//这段程序代码主要是为读者展示如何处理TableModelEvent事件
import javax.swing.table.AbstractTableModel;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class test9 implements TableModelListener
{
    JTable table = null;
    MyTable my = null;
    public test9() 
{
        JFrame f = new JFrame();
        my=new MyTable();
    	   my.addTableModelListener(this);
        table=new JTable(my);
        table.setPreferredScrollableViewportSize(new Dimension(550, 30));
        JScrollPane s = new JScrollPane(table);
        f.getContentPane().add(s, BorderLayout.CENTER);
	       f.setTitle("表格事件处理");
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void tableChanged(TableModelEvent e)
    {//处理表格数据变化事件
        int row = e.getFirstRow(); //获得所选数据的行数
        int grade1=((Integer)(my.getValueAt(row,1))).intValue();//获得所此行第二列的值
        int grade2=((Integer)(my.getValueAt(row,2))).intValue();//获得此行第三列的值
	       int total = grade1+grade2;//将两次获得的值进行叠加
     	   my.mySetValueAt(new Integer(total),row,3);//将变化的值赋给第四列
    	   table.repaint();//系统重新绘制表格
    }
    public static void main(String args[]) {
    
        new test9();
    }
}

class MyTable extends AbstractTableModel {//使用AbstractTableModel来创建表格模型
	 Object[][] p = 
{
   			 {"王鹏",new Integer(91),new Integer(100),new Integer(191)},
   			 {"朱雪莲",new Integer(82),new Integer(100),new Integer(182)},
   			 {"梅庭",new Integer(47),new Integer(100),new Integer(147)},
   			 {"赵龙",new Integer(61),new Integer(100),new Integer(161)},
   			 {"李兵",new Integer(90),new Integer(100),new Integer(190)},
       };
       String[] n = {"姓名","语文","数学","总分"};        
    public int getColumnCount() 
{
        return n.length;
    }
    public int getRowCount() 
{
        return p.length;
    }
    public String getColumnName(int col) 
{
        return n[col];
    }
    public Object getValueAt(int row, int col) 
{
        return p[row][col];
    }
    	public Class getColumnClass(int c) 
{
        	return getValueAt(0, c).getClass();
    }

	    public boolean isCellEditable(int rowIndex, int columnIndex) 
{	//判断单元格是否可以编辑
		return true;	
    }
    	public void setValueAt(Object value, int row, int col)
{
        	p[row][col] = value;
        	fireTableCellUpdated(row, col);
    }
        public void mySetValueAt(Object value, int row, int col) 
{
    	       p[row][col] = value;
       }
}
