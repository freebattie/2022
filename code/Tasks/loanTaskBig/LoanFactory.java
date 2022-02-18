package Tasks.loanTaskBig;

public class LoanFactory {

    public Loan createLoan(LoanType typeOfLoan) throws LoanException {

        switch (typeOfLoan){
            case HouseLoan -> {return new HouseLoan();}
            case ConsumerLoan -> {return  new ConsumerLoan();}
            case CarLoan -> {return new CarLoan();}
            default -> {throw new LoanException("Type of loan dose not exsist" + typeOfLoan);}
        }
    }
}
