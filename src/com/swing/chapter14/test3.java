//这段程序代码主要为读者展示如何将表格放到容器中，但是在这个表格中没有横标
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test3{
	public test3(){
		 JFrame f=new JFrame();
		 Object[][] playerInfo={
				 {"王鹏",new Integer(91),new Integer(100),new Integer(191),new Boolean(true)},
				 {"朱雪莲",new Integer(82),new Integer(69),new Integer(151),new Boolean(true)},
				 {"梅庭",new Integer(47),new Integer(57),new Integer(104),new Boolean(false)},
				 {"赵龙",new Integer(61),new Integer(57),new Integer(118),new Boolean(false)},
				 {"李兵",new Integer(90),new Integer(87),new Integer(177),new Boolean(true)},
		 };
		 String[] Names={"姓名","语文","数学","总分","及格"};
		 JTable table=new JTable(playerInfo,Names);
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));
		 f.getContentPane().add(table,BorderLayout.CENTER);//使用的将表格直接添加到中间容器中
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
			 test3 b=new test3();
		 }
	 }
