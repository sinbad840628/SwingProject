import java.awt.Dimension;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class test20 extends JPanel
{
	static final int WIDTH=300;
	static final int HEIGHT=400;
	DefaultTableModel defaultModel;
	JTable table;
	test20()
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
	}
	public static void main(String[] args)
	{
		new test20();
	}
}
