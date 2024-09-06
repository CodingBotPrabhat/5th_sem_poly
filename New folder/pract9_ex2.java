import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class  pract9_ex2 extends JFrame implements ActionListener
{
    JButton b = new JButton("Submit");
    JProgressBar jp = new JProgressBar(SwingConstants.HORIZONTAL , 0 ,100);

    pract9_ex2()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jp.setValue(0);
        jp.setStringPainted(true);
        
        add(jp);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b)
        {
           
                int i =10;
                    while(i<=100)
                    {
                        jp.setValue(i);
                      
                       try 
                       {
                        Thread.sleep(1000);
                       } catch (Exception ex) {
                       }
                       i = i + 10;
                    }    
        }
    }
    public static void main(String[] args) {
        new pract9_ex2();
    }
}
