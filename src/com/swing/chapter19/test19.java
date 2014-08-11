import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class test19 extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=400;
	static JTextField nameinput;
	static JTextField passwordinput;
	static JButton button1;
	static JButton button2;
	test19()
	{
		JFrame frame=new JFrame();
		frame.setTitle("登陆窗口");
		
		frame.setSize(WIDTH,HEIGHT);
		frame.setContentPane(this);
		
		JLabel title=new JLabel("简单登陆窗口");
		JLabel name=new JLabel("姓名");
		JLabel password=new JLabel("密码");
		nameinput=new JTextField();
		passwordinput=new JTextField();
		button1=new JButton("登陆系统");
		button2=new JButton("放弃登陆");
		setLayout(new GridLayout(4,2));
		add(title);
		add(new JLabel());
		add(name);
		add(nameinput);
		add(password);
		add(passwordinput);
		add(button1);
		add(button2);
		framefocus focus1=new framefocus();
		frame.setFocusTraversalPolicy(focus1); 
		
		frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  nameinput.requestFocusInWindow();
			  }
		  });
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new test19();
	}
}
class framefocus extends FocusTraversalPolicy
{

	public Component getComponentAfter(Container arg0, Component arg1)
	{
		if(arg1.equals(test.nameinput))//如果当前组件是姓名文本框的话，则下一个遍历对象则是密码文本框
		{
			return test.passwordinput;
		}
		else if(arg1.equals(test.passwordinput))
		{
			return test.button1;
		}
		else if(arg1.equals(test.button1))
		{
			return test.button2;
		}
		return test.nameinput;
	}
	public Component getComponentBefore(Container arg0, Component arg1) 
	{
		
		if(arg1.equals(test.button2))
		{
			return test.nameinput;
		}
		else if(arg1.equals(test.nameinput))
		{
			return test.passwordinput;
		}
		else if(arg1.equals(test.passwordinput))
		{
			return test.button1;
		}
		return test.button2;
	}
	public Component getDefaultComponent(Container arg0) 
	{
		return test.nameinput;
	}

	public Component getFirstComponent(Container arg0) 
	{
		return test.nameinput;
	}
	public Component getLastComponent(Container arg0)
	{
		return test.button2;
	}
	
}
