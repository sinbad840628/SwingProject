import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
public class test14 extends JSplitPane
{
	JTextField text1;
	JTextField text2;
    public test14()
    {
        JFrame f = new JFrame("�б����Դ���");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        text1=new JTextField(10);
        text2=new JTextField(10);
        
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

        pane1.add(combo1);
        pane1.add(text1);
        pane2.add(combo2);
        pane2.add(text2);
        f.pack();
        f.setVisible(true);
        combo1.addItemListener(new ItemListener()
        {
			public void itemStateChanged(ItemEvent arg0) 
			{
				text1.setText("�������ʵ��߲�");
				
			}
			
        });
        combo2.addItemListener(new ItemListener()
        {
			public void itemStateChanged(ItemEvent arg0) 
			{
				text2.setText("���ǺóԵ�ʳƷ");
				
			}
			
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        new test14();
    }
}
/// ����һ���̳���DefaultListModel�����
class DataModel extends DefaultComboBoxModel
{
    ������������������..//ͬ�ڶ�ʵ���мӺڲ���������ͬ
}
