//��γ��������Ҫ��Ϊ����չʾ��δ���TableModelEvent�¼�
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
	       f.setTitle("����¼�����");
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void tableChanged(TableModelEvent e)
    {//���������ݱ仯�¼�
        int row = e.getFirstRow(); //�����ѡ���ݵ�����
        int grade1=((Integer)(my.getValueAt(row,1))).intValue();//��������еڶ��е�ֵ
        int grade2=((Integer)(my.getValueAt(row,2))).intValue();//��ô��е����е�ֵ
	       int total = grade1+grade2;//�����λ�õ�ֵ���е���
     	   my.mySetValueAt(new Integer(total),row,3);//���仯��ֵ����������
    	   table.repaint();//ϵͳ���»��Ʊ��
    }
    public static void main(String args[]) {
    
        new test9();
    }
}

class MyTable extends AbstractTableModel {//ʹ��AbstractTableModel���������ģ��
	 Object[][] p = 
{
   			 {"����",new Integer(91),new Integer(100),new Integer(191)},
   			 {"��ѩ��",new Integer(82),new Integer(100),new Integer(182)},
   			 {"÷ͥ",new Integer(47),new Integer(100),new Integer(147)},
   			 {"����",new Integer(61),new Integer(100),new Integer(161)},
   			 {"���",new Integer(90),new Integer(100),new Integer(190)},
       };
       String[] n = {"����","����","��ѧ","�ܷ�"};        
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
{	//�жϵ�Ԫ���Ƿ���Ա༭
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
