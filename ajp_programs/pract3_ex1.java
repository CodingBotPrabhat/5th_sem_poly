import java.awt.*;

public class pract3_ex1 extends Frame
{
    pract3_ex1()
    {
    setVisible(true);
	setSize(500,500);
	setLayout(new GridLayout(3,2,30,30));

	Button btnarray[] = new Button[5] ;
		for(int j=0;j<6 ; j++)
		{
			String s = "Button " + (j+1);
			btnarray[j] = new Button(s);
			add(btnarray[j]);
		}

    }

	public static void main(String []args)
	{
		new pract3_ex1();
	}
    
}
