//这段代码主要是为读者展示如何为表头指定说明性文字
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class test15
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
		table.setRowSorter(sorter);
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane, BorderLayout.CENTER);
		table.getTableHeader().setToolTipText("这个是有关学生信息的表格");//为表头指定说明性文字
		frame.setSize(300, 150);
		frame.setVisible(true);
		}
	}
