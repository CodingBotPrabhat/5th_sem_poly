import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/* 
<applet code=homework2.class width=300 height=200>
</applet>
*/
public class homework2 extends Applet implements ActionListener
{
    // declaration and initialization of label and password obj 
    Label password =  new Label("Password");
    TextField t = new TextField(10);
    Button b1  =  new Button("Submit");
    String s ; 

    public void init()
    {
        add(password);
        t.setEchoChar('*');
        add(t);
        add(b1);

        t.addActionListener(this);
        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            String s1 = t.getText();
            if(s1.length() > 6)
            {
                s= "Correct password length";
                repaint(); // calling to display status of password on applet window 
            }
            else 
            {
                s="Incorrect password length try again";
                repaint();
            }
        }
    }

    public void paint(Graphics g)
    {
        g.drawString(s , 100 , 50);
    }
    
}
