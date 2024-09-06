import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class pract7_ex1 extends JApplet
{
	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		DefaultMutableTreeNode C , c1 , c2,c3,c4,c11,c12,c13,c14,c15,c21,c22,c23,c24,c25,c31,c32,c33,c34,c35;
		DefaultMutableTreeNode c41,c42,c43,c44,c45;
		C = new DefaultMutableTreeNode("Windows (C:)");
		JTree t = new JTree(C);
		c1 = new DefaultMutableTreeNode("Program Data");
		c2 = new DefaultMutableTreeNode("Program Files (x86)");
		c3 = new DefaultMutableTreeNode("Program Files");
		c4 = new DefaultMutableTreeNode("AMD");	
		C.add(c1);
		C.add(c2);
		C.add(c3);
		C.add(c4);
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp = new JScrollPane(t , v, h);
		c.add(jsp);
		// c1
		c11 = new DefaultMutableTreeNode("Boost_interprocess");
		c12 = new DefaultMutableTreeNode("Express VPN");
		c13 = new DefaultMutableTreeNode("HP");
		c14 = new DefaultMutableTreeNode("McAfee");
		c15 = new DefaultMutableTreeNode("Microsoft OneDrive");
		c1.add(c11);
		c1.add(c12);
		c1.add(c13);
		c1.add(c14);
		c1.add(c15);
		// c2
		c21 = new DefaultMutableTreeNode("Common Files");
		c22 = new DefaultMutableTreeNode("Hewlett-Packard");
		c23 = new DefaultMutableTreeNode("Internet Explorer");
		c24 = new DefaultMutableTreeNode("Microsoft");
		c25 = new DefaultMutableTreeNode("MySQL");
		c2.add(c21);
		c2.add(c22);
		c2.add(c23);
		c2.add(c24);
		c2.add(c25);
		// c3
		c31 = new DefaultMutableTreeNode("WindowsPowerShell");
		c32 = new DefaultMutableTreeNode("Windows Mail");
		c33 = new DefaultMutableTreeNode("HPCommRecovery");
		c34 = new DefaultMutableTreeNode("Java");
		c35 = new DefaultMutableTreeNode("Microsoft Office 15");
		c3.add(c31);
		c3.add(c32);
		c3.add(c33);
		c3.add(c34);
		c3.add(c35);
		// c4
		c41 = new DefaultMutableTreeNode("CIM");
		c42 = new DefaultMutableTreeNode("CNext");
		c43 = new DefaultMutableTreeNode("InstallUEP");
		c44 = new DefaultMutableTreeNode("RyzenMasterSDK");
		c45 = new DefaultMutableTreeNode("WVR");
		c4.add(c41);
		c4.add(c42);
		c4.add(c43);
		c4.add(c44);
		c4.add(c45);	
	}   
}
/*<applet code=pract7_ex1.class width=400 height=520>
</applet>
*/
