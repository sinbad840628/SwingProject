//��γ��������Ҫ��Ϊ����չʾ��δ���TreeModelEvent�¼�����������иı�ڵ㣬ͨ���ڱ�ǩ�������ʾ���ı�Ľ�����������¼�
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.*;
public class test4 implements TreeModelListener
{
	 JLabel label;
String nodeName = null; //ԭ�нڵ�����
  public test4()
  {
    JFrame f=new JFrame("����Ҫ������嵥");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("����Ҫ����Ķ���");	
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�߲�");
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("ˮ��");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("��Ʒ");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("����С���");
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
    
    JTree tree=new JTree(root);
    tree.setEditable(true);//����JTreeΪ�ɱ༭��
    tree.addMouseListener(new MouseHandle());//��Tree������Mouse�¼����Ա�ȡ�ýڵ����� 
    
    DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();//��������ȡ��DefaultTreeModel,������Ƿ���TreeModelEvent�¼�.
    treeModel.addTreeModelListener(this);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(tree);
    
    label = new JLabel("��������Ϊ: ");
    contentPane.add(scrollPane,BorderLayout.CENTER);
    contentPane.add(label,BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });

}
public void treeNodesChanged(TreeModelEvent e) 
{/*������ʵ��TreeModelListener�ӿڣ����ӿڹ������ĸ��������ֱ���TreeNodesChanged()
 *treeNodesInserted()��treeNodesRemoved()��treeNodesRemoved()��treeStructureChanged().�ڴ˷�����ֻ��Ը��Ľڵ�ֵ�Ĳ��ݣ����ֻҪʵ��treeNodesChanged()����.
 */
    TreePath treePath = e.getTreePath();//��ȡĿǰ��ѡȡ�ڵ����·��
    DefaultMutableTreeNode node = (DefaultMutableTreeNode)treePath.getLastPathComponent();//�����ѡȡ�ڵ�
    try 
    {//��ȡ���ӽڵ�Ľڵ���ţ���Դ���Ż�����ӽڵ�
    int[] index = e.getChildIndices(); 
    node = (DefaultMutableTreeNode)node.getChildAt(index[0]);
    } 
    catch (NullPointerException exc) {}
    label.setText(nodeName+"��������Ϊ: "+(String)node.getUserObject());//���ڵ�������ʾ�ڱ�ǩ��
}
public void treeNodesInserted(TreeModelEvent e) {
}
public void treeNodesRemoved(TreeModelEvent e) {
}
public void treeStructureChanged(TreeModelEvent e) {
}

public static void main(String args[]) {

    new test4();
}

class MouseHandle extends MouseAdapter
{//����Mouse��ѡ�¼�
    public void mousePressed(MouseEvent e) 
    {
        try{
          JTree tree = (JTree)e.getSource();//���������еĽڵ�ʱ�����ȡ�ڵ������     
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
        }catch(NullPointerException ne){}
    }
}
}
