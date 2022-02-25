package Tasks.loanTaskBig;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LoanFactory {

    private CustomerInfo activeUser;
    private CustomerInfo coLoaner;
    private Loan activeLoan;
    private Scanner sc;
    private CustomerProxy customerProxy;
    private LoanProxy loanProxy;

    private String input;
    public LoanFactory(){
        this.sc = new Scanner(System.in);
        this.coLoaner = new CustomerInfo();
        this.customerProxy = new CustomerProxy();
        this.loanProxy = new LoanProxy();

    }

    public void run(){
        this.input = "m";
        try {
            while (true){

                if (this.input.equalsIgnoreCase("m")){
                    this.printMainMenu();
                    this.input = sc.nextLine();

                }
                if (input.equalsIgnoreCase("q"))
                    break;
                else if (input.equalsIgnoreCase("1")){
                    CustomerInfo user = new CustomerInfo();
                    this.printQuestion("name");
                    user.setName(sc.nextLine());
                    this.printQuestion("Age");
                    user.setAge(Integer.parseInt(sc.nextLine()));
                    this.printQuestion("SSN");
                    user.setSsn(sc.nextLine());
                    this.customerProxy.registerCustomer(user);
                    System.out.printf("User added to DB");
                    this.input = "m";


                }
                else if (this.input.equalsIgnoreCase("2")){
                    this.customerProxy.printAllCustomers();
                    this.input = "m";
                }
                else if (this.input.equalsIgnoreCase("3")){
                    System.out.println("Please enter a valid 11 digit ssn");
                    System.out.printf("Input: ");
                    this.input = sc.nextLine();
                    this.activeUser = customerProxy.getCustomer(input);
                    this.input = "m";
                }
                // Create new loan
                else if (this.input.equalsIgnoreCase("4")){

                    System.out.println("plese fill inn loan information ");
                    this.getLoanInformation();
                }
                else if (this.input.equalsIgnoreCase("5")){
                    this.loanProxy.printAllLoans();
                    this.input = "m";

                }
                else  if (input.equalsIgnoreCase("6")){
                    printQueston("Plese enter a valid ssn: ", "input:");
                    this.input = this.sc.nextLine();
                    loanProxy.printLoanbySsn(this.input);
                    this.input = "m";
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void getLoanInformation() throws Exception {
        // hent all felles lån info
        LoanType loanType;
        double loan;
        int years;
        Date date;
        loanType = getLoanTypeFromUser();
        loan = GetLoanAmountFromUser();
        years = getNumberOfYearsFromUser();
        date = getDateFromUser();
        this.coLoaner = getColoanerFromUser();
        setActiveLoanBaseInfo(loanType, loan, years, date);

        if (coLoaner != null  && activeLoan.getLoanType() != LoanType.HouseLoan)
            throw new LoanException("can only have co loaner on " +LoanType.HouseLoan);

        switch (this.activeLoan.getLoanType()){
            case HouseLoan -> {

                if (this.coLoaner != null){
                    ((HouseLoan)this.activeLoan).setCoLoaner(this.coLoaner);
                }
                ((HouseLoan)this.activeLoan).setCustomerProxy(this.customerProxy);
                printQueston("plese enter adress of house", "input: ");
                this.input = sc.nextLine();
                ((HouseLoan)this.activeLoan).setHouseAddress(this.input);
                input = "m";
                break;
            }
            case ConsumerLoan -> {
                ((ConsumerLoan)this.activeLoan).setCustomerProxy(this.customerProxy);
                input = "m";
                break;
            }
            case CarLoan -> {
                this.getUserInputOnCarLoan();
                input = "m";
                break;
            }
            default -> {throw new LoanException("Type of loan dose not exsist" + this.activeLoan.getLoanType());}
        }
        this.activeLoan.getAnnualInterestRate();
        this.loanProxy.registerLoan(this.activeLoan);

    }

    private void getUserInputOnCarLoan() {
        String brand;
        String miles;
        InsuranceType insuranceType;
        brand = getCarBrandFromUser();
        miles = getCarMilesFromUser();
        insuranceType = getInsuranceTypeFromUser();

        ((CarLoan)this.activeLoan).setMiles(miles);
        ((CarLoan)this.activeLoan).setCarModel(brand);
        ((CarLoan)this.activeLoan).setTypeOfInsurance(insuranceType);
        ((CarLoan)this.activeLoan).setCustomerProxy(this.customerProxy);

    }

    private String getCarBrandFromUser() {
        String brand;
        printQueston("Please enter brand of car", "input: ");
        brand = sc.nextLine();
        return brand;
    }

    private String getCarMilesFromUser() {
        String miles;
        printQueston("Please enter how many miles", "input: ");
        miles = sc.nextLine();
        return miles;
    }

    private InsuranceType getInsuranceTypeFromUser() {
        printQueston("Please enter insurances type Fullkasko/Delkasko/topKasko", "input: ");
        InsuranceType insuranceType;
        this.input = sc.nextLine();
        switch (input.toLowerCase()){
            case "fullkasko" -> insuranceType = InsuranceType.FullKasko;
            case "delkasko" -> insuranceType = InsuranceType.DelKasko;
            case "topkasko" -> insuranceType = InsuranceType.TopKasko;
            default -> throw new IllegalStateException("Unexpected value: " + input.toLowerCase());
        }
        return insuranceType;
    }

    private CustomerInfo getColoanerFromUser() throws Exception{
        printQueston("Will there be a Co Loaner? y/n", "input:");
        input = sc.nextLine();
        if (input.equalsIgnoreCase("y")){
            printQueston("Please enter a valid ssn number (11 digits) for Co Loaner", "input:");
            input = sc.nextLine();
            return this.customerProxy.getCustomer(input);
        }
        else {
            return null;
        }
    }

    private void setActiveLoanBaseInfo(LoanType loanType, double loan, int years, Date date) throws LoanException {
        activeLoan = createLoan(loanType);
        activeLoan.setLoanType(loanType);
        activeLoan.setLoanTaker(this.activeUser);
        activeLoan.setLoanAmount(loan);
        activeLoan.setNumberOfYears(years);
        activeLoan.setStartDate(date);
    }

    private LoanType getLoanTypeFromUser() {
        LoanType loanType;
        printQueston("Please enter LoanType as car/house(Consumer","input: ");
        input = sc.nextLine();
        loanType = selectLoanType(input);
        return loanType;
    }

    private Date getDateFromUser() throws ParseException {
        Date date;
        printQueston("Please enter Start date for loan in format dd-mm-YY","input: ");
        input = sc.nextLine();
        DateFormat format = new SimpleDateFormat("dd-MM-yy");
        date = format.parse(input);
        return date;
    }

    private int getNumberOfYearsFromUser() {
        int years;
        printQueston("Please enter Amount of Years","input: ");
        years = Integer.parseInt(sc.nextLine());
        return years;
    }

    private double GetLoanAmountFromUser() {
        double loan;
        printQueston("Please enter Loan Amount","input: ");
        loan = Double.parseDouble(sc.nextLine());
        return loan;
    }

    private LoanType selectLoanType(String input) {
        LoanType loanType;
        switch (input.toLowerCase()){
            case "car" -> loanType = LoanType.CarLoan;
            case "house" -> loanType = LoanType.HouseLoan;
            case "consumer" -> loanType = LoanType.ConsumerLoan;
            default -> throw new IllegalStateException("Unexpected value: " + input.toLowerCase());
        }
        return loanType;
    }


    private void printQueston(String x, String x1) {
        System.out.println(x);
        System.out.printf(x1);
    }

    public   void printQuestion(String value) {
        System.out.println("Please enter "+ value +" :");
        System.out.printf("input: ");

    }

    public   void printMainMenu() {
        String  user = "NOT SET";
        if (activeUser != null){
            user = activeUser.getName();
        }



        System.out.println("Welcome to the Bank of Norway");
        System.out.println( "Active user: " + user);
        System.out.println("Please Select a Option:");
        System.out.println("1. Add New Customer");
        System.out.println("2. List all Customers");
        System.out.println("3. Set active customer by ssn number");
        System.out.println("4. Create New loan for activ Customer");
        System.out.println("5. Show all Loans");
        System.out.println("6. Show all Loans for customer using ssn number");
        printQueston("Q. to quit", "input: ");
    }

    public Loan createLoan(LoanType typeOfLoan) throws LoanException {

        switch (typeOfLoan){
            case HouseLoan -> {return new HouseLoan(typeOfLoan);}
            case ConsumerLoan -> {return  new ConsumerLoan(typeOfLoan);}
            case CarLoan -> {return new CarLoan(typeOfLoan);}
            default -> {throw new LoanException("Type of loan dose not exsist" + typeOfLoan);}
        }
    }

    public static void main(String[] args) {
        LoanFactory loanFactory = new LoanFactory();

        try {


            loanFactory.run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
