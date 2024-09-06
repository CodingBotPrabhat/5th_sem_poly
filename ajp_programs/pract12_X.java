import java.awt.*;
import javax.swing.*;
import java.applet.*;

public class pract12_X extends JFrame
{
    pract12_X()
    {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());

        JLabel l = new JLabel("Password : ");

        JPasswordField jp = new JPasswordField(20);
        jp.setEchoChar('#');


        add(l);
        add(jp);

    }
    public static void main(String[] args) {
        new pract12_X();
    }

}
