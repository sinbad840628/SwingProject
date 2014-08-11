class codeframe  extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JTextField input1;
	JPasswordField input2;
	JFrame frame;
	codeframe()
	{
		frame=new JFrame("双层密码锁第一层密码锁");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		setLayout(new BorderLayout());	
		JPanel pane=new JPanel();
		pane.setLayout(new GridLayout(2,2));
		add(pane,"Center");
		JLabel title=new JLabel("第一层密码锁");
		JLabel name=new JLabel("请输入用户名");
		JLabel code=new JLabel("请输入密码");
        input1=new JTextField(5);
        input2=new JPasswordField(10);//创建一个密码文本框
        
        add(title,"North");
        pane.add(name);
        pane.add(input1);
        pane.add(code);
        pane.add(input2);
        
        input2.addActionListener(new ActionListener()
        {

			public void actionPerformed(ActionEvent arg0) 
			{
				if(((input1.getText()).equals("starsong"))&&(input2.getText().equals("123456")))
				{
					new codeframe1();//当密码和用户名都输入正确，就会调出第二个顶层容器类。
				    frame.dispose();//第一个顶层容器类消失
				}
				else
				{
					input1.setText("");
					input2.setText("");
				}
			}
        	
        });
	}
}
class codeframe1  extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JFormattedTextField input1;
	MaskFormatter mf;
	static JFrame frame;
	codeframe1()
	{
		frame=new JFrame("第二层密码锁");
		frame.setContentPane(this);
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		
		JLabel title=new JLabel("第二层密码输入窗口");
		JLabel code=new JLabel("请输入第二层");
		try
		{
		    mf = new MaskFormatter("###-##");
		    mf.setPlaceholderCharacter('_');
		}
		catch(Exception e){}
		input1=new JFormattedTextField(mf);
		
		setLayout(new GridLayout(2,2));
		add(title);
		add(new JLabel());
		add(code);
		add(input1);
		
		input1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(input1.getText().equals("123-45"))
				{
					new okframe();
				}
				else
				{
					input1.setText("");
				}
			}
		});
		
	}
}
class okframe  extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JFrame frame;
	okframe()
	{
		frame=new JFrame("密码输入确认框");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		setLayout(new GridLayout(2,2));
		
		JLabel title=new JLabel("密码输入正确，确定进入系统");
		JButton ok=new JButton("确认");
		JButton cancel=new JButton("取消");
		add(title);
		add(new JLabel());
		add(ok);
		add(cancel);
		///当单击此按钮时，会让第二层容器类消失
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				codeframe1.frame.dispose();
			}
		});
        ///当单击此按钮时，会让第三个顶层容器类消失
		cancel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.dispose();
			}
		});
		
	}
}
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
public class test14 extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args)
	{
		new codeframe();
	}
