package Tasks.loanTaskBig;

import java.util.Date;

public class CarLoan extends Loan{
    private String carModel;
    private String miles;
    InsuranceType typeOfInsurance;

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

    public CarLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker, String carModel, String miles, InsuranceType typeOfInsurance) {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
        this.carModel = carModel;
        this.miles = miles;
        this.typeOfInsurance = typeOfInsurance;
    }

    public CarLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker) {
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
