import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
public class test17 extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=400;
	Border b1;
	Border b2;
	Border b3;
	test17()
	{
		JFrame frame=new JFrame();
		frame.setTitle("快捷键测试程序");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		JMenuBar menubar=new JMenuBar();
		JMenu color=new JMenu("颜色");
		JMenuItem color1=new JMenuItem("将边框设为红色");
		JMenuItem color2=new JMenuItem("将边框设为绿色");
		JMenuItem color3=new JMenuItem("将边框设为蓝色");
		menubar.add(color);
		color.add(color1);
		color.add(color2);
		color.add(color3);
		frame.setJMenuBar(menubar);
		b1=BorderFactory.createLineBorder(Color.red);
		b2=BorderFactory.createLineBorder(Color.green);
		b3=BorderFactory.createLineBorder(Color.blue);
		
		color1.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
				 setBorder(b1);
	         }
		});
		color2.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
				 setBorder(b2);
	         }
		});
		color3.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
				 setBorder(b3);
	         }
		});
	}
	public static void main(String[] args)
	{
		new test17();
	}
}
