//��γ��������Ҫ��Ϊ����չʾ���������Ⱦ���ڱ�ĵ����к͵�����λ���ٲ���һ�����
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.table.*; 
public class test13 extends JTable
{
    public test13() 
{
    	JFrame f=new JFrame("���Դ���");
    	f.setVisible(true);
    	f.pack();
    	Object[][] p = {
      			 {"����","91","100","191"},
      			 {"��ѩ��","82","100","182"},
      			 {"÷ͥ","47","100","147"},
      			 {"����","61","100","161"},
      			 {"���","90","100","190"},
          };
          String[] n = {"����","����","��ѧ","�ܷ�"};    
//������� 
          JScrollPane scroPanel = new JScrollPane(this); //�еײ�������  
f.getContentPane().add(scroPanel, BorderLayout.CENTER);
          setModel(new DefaultTableModel(p,n));
          setRowHeight(1,super.getRowHeight()*4); //���ڶ��и߶����ÿ�һЩ��ʹǶ��ı����ʾ�����ÿ�Щ��
    }
    
          public TableCellRenderer getCellRenderer(int row, int column) 
{//����getCellRenderer�ṩ�Լ���TableCellRenderer
             if(row == 1 && column==2)
{
                 return new TableCellRenderer(){//�ڵڶ��С��������ṩһ���ӱ����Ⱦ��
                JTable subTable=new JTable(new DefaultTableModel(4,4)); //�ӱ������Լ������ӱ�����ݡ�
                public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) 
{//ʵ��TableCellRenderer�ķ������ṩ���ӱ���Ⱦ��
                    return subTable;
                }
            };
         }
else

            return super.getCellRenderer(row, column); //����������ط��ı�����ø������ṩ����Ⱦ��
    public static void main(String[] args)
    {
    	new test13();
    }
}
