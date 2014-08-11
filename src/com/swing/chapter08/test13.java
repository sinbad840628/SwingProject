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
        String[] s1 = {"中华香烟","玉溪香烟","熊猫香烟","上海香烟","金双喜香烟","立群香烟","红塔山香烟","三五香烟"};
        String[] s2 = {"茅台酒","五粮液","剑南春","竹叶青","泸州老窖","郎酒","琅母酒","长城干红"};
        
        ListModel mode1 = new DataModel(s1);
        ListModel mode2 = new DataModel(s2);
        JList list1 = new JList(mode1);// 通过创建一个DefaultListModel类的继承类来创建一个列表框对象
        JList list2 = new JList(mode2);
        list1.setVisibleRowCount(5);
        list2.setVisibleRowCount(5);
        list1.setBorder(BorderFactory.createTitledBorder("香烟"));
        list2.setBorder(BorderFactory.createTitledBorder("名酒"));
        
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
				text1.setText("这是比较有名的香烟");
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
				text2.setText("这是比较有名的酒");
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
/// 创建一个继承了DefaultListModel类的类
class DataModel extends DefaultListModel
{
   DataModel(String[] s)
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }

}
