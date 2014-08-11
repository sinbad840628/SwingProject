//这段程序代码主要是为读者展示如何通过JTree()来创建树组件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1
{
  public test1()
{
  	JFrame f=new JFrame("树组件测试");
  	Container contentPane=f.getContentPane();
  	JTree tree=new JTree();//创建一个系统默认的树组件
  	JScrollPane scrollPane=new JScrollPane();//创建一个滚动条组件
  	scrollPane.setViewportView(tree);//将树组件添加到滚动条组件中
  	contentPane.add(scrollPane);//将滚动条组件添加到中间容器中
  	f.pack();
  	f.setVisible(true);
  	f.addWindowListener(new WindowAdapter()
{
  		 public void windowClosing(WindowEvent e){
  		   System.exit(0);	
  		 }
  	  });
     }		
  public static void main(String[] args)
{
  	 new test1();
  }
}
