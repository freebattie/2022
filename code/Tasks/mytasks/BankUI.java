package Tasks.mytasks;

import javax.swing.*;

public class BankUI extends JFrame {

    JFrame frame;

    BankUI(){
        int btnXStart = 40;
        int btnYStart = 40;
        int btnSpace = 10;
        int btnHeight = 40;
        int btnWidth = 140;
        JButton btnAddCustomer = new JButton("Add Customer");
        JButton btnShowAllCustomers = new JButton("Show Customers");
        JButton btnEditCustomer = new JButton("Edit Customer");

        btnAddCustomer.setBounds(btnXStart,btnYStart,btnWidth, btnHeight);
        btnEditCustomer.setBounds(btnXStart,btnAddCustomer.getY()+btnSpace,btnWidth,btnHeight);
        btnShowAllCustomers.setBounds(btnXStart,btnEditCustomer.getY()+btnSpace,btnWidth,btnHeight);
        this.add(btnAddCustomer);
        this.add(btnEditCustomer);
        this.add(btnShowAllCustomers);

    }
}
