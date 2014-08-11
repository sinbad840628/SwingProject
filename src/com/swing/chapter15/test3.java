//这段程序代码主要是为读者展示如何使用DefaultMutableTreeNode的构造器来创建树组件中的每一个节点，最后形成一棵树
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class test3
{
  public test3()
{
    JFrame f=new JFrame("今天要购买的清单");
    Container contentPane=f.getContentPane();
    
    DefaultMutableTreeNode root=new DefaultMutableTreeNode("今天要购买的东西");//使用DefaultMutableTreeNode的构造器创建根节点
    DefaultMutableTreeNode node1=new DefaultMutableTreeNode("蔬菜");//使用DefaultMutableTreeNode的构造器创建四个枝节点	
    DefaultMutableTreeNode node2=new DefaultMutableTreeNode("水果");
    DefaultMutableTreeNode node3=new DefaultMutableTreeNode("礼品");
    DefaultMutableTreeNode node4=new DefaultMutableTreeNode("家用小物件");
    root.add(node1); //将四个枝节点添加到根节点中
    root.add(node2);
    root.add(node3);
    root.add(node4);
    DefaultMutableTreeNode leafnode=new DefaultMutableTreeNode("白菜"); //利用DefaultMutableTreeNode的构造器构造器创建出叶节点，再将页节点分别添加到不同的枝节点上
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