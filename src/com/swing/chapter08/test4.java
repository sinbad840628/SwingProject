//��γ�����Ҫ��ʹ��DefaultListModel�����������һ���б��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class test4
{
    public test4()
    {
        JFrame f = new JFrame("JList");
        Container contentPane = f.getContentPane();
        
        ListModel mode = new DataModel();
        JList list = new JList(mode);//ͨ������һ��DefaultListModel��ļ̳���������һ���б�����
        list.setVisibleRowCount(5);
        list.setBorder(BorderFactory.createTitledBorder("�������"));
        contentPane.add(new JScrollPane(list));
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        new test4();
    }
}
class DataModel extends DefaultListModel// ����һ���̳���DefaultListModel�����
{
    String[] s = {"��ʾ��","����","Ӳ��","�ڴ�","����","���","��Դ","����"};
    
    DataModel()
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
