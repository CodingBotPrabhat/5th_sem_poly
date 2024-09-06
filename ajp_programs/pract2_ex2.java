import java.applet.*;
import java.awt.*;
/* 
<applet code=pract2_ex2.class width=300 height=200>
</applet>
*/
public class pract2_ex2 extends Applet
{
    public void init()
    {
        List l1 = new List(7,true);

        l1.add("Times of India");
        l1.add("Hindustan Times");
        l1.add("The Hindu");
        l1.add("The Economic Times.");

        add(l1);



    }
}
