package com.swing.chapter16;

//��γ��������Ҫ��Ϊ����չʾʹ�ù۸�����ͼ�ν����벻ʹ�ù۸�����ͼ�ν���ıȽ�
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class test1
{
  public test1()
  {
    JFrame f=new JFrame("ѧУ��¼");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("ѧУ��¼");//ʹ��DefaultMutableTreeNode�Ĺ������������ڵ�
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("�̵���");//ʹ��DefaultMutableTreeNode�Ĺ����������ĸ�֦�ڵ�
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("һ�꼶");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("���꼶");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("���꼶");
    root.add(node1); //���ĸ�֦�ڵ���ӵ����ڵ���
    root.add(node2);
    root.add(node3);
    root.add(node4);
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("����");//����DefaultMutableTreeNode�Ĺ�����������������Ҷ�ڵ㣬�ٽ�ҳ�ڵ�ֱ���ӵ���ͬ��֦�ڵ���
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("��ޱ");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("�δ��");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("�ױ�");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node2.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("����");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("�Ͽ�");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("����");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("����");
    node4.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("̷��");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("Ҷ��");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("�º�");
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
  public static void main(String[] args)
  {
	  try
	  {
		  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	  }
	  catch(Exception e){}
	  
  	 new test1();
  }  
}
