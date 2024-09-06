import java.awt.*;
import java.applet.*;

public class pract1_XII extends Applet
{
    public void init()
    {
        List ch = new List(4 , false);

        ch.add("Maths");
        ch.add("Physics");
        ch.add("C++");
        ch.add("Java");

        add(ch);
    }
    
}

/* 
<applet code=pract1_XII.class width=300 height=300></applet>
*/
 