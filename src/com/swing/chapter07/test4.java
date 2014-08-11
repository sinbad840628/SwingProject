import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
///创建一个窗口事件适配器类
///在这个适配器内只需要实现关闭窗口后的事件就可以了
public class test4 extends JFrame 
{
    public test4()
    {	
    	   super.setTitle("测试窗口");
        WindowListener wh=new windowhandler();
        addWindowListener(wh);
    }
    public static void main(String[] args)
    {
        test4 me=new test4();
        me.setSize(400,300);
        me.setVisible(true);
    }
    class windowhandler extends WindowAdapter
    {
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
    }
}
