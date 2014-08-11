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
		frame.setTitle("表格测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
	    
		 Object[][] p = 
		 {
		    	{"王鹏","江西九江",new Integer(32),new Integer(1975),"上海浦东","上海贝尔"},
		    	{"朱雪莲","上海浦东",new Integer(27),new Integer(1981),"上海浦东","上海大众"},
		    	{"梅庭","江苏启东",new Integer(28),new Integer(1980),"上海徐汇","上海通用"},
		    	{"赵龙","黑龙江哈尔滨",new Integer(33),new Integer(1974),"上海长宁","上海Intel"},
		    	{"李兵","浙江杭州",new Integer(34),new Integer(1974),"上海松江","上海中信"},
		  };
		 String[] n = {"姓名","籍贯","年龄","出生年月","家庭地址","所在公司"};
		 defaultModel = new DefaultTableModel(p,n);//创建一个默认的表格模型
	     table=new JTable(defaultModel);
	     table.setPreferredScrollableViewportSize(new Dimension(400, 80));
	     JScrollPane s = new JScrollPane(table);
	     add(s);   
	     DefaultTableCellRenderer renderer1=new DefaultTableCellRenderer();
	     renderer1.setToolTipText("这是同学的姓名");//为单元格指定说明性文字
	     DefaultTableCellRenderer renderer2=new DefaultTableCellRenderer();
	     renderer2.setToolTipText("这是同学的籍贯");//为单元格指定说明性文字
	     DefaultTableCellRenderer renderer3=new DefaultTableCellRenderer();
	     renderer3.setToolTipText("这是同学的年龄");//为单元格指定说明性文字
	     DefaultTableCellRenderer renderer4=new DefaultTableCellRenderer();
	     renderer4.setToolTipText("这是同学的家庭地址");//为单元格指定说明性文字
	     DefaultTableCellRenderer renderer5=new DefaultTableCellRenderer();
	     renderer5.setToolTipText("这是同学的所在公司");//为单元格指定说明性文字
	     
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
