//��γ��������Ҫ��Ϊ����չʾ���ʹ��DefaultMutableTreeNode�Ĺ�����������������е�ÿһ���ڵ㣬����γ�һ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class test3
{
  public test3()
{
    JFrame f=new JFrame("����Ҫ������嵥");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("����Ҫ����Ķ���");//ʹ��DefaultMutableTreeNode�Ĺ������������ڵ�
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�߲�");//ʹ��DefaultMutableTreeNode�Ĺ����������ĸ�֦�ڵ�	
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("ˮ��");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("��Ʒ");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("����С���");
    root.add(node1); //���ĸ�֦�ڵ���ӵ����ڵ���
    root.add(node2);
    root.add(node3);
    root.add(node4);
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("�ײ�"); //����DefaultMutableTreeNode�Ĺ�����������������Ҷ�ڵ㣬�ٽ�ҳ�ڵ�ֱ���ӵ���ͬ��֦�ڵ���
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
    JScrollPane scrollPane=new JScrollPane();
    scrollPane.setViewportView(tree);
    
    contentPane.add(scrollPane);
  	f.pack();
  	f.setVisible(true);
  	f.addWindowListener(new WindowAdapter(){
  		 public void windowClosing(WindowEvent e){
  		   System.exit(0);	
  		 }
  	});
  }		
  public static void main(String[] args){
  	 new test3();
  }  
}
h