import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
public class test11 extends JPanel 
{
	static final int WIDTH=300;
	static final int HEIGHT=800;
	JTree tree;
	static JTextArea text;
	test11()
	{
		JFrame frame=new JFrame();
		frame.setTitle("树组件测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.pack();
		
		 DefaultMutableTreeNode root=new DefaultMutableTreeNode("家庭用品");//使用DefaultMutableTreeNode的构造器创建根节点
         ///使用DefaultMutableTreeNode的构造器创建四个枝节点	
		 DefaultMutableTreeNode node1=new DefaultMutableTreeNode("家用电器");
		 DefaultMutableTreeNode node2=new DefaultMutableTreeNode("厨具");
		 DefaultMutableTreeNode node3=new DefaultMutableTreeNode("家具");
		 DefaultMutableTreeNode node4=new DefaultMutableTreeNode("书");

		 root.add(node1);
		 root.add(node2);
		 root.add(node3);
		 root.add(node4);
		 
		 DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("电视机");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("洗衣机");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("影碟机");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("空调");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("冰箱");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("微波炉");
		 node1.add(leafnode);
		    
		 leafnode=new DefaultMutableTreeNode("锅");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("汤勺");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("搅拌机");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("锅铲");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("菜刀");
		 node2.add(leafnode);
		    
		 leafnode=new DefaultMutableTreeNode("大衣柜");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("饭桌");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("床");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("书桌");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("书柜");
		 node3.add(leafnode);
		 
		 leafnode=new DefaultMutableTreeNode("电脑书");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("小说");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("课本");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("字典");
		 node4.add(leafnode);
		 
		 JTree tree=new JTree(root);
		 JScrollPane scrollPane=new JScrollPane();
		 scrollPane.setViewportView(tree);

		 
		 text=new JTextArea(3,3);
	     tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
	     add(text);
	     frame.setContentPane(this);
	     tree.addMouseListener(new MouseHandle1());

	}
	public static void main(String[] args)
	{
		new test11();
	}	
}
class MouseHandle1 extends MouseAdapter
{
    public void mousePressed(MouseEvent e) 
    {
    	 String nodeName;
        try{

          JTree tree = (JTree)e.getSource();//当单击鼠标，在右边会显示出相应的数据信息      
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();

          test.text.setText(nodeName); //在右边文本区中所显示的数据信息
          
        }catch(NullPointerException ne){}
    }
}
