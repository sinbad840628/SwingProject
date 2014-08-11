//这段代码主要为读者展示如何为表格单元指定说明性文字
import java.awt.BorderLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
public class test14  extends JFrame
{
DefaultCellEditor cellEditor;
public test14()
{
super("输入文本测试");
String value[][]=
{
{"1","2","3","4","5"}
};
String columnName[]={"测试一","测试二","测试三","测试四","测试五"};
DefaultTableModel model=new DefaultTableModel(value,columnName);
JTable table=new JTable(model);
DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
renderer.setToolTipText("这是重要的数据信息");//为单元格指定说明性文字
TableColumnModel colmodel=table.getColumnModel();
for(int index=0;index<columnName.length;index++)
{
TableColumn tc = colmodel.getColumn(index);
tc.setCellRenderer(renderer);
}
this.add(new JScrollPane(table),BorderLayout.CENTER);
this.setSize(300, 200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main(String args[])
{
new test14();
}
}
