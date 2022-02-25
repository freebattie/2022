package Tasks.loanTaskBig;

public class CustomerInfo {
    private String ssn;
    private String name;
    private int age;

    public CustomerInfo(String ssn, String name, int age) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
    }
    public CustomerInfo(){

    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
