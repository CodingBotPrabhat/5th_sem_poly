import java.awt.*; import java.awt.event.*; 
import javax.swing.*; 
import java.applet.*; 
public class pract12_ex2 extends JApplet implements ActionListener
 { JTextField jtf1,jtf2,jtf3; 
JButton jb; JLabel jl1,jl2,jl3; 
public void init() { 
Container c = getContentPane(); 
c.setLayout(new GridLayout(4,2)); 
jtf1 = new JTextField(); 
jtf2 = new JTextField(); 
jtf3 = new JTextField(); 
jb = new JButton("Addition");
 jl1 = new JLabel("Number 1",JLabel.CENTER); 
jl2 = new JLabel("Number 2",JLabel.CENTER); 
jl3 = new JLabel("Answer",JLabel.CENTER); 
jb.addActionListener(this); 
c.add(jl1);
 c.add(jtf1); 
c.add(jl2); 
c.add(jtf2); 
c.add(jl3); 
c.add(jtf3); 
c.add(jb); 
} 
public void actionPerformed(ActionEvent ae)
 { 
String s1 = jtf1.getText(); 
String s2 = jtf2.getText(); 
int i1 = Integer.parseInt(s1); 
int i2 = Integer.parseInt(s2); 
int mult = i1+i2; 
String ans = Integer.toString(mult); 
jtf3.setText(ans); 
repaint(); } } 
/* <applet code=pract12_ex2.class width=400 height=400>
 </applet>
*/
