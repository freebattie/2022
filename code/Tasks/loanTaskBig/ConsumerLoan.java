package Tasks.loanTaskBig;

import java.util.Date;

public class ConsumerLoan extends Loan{

    public ConsumerLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
    }
    public ConsumerLoan(){
        super();
    }
    //TODO: Implement this for task 3, unsure what it should do yet.
    @Override
    void getAnnualInterestRate() {
        super.setAnnualInterestRate(24d);
    }

    @Override
    void printLoanInformation() {

    }
}
