import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class pract6_X extends JApplet implements ItemListener
{
    JComboBox ch = new JComboBox();
    JLabel l;
    public void init()
    {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        l = new JLabel("");
       
        ch.addItem("Solapur");
        ch.addItem("Pune");
        ch.addItem("Banglore");
        ch.addItem("Mumbai");

        c.add(ch);
        c.add(l);
        ch.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        String s = (String)ch.getSelectedItem();

        l.setText("You are in " + s);
    }
    
}


/* 
<applet code=pract6_X.class width=300 height=300> </applet> 
*/
