//��γ�������Ǵ���һ���б��Ȼ�󵥻��б���е�ĳ��ѡ���ǩ�������ʾ��ѡ���ѡ��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;//����ListSelectionEvent��swing���¼�������awt���¼���������Ǳ���import javax.swing.event.*
public class test5 implements ListSelectionListener
{
    JList list = null;
    JLabel label = null;
    String[] s = {"����","�ձ�","��½","Ӣ��","����","�����","����","����"};
    
    public test5()
    {
        JFrame f = new JFrame("JList");
        Container contentPane = f.getContentPane();
        contentPane.setLayout(new BorderLayout());
        label = new JLabel();
        
        list = new JList(s);//�������ݴ����б��
        list.setVisibleRowCount(5);
        list.setBorder(BorderFactory.createTitledBorder("����ϲ�����ĸ��������أ�"));
        list.addListSelectionListener(this);
        
        contentPane.add(label,BorderLayout.NORTH);
        contentPane.add(new JScrollPane(list),BorderLayout.CENTER);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        new test5();
    }
    ///ʵ��valueChanged()������ͨ������������б������ѡȡ��������ʾ�ڱ�ǩ��
    public void valueChanged(ListSelectionEvent e)
    {
        int tmp = 0;
        String stmp = "��Ŀǰѡȡ��";
        int[] index = list.getSelectedIndices();//��ѡ���ݵ����к�
        for(int i=0; i < index.length ; i++)
        {
            tmp = index[i];
            stmp = stmp+s[tmp]+"  ";
        }
        label.setText(stmp);//Ϊ��ǩ��ֵ
    }
}
