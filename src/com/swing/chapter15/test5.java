//��γ��������Ҫ��Ϊ����չʾ�й���δ���TreeModelEvent�¼�
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.*;
public class test5  implements TreeModelListener
{
	JLabel label;
	String nodeName = null; //ԭ�нڵ�����
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode node1;
	DefaultMutableTreeNode node2;
	DefaultMutableTreeNode node3;
	DefaultMutableTreeNode node4;
	JTree tree;
	DefaultTreeModel treeModel;
  public test5()
  {
    JFrame f=new JFrame("����Ҫ������嵥");
    Container contentPane=f.getContentPane();
    Container con=new Container();
    root=new DefaultMutableTreeNode("����Ҫ����Ķ���");	
    node1=new DefaultMutableTreeNode("�߲�");
    node2=new DefaultMutableTreeNode("ˮ��");
    node3=new DefaultMutableTreeNode("��Ʒ");
    node4=new DefaultMutableTreeNode("����С���");
    root.add(node1);
    root.add(node2);
    root.add(node3);
    root.add(node4);
    
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("�ײ�");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("ƻ��");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("�㽶");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node2.add(leafnode);
    
   leafnode=new DefaultMutableTreeNode("��Ʒ");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("ę́��");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("Ӫ����Ƭ");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����ʳƷ");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("ζ��");
    node4.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("����");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("ϴ�ྫ");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("���մ�");
    node4.add(leafnode);
    
    tree=new JTree(root);
    tree.setEditable(true);//����JTreeΪ�ɱ༭��
    tree.addMouseListener(new MouseHandle());//ʹTree������Mouse�¼����Ա�ȡ�ýڵ����� 
    final DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();//��������ȡ��DefaultTreeModel,������Ƿ���TreeModelEvent�¼�
    treeModel.addTreeModelListener(this);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(tree);
    
    label = new JLabel("��������Ϊ: ");
    JButton b1=new JButton("���ӽڵ�");
    JButton b2=new JButton("ɾ���ڵ�");
con.setLayout(new FlowLayout());
    con.add(b1);
    con.add(b2);
    con.add(label);
    contentPane.add(scrollPane,BorderLayout.CENTER);
    contentPane.add(con,BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
 b1.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent Event) 
        {
    		 DefaultMutableTreeNode parentNode=null;
     	 	 DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("�½ڵ�");
     	 	 newNode.setAllowsChildren(true);
     	 	 TreePath parentPath=tree.getSelectionPath();
     	 	 parentNode=(DefaultMutableTreeNode)(parentPath.getLastPathComponent());//ȡ���½ڵ�ĸ��ڵ�
     	 	 treeModel.insertNodeInto(newNode,parentNode,parentNode.getChildCount());//��DefaultTreeModel��insertNodeInto�������������½ڵ�
     	 	 tree.scrollPathToVisible(new TreePath(newNode.getPath()));  //tree��scrollPathToVisible()������ʹTree���Զ�չ���ļ����Ա���ʾ��������½ڵ㡣��û�������������½ڵ�,�ᱻ �����ļ����У���������չ���ļ��вſ��õ���	 	 
     	 	 label.setText("�����ڵ�ɹ�");
        }
    });
    b2.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent Event) 
        {
    		TreePath treepath=tree.getSelectionPath();
      	 	if (treepath!=null){
      	 	  DefaultMutableTreeNode selectionNode=(DefaultMutableTreeNode)treepath.getLastPathComponent();//��������ȡ��ѡȡ�ڵ�ĸ��ڵ�.
      	 	  TreeNode parent=(TreeNode)selectionNode.getParent();
      	 	  if (parent!=null)	{
      	 	  	 treeModel.removeNodeFromParent(selectionNode); //��DefaultTreeModel��removeNodeFromParent()����ɾ���ڵ㣬���������ӽڵ㡣
      	 	  	 label.setText("ɾ���ڵ�ɹ�");
      	 	  }
      	 	}  	 	
      	 }
    });
    

}
/*������ʵ��TreeModelListener�ӿڣ����ӿڹ������ĸ��������ֱ���TreeNodesChanged()
 *treeNodesInserted()��treeNodesRemoved()��treeNodesRemoved()��
 *treeStructureChanged().�ڴ˷���������ֻ��Ը��Ľڵ�ֵ�Ĳ��ݣ����ֻʵ��
 *treeNodesChanged()����.
 */
public void treeNodesChanged(TreeModelEvent e) {
    
    TreePath treePath = e.getTreePath();
    DefaultMutableTreeNode node = (DefaultMutableTreeNode)treePath.getLastPathComponent();
    try 
    {
    int[] index = e.getChildIndices();
    node = (DefaultMutableTreeNode)node.getChildAt(index[0]);
    } 
    catch (NullPointerException exc) {}
    label.setText(nodeName+"��������Ϊ: "+(String)node.getUserObject());
}
public void treeNodesInserted(TreeModelEvent e) 
{
}
public void treeNodesRemoved(TreeModelEvent e) 
{
}
public void treeStructureChanged(TreeModelEvent e) 
{
}
public static void main(String args[]) {

    new test5();
}
���洦���˽ڵ�仯�¼������潫�����й����˫������¼�������롣
class MouseHandle extends MouseAdapter
{//����Mouse��ѡ�¼�
    public void mousePressed(MouseEvent e) 
    {
        try{
          JTree tree = (JTree)e.getSource();      
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
        }catch(NullPointerException ne){}
    }
}
}
