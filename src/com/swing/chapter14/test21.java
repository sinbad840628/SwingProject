import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
public class test21 extends JPanel
{
	static final int WIDTH=300;
	static final int HEIGHT=400;
	DefaultTableModel defaultModel;
	JTable table;
	int index;
	test21()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�����Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
	    
		 Object[][] p = 
		 {
		    	{"����","�����Ž�",new Integer(32),new Integer(1975),"�Ϻ��ֶ�","�Ϻ�����"},
		    	{"��ѩ��","�Ϻ��ֶ�",new Integer(27),new Integer(1981),"�Ϻ��ֶ�","�Ϻ�����"},
		    	{"÷ͥ","��������",new Integer(28),new Integer(1980),"�Ϻ����","�Ϻ�ͨ��"},
		    	{"����","������������",new Integer(33),new Integer(1974),"�Ϻ�����","�Ϻ�Intel"},
		    	{"���","�㽭����",new Integer(34),new Integer(1974),"�Ϻ��ɽ�","�Ϻ�����"},
		  };
		 String[] n = {"����","����","����","��������","��ͥ��ַ","���ڹ�˾"};
		 defaultModel = new DefaultTableModel(p,n);//����һ��Ĭ�ϵı��ģ��
	     table=new JTable(defaultModel);
	     table.setPreferredScrollableViewportSize(new Dimension(400, 80));
	     JScrollPane s = new JScrollPane(table);
	     add(s);   
	     DefaultTableCellRenderer renderer1=new DefaultTableCellRenderer();
	     renderer1.setToolTipText("����ͬѧ������");//Ϊ��Ԫ��ָ��˵��������
	     DefaultTableCellRenderer renderer2=new DefaultTableCellRenderer();
	     renderer2.setToolTipText("����ͬѧ�ļ���");//Ϊ��Ԫ��ָ��˵��������
	     DefaultTableCellRenderer renderer3=new DefaultTableCellRenderer();
	     renderer3.setToolTipText("����ͬѧ������");//Ϊ��Ԫ��ָ��˵��������
	     DefaultTableCellRenderer renderer4=new DefaultTableCellRenderer();
	     renderer4.setToolTipText("����ͬѧ�ļ�ͥ��ַ");//Ϊ��Ԫ��ָ��˵��������
	     DefaultTableCellRenderer renderer5=new DefaultTableCellRenderer();
	     renderer5.setToolTipText("����ͬѧ�����ڹ�˾");//Ϊ��Ԫ��ָ��˵��������
	     
	     TableColumnModel colmodel=table.getColumnModel();
	     TableColumn tc = colmodel.getColumn(0);
	     tc.setCellRenderer(renderer1);
	     TableColumn tc1 = colmodel.getColumn(1);
	     tc1.setCellRenderer(renderer2);
	     TableColumn tc2 = colmodel.getColumn(2);
	     tc2.setCellRenderer(renderer3);
	     TableColumn tc3 = colmodel.getColumn(3);
	     tc3.setCellRenderer(renderer4);
	     TableColumn tc4 = colmodel.getColumn(4);
	     tc4.setCellRenderer(renderer5);
	}
	public static void main(String[] args)
	{
		new test21();
	}
}
