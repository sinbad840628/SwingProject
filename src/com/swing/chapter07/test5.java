//这段程序代码主要是为读者展示如何处理动作事件，当单击按钮组件时，其上的文本会发生变化
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///创建一个动作事件类，在这个类中，如果单击按钮的话，那么按钮上的文本会发生变化
public class test5 extends Frame 
{
    JButton b;
    public test5(String str)
    {
        super(str);
        b=new JButton("确认");
        add(b);
        ActionListener ac=new actionhandler();
        b.addActionListener(ac);
    }
    public static void main(String[] args)
    {
        test5 me=new test5("动作事件测试窗口");
        me.pack();
        me.setVisible(true);
    }
    class actionhandler implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            ((JButton)e.getSource()).setLabel("取消");
        }
    }
}
