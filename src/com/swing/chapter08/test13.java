import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class test13 extends JSplitPane
{
	JTextField text1;
	JTextField text2;
	
    public test13()
    {
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

        text1=new JTextField(10);
        text2=new JTextField(10);
        

        pane1.add(new JScrollPane(list1));
        pane1.add(text1);
        pane2.add(new JScrollPane(list2));
        pane2.add(text2);
        f.pack();
        f.setVisible(true);
        
        list1.addMouseListener(new MouseListener()
        {

			public void mouseClicked(MouseEvent e) 
			{
				text1.setText("���ǱȽ�����������");
			}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
        });
        list2.addMouseListener(new MouseListener()
        {

			public void mouseClicked(MouseEvent e) 
			{
				text2.setText("���ǱȽ������ľ�");
			}
			public void mouseEntered(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {}
			public void mouseReleased(MouseEvent e) {}
        });
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                    System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        new test13();
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
