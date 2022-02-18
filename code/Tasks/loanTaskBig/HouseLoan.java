package Tasks.loanTaskBig;

import java.util.Date;

public class HouseLoan extends Loan{

    private CustomerInfo coLoaner;
    private String houseAddress;
    public HouseLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
    }
    public HouseLoan(){
        super();
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

            System.out.println(   "Loaner one: " + loanerOne.getName()+"\n"
                                + "Loaner two: " + coLoaner.getName()+"\n"
                                +  "totalPayments: "+ super.calculateLoanPayments() + "\n"
                                +  "Address: " + houseAddress );
        else
            System.out.println(   "Loaner one: " + loanerOne.getName()+"\n"
                                + "totalPayments: "+ super.calculateLoanPayments() + "\n"
                                + "Address: " + houseAddress );
    }
}
