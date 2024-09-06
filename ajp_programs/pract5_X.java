import java.awt.*;

public class pract5_X extends Frame
{pract5_X()
    {
        setSize(500,500);
        setVisible(true);

        MenuBar m = new MenuBar();
        setMenuBar(m);

        Menu m1 = new Menu("Orange");
        Menu m2 = new Menu("Green");
        Menu m3 = new Menu("Black");

        m.add(m1);
        m.add(m2);
        m.add(m3);

        MenuItem moitem1 = new MenuItem("Orange Item1");
        MenuItem moitem2 = new MenuItem("Orange Item2");
        m1.add(moitem1);
        m1.add(moitem2);

        MenuItem mgitem = new MenuItem("Green item1");
        MenuItem mgitem2 = new MenuItem("Green item2");
        m2.add(mgitem);
        m2.add(mgitem2);

        m3.setEnabled(false);
    }public static void main(String[] args){
        new pract5_X();
    }
}
