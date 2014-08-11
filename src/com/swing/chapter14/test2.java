//这段程序代码主要是为读者展示创建表格的方法，创建表格的方法主要是通过“JTable(int numRows,int numColumns)”来创建表格，numRows指行数，numColumn指列数。
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test2{
	public test2(){
		 JFrame f=new JFrame();
		 JTable table=new JTable(10,10);//创建一个十行和十列的空表格
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));
		 JScrollPane scrollPane=new JScrollPane(table);
		 f.getContentPane().add(scrollPane,BorderLayout.CENTER);
		 f.setTitle("表格测试窗口");
		 f.pack();
		 f.setVisible(true);
		 f.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
	}
		 public static void main(String[] args){
			 test2 b=new test2();
		 }
	 }
