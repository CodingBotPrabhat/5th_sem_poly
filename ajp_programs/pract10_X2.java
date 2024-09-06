import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class pract10_X2  
{
 public static void main(String[] args) 
{
 JFrame frame = new JFrame("Special Keys Program");        	              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setLayout(new FlowLayout());
 JLabel label = new JLabel("Press a special key...");
 frame.add(label);
 frame.addKeyListener(new KeyListener() 
{            
 public void keyTyped(KeyEvent e) 
{
 }
 public void keyPressed(KeyEvent e) 
{                
int keyCode = e.getKeyCode();
if (keyCode >= KeyEvent.VK_F1 && keyCode <= KeyEvent.VK_F12)
{
label.setText("Function key pressed: F" + (keyCode - KeyEvent.VK_F1 + 1));
} 
else if (keyCode == KeyEvent.VK_UP)
{
label.setText("Up arrow key pressed");
} 
else if (keyCode == KeyEvent.VK_DOWN) 
{
label.setText("Down arrow key pressed");
} 
else if (keyCode == KeyEvent.VK_LEFT) 
{
label.setText("Left arrow key pressed");
} 
else if (keyCode == KeyEvent.VK_RIGHT)
{
label.setText("Right arrow key pressed");
}
}
public void keyReleased(KeyEvent e)
{
}
});
frame.setSize(300, 100);
frame.setVisible(true);
}
}
