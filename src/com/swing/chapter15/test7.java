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
public class test7  implements TreeModelListener
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
  public test7()
  {
    ………………………………….与上例中加黑部分内容相同
tree.addMouseListener(new MouseHandle());
class MouseHandle extends MouseAdapter
{//处理Mouse点选事件
    public void mousePressed(MouseEvent e) 
    {
    	 String nodeName;
        try{
          JTree tree = (JTree)e.getSource(); //当单击鼠标，在右边会显示出相应的数据信息
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
          dd.ta1.setText("1中含有丰富的碳水化合物、维生素和微量元素。尤维生素A和胡萝卜素的含量较高。 ");//在右边文本区中所显示的数据信息
          dd.ta2.setText("可以吃、治病。 ");
          dd.ta3.setText("上海的比较便宜。 ");
          dd.ta4.setText("一般进货从广东惠州。 ");
          dd.ta5.setText("营养价值高，需要多买点。 ");
          
        }catch(NullPointerException ne){}
    }
}
