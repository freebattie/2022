package Tasks.loanTaskBig;

import LargerTasks.bankLoan.LoanException;

import java.util.HashMap;

public class LoanProxy implements ILoanProxy{

    HashMap<Integer,Loan> loans;
    @Override
    public Loan getLoan(Integer loanId) {
        return null;
    }
    public LoanProxy(){
        loans = new HashMap<>();
    }
    @Override
    public void registerLoan(Loan loan) throws Exception {
        if (loans.containsKey(loan.getLoanId()))
            throw new LoanException("Loan is already in list");
        else
            loans.put(loan.getLoanId(),loan);
    }

    @Override
    public void printAllLoans() throws Exception {
        for (Loan loan : loans.values()){
            if (loan == null)
                throw new Tasks.loanTaskBig.LoanException("loan missing");
            loan.printLoanInformation();
        }
    }

    @Override
    public void printLoanbySsn(String ssn) throws Exception {
        if (loans.containsKey(ssn))
            loans.get(ssn).printLoanInformation();
        else
            throw  new Tasks.loanTaskBig.LoanException("loan was not found in list");

    }
}
