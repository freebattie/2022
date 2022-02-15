package Tasks.loanTaskBig;

import java.util.Date;

public class HouseLoan extends Loan{

    public HouseLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
    }

    @Override
    double getAnnualInterestRate() {
        return 0;
    }

    @Override
    void printLoanInformation() {

    }
}
