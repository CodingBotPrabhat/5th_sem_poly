import java.awt.*;
import java.applet.*;

public class pract2_X extends Applet 
{
    public void init()
    {
        List l1 = new List(3,true);

        l1.add("Summer");
        l1.add("Winter");
        l1.add("Rainy");

        add(l1);
    }
    
}

/* 
<applet code=pract2_X.class width=300 height=300> 
</applet>
*/
