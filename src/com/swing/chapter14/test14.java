//��δ�����ҪΪ����չʾ���Ϊ���Ԫָ��˵��������
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
super("�����ı�����");
String value[][]=
{
{"1","2","3","4","5"}
};
String columnName[]={"����һ","���Զ�","������","������","������"};
DefaultTableModel model=new DefaultTableModel(value,columnName);
JTable table=new JTable(model);
DefaultTableCellRenderer renderer=new DefaultTableCellRenderer();
renderer.setToolTipText("������Ҫ��������Ϣ");//Ϊ��Ԫ��ָ��˵��������
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
