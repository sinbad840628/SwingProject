//这段程序代码主要是为读者展示如何创建一个能够自动调节列宽的表格
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class test6  
{
	private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JFrame f;
    JMenuItem item1;
    static JPanel p;
    JTable table;
    TableColumn column;
    public test6() 
    {
      …………………………….//与上例中省略的内容相同
      Object[][] playerInfo={
				 {"王鹏",new Integer(91),new Integer(1949),new Integer(1910)},
				 {"朱雪莲",new Integer(82),new Integer(1969),new Integer(1510)},
				 {"梅庭",new Integer(47),new Integer(1957),new Integer(1040)},
				 {"赵龙",new Integer(61),new Integer(1957),new Integer(1180)},
				 {"李兵",new Integer(90),new Integer(1987),new Integer(1770)},
		 };
		 String[] Names={"姓名","工号","出生年月","薪水"};
		 table=new JTable(playerInfo,Names);
		 table.setPreferredScrollableViewportSize(new Dimension(850,300));
       p.add(table.getTableHeader(),BorderLayout.NORTH);
  	  p.add(table,BorderLayout.CENTER);  
  	  table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);//让其它的列也跟随变动
       for (int i=0;i<5;i++)
{//下面的for语句要是规范表格中的偶数列宽度和奇数列的宽度值
       	  column=table.getColumnModel().getColumn(i);
       	  if ((i%2)==0)
       	     column.setPreferredWidth(100);
       	  else
       	     column.setPreferredWidth(50);
       }

    }
public static void main(String args[]) 
{
  new test6();
 }
}
