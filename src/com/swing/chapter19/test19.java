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
		frame.setTitle("��½����");
		
		frame.setSize(WIDTH,HEIGHT);
		frame.setContentPane(this);
		
		JLabel title=new JLabel("�򵥵�½����");
		JLabel name=new JLabel("����");
		JLabel password=new JLabel("����");
		nameinput=new JTextField();
		passwordinput=new JTextField();
		button1=new JButton("��½ϵͳ");
		button2=new JButton("������½");
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
		if(arg1.equals(test.nameinput))//�����ǰ����������ı���Ļ�������һ�������������������ı���
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
