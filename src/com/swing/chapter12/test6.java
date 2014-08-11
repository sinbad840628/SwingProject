import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test6 
{
	static final int WIDTH=400;
	static final int HEIGHT=500;
	JMenuItem item2;
	JMenuItem item3;
	JMenuItem item4;
	JMenuItem item5;
	JMenuItem item6;
	JMenuItem item8;
	JMenuItem item9;
	JMenuItem item10;
	JMenuItem item11;
	JMenuItem item12;
	JMenuItem item13;
	test6()
	{
		JFrame frame=new JFrame();
		frame.setTitle("测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		JMenuBar menubar=new JMenuBar();
		JMenu menu1=new JMenu("菜单一");
		JMenu menu2=new JMenu("菜单二");
		JMenuItem item1=new JMenuItem("取消菜单一中所有的菜单项可用性");
		item2=new JMenuItem("菜单项一");
		item3=new JMenuItem("菜单项二");
		item4=new JMenuItem("菜单项三");
	    item5=new JMenuItem("菜单项四");
		item6=new JMenuItem("菜单项五");
		JMenuItem item7=new JMenuItem("取消菜单一中所有的菜单项可用性");
		item8=new JMenuItem("菜单项六");
		item9=new JMenuItem("菜单项七");
		item10=new JMenuItem("菜单项八");
		item11=new JMenuItem("菜单项九");
		item12=new JMenuItem("菜单项十");
	    item13=new JMenuItem("菜单项十一");
		
		menubar.add(menu1);
		menubar.add(menu2);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.add(item5);
		menu1.add(item6);
		menu2.add(item7);
		menu2.add(item8);
		menu2.add(item9);
		menu2.add(item10);
		menu2.add(item11);
		menu2.add(item12);
		menu2.add(item13);
		
		frame.setJMenuBar(menubar);
		item1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				int i=JOptionPane.showConfirmDialog(null,"这是一个有关取消菜单可用性的消息","这是一个有关有关取消菜单可用性的对话框", JOptionPane.YES_NO_CANCEL_OPTION);
				if(i==0)
				{
				item2.setEnabled(false);
				item3.setEnabled(false);
				item4.setEnabled(false);
				item5.setEnabled(false);
				item6.setEnabled(false);
				}
			}
		});
		item7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{

				int i=JOptionPane.showConfirmDialog(null,"这是一个有关取消菜单可用性的消息","这是一个有关有关取消菜单可用性的对话框", JOptionPane.YES_NO_CANCEL_OPTION);
				if(i==0)
				{
				item8.setEnabled(false);
				item9.setEnabled(false);
				item10.setEnabled(false);
				item11.setEnabled(false);
				item12.setEnabled(false);
				item13.setEnabled(false);
				}
			}
		});
	
		
		}	
		
	public static void main(String[] args)
	{
		new test6();
		}
}
