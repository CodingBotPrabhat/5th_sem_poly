import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code=homework1.class width=300 height=200>
</applet> 
*/
public class homework1 extends Applet implements ActionListener
{
    Label l1,l2;
    Button b1;
    TextField t1,t2;

    public void init()
    {
        l1 = new Label("Number = ");
        l2 = new Label("Factorial = ");

        t1 = new TextField(10);
        t2 = new TextField(10);

        b1 =  new Button("Submit");

        // Adding components to applet window

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(b1);

        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b1)
        {
            int num = Integer.parseInt(t1.getText());

            int fact = 1;
            for(int i = 1 ; i<=num ; i++)
            {
                fact *= i;
            }

            t2.setText(String.valueOf(fact));
            
        }
    }
    
}
