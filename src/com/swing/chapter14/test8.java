//��γ��������Ҫ��Ϊ����չʾ���ʹ��DefaultTableModel�ഴ�����
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
public class test8  implements ActionListener
{
    JTable table = null;
    DefaultTableModel defaultModel = null;
    public test8()
    {
        JFrame f = new JFrame();
        Object[][] p = 
{
   			 {"����",new Integer(91),new Integer(1949),new Integer(1910)},
   			 {"��ѩ��",new Integer(82),new Integer(1969),new Integer(1510)},
   			 {"÷ͥ",new Integer(47),new Integer(1957),new Integer(1040)},
   			 {"����",new Integer(61),new Integer(1957),new Integer(1180)},
   			 {"���",new Integer(90),new Integer(1987),new Integer(1770)},
       };
        String[] n = {"����","����","��������","нˮ"};        
        defaultModel = new DefaultTableModel(p,n);//����һ��Ĭ�ϵı��ģ��
        table=new JTable(defaultModel);
        table.setPreferredScrollableViewportSize(new Dimension(400, 80));
        JScrollPane s = new JScrollPane(table);
        JPanel panel = new JPanel();
        JButton b = new JButton("������");
        panel.add(b);
        panel.add(b);
        b.addActionListener(this);
        b = new JButton("ɾ����");
        panel.add(b);
        panel.add(b);
        b.addActionListener(this);
        Container contentPane = f.getContentPane();
        contentPane.add(panel, BorderLayout.NORTH);
        contentPane.add(s, BorderLayout.CENTER);
	       f.setTitle("AddRemoveCells");
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getActionCommand().equals("������"))//��������������С���ť��������ڱ�������һ��
            defaultModel.addRow(new Vector());
        if(e.getActionCommand().equals("ɾ����"))//���������ɾ���С���ť������ڱ���ɾ����ѡ�е�һ�У�����������һ��Ϊ��ǰ��
        {
            int rowcount = defaultModel.getRowCount()-1;//getRowCount����������rowcount<0�����Ѿ�û���κ����ˡ�
            if(rowcount >= 0)
            {
                defaultModel.removeRow(rowcount);
                defaultModel.setRowCount(rowcount);//ɾ���бȽϼ򵥣�ֻҪ��DefaultTableModel��removeRow()�������ɡ�ɾ������Ϻ������������������Ҳ����ʹ��DefaultTableModel��setRowCount()���������õ�ǰ�С�
            }
        }
        table.revalidate();
    }
    
    public static void main(String args[]) {
        new test8();
    }
}
