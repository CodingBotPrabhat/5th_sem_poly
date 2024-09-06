import java.applet.*;
import java.awt.*;
/*
<applet code=pract1_ex3.class width=300 height=200>
</applet>
*/
public class pract1_ex3 extends Applet
{
   public void init()
   {
    Button b1,b2,b3;

    b1 = new Button("OK");
    add(b1);

    b2 = new Button("RESET");
    add(b2);

    b3 = new Button("CANCEL");
    add(b3);
   }
}
