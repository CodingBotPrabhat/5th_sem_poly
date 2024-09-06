import java.awt.*;
import javax.swing.*;
public class pract6_ex1 extends JApplet
{ 
    JComboBox jc = new JComboBox();
    public void init()
    {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        jc.addItem("Maharashtra");
        jc.addItem("Punjab");
        jc.addItem("Gujrat");
        jc.addItem("Madhya Pradesh");
        jc.addItem("Uttar Pradesh");
        jc.addItem("Goa");
        jc.addItem("Karnataka");
        jc.addItem("Manipur");
        jc.addItem("Haryana");
        jc.addItem("Tamil Nadu");

        c.add(jc);
    }

}

/* 
<applet code=pract6_ex1.class width=300 height=300> </applet>
*/
