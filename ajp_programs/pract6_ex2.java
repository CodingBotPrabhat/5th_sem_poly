import java.applet.*;
import java.awt.*;
import javax.swing.*;
public class pract6_ex2 extends JApplet
{
    public void init()
    {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));
        int b = 0;
        for(int i = 0; i < 5; i++) {
        for(int j = 0; j < 5; j++) {
        jp.add(new JButton("Button " + b));
        ++b;
        }
        }

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jp, v, h);
        c.add(jsp, BorderLayout.CENTER);

    
    }
}

/* 
<applet code=pract6_ex2.class width=400 height=400>
</applet>
*/
