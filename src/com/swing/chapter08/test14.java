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
        JFrame f = new JFrame("列表框测试窗口");
        f.setContentPane(this);
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        text1=new JTextField(10);
        text2=new JTextField(10);
        
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
				text1.setText("这是新鲜的蔬菜");
				
			}
			
        });
        combo2.addItemListener(new ItemListener()
        {
			public void itemStateChanged(ItemEvent arg0) 
			{
				text2.setText("这是好吃的食品");
				
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
/// 创建一个继承了DefaultListModel类的类
class DataModel extends DefaultComboBoxModel
{
    ………………………..//同第二实例中加黑部分内容相同
}
