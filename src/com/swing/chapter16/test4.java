package com.swing.chapter16;

import javax.swing.*;
public class test4 
{
	static final int WIDTH=500;
	static final int HEIGHT=300;
	test4()
	{
		JFrame frame=new JFrame();
		frame.setTitle("观感器测试程序");
		frame.setSize(WIDTH,HEIGHT);
		
		
		JMenuBar menubar=new JMenuBar();
		frame.setJMenuBar(menubar);
		JMenu menu1=new JMenu("文件");
		JMenu menu2=new JMenu("编辑");
		JMenuItem item1=new JMenuItem("新建");
		JMenuItem item3=new JMenuItem("保存");
		JMenuItem item5=new JMenuItem("打印");
		JMenuItem item7=new JMenuItem("拷贝");
		JMenuItem item9=new JMenuItem("剪切");
		try
		  {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		  }
		  catch(Exception e){}

		JMenuItem item2=new JMenuItem("打开");
		JMenuItem item4=new JMenuItem("另存为");
		JMenuItem item6=new JMenuItem("退出");
		JMenuItem item8=new JMenuItem("粘贴");
		JMenuItem item10=new JMenuItem("查找");
		
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
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new test4();
	}
}
