package Tasks.loanTaskBig;

import java.util.Date;

public class CarLoan extends Loan{
    private String carModel;
    private String miles;
    InsuranceType typeOfInsurance;
    CustomerProxy customerProxy;

    public CarLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate,
                   Date startDate, CustomerInfo loanTaker, String carModel,
                   String miles, InsuranceType typeOfInsurance, CustomerProxy customerProxy) throws Exception {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
        this.carModel = carModel;
        this.miles = miles;
        this.typeOfInsurance = typeOfInsurance;
        this.customerProxy = customerProxy;
        this.customerProxy.registerCustomer(super.getLoanTaker());
    }
    public CarLoan(){
        super();
    }

    public CarLoan(LoanType typeOfLoan) {
        super.setLoanType(typeOfLoan);
    }

    public CustomerProxy getCustomerProxy() {
        return customerProxy;
    }

    public void setCustomerProxy(CustomerProxy customerProxy) {
        this.customerProxy = customerProxy;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }

    public InsuranceType getTypeOfInsurance() {
        return typeOfInsurance;
    }

    public void setTypeOfInsurance(InsuranceType typeOfInsurance) {
        this.typeOfInsurance = typeOfInsurance;
    }



    public CarLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
    }


    /**
     * hardocoded annualInstrerestRate in % for Car loans
     */
    @Override
    public void getAnnualInterestRate() {
        super.setAnnualInterestRate(12d);
    }

    @Override
    void printLoanInformation() {
        double loanPayments = super.calculateLoanPayments();
        CustomerInfo loaner = super.getLoanTaker();

        System.out.println(loaner.getName() +" total Payments are : " + loanPayments+"\n"+
                            "on a " + carModel + ", it has driven " +miles +" Miles and " + "he has " + typeOfInsurance +" Insurance");

    }

}
