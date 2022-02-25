package Tasks.loanTaskBig;
import java.util.Date;

public class ConsumerLoan extends Loan{

    private  CustomerProxy customerProxy;

    public ConsumerLoan(double loanAmount, int numberOfYears, LoanType loanType, double annualInterestRate, Date startDate, CustomerInfo loanTaker, CustomerProxy customerProxy) throws Exception {
        super(loanAmount, numberOfYears, loanType, annualInterestRate, startDate, loanTaker);
        this.customerProxy = customerProxy;

        this.customerProxy.registerCustomer(super.getLoanTaker());
    }
    public ConsumerLoan(){
        super();
    }

    public ConsumerLoan(LoanType typeOfLoan) {
        super.setLoanType(typeOfLoan);
    }

    //TODO: Implement this for task 3, unsure what it should do yet.
    @Override
    void getAnnualInterestRate() {
        super.setAnnualInterestRate(24d);
    }

    public CustomerProxy getCustomerProxy() {
        return customerProxy;
    }

    public void setCustomerProxy(CustomerProxy customerProxy) {
        this.customerProxy = customerProxy;
        try {
            this.customerProxy.registerCustomer(super.getLoanTaker());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    void printLoanInformation() {

    }
}
