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
		   frame.setTitle("ͨѶ¼ϵͳ�����ĵ�");
		   frame.setSize(WIDTH,HEIGHT);
		
		
		    root=new DefaultMutableTreeNode("ͨѶ¼ϵͳ�����ĵ�");	
		    node1=new DefaultMutableTreeNode("��β���ͬѧͨѶϵͳ");
		    node2=new DefaultMutableTreeNode("��β���ͬ��ͨѶϵͳ");
		    node3=new DefaultMutableTreeNode("��β�������ͨѶϵͳ");
		    node4=new DefaultMutableTreeNode("��β�����ѯϵͳ");
		    root.add(node1);
		    root.add(node2);
		    root.add(node3);
		    root.add(node4);
		    
		    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("���ʹ��ͬѧ��Ϣģ��");
		    node1.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("���ʹ��ͬѧͨѶģ��");
		    node1.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("���ʹ��ͬ����Ϣģ��");
		    node2.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("���ʹ��ͬ��ͨѶģ��");
		    node2.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("���ʹ��������Ϣģ��");
		    node3.add(leafnode);
		    leafnode=new DefaultMutableTreeNode("���ʹ������ͨѶģ��");
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
///�������꣬���ұ߻���ʾ����Ӧ��������Ϣ
          JTree tree = (JTree)e.getSource();      
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
///���ұ��ı���������ʾ��������Ϣ
          help.text.setText("Ҫ���ѯ���ʹ��"+nodeName+"ģ�����֪ʶ������Ĺ���");
          
        }catch(NullPointerException ne){}
    }
}

