import java.util.Hashtable;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class test9 extends JPanel
{
	static final int WIDTH=300;
	static final int HEIGHT=800;
	test9()
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
		add(scrollPane);
     frame.setContentPane(this);

	}
	public static void main(String[] args)
	{
		new test9();
	}
}
