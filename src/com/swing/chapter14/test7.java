//��γ��������Ҫ��Ϊ����չʾ���ʹ��AbstractTableModel��������һ�����
import javax.swing.table.AbstractTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test7
{
    public test7() {
   	JFrame f = new JFrame();
   	MyTable mt=new MyTable();
   	JTable t=new JTable(mt);
   	t.setPreferredScrollableViewportSize(new Dimension(550, 30));
     JScrollPane s = new JScrollPane(t);
     f.getContentPane().add(s, BorderLayout.CENTER);
	    f.setTitle("���ģ�͵Ĵ���ʵ��");
     f.pack();
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter() {
     public void windowClosing(WindowEvent e) 
{
                System.exit(0);
            }
        });
    }
    public static void main(String args[]) {
    
        new test7();
    }
}

class MyTable extends AbstractTableModel
{//����һ����MyTable�����Ǽ̳�AbstractTableModel��ģ����������ͨ��ʵ�֡�getRowCount()������getColumnCount()������getValueAt()��������������
    Object[][] p = 
{
			 {"����",new Integer(91),new Integer(1949),new Integer(1910)},
			 {"��ѩ��",new Integer(82),new Integer(1969),new Integer(1510)},
			 {"÷ͥ",new Integer(47),new Integer(1957),new Integer(1040)},
			 {"����",new Integer(61),new Integer(1957),new Integer(1180)},
			 {"���",new Integer(90),new Integer(1987),new Integer(1770)},
    };
    String[] n = {"����","����","��������","нˮ"};

    public int getColumnCount()//�˷����Ƿ��ظ�ģ���е�����
{
        return n.length;
    }

    public int getRowCount()//�˷����Ƿ��ظ�ģ���е�����
{
        return p.length;
    }

    public String getColumnName(int col) //�˷����Ƿ��� col λ�õ��е�����
{
        return n[col];
    }

    public Object getValueAt(int row, int col) //�˷����Ƿ���row��col�ĵ�Ԫ���ֵ
 {
        return p[row][col];
    }

public Class getColumnClass(int c) //�˷���������������еĵ�Ԫ��ֵ�����������ĳ���
{
	    return getValueAt(0, c).getClass();
}
}
