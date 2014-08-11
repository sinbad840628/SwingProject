import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
public class test11 extends JSplitPane
{
	
    public test11()
    {
        JFrame f = new JFrame("�б����Դ���");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        
        String[] s1 = {"�л�����","��Ϫ����","��è����","�Ϻ�����","��˫ϲ����","��Ⱥ����","����ɽ����","��������"};
        String[] s2 = {"ę́��","����Һ","���ϴ�","��Ҷ��","�����Ͻ�","�ɾ�","��ĸ��","���Ǹɺ�"};
        
        ListModel mode1 = new DataModel(s1);
        ListModel mode2 = new DataModel(s2);
        JList list1 = new JList(mode1);// ͨ������һ��DefaultListModel��ļ̳���������һ���б�����
        JList list2 = new JList(mode2);
        list1.setVisibleRowCount(5);
        list2.setVisibleRowCount(5);
        list1.setBorder(BorderFactory.createTitledBorder("����"));
        list2.setBorder(BorderFactory.createTitledBorder("����"));
        
        setOneTouchExpandable (true);
        setContinuousLayout (true);
        setPreferredSize (new Dimension (100,200));
        setOrientation (JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent (pane1);
        setRightComponent (pane2);
        setDividerSize (3);
        setDividerLocation(50);  

        pane1.add(new JScrollPane(list1));
        pane2.add(new JScrollPane(list2));
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
        new test11();
    }
}
/// ����һ���̳���DefaultListModel�����
class DataModel extends DefaultListModel
{
    
    
    DataModel(String[] s)
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
