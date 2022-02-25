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

    }

    @Override
    public void printAllCustomers() throws Exception {
        for (var user :customers.values()){
            printBorder();
            printUser(user);
            printBorder();
        }
    }

    private void printUser(CustomerInfo user) {
        System.out.println("Name: " +user.getName());
        System.out.println("Age: " +user.getAge());
        System.out.println("SSN: " +user.getSsn());
    }

    private void printBorder() {
        System.out.println("--------------");
    }
}
