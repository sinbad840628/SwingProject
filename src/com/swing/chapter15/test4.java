//这段程序代码主要是为读者展示如何处理TreeModelEvent事件，这个程序中改变节点，通过在标签组件中显示出改变的结果来处理其事件
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
String nodeName = null; //原有节点名称
  public test4()
  {
    JFrame f=new JFrame("今天要购买的清单");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("今天要购买的东西");	
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("蔬菜");
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("水果");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("礼品");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("家用小物件");
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
    
    JTree tree=new JTree(root);
    tree.setEditable(true);//设置JTree为可编辑的
    tree.addMouseListener(new MouseHandle());//在Tree加入检测Mouse事件，以便取得节点名称 
    
    DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();//下面两行取得DefaultTreeModel,并检测是否有TreeModelEvent事件.
    treeModel.addTreeModelListener(this);
    
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(tree);
    
    label = new JLabel("更改数据为: ");
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
{/*本方法实作TreeModelListener接口，本接口共定义四个方法，分别是TreeNodesChanged()
 *treeNodesInserted()、treeNodesRemoved()、treeNodesRemoved()、treeStructureChanged().在此范例中只针对更改节点值的部份，因此只要实现treeNodesChanged()方法.
 */
    TreePath treePath = e.getTreePath();//获取目前所选取节点的树路径
    DefaultMutableTreeNode node = (DefaultMutableTreeNode)treePath.getLastPathComponent();//获得所选取节点
    try 
    {//获取其子节点的节点序号，针对此序号获得其子节点
    int[] index = e.getChildIndices(); 
    node = (DefaultMutableTreeNode)node.getChildAt(index[0]);
    } 
    catch (NullPointerException exc) {}
    label.setText(nodeName+"更改数据为: "+(String)node.getUserObject());//将节点内容显示在标签中
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
{//处理Mouse点选事件
    public void mousePressed(MouseEvent e) 
    {
        try{
          JTree tree = (JTree)e.getSource();//当单击树中的节点时，会获取节点的内容     
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
        }catch(NullPointerException ne){}
    }
}
}
