//这段程序代码主要是为读者展示如何使用AbstractTableModel类来创建一个表格
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test7
{
    public test7() {
   	JFrame f = new JFrame();
   	MyTable mt=new MyTable();
   	JTable t=new JTable(mt);
   	t.setPreferredScrollableViewportSize(new Dimension(550, 30));
     JScrollPane s = new JScrollPane(t);
     f.getContentPane().add(s, BorderLayout.CENTER);
	    f.setTitle("表格模型的创建实例");
     f.pack();
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent e) 
{
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
    
        new test7();
    }
}

class MyTable extends AbstractTableModel
{//创建一个类MyTable，它是继承AbstractTableModel类的，在这个类中通过实现“getRowCount()”、“getColumnCount()”、“getValueAt()”这三个方法。
    Object[][] p = 
{
			 {"王鹏",new Integer(91),new Integer(1949),new Integer(1910)},
			 {"朱雪莲",new Integer(82),new Integer(1969),new Integer(1510)},
			 {"梅庭",new Integer(47),new Integer(1957),new Integer(1040)},
			 {"赵龙",new Integer(61),new Integer(1957),new Integer(1180)},
			 {"李兵",new Integer(90),new Integer(1987),new Integer(1770)},
    };
    String[] n = {"姓名","工号","出生年月","薪水"};

    public int getColumnCount()//此方法是返回该模型中的列数
{
        return n.length;
    }

    public int getRowCount()//此方法是返回该模型中的行数
{
        return p.length;
    }

    public String getColumnName(int col) //此方法是返回 col 位置的列的名称
{
        return n[col];
    }

    public Object getValueAt(int row, int col) //此方法是返回row和col的单元格的值
 {
        return p[row][col];
    }

public Class getColumnClass(int c) //此方法是针对列中所有的单元格值，返回最具体的超类
{
	    return getValueAt(0, c).getClass();
}
}
