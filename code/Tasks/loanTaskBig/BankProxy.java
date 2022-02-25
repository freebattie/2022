package Tasks.loanTaskBig;

import java.util.Scanner;

public class BankProxy implements IBankProxy{
    private CustomerInfo activeUser;
    private CustomerInfo coLoaner;
    private Scanner sc;
    private CustomerProxy customerProxy;
    private LoanProxy loanProxy;
    private String input;

    public BankProxy(){
        this.activeUser = new CustomerInfo();
        this.coLoaner = new CustomerInfo();
        this.sc = new Scanner(System.in);
        this.customerProxy = new CustomerProxy();
        this.loanProxy = new LoanProxy();
    }
    @Override
    public CustomerInfo createNewCustomer(String name, int age, String ssn) {
        CustomerInfo user = new CustomerInfo(ssn,name,age);
       return user;
    }

    @Override
    public void RegisterUser(CustomerInfo user) {

    }

    @Override
    public Loan createNewLoan(Loan loan) {
        switch (loan.getLoanType()){

            case HouseLoan -> {
            }
            case ConsumerLoan -> {
            }
            case CarLoan -> {
            }
        }
        return null;
    }

    @Override
    public void registerLoan(Loan loan) {

    }

    @Override
    public void printAllLoans() {

    }

    @Override
    public void printLoanBySsn() {

    }

}
