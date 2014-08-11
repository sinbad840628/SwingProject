//这段程序代码主要是为读者展示有关如何处理TreeModelEvent事件
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
	String nodeName = null; //原有节点名称
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode node1;
	DefaultMutableTreeNode node2;
	DefaultMutableTreeNode node3;
	DefaultMutableTreeNode node4;
	JTree tree;
	DefaultTreeModel treeModel;
  public test5()
  {
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
    
    label = new JLabel("更改数据为: ");
    JButton b1=new JButton("增加节点");
    JButton b2=new JButton("删除节点");
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
     	 	 DefaultMutableTreeNode newNode=new DefaultMutableTreeNode("新节点");
     	 	 newNode.setAllowsChildren(true);
     	 	 TreePath parentPath=tree.getSelectionPath();
     	 	 parentNode=(DefaultMutableTreeNode)(parentPath.getLastPathComponent());//取得新节点的父节点
     	 	 treeModel.insertNodeInto(newNode,parentNode,parentNode.getChildCount());//由DefaultTreeModel的insertNodeInto（）方法增加新节点
     	 	 tree.scrollPathToVisible(new TreePath(newNode.getPath()));  //tree的scrollPathToVisible()方法在使Tree会自动展开文件夹以便显示所加入的新节点。若没加这行则加入的新节点,会被 包在文件夹中，必须自行展开文件夹才看得到。	 	 
     	 	 label.setText("新增节点成功");
        }
    });
    b2.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent Event) 
        {
    		TreePath treepath=tree.getSelectionPath();
      	 	if (treepath!=null){
      	 	  DefaultMutableTreeNode selectionNode=(DefaultMutableTreeNode)treepath.getLastPathComponent();//下面两行取得选取节点的父节点.
      	 	  TreeNode parent=(TreeNode)selectionNode.getParent();
      	 	  if (parent!=null)	{
      	 	  	 treeModel.removeNodeFromParent(selectionNode); //由DefaultTreeModel的removeNodeFromParent()方法删除节点，包含它的子节点。
      	 	  	 label.setText("删除节点成功");
      	 	  }
      	 	}  	 	
      	 }
    });
    

}
/*本方法实作TreeModelListener接口，本接口共定义四个方法，分别是TreeNodesChanged()
 *treeNodesInserted()、treeNodesRemoved()、treeNodesRemoved()、
 *treeStructureChanged().在此范例中我们只针对更改节点值的部份，因此只实作
 *treeNodesChanged()方法.
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
public static void main(String args[]) {

    new test5();
}
上面处理了节点变化事件，下面将给出有关鼠标双击后的事件处理代码。
class MouseHandle extends MouseAdapter
{//处理Mouse点选事件
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
