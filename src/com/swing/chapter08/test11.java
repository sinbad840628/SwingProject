import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
public class test11 extends JSplitPane
{
	
    public test11()
    {
        JFrame f = new JFrame("列表框测试窗口");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        
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
/// 创建一个继承了DefaultListModel类的类
class DataModel extends DefaultListModel
{
    
    
    DataModel(String[] s)
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
