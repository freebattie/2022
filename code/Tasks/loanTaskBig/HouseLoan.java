package Tasks.loanTaskBig;

import java.util.Date;

public class HouseLoan extends Loan{

    private CustomerProxy customerProxy;
    private CustomerInfo coLoaner;
    private String houseAddress;
    public HouseLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker,CustomerProxy customerProxy) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
        this.customerProxy = customerProxy;
    }
    public HouseLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker,CustomerProxy customerProxy, CustomerInfo coLoaner) throws Exception {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
        this.coLoaner = coLoaner;
        this.customerProxy = customerProxy;

        customerProxy.registerCustomer(super.getLoanTaker());
        customerProxy.registerCustomer(this.coLoaner);
    }
    public HouseLoan(){
        super();
    }

    public HouseLoan(LoanType typeOfLoan) {
        super.setLoanType(typeOfLoan);
    }

    @Override
    public void getAnnualInterestRate() {
        super.setAnnualInterestRate(3d);
    }

    public CustomerInfo getCoLoaner() {
        return coLoaner;
    }

    public void setCoLoaner(CustomerInfo coLoaner) {
        this.coLoaner = coLoaner;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    @Override
    void printLoanInformation() {
        CustomerInfo loanerOne = super.getLoanTaker();
        if (coLoaner != null)

            System.out.println(   "Loan type " + super.getLoanType()+ "\n"
                                + "Loaner one: " + loanerOne.getName()+"\n"
                                + "Loaner two: " + coLoaner.getName()+"\n"
                                +  "totalPayments: "+ super.calculateLoanPayments() + "\n"
                                +  "Address: " + houseAddress );
        else
            System.out.println("Loan type " + super.getLoanType()+ "\n"
                                +"Loaner one: " + loanerOne.getName()+"\n"
                                + "totalPayments: "+ super.calculateLoanPayments() + "\n"
                                + "Address: " + houseAddress );
    }

    public void setCustomerProxy(CustomerProxy customerproxy) throws Exception {
        this.customerProxy = customerproxy;
        this.customerProxy.registerCustomer(super.getLoanTaker());

        if (coLoaner != null){
            this.customerProxy.registerCustomer(this.coLoaner);
        }

    }
}
