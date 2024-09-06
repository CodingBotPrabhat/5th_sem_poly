import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class pract7_X1 extends JApplet
{
    public void init()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		DefaultMutableTreeNode root,A,B,a1,a2,b1,b2;
		JTree t;

		root = new DefaultMutableTreeNode("Default");
		t = new JTree(root);
		

		A = new DefaultMutableTreeNode("A");
		B = new DefaultMutableTreeNode("B");

		a1 = new DefaultMutableTreeNode("a1");
		a2 = new DefaultMutableTreeNode("a2");

		b1 = new DefaultMutableTreeNode("b1");
		b2 = new DefaultMutableTreeNode("b2");

		root.add(A);
		root.add(B);

		A.add(a1);
		A.add(a2);

		B.add(b1);
		B.add(b2);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;

JScrollPane jsp = new JScrollPane(t, v, h);
		
		c.add(jsp , BorderLayout.CENTER);
			
	}
}


/*
<applet code=pract7_X1.class width=300 height=300></applet>
*/
