//��γ��������Ҫ��Ϊ����չʾ��δ���һ���ܹ��Զ������п�ı��
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class test6  
{
	private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JFrame f;
    JMenuItem item1;
    static JPanel p;
    JTable table;
    TableColumn column;
    public test6() 
    {
      ����������������������.//��������ʡ�Ե�������ͬ
      Object[][] playerInfo={
				 {"����",new Integer(91),new Integer(1949),new Integer(1910)},
				 {"��ѩ��",new Integer(82),new Integer(1969),new Integer(1510)},
				 {"÷ͥ",new Integer(47),new Integer(1957),new Integer(1040)},
				 {"����",new Integer(61),new Integer(1957),new Integer(1180)},
				 {"���",new Integer(90),new Integer(1987),new Integer(1770)},
		 };
		 String[] Names={"����","����","��������","нˮ"};
		 table=new JTable(playerInfo,Names);
		 table.setPreferredScrollableViewportSize(new Dimension(850,300));
       p.add(table.getTableHeader(),BorderLayout.NORTH);
  	  p.add(table,BorderLayout.CENTER);  
  	  table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);//����������Ҳ����䶯
       for (int i=0;i<5;i++)
{//�����for���Ҫ�ǹ淶����е�ż���п�Ⱥ������еĿ��ֵ
       	  column=table.getColumnModel().getColumn(i);
       	  if ((i%2)==0)
       	     column.setPreferredWidth(100);
       	  else
       	     column.setPreferredWidth(50);
       }

    }
public static void main(String args[]) 
{
  new test6();
 }
}
