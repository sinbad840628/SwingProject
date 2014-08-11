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
		frame=new JFrame("˫����������һ��������");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		setLayout(new BorderLayout());	
		JPanel pane=new JPanel();
		pane.setLayout(new GridLayout(2,2));
		add(pane,"Center");
		JLabel title=new JLabel("��һ��������");
		JLabel name=new JLabel("�������û���");
		JLabel code=new JLabel("����������");
        input1=new JTextField(5);
        input2=new JPasswordField(10);//����һ�������ı���
        
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
					new codeframe1();//��������û�����������ȷ���ͻ�����ڶ������������ࡣ
				    frame.dispose();//��һ��������������ʧ
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
		frame=new JFrame("�ڶ���������");
		frame.setContentPane(this);
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		
		JLabel title=new JLabel("�ڶ����������봰��");
		JLabel code=new JLabel("������ڶ���");
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
		frame=new JFrame("��������ȷ�Ͽ�");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		setLayout(new GridLayout(2,2));
		
		JLabel title=new JLabel("����������ȷ��ȷ������ϵͳ");
		JButton ok=new JButton("ȷ��");
		JButton cancel=new JButton("ȡ��");
		add(title);
		add(new JLabel());
		add(ok);
		add(cancel);
		///�������˰�ťʱ�����õڶ�����������ʧ
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				codeframe1.frame.dispose();
			}
		});
        ///�������˰�ťʱ�����õ�����������������ʧ
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
