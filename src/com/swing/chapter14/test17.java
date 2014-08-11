//这段代码主要是为读者展示如何使用组合列表框作为表格中的元素，使得可以在列表框中选择所需的数据，相当于输入不同数据
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test17
{  
    public test17() 
{
   	JFrame f = new JFrame();
   /*由于我们的MyTable类继承了AbstractTableModel并且实作了getColmunCount(),getRowCount(),getValueAt()方法.因此我们可以通
    *过MyTable来产生TableModel的实体.
    */ 
   	MyTable mt=new MyTable();
   	JTable t=new JTable(mt);//我们利用MyTable来建立JTable.
   	JComboBox c = new JComboBox();//建立一个JComboBox的对象.
   	c.addItem("江西省九江市");//我们在新建立的JComboBox对象里新增三个项目.
   	c.addItem("浙江省杭州市");
   	c.addItem("安徽省合肥市");
    /*我们利用JTable所提供的getTableColumnModel()方法取得TableColumnModel对象,再由TableColumnModel类所提供的getColumn()方
     *法取得TableColumn对象,TableColumn类可针对表格中的每一行做具体的设置,例如设置字段的宽度,某行的标头,设置输入较复杂的
     *数据类型等等.在这里,我们利用TableColumn类所提供的setCellEditor()方法,将JComboBox作为第二行的默认编辑组件.
     */
   	   t.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(c));
   	   t.setPreferredScrollableViewportSize(new Dimension(550, 30));
        JScrollPane s = new JScrollPane(t);
        f.getContentPane().add(s, BorderLayout.CENTER);
	       f.setTitle("ColumnModelDd");
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() 
{
            public void windowClosing(WindowEvent e) 
{
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
        new test17();
    }  
}
///继承表格抽象类的表格模型
class MyTable extends AbstractTableModel
{

        Object[][] p = 
{
            {"王鹏", "江西省九江市",new Integer(66), 
              new Integer(32), new Integer(98)},
            {"宋兵", "浙江省杭州市",new Integer(85), 
              new Integer(69), new Integer(154)},          
        };
        String[] n = 
{
"姓名", 
        	         "居住地",
                   "语文",
                   "数学",
                   "总分",                              
                 };
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
{
		    return true;	
       }
	      public void setValueAt(Object value, int row, int col) 
{
        	p[row][col] = value;
		    fireTableCellUpdated(row, col);
    	}
}
