import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;


public class help 
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
	JTree tree;
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode node1;
	DefaultMutableTreeNode node2;
	DefaultMutableTreeNode node3;
	DefaultMutableTreeNode node4;
	static JTextArea text;
	help()
	{
		   JFrame frame=new JFrame();
		   frame.setTitle("通讯录系统帮助文档");
		   frame.setSize(WIDTH,HEIGHT);
		
		
		    root=new DefaultMutableTreeNode("通讯录系统帮助文档");	
		    node1=new DefaultMutableTreeNode("如何操作同学通讯系统");
		    node2=new DefaultMutableTreeNode("如何操作同事通讯系统");
		    node3=new DefaultMutableTreeNode("如何操作朋友通讯系统");
		    node4=new DefaultMutableTreeNode("如何操作查询系统");
		    root.add(node1);
		    root.add(node2);
		    root.add(node3);
		    root.add(node4);
		    
		    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("如何使用同学信息模块");
		    node1.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("如何使用同学通讯模块");
		    node1.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("如何使用同事信息模块");
		    node2.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("如何使用同事通讯模块");
		    node2.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("如何使用朋友信息模块");
		    node3.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("如何使用朋友通讯模块");
		    node3.add(leafnode);
		    
		    tree=new JTree(root);
		    JScrollPane scrollpane=new JScrollPane(tree);
		    JPanel p1=new JPanel();
		    JPanel p2=new JPanel();
		    JSplitPane splitPane = new JSplitPane ();
		    splitPane.setOneTouchExpandable (true);
		    splitPane.setContinuousLayout (true);
		    splitPane.setPreferredSize (new Dimension (100,200));
		    splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT);
		    splitPane.setLeftComponent (p1);
		    splitPane.setRightComponent (p2);
		    splitPane.setDividerSize (3);
		    splitPane.setDividerLocation(200);
		    frame.setContentPane(splitPane);
		    p1.add(scrollpane);
		    frame.setVisible(true);
		    tree.addMouseListener(new MouseHandle());
		    text=new JTextArea();
		    p2.add(text);
		    

	}

}
class MouseHandle extends MouseAdapter
{
    public void mousePressed(MouseEvent e) 
    {
    	 String nodeName;
        try{
///当点击鼠标，在右边会显示出相应的数据信息
          JTree tree = (JTree)e.getSource();      
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
///在右边文本区中所显示的数据信息
          help.text.setText("要想查询如何使用"+nodeName+"模块相关知识，请查阅光盘");
          
        }catch(NullPointerException ne){}
    }
}

