//��δ�����Ҫ����֤���ʹ�ñ༭������֤�û���������ݵ���ȷ���
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
super("�����ı�����");
String value[][]=
{
{"1","2","3","4","5"}
};
String columnName[]={"����һ","���Զ�","������","������","������"};
DefaultTableModel model=new DefaultTableModel(value,columnName);
JTable table=new JTable(model);
TableColumnModel colmodel=table.getColumnModel();
///���forѭ���������һ���ı��������������ӵ����ĵ�Ԫ�񣬲������õ�Ԫ�񵥻��ɱ༭
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
///����ͨ��������������������õ�Ԫ�������
public boolean stopCellEditing()
{
///���������Ԫ�������롰1234��ʱ����Ԫ�����
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
