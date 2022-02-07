package LectureCode.Session7.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    private int salt = 23457;
    private String name;
    private Account activeAccount = null;
    private int menu = 0;
    ArrayList<Account> accounts = new ArrayList<>();

    private void addAccount(String name, int balance,int pin){
        Account newAcc = new Account(name,balance,pin,this.salt);
        accounts.add(newAcc);
    }

    public void bankAPI(){
        if (activeAccount != null){
            displayAccountMenu();
        }
        else{
            displayMainMenu();
            switch (menu){
                case 1:
                    handelLogin();
                    break;
                case 2:
                    handelCreateNewAccount();
                    break;
                case 3:
                    return;
                default:
            }
        }
    }

    private void handelCreateNewAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter name: ");
        System.out.print("Input: ");
        String tmpName = sc.nextLine();
        System.out.println("please enter amount to deposit ");
        System.out.print("Input: ");
        int tmpBalance = Integer.parseInt(sc.nextLine());
        System.out.println("please enter PIN to use: ");
        System.out.print("Input: ");
        int tmpPin = Integer.parseInt(sc.nextLine());
        addAccount(tmpName,tmpBalance,tmpPin);
    }

    private void handelLogin() {
        Scanner sc = new Scanner(System.in);
        Account tmp = null;
        System.out.println("please enter account number: ");
        System.out.print("Input: ");
        String input = sc.nextLine();
        int tmpAcc = Integer.parseInt(input);

        for (Account acc: accounts){
            if (acc.getAccountNr() == tmpAcc){
                tmp = acc;
                break;
            }

        }
        if (tmp != null){
            System.out.println("please enter Pin: ");
            System.out.print("Input: ");
            input = sc.nextLine();
            int pin = Integer.parseInt(input);
            if (tmp.loggInnToAccount(pin,this.salt)){
                this.activeAccount = tmp;
            }
            else {
                this.activeAccount = null;
                System.out.println("Wrong Pin: ");
            }

        }
        else{
            System.out.println("Account not found ");
        }
    }

    public void displayMainMenu(){
        System.out.println("Welcome to the bank of "+name);
        System.out.println("Press 1 to login:");
        System.out.println("Press 2 to create a new account");
        System.out.println("Press 3 to quit");

    }
    public void displayAccountMenu(){
        System.out.println("Welcome "+ activeAccount.getName() );
        System.out.println("Press 1 to show balance");
        System.out.println("Press 2 to withdraw money");
        System.out.println("Press 3 to transfer money");
        System.out.println("Press 4 to log out");

    }


}
class Account{
    private static int currentNr = 1000;
    private String name;
    private double balance;
    private final int accountNr;
    private final int hash;
    private boolean isLoggedInn = false;


    Account(String name,int balance,int pin,int salt){
        this.name = name;
        this.balance = balance;
        this.accountNr = Account.currentNr;
        Account.currentNr += 1;
        this.hash = this.accountNr + pin+ salt;
    }

    public String getName() {
        return this.name;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public double getBalance(int pin,int salt) {
        if (isLoggedInn)
            return balance;
        else
            return -1;
    }

    public void withdrawMoney(double money,int pin,int salt) {
        if (isLoggedInn && this.balance >= money)
           this.balance -= money;

    }
    public void addMoney(double money){
        this.balance += money;
    }

    public boolean loggInnToAccount(int pin, int salt) {
        if (pin+salt+accountNr == hash){
            isLoggedInn = true;
            return true;
        }

        else{
            isLoggedInn = false;
            return false;
        }

    }
}
