//��δ�����Ҫ��Ϊ����չʾ���ʹ������б����Ϊ����е�Ԫ�أ�ʹ�ÿ������б����ѡ����������ݣ��൱�����벻ͬ����
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test17
{  
    public test17() 
{
   	JFrame f = new JFrame();
   /*�������ǵ�MyTable��̳���AbstractTableModel����ʵ����getColmunCount(),getRowCount(),getValueAt()����.������ǿ���ͨ
    *��MyTable������TableModel��ʵ��.
    */ 
   	MyTable mt=new MyTable();
   	JTable t=new JTable(mt);//��������MyTable������JTable.
   	JComboBox c = new JComboBox();//����һ��JComboBox�Ķ���.
   	c.addItem("����ʡ�Ž���");//�������½�����JComboBox����������������Ŀ.
   	c.addItem("�㽭ʡ������");
   	c.addItem("����ʡ�Ϸ���");
    /*��������JTable���ṩ��getTableColumnModel()����ȡ��TableColumnModel����,����TableColumnModel�����ṩ��getColumn()��
     *��ȡ��TableColumn����,TableColumn�����Ա���е�ÿһ�������������,���������ֶεĿ��,ĳ�еı�ͷ,��������ϸ��ӵ�
     *�������͵ȵ�.������,��������TableColumn�����ṩ��setCellEditor()����,��JComboBox��Ϊ�ڶ��е�Ĭ�ϱ༭���.
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
///�̳б�������ı��ģ��
class MyTable extends AbstractTableModel
{

        Object[][] p = 
{
            {"����", "����ʡ�Ž���",new Integer(66), 
              new Integer(32), new Integer(98)},
            {"�α�", "�㽭ʡ������",new Integer(85), 
              new Integer(69), new Integer(154)},          
        };
        String[] n = 
{
"����", 
        	         "��ס��",
                   "����",
                   "��ѧ",
                   "�ܷ�",                              
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
