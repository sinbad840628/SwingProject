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
		frame.setTitle("��������Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.pack();
		
		 DefaultMutableTreeNode root=new DefaultMutableTreeNode("��ͥ��Ʒ");//ʹ��DefaultMutableTreeNode�Ĺ������������ڵ�
         ///ʹ��DefaultMutableTreeNode�Ĺ����������ĸ�֦�ڵ�	
		 DefaultMutableTreeNode node1=new DefaultMutableTreeNode("���õ���");
		 DefaultMutableTreeNode node2=new DefaultMutableTreeNode("����");
		 DefaultMutableTreeNode node3=new DefaultMutableTreeNode("�Ҿ�");
		 DefaultMutableTreeNode node4=new DefaultMutableTreeNode("��");

		 root.add(node1);
		 root.add(node2);
		 root.add(node3);
		 root.add(node4);
		 
		 DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("���ӻ�");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("ϴ�»�");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("Ӱ����");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("�յ�");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("����");
		 node1.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("΢��¯");
		 node1.add(leafnode);
		    
		 leafnode=new DefaultMutableTreeNode("��");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("����");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("�����");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("����");
		 node2.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("�˵�");
		 node2.add(leafnode);
		    
		 leafnode=new DefaultMutableTreeNode("���¹�");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("����");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("��");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("����");
		 node3.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("���");
		 node3.add(leafnode);
		 
		 leafnode=new DefaultMutableTreeNode("������");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("С˵");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("�α�");
		 node4.add(leafnode);
		 leafnode=new DefaultMutableTreeNode("�ֵ�");
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

          JTree tree = (JTree)e.getSource();//��������꣬���ұ߻���ʾ����Ӧ��������Ϣ      
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();

          test.text.setText(nodeName); //���ұ��ı���������ʾ��������Ϣ
          
        }catch(NullPointerException ne){}
    }
}
