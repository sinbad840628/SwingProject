package com.swing.chapter16;

//这段程序代码主要是为读者展示使用观感器的图形界面与不使用观感器的图形界面的比较
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class test1
{
  public test1()
  {
    JFrame f=new JFrame("学校名录");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("学校名录");//使用DefaultMutableTreeNode的构造器创建根节点
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("教导处");//使用DefaultMutableTreeNode的构造器创建四个枝节点
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("一年级");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("二年级");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("三年级");
    root.add(node1); //将四个枝节点添加到根节点中
    root.add(node2);
    root.add(node3);
    root.add(node4);
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("王成");//利用DefaultMutableTreeNode的构造器构造器创建出叶节点，再将页节点分别添加到不同的枝节点上
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("赵薇");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("李明");
    node1.add(leafnode);
    leafnode=new DefaultMutableTreeNode("宋大兵");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("雷宝");
    node2.add(leafnode);
    leafnode=new DefaultMutableTreeNode("赵月");
    node2.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("潘良");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("严康");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("王鹏");
    node3.add(leafnode);
    leafnode=new DefaultMutableTreeNode("刘华");
    node3.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("朱卫");
    node4.add(leafnode);
    
    leafnode=new DefaultMutableTreeNode("谭豪");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("叶婷");
    node4.add(leafnode);
    leafnode=new DefaultMutableTreeNode("陈浩");
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
