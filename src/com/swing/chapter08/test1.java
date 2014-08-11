//这段程序代码主要是为读者展示如何使用数组创建列表框
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class test1
{
	public static void main(String[] args)
	{
		   JFrame f=new JFrame("测试窗口");
		   f.setSize(400,300);
	        f.setLocation(0,0);
	        f.setVisible(true);
	        JPanel p=new JPanel();
	        f.setContentPane(p);
	        p.setLayout(new BorderLayout());
//将数据存储到数组name中
	        String[] name={"王鹏","王宸博","朱雪莲","王棋淋","项西云","文日珍","宋丽","田秀"};
	        JList l=new JList(name);//通过JList(String text)构造器将数组中的数据直接列举在列表框中
	        JTextField tf=new JTextField();
	        p.add(l,"North");
	        p.add(tf,"South");
//此方法的用途就是当选择列表框中的任意一项时，都会将选择项显示在文本框中
	        while(true)
	        {
	            tf.setText((String)l.getSelectedValue());
	        }   
	}
}
