//��δ�����Ҫ��Ϊ����չʾ���ʹ�ø�ѡ����Ϊ�༭�����༭����еĵ�Ԫ��
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test18
{
    public test18() 
{
   	JFrame f = new JFrame();
  
   	MyTable mt=new MyTable();/*����MyTable��̳���AbstractTableModel����ʵ����getColmunCount(),getRowCount(),getValueAt()����.��˿���ͨ��MyTable������TableModel��ʵ��.*/
   	JTable t=new JTable(mt);//����MyTable������JTable.
   	JCheckBox jc1=new JCheckBox();
   	t.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jc1));
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
        new test18();
    }    
}
class MyTable extends AbstractTableModel{

        Object[][] p = {
            {"����", new Integer(66), 
              new Integer(32), new Integer(98),""},
            {"�α�", new Integer(85), 
              new Integer(69), new Integer(154),""},          
        };
        String[] n = {"����", 
                      "����",
                      "��ѧ",
                      "�ܷ�", 
                      "�������"
                     };
        public int getColumnCount() {
            return n.length;
        }
        public int getRowCount() {
            return p.length;
        }
        public String getColumnName(int col) {
            return n[col];
        }
        public Object getValueAt(int row, int col) {
            return p[row][col];
        }
	    public Class getColumnClass(int c) {
        	return getValueAt(0, c).getClass();
    	}
	    public boolean isCellEditable(int rowIndex, int columnIndex) {
		    return true;	
    	}
	    public void setValueAt(Object value, int row, int col) {
        	p[row][col] = value;
		    fireTableCellUpdated(row, col);
    	}
}
