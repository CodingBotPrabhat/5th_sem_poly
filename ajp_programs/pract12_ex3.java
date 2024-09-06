import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pract12_ex3 extends JFrame implements ActionListener
{
    JLabel l1 ;
    JPasswordField jp = new JPasswordField(15);
    JButton b = new JButton("Submit");
    String msg = "";
    JLabel l2;
    
    pract12_ex3()
    {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());

        l1 = new JLabel("Password : ");
        add(l1);
        add(jp);

        add(b);

        l2 = new JLabel("");
        add(l2);

        b.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
            String s = jp.getText();
            if(s.length()<6)
            {
                msg = "Password length must be grater than 6";
               l2.setText(msg);
            }
            else
            {
                msg = "Correct password length";
                l2.setText(msg);
            }
        }
    }

    public static void main(String[] args) {
        new pract12_ex3();
    }
    
}


