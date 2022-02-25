package Tasks.loanTaskBig;

public interface IBankProxy {
    CustomerInfo createNewCustomer(String name,int age,String ssn);
    void RegisterUser(CustomerInfo user);
    Loan createNewLoan(Loan loan);
    void registerLoan(Loan loan);
    void printAllLoans();
    void printLoanBySsn();

}
