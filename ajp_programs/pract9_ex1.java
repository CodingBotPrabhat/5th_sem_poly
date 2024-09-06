import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class pract9_ex1 extends JApplet
{
    public void init()
	{
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JProgressBar jp = new JProgressBar(0,100);
		jp.setValue(66);
		jp.setStringPainted(true);
		c.add(jp);
	}
    
}

/* <applet code=pract9_ex1  width=500 height=500></applet> */
