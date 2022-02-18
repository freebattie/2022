package Tasks.loanTaskBig;

import LargerTasks.bankLoan.LoanException;

import java.util.HashMap;

public class CustomerProxy implements ICustomerProxy{

    HashMap<String,CustomerInfo> customers;

    public CustomerProxy() {
        this.customers = new HashMap<>();
    }

    @Override
    public CustomerInfo getCustomer(String ssn) throws Exception {

        if (customers.containsKey(ssn) && isValidSsn(ssn))
            return customers.get(ssn);
        else
            return null;
    }

    @Override
    public boolean isValidSsn(String personalIdentifyNumber) throws Exception {
        if (personalIdentifyNumber.length() == 11)
            return true;
        else
            throw new LoanException("Wrong length on the SSn number");
    }

    @Override
    public void registerCustomer(CustomerInfo customerInfo) throws Exception {
        if (!customers.containsKey(customerInfo.getSsn()) && isValidSsn(customerInfo.getSsn()))
            customers.put(customerInfo.getSsn(),customerInfo);
        else
            throw new LoanException("Customer is Already added" + customerInfo.getName());
    }
}
