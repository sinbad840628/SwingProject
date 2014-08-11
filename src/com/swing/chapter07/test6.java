//这段程序代码主要是为读者展示如何使用焦点事件，当如何获得焦点以及如何失去焦点
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//此类继承了焦点监听器接口
public class test6 extends JFrame implements FocusListener
{
	List info=new List(10);
	JTextField tf=new JTextField("");
	JButton button=new JButton("确认");
	public test6(String title)
	{
	  super(title);
	  add(info,"North");
	  add(tf,"Center");
	  add(button,"South");
	  tf.addFocusListener(this);	  
	}
	public void focusGained(FocusEvent e)
	{
		if(e.isTemporary())//将焦点更改事件的标识为暂时性或者永久性
			info.add("暂时性获得");
		else info.add("长久性获得");
	}
	public void focusLost(FocusEvent e)
	{
		if(e.isTemporary())//将焦点更改事件的标识为暂时性或者永久性
			info.add("暂时性失去");
		else info.add("长久性失去");
	}
	public static void main(String[] args)
	{
		test6 t=new test6("测试窗口");
		t.pack();
		t.setVisible(true);
	}
}
