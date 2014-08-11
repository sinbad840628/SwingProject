import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class test12 extends JSplitPane
{
	
    public test12()
    {
        JFrame f = new JFrame("�б����Դ���");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        
        String[] s1 = {"��ײ�","����","�۲�","����","����","����","����","����"};
        String[] s2 = {"����","����","���","�ɿ���","����","�±�","����"};
        
        ComboBoxModel mode1 = new DataModel(s1);
        ComboBoxModel mode2 = new DataModel(s2);
        JComboBox combo1=new JComboBox(mode1);// ͨ������һ��DefaultListModel��ļ̳���������һ���б�����
        JComboBox combo2=new JComboBox(mode2);
        combo1.setBorder(BorderFactory.createTitledBorder("����"));
        combo2.setBorder(BorderFactory.createTitledBorder("����"));
        
        setOneTouchExpandable (true);
        setContinuousLayout (true);
        setPreferredSize (new Dimension (100,200));
        setOrientation (JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent (pane1);
        setRightComponent (pane2);
        setDividerSize (3);
        setDividerLocation(50);  

        pane1.add(new JScrollPane(combo1));
        pane2.add(new JScrollPane(combo2));
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
        new test12();
    }
}
/// ����һ���̳���DefaultListModel�����
class DataModel extends DefaultComboBoxModel
{
    DataModel(String[] s)
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
