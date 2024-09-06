import java.awt.*;
//import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class pract12_ex1 extends JFrame implements ActionListener
{
    JTextField jp = new JPasswordField(15);
    JTextField jt = new JTextField(15);
    String pass = "NESP";
    String msg;
    JLabel l1 , l2,l3= new JLabel("");

    JButton b = new JButton("Submit");

    pract12_ex1()
    {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());

        l1 =  new JLabel("Username : ");
        add(l1);
        add(jt);

        l2 = new JLabel("Password : ");
        add(l2);
        add(jp);

        add(b);
        add(l3);

       jp.addActionListener(this);
       b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            String s = jp.getText();
            if(s == pass)
            {
                msg ="Authentication Successful...";
                l3.setText(msg);
            }
            else 
            {
                msg= "Authentication Failed";
                l3.setText(msg);
            }

        }
    }

    public static void main(String[] args) {
        new pract12_ex1();
    }
}



