package Tasks.loanTaskBig;

import java.io.Serializable;
import java.util.Date;

public abstract class Loan implements Serializable {
    private double loanAmount;
    private int numberOfYears;
    private LoanType loanType;
    private double annualInterestRate;
    private Date startDate;
    private CustomerInfo loanTaker;

    public Loan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
        this.loanAmount = loanAmount;
        this.numberOfYears = numberOfYears;
        this.loanType = loanType;
        this.annualInterestRate = annualInterestRate;
        this.startDate = startDate;
        this.loanTaker = loanTaker;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public CustomerInfo getLoanTaker() {
        return loanTaker;
    }

    public void setLoanTaker(CustomerInfo loanTaker) {
        this.loanTaker = loanTaker;
    }

    public double calculateLoanPayments(){

        double monthlyInterestRate = getMonthlyInterestRate();
        double monthlyPayment = calculateMonthlyPayment(monthlyInterestRate);
        double totalPayment = monthlyPayment * numberOfYears * 12;

        return totalPayment;
    }

    private double calculateMonthlyPayment(double monthlyInterestRate) {
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12)));
        return monthlyPayment;
    }

    private double getMonthlyInterestRate() {
        double monthlyInterestRate=(annualInterestRate/12)/100;
        return monthlyInterestRate;
    }

    abstract double getAnnualInterestRate();
    abstract void printLoanInformation();
}
