package Tasks.loanTaskBig;

public interface ICustomerProxy {

    CustomerInfo getCustomer(String ssn) throws Exception;
    boolean isValidSsn(String personalIdentifyNumber) throws Exception;
    void registerCustomer(CustomerInfo customerInfo) throws Exception;

}
