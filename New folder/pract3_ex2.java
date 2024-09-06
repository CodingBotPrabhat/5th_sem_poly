import java.awt.*;
public class pract3_ex2 extends Frame
{
    pract3_ex2()
    {
        setSize(500,500);
        setVisible(true);
        setLayout(new BorderLayout(00,00));

        Button b1,b2,b3,b4,b5;

        b1 = new Button("North");
        b2 = new Button("South");
        b3 = new Button("East");
        b4 = new Button("West");
        b5 = new Button("Center");

        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3 , BorderLayout.EAST);
        add(b4 , BorderLayout.WEST);
        add(b5 , BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new pract3_ex2();
    }
}
