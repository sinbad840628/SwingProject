import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class test12 extends JSplitPane
{
	
    public test12()
    {
        JFrame f = new JFrame("列表框测试窗口");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        
        String[] s1 = {"大白菜","土豆","芹菜","笋子","豆腐","酱干","花菜","花生"};
        String[] s2 = {"饼干","蛋糕","面包","巧克力","青团","月饼","曲奇"};
        
        ComboBoxModel mode1 = new DataModel(s1);
        ComboBoxModel mode2 = new DataModel(s2);
        JComboBox combo1=new JComboBox(mode1);// 通过创建一个DefaultListModel类的继承类来创建一个列表框对象
        JComboBox combo2=new JComboBox(mode2);
        combo1.setBorder(BorderFactory.createTitledBorder("香烟"));
        combo2.setBorder(BorderFactory.createTitledBorder("名酒"));
        
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
/// 创建一个继承了DefaultListModel类的类
class DataModel extends DefaultComboBoxModel
{
    DataModel(String[] s)
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
