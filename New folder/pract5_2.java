import java.awt.*;
public class pract5_2 extends Frame
{
    pract5_2()
    {
        setSize(400,400);
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

        MenuItem e1 = new MenuItem("Cut");
        MenuItem e2 = new MenuItem("Copy");
        MenuItem e3 = new MenuItem("Paste");
        MenuItem e4 = new MenuItem("Testing");
        e.add(e1);
        e.add(e2);
        e.add(e3);
       

        Menu special = new Menu("Special");
        MenuItem s1 = new MenuItem("First");
        MenuItem s2 = new MenuItem("Second");
        MenuItem s3 = new MenuItem("Third");
        special.add(s1);
        special.add(s2);
        special.add(s3);
        e.add(special);

        CheckboxMenuItem cb = new CheckboxMenuItem("Debug");
        e.add(cb);
        e.add(e4);
        cb.setState(true);

        m.add(e);
        
    }
    public static void main(String[] args) 
    {
        new pract5_2();
    }
}
