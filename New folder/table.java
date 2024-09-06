import java.awt.*;
import java.applet.*;
import javax.swing.*;

public class table extends JApplet
{
    public void init()
    {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        final String [] heads = {"Name" , "Roll No. " , "Percent "};

        final Object data [][]= 
        {
            {"Prabhat" , "1303" ,"99.99"},
            {"Spandan" ,"1306" , "90.23"},
            {"Sai" , "1330" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},
            {"Spandan" ,"1306" , "90.23"},


        };

        JTable tab = new JTable(data,heads);

        

        int vsb = JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
        int hsb = JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;

        JScrollPane jsp = new JScrollPane(tab, vsb ,hsb);

        c.add(jsp, FlowLayout.LEFT);

    }
    
}

/* 
<applet code=table.class width=300 height=300></applet>
*/
