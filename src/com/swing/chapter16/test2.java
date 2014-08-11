package com.swing.chapter16;

//��γ��������ҪΪ����չʾ���Ϊÿ���������һ���۸���
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
import javax.swing.tree.*;
public class test2  
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
	JLabel label;
	String nodeName = null; //ԭ�нڵ�����
	
	JPanel p1;
	JPanel p2;
	JPanel p3;
	
	
  public test2()
  {
	 

    JFrame f=new JFrame("����Ҫ������嵥");
    p1=new JPanel();
    p2=new JPanel();
    p3=new JPanel();
    label = new JLabel("��������Ϊ: ");
    
    JSplitPane splitPane = new JSplitPane ();
    splitPane.setOneTouchExpandable (true);
    splitPane.setContinuousLayout (true);
    splitPane.setPreferredSize (new Dimension (100,200));
    splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT);
    splitPane.setLeftComponent (p1);
    splitPane.setRightComponent (p2);
    splitPane.setDividerSize (3);
    splitPane.setDividerLocation(50);

    lookandfeel1 lf=new lookandfeel1();//����lookandfeel1����
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setViewportView(lf.tree);//���������ӵ������������
    JSplitPane splitPane1 = new JSplitPane ();
    splitPane1.setOneTouchExpandable (true);
    splitPane1.setContinuousLayout (true);
    splitPane1.setPreferredSize (new Dimension (100,200));
    splitPane1.setOrientation (JSplitPane.VERTICAL_SPLIT);
    splitPane1.setTopComponent (scrollPane);
    splitPane1.setBottomComponent (label);
    splitPane1.setDividerSize (1);
    splitPane1.setDividerLocation(80);
    
    JButton b1=new JButton("���ӽڵ�");
    JButton b2=new JButton("ɾ���ڵ�");
    p3.setLayout(new FlowLayout());
    p3.add(b1);
    p3.add(b2);
    JSplitPane splitPane2 = new JSplitPane ();
    splitPane2.setOneTouchExpandable (true);
    splitPane2.setContinuousLayout (true);
    splitPane2.setPreferredSize (new Dimension (100,200));
    splitPane2.setOrientation (JSplitPane.VERTICAL_SPLIT);

    lookandfeel2 lf2=new lookandfeel2();//����lookandfeel2����
    splitPane2.setTopComponent (lf2.tp);//��JTabbedPane�����ӵ������
    splitPane2.setBottomComponent (p3);
    splitPane2.setDividerSize (1);
    splitPane2.setDividerLocation(80);
    p1.setLayout(new GridLayout(1,1));
    p1.add(splitPane1);
    p2.setLayout(new GridLayout(1,1));
    p2.add(splitPane2);
    f.setContentPane(splitPane);
    f.setSize(WIDTH,HEIGHT);
    Toolkit kit=Toolkit.getDefaultToolkit();
    Dimension screenSize=kit.getScreenSize();
    int width=screenSize.width;
    int height=screenSize.height;
     int x=(width-WIDTH)/2;
    int y=(height-HEIGHT)/2;
    f.setLocation(x,y);
    f.pack();
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });

}
public static void main(String args[]) {

    new test2();
}
}

class lookandfeel1 
{//����һ��lookandfeel1�࣬�������Ҫ�Ǵ���һ���������֮���Էŵ�����һ�����ԭ������ΪҪΪ�����������滮һ���۸���
	DefaultMutableTreeNode root;
	DefaultMutableTreeNode node1;
	DefaultMutableTreeNode node2;
	DefaultMutableTreeNode node3;
	DefaultMutableTreeNode node4;
	static JTree tree;
	DefaultTreeModel treeModel;
	lookandfeel1()
	{
		try
		  {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		  }
		  catch(Exception e){}

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
	    //��������ȡ��DefaultTreeModel,������Ƿ���TreeModelEvent�¼�.
	    final DefaultTreeModel treeModel = (DefaultTreeModel)tree.getModel();
	}
}
class lookandfeel2
{//����һ��lookandfeel2�࣬�������Ҫ�Ǵ���һ���������֮���Էŵ�����һ�����ԭ������ΪҪΪ�����������滮һ���۸���
	JPanel panel1;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	JPanel panel5;
	static JTextArea ta1;
	static JTextArea ta2;
	static JTextArea ta3;
	static JTextArea ta4;
	static JTextArea ta5;
	static JTabbedPane tp;
	lookandfeel2()
	{
		try
		  {
			  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		  }
	     catch(Exception e){}
		ta1=new JTextArea(30,30);
	    ta2=new JTextArea(40,40);
	    ta3=new JTextArea(40,40);
	    ta4=new JTextArea(40,40);
	    ta5=new JTextArea(40,40);
	    tp=new JTabbedPane();
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
	    
	}
}

