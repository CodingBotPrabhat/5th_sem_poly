import java.awt.*;
import java.applet.*;

/*
<applet code=pract1_ex2.class width=400 height=400>
</applet>
*/
public class pract1_ex2 extends Applet 
{
	public void init()
	{
	
	Choice c =  new Choice();
	c.add("Marathi");
	c.add("Hindi");
	c.add("English");
	c.add("Sanskrit");

	add(c);

	}
	
}

