//这段代码主要是为读者展示如何可以将表格中的数据按大小进行排列
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class test16
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JTable的排序测试");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 表格中显示的数据
		Object rows[][]={
				{"王鹏","江西","43"},
				{"周丹","四川","25"},
				{"钱丽","贵州","31"},
				{"孙军","江苏","24"},
				{"李环","新疆","45"},
				{"苏菲","广东","33"}
				};
		String columns[]={"姓名", "籍贯", "年龄"};
		TableModel model = new DefaultTableModel(rows, columns);
		JTable table = new JTable(model);
		RowSorter sorter = new TableRowSorter(model);
		table.setRowSorter(sorter);//表格排序过滤
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane, BorderLayout.CENTER);
		frame.setSize(300, 150);
		frame.setVisible(true);
		}
	} 
