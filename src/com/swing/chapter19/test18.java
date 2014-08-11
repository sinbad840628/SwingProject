import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class test18 extends JPanel
{
	static final int WIDTH=500;
	static final int HEIGHT=200;
	static JButton button1;
	static JButton button2;
	static JButton button3;
	static JTextField text1;
	static JTextField text2;
	test18()
	{
		JFrame frame=new JFrame();
		frame.setTitle("焦点子系统测试");
		frame.setVisible(true);
		frame.setContentPane(this);
		frame.setSize(WIDTH,HEIGHT);
		
		button1=new JButton("按钮一");
		button2=new JButton("按钮二");
		button3=new JButton("按钮三");
		text1=new JTextField("文本组件一");
		text2=new JTextField("文本组件二");
		add(button1);
		add(button2);
		add(button3);
		add(text1);
		add(text2);
		framefocus focus1=new framefocus();
		frame.setFocusTraversalPolicy(focus1); 
		frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button1.requestFocusInWindow();
			  }
		  });

	}
	public static void main(String[] args)
	{
		new test18();
	}
}
class framefocus extends FocusTraversalPolicy
{

	public Component getComponentAfter(Container arg0, Component arg1)
	{
		if(arg1.equals(test.button1))//如果当前组件是按钮一的话，则下一个遍历对象则是按钮二
		{
			return test.text1;
		}
		else if(arg1.equals(test.text1))
		{
			return test.button2;
		}
		else if(arg1.equals(test.button2))
		{
			return test.text2;
		}
		else if(arg1.equals(test.text2))
		{
			return test.button3;
		}
		return test.button1;
	}
	public Component getComponentBefore(Container arg0, Component arg1) 
	{
		
		if(arg1.equals(test.button3))
		{
			return test.text2;
		}
		else if(arg1.equals(test.text2))
		{
			return test.button2;
		}
		else if(arg1.equals(test.button2))
		{
			return test.text1;
		}
		else if(arg1.equals(test.text1))
		{
			return test.button1;
		}		
		return test.button3;
	}
	public Component getDefaultComponent(Container arg0) 
	{
		return test.button1;
	}

	public Component getFirstComponent(Container arg0) 
	{
		return test.button1;
	}
	public Component getLastComponent(Container arg0)
	{
		return test.button3;
	}
}
