package Tasks.mytasks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomerUI extends JFrame implements ActionListener {
    JLabel lFirstName,lLastName,lAge;
    JTextField jTxtFirstName,jTxtLastName,JTxtAge;
    JButton btnOk,btnCancel;

    AddCustomerUI(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCancel){
            this.dispose();
        }
    }
}
