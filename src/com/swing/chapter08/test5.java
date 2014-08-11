//这段程序代码是创建一个列表框，然后单击列表框中的某个选项，标签组件会显示所选择的选项
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;//由于ListSelectionEvent是swing的事件，不是awt的事件，因此我们必须import javax.swing.event.*
public class test5 implements ListSelectionListener
{
    JList list = null;
    JLabel label = null;
    String[] s = {"美国","日本","大陆","英国","法国","意大利","澳洲","韩国"};
    
    public test5()
    {
        JFrame f = new JFrame("JList");
        Container contentPane = f.getContentPane();
        contentPane.setLayout(new BorderLayout());
        label = new JLabel();
        
        list = new JList(s);//利用数据创建列表框
        list.setVisibleRowCount(5);
        list.setBorder(BorderFactory.createTitledBorder("您最喜欢到哪个国家玩呢？"));
        list.addListSelectionListener(this);
        
        contentPane.add(label,BorderLayout.NORTH);
        contentPane.add(new JScrollPane(list),BorderLayout.CENTER);
        f.pack();
        f.show();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
            }
        });
    }
    
    public static void main(String args[])
    {
        new test5();
    }
    ///实现valueChanged()方法，通过这个方法将列表框中所选取的数据显示在标签中
    public void valueChanged(ListSelectionEvent e)
    {
        int tmp = 0;
        String stmp = "您目前选取：";
        int[] index = list.getSelectedIndices();//所选数据的序列号
        for(int i=0; i < index.length ; i++)
        {
            tmp = index[i];
            stmp = stmp+s[tmp]+"  ";
        }
        label.setText(stmp);//为标签赋值
    }
}
