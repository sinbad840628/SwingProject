//这段代码主要是为读者介绍如何处理窗口的事件
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class test3 extends JFrame 
{
    public test3()
    {
    	    super.setTitle("测试窗口");
///向事件源注册监听器类
        WindowListener wh=new windowhandler();
        addWindowListener(wh);
    }
    public static void main(String[] args)
    {
        test3 me=new test3();
        me.setSize(400,300);
        me.setVisible(true);
}
///创建一个窗口事件处理类
class windowhandler implements WindowListener 
{
    public void windowActivated(WindowEvent e)//此方法不需要，但必须要空实现
    {}
    public void windowClosed(WindowEvent e) //此方法不需要，但必须要空实现
    {}
    public void windowClosing(WindowEvent e)
    {
	    JButton b1=new JButton("确定");
         JButton b2=new JButton("取消");
         JLabel l=new JLabel("你能确定关闭系统了吗？");
         JDialog d=new JDialog((JFrame)e.getSource(),"系统出错了!",true)//创建一个对话框
         d.setSize(200,100);
         d.setLocation(0,0);
         JPanel p=new JPanel();
         p.setLayout(new GridLayout(1,2));
         d.add(p,"South");
         d.add(l,"Center");
         p.add(b1);
         p.add(b2);  
         d.setVisible(true);
         b1.setVisible(true);
         b2.setVisible(true);
         l.setVisible(true);
    }
    public void windowDeactivated(WindowEvent e){} //此方法不需要，但必须要空实现
    public void windowIconified(WindowEvent e){} //此方法不需要，但必须要空实现
    public void windowDeiconified(WindowEvent e){} //此方法不需要，但必须要空实现
    public void windowOpened(WindowEvent e){} //此方法不需要，但必须要空实现
    }
}
