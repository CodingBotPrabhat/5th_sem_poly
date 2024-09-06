import java.awt.*;
import java.awt.event.*;
public class pract10_X1 extends Frame implements KeyListener
{
Label l;
TextArea ta;
pract10_X1 ()
{
setSize(400,400);
setLayout(null);
setVisible(true);
l = new Label();
l.setBounds(20,50,100,20);
ta = new TextArea();
ta.setBounds(20,80,300,300);
ta.addKeyListener(this);
add(l);
add(ta);
}
public void keyPressed(KeyEvent ke)
{
l.setText("Key Pressed");
}
public void keyReleased(KeyEvent ke)
{
}
public void keyTyped(KeyEvent ke)
{
}
public static void main(String[] args)
{
new pract10_X1();
}
}/*
<applet code=pract10_X1.class width=300 height=300>
</applet> 
*/
