import java.applet.*;
import java.awt.*;


/* 
<applet code=pract2_ex1.class width=300 height=200>
</applet>
*/

public class pract2_ex1 extends Applet
{
    public void init()
    {
        List l1 = new List(10);
        l1.add("Mumbai");
        l1.add("Pune");
        l1.add("Banglore");
        l1.add("Delhi");
        l1.add("Noida");
        l1.add("Gurgaon");
        l1.add("Hyderabad");
        l1.add("Indore");
        l1.add("Jaipur");
        l1.add("Surat");
        //l1.add("extra city");
        add(l1);

    }

}
