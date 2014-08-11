//这段代码主要是验证如何使用编辑器来验证用户输入的数据的正确与否
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
public class test19 extends JFrame
{
public test19()
{
super("输入文本测试");
String value[][]=
{
{"1","2","3","4","5"}
};
String columnName[]={"测试一","测试二","测试三","测试四","测试五"};
DefaultTableModel model=new DefaultTableModel(value,columnName);
JTable table=new JTable(model);
TableColumnModel colmodel=table.getColumnModel();
///这个for循环语句设置一个文本框组件，将它添加到表格的单元格，并且设置单元格单击可编辑
for(int index=0;index<columnName.length;index++)
{
TableColumn tc = colmodel.getColumn(index);
JTextField editor=new JTextField();
MyCellEditor cellEditor=new MyCellEditor(editor);
cellEditor.setClickCountToStart(1);
tc.setCellEditor(cellEditor);
}
this.add(new JScrollPane(table),BorderLayout.CENTER);
this.setSize(300, 200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main(String args[])
{
new test19();
}
}
class MyCellEditor extends DefaultCellEditor
{
public MyCellEditor(JTextField textField) 
{
super(textField);
}
///可以通过重载这个方法，来设置单元格的属性
public boolean stopCellEditing()
{
///当在这个单元格中输入“1234”时，单元格清空
String value=(String)this.getCellEditorValue();
if(value.equals("1234"))
{
((JTextField)this.getComponent()).setText("");
return false;
}
else 
return super.stopCellEditing();

}
}
