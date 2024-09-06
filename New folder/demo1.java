import java.awt.*;
import javax.swing.*;
public class demo extends JApplet{
    public void init()
    {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JTextArea ta = new JTextArea(10,10);

        //JTextArea ta1 = new JTextArea(10,10);

        

        JScrollPane jsp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //JScrollPane jsp1 = new JScrollPane(ta1,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
       

        c.add(jsp);
        //c.add(jsp1);



        /*
        //CHOICE
        Choice c = new Choice();

        c.add("Hello");
        c.add("java");
        c.add("Python");

        add(c);
        c.select(2);
        String s = c.getItem(0);
        String s2 = c.getSelectedItem();
        int a = c.getSelectedIndex();
        int b = c.getItemCount();
        System.out.println("Get item " +s);
        System.out.println("selected item : " +s2);
        System.out.println("selected inedex : " +a);
        System.out.println("Item count : " +b); */
        

        /*

        // TEXTFIELD

        String getText();
        void setText();
        boolean isEditable();
        void setEditable();
        String getSelectedText();
        void setEchoChar('char');
        Char getEchoChar();
        */

        /*
        TextField tf = new TextField();

        boolean b;
        String s1,s2,s3;

        b = tf.isEditable();
        System.out.println("Editable : " +b);

        tf.setText("Hello my name is prabhat");
        s1 = tf.getText();
        System.out.println("Get Text : " +s1);

        tf.select(0,4);
        s2 = tf.getSelectedText();
        System.out.println("Selected Text : " +s2);

        tf.setEchoChar('+');
        char c = tf.getEchoChar();
        System.out.println("Char : " +c);

        add(tf);

        TextArea ta = new TextArea("Hello" , 10 , 20 , TextArea.SCROLLBARS_BOTH);
        add(ta); */

       


        /*
                                        LIST        
        List l1 = new List(3,true);
        l1.add("Prabhat");
        l1.add("Avinash");
        l1.add("Nandini");

        add(l1);

        l1.select(0);
        l1.select(1);
        String s1[] = l1.getSelectedItems();
        System.out.println("Selected Item : ");
        for(int i=0 ; i<s1.length ; i++)
        {
            System.out.print(s1[i]);
        }

        String s2 = l1.getItem(2);
        System.out.println("Get Item : " +s2);*/
        

       

        

        
    } 

/*
    demo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(3,2,10,15));
        
        Button b1,b2,b3,b4,b5;
        b1= new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        b5 = new Button("Button5");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        
    }

    public static void main(String[] args) {
        new demo();

    } */
     
}

/* 
<applet code=demo.class width=300 height=200>
</applet> 
*/
