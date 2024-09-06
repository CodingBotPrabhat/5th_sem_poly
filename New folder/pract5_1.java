import java.awt.*;
public class pract5_1 extends Frame
{
    pract5_1()
    {
        setSize(300,300);
        setVisible(true);

        MenuBar m = new MenuBar();
        setMenuBar(m);

        Menu f = new Menu("File");
        Menu e = new Menu("Edit");

        MenuItem nw = new MenuItem("New");
        MenuItem cl = new MenuItem("Close");
        MenuItem op = new MenuItem("Open");

        m.add(f);
        f.add(nw);
        f.add(cl);
        f.add(op);

        MenuItem ct = new MenuItem("Cut");
        MenuItem cpy = new MenuItem("Copy");
        MenuItem pst = new MenuItem("Paste");

        m.add(e);
        e.add(ct);
        e.add(cpy);
        e.add(pst);

    }
    public static void main(String[] args) 
    {
        new pract5_1();
    }   
}
