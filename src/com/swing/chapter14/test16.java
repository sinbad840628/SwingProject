//��δ�����Ҫ��Ϊ����չʾ��ο��Խ������е����ݰ���С��������
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
public class test16
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JTable���������");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// ��������ʾ������
		Object rows[][]={
				{"����","����","43"},
				{"�ܵ�","�Ĵ�","25"},
				{"Ǯ��","����","31"},
				{"���","����","24"},
				{"�","�½�","45"},
				{"�շ�","�㶫","33"}
				};
		String columns[]={"����", "����", "����"};
		TableModel model = new DefaultTableModel(rows, columns);
		JTable table = new JTable(model);
		RowSorter sorter = new TableRowSorter(model);
		table.setRowSorter(sorter);//�����������
		JScrollPane pane = new JScrollPane(table);
		frame.add(pane, BorderLayout.CENTER);
		frame.setSize(300, 150);
		frame.setVisible(true);
		}
	} 