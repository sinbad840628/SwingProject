//这段程序代码主要是为读者展示创建表格的方法，创建表格的方法主要是通过“JTable(Object[][] rowData,Object[ ][ ] columnNames)”来创建两个数组来作为创建表格的两个参数
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test1{
	public test1(){
		 JFrame f=new JFrame();
		 Object[][] playerInfo={//创建表格中的数据
				 {"王鹏",new Integer(91),new Integer(100),new Integer(191),new Boolean(true)},
				 {"朱雪莲",new Integer(82),new Integer(69),new Integer(151),new Boolean(true)},
				 {"梅庭",new Integer(47),new Integer(57),new Integer(104),new Boolean(false)},
				 {"赵龙",new Integer(61),new Integer(57),new Integer(118),new Boolean(false)},
				 {"李兵",new Integer(90),new Integer(87),new Integer(177),new Boolean(true)},
		 };
		 String[] Names={"姓名","语文","数学","总分","及格"};//创建表格中的横标题
		 JTable table=new JTable(playerInfo,Names);//以Names和playerInfo为参数，创建一个表格
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));//  设置此表视口的首选大小
		 JScrollPane scrollPane=new JScrollPane(table);//将表格加入到滚动条组件中
		 f.getContentPane().add(scrollPane,BorderLayout.CENTER);//再将滚动条组件添加到中间容器中
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
			 test1 b=new test1();
		 }
	 }
