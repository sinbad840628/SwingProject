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
public class test7  implements TreeModelListener
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
  public test7()
  {
    ��������������������������.�������мӺڲ���������ͬ
tree.addMouseListener(new MouseHandle());
class MouseHandle extends MouseAdapter
{//����Mouse��ѡ�¼�
    public void mousePressed(MouseEvent e) 
    {
    	 String nodeName;
        try{
          JTree tree = (JTree)e.getSource(); //��������꣬���ұ߻���ʾ����Ӧ��������Ϣ
          int rowLocation = tree.getRowForLocation(e.getX(), e.getY());          
          TreePath treepath = tree.getPathForRow(rowLocation);
          TreeNode treenode = (TreeNode) treepath.getLastPathComponent(); 
          nodeName = treenode.toString();
          dd.ta1.setText("1�к��зḻ��̼ˮ�����ά���غ�΢��Ԫ�ء���ά����A�ͺ��ܲ��صĺ����ϸߡ� ");//���ұ��ı���������ʾ��������Ϣ
          dd.ta2.setText("���Գԡ��β��� ");
          dd.ta3.setText("�Ϻ��ıȽϱ��ˡ� ");
          dd.ta4.setText("һ������ӹ㶫���ݡ� ");
          dd.ta5.setText("Ӫ����ֵ�ߣ���Ҫ����㡣 ");
          
        }catch(NullPointerException ne){}
    }
}
