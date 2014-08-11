//这段程序主要是使用DefaultListModel类的类来创建一个列表框
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
        JList list = new JList(mode);//通过创建一个DefaultListModel类的继承类来创建一个列表框对象
        list.setVisibleRowCount(5);
        list.setBorder(BorderFactory.createTitledBorder("电脑配件"));
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
class DataModel extends DefaultListModel// 创建一个继承了DefaultListModel类的类
{
    String[] s = {"显示器","主板","硬盘","内存","键盘","鼠标","电源","光驱"};
    
    DataModel()
    {
        for(int i=0; i < s.length; i++)
            addElement((i+1)+"."+s[i]);
    }
}
