import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;	
import java.applet.*;
import javax.swing.JScrollPane;

public class pract7_X2 extends JApplet
{

	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		
		DefaultMutableTreeNode ind , mh, gj , mum,pune,nas,nag;
		ind = new DefaultMutableTreeNode("India");
		JTree t = new JTree(ind);

		mh = new DefaultMutableTreeNode("Maharashtra");
		gj = new DefaultMutableTreeNode("Gujarat");

		ind.add(mh);
		ind.add(gj);

		mum = new DefaultMutableTreeNode("Mumbai");
		mh.add(mum);
		pune = new DefaultMutableTreeNode("Pune");
		mh.add(pune);
		nas = new DefaultMutableTreeNode("Nashik");
		mh.add(nas);
		nag = new DefaultMutableTreeNode("Nagpur");
		mh.add(nag);

		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;

		JScrollPane jsp;
        jsp = new JScrollPane(t, v, h);

		c.add(jsp);
	
	}
    
}

/*
<applet code=pract7_X2.class width=300 height=300></applet>

*/





