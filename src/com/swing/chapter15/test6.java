//��γ��������ҪΪ����չʾ��δ���TreeSelectionModel�¼����������ǵ�ѡ���������һ���ڵ�ʱ������ʾ����Ӧ������
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
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;
public class test6  implements TreeModelListener,TreeSelectionListener
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
	JPanel p1;
	JPanel p2;
	JPanel p3;
	static JTextArea ta1;
	static JTextArea ta2;
	static JTextArea ta3;
	static JTextArea ta4;
	static JTextArea ta5;
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
  public test6()
  {
    
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    label = new JLabel("��������Ϊ: ");
    ta1=new JTextArea(30,30);
    ta2=new JTextArea(40,40);
    ta3=new JTextArea(40,40);
    ta4=new JTextArea(40,40);
    ta5=new JTextArea(40,40);
    JTabbedPane tp=new JTabbedPane();
    panel1 = new JPanel ();
    panel2 = new JPanel ();
    panel3 = new JPanel ();
    panel4 = new JPanel ();
    panel5 = new JPanel ();
    tp.addTab("panel1", panel1);
    tp.setEnabledAt(0,true);
    tp.setTitleAt(0,"���");
    tp.addTab ("panel2", panel2);
    tp.setEnabledAt (1, true);
    tp.setTitleAt (1,"�ô�");
    tp.addTab ("panel3", panel3);
    tp.setEnabledAt (2, true);
    tp.setTitleAt (2,"���رȽ�");
    tp.addTab ("panel4", panel4);
    tp.setEnabledAt(0,true);
    tp.setTitleAt(3,"һ�������Դ");
    tp.addTab ("panel5", panel5);
    tp.setEnabledAt(4,true);
    tp.setTitleAt(4," ��ע");
    tp.setPreferredSize (new Dimension (500,200));
    tp.setTabPlacement (JTabbedPane.TOP);
    tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
    panel1.setLayout(new FlowLayout());
    panel1.add(ta1);
    panel2.setLayout(new FlowLayout());
    panel2.add(ta2);
    panel3.setLayout(new FlowLayout());
    panel3.add(ta3);
    panel4.setLayout(new FlowLayout());
    panel4.add(ta4);
    panel5.setLayout(new FlowLayout());
    panel5.add(ta5);
    
    JSplitPane splitPane = new JSplitPane ();
    splitPane.setOneTouchExpandable (true);
    splitPane.setContinuousLayout (true);
    splitPane.setPreferredSize (new Dimension (100,200));
    splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT);
    splitPane.setLeftComponent (p1);
    splitPane.setRightComponent (p2);
    splitPane.setDividerSize (3);
    splitPane.setDividerLocation(50);
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

    JSplitPane splitPane1 = new JSplitPane ();
    splitPane1.setOneTouchExpandable (true);
    splitPane1.setContinuousLayout (true);
    splitPane1.setPreferredSize (new Dimension (100,200));
    splitPane1.setOrientation (JSplitPane.VERTICAL_SPLIT);
    splitPane1.setTopComponent (scrollPane);
    splitPane1.setBottomComponent (label);
    splitPane1.setDividerSize (1);
    splitPane1.setDividerLocation(80);
    p3.setLayout(new FlowLayout());
    JSplitPane splitPane2 = new JSplitPane ();
    splitPane2.setOneTouchExpandable (true);
    splitPane2.setContinuousLayout (true);
    splitPane2.setPreferredSize (new Dimension (100,200));
    splitPane2.setOrientation (JSplitPane.VERTICAL_SPLIT);
    splitPane2.setTopComponent (tp);
    splitPane2.setBottomComponent (p3);
    splitPane2.setDividerSize (1);
    splitPane2.setDividerLocation(80);
    p1.setLayout(new GridLayout(1,1));
    p1.add(splitPane1);
    p2.setLayout(new GridLayout(1,1));
    p2.add(splitPane2);
    f.setContentPane(splitPane);
    f.pack();
    f.setVisible(true);
    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION); //��������ѡ��ģʽ
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });


/*������ʵ��TreeModelListener�ӿڣ����ӿڹ������ĸ��������ֱ���TreeNodesChanged()
 *treeNodesInserted()��treeNodesRemoved()��treeNodesRemoved()��
 *treeStructureChanged().�ڴ˷���������ֻ��Ը��Ľڵ�ֵ�Ĳ��ݣ����ֻʵ��
 *treeNodesChanged()����.
 */
  tree.addTreeSelectionListener(new TreeSelectionListener() 
{//������Ҫ����Ӧ���ڵ��ѡ���¼�
      public void valueChanged(TreeSelectionEvent e) 
{
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
            .getPath().getLastPathComponent();//����ѡ�Ľڵ�ģ�ͻ�
        ta1.setText("You selected " + node);
      }
    });
  }
public void treeNodesChanged(TreeModelEvent e) 
{//����ķ�����Ҫ�ǵ��ڵ㷢���ı�ʱ����Ӧ�Ļ��ڱ�ǩ����ʾ���޸�ǰ�����ݺ��޸ĺ������
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
public void valueChanged(TreeSelectionEvent e) 
{
	   TreePath path = tree.getSelectionPath();
    if (path == null)
      return;
    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path
        .getLastPathComponent();
    ta1.setText(selectedNode.toString());
    }
public static void main(String args[]) {
    new test6();
}
}
