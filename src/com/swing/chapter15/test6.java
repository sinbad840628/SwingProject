//这段程序代码主要为读者展示如何处理TreeSelectionModel事件，在这里是当选择树组件的一个节点时，会显示出相应的数据
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
	String nodeName = null; //原有节点名称
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
    label = new JLabel("更改数据为: ");
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
    tp.setTitleAt(0,"简介");
    tp.addTab ("panel2", panel2);
    tp.setEnabledAt (1, true);
    tp.setTitleAt (1,"用处");
    tp.addTab ("panel3", panel3);
    tp.setEnabledAt (2, true);
    tp.setTitleAt (2,"各地比较");
    tp.addTab ("panel4", panel4);
    tp.setEnabledAt(0,true);
    tp.setTitleAt(3,"一般进货来源");
    tp.addTab ("panel5", panel5);
    tp.setEnabledAt(4,true);
    tp.setTitleAt(4," 备注");
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
JFrame f=new JFrame("今天要购买的清单");
    Container contentPane=f.getContentPane();
    Container con=new Container();
    root=new DefaultMutableTreeNode("今天要购买的东西");	
    node1=new DefaultMutableTreeNode("蔬菜");
    node2=new DefaultMutableTreeNode("水果");
    node3=new DefaultMutableTreeNode("礼品");
    node4=new DefaultMutableTreeNode("家用小物件");
    root.add(node1);
    root.add(node2);
    root.add(node3);
    root.add(node4);
    
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("白菜");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("大蒜");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("土豆");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("苹果");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("香蕉");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("西瓜");
    node2.add(leafnode);
    
   leafnode=new DefaultMutableTreeNode("礼品");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("茅台酒");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("营养麦片");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("保健食品");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("味精");
    node4.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("酱油");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("洗洁精");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("保险袋");
    node4.add(leafnode);
    
    tree=new JTree(root);
    tree.setEditable(true);//设置JTree为可编辑的
    tree.addMouseListener(new MouseHandle());//使Tree加入检测Mouse事件，以便取得节点名称 
    final DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();//下面两行取得DefaultTreeModel,并检测是否有TreeModelEvent事件
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
    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION); //设置树的选择模式
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });


/*本方法实作TreeModelListener接口，本接口共定义四个方法，分别是TreeNodesChanged()
 *treeNodesInserted()、treeNodesRemoved()、treeNodesRemoved()、
 *treeStructureChanged().在此范例中我们只针对更改节点值的部份，因此只实作
 *treeNodesChanged()方法.
 */
  tree.addTreeSelectionListener(new TreeSelectionListener() 
{//下面主要是相应树节点的选择事件
      public void valueChanged(TreeSelectionEvent e) 
{
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) e
            .getPath().getLastPathComponent();//将所选的节点模型化
        ta1.setText("You selected " + node);
      }
    });
  }
public void treeNodesChanged(TreeModelEvent e) 
{//下面的方法主要是当节点发生改变时，相应的会在标签中显示出修改前的数据后修改后的数据
    TreePath treePath = e.getTreePath();
    DefaultMutableTreeNode node = (DefaultMutableTreeNode)treePath.getLastPathComponent();
    try 
    {
    int[] index = e.getChildIndices();
    node = (DefaultMutableTreeNode)node.getChildAt(index[0]);
    } 
    catch (NullPointerException exc) {}
    label.setText(nodeName+"更改数据为: "+(String)node.getUserObject());
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
