package com.swing.chapter16;

import javax.swing.*;
public class test4 
{
	static final int WIDTH=500;
	static final int HEIGHT=300;
	test4()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�۸������Գ���");
		frame.setSize(WIDTH,HEIGHT);
		
		
		JMenuBar menubar=new JMenuBar();
		frame.setJMenuBar(menubar);
		JMenu menu1=new JMenu("�ļ�");
		JMenu menu2=new JMenu("�༭");
		JMenuItem item1=new JMenuItem("�½�");
		JMenuItem item3=new JMenuItem("����");
		JMenuItem item5=new JMenuItem("��ӡ");
		JMenuItem item7=new JMenuItem("����");
		JMenuItem item9=new JMenuItem("����");
		try
		  {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		  }
		  catch(Exception e){}

		JMenuItem item2=new JMenuItem("��");
		JMenuItem item4=new JMenuItem("���Ϊ");
		JMenuItem item6=new JMenuItem("�˳�");
		JMenuItem item8=new JMenuItem("ճ��");
		JMenuItem item10=new JMenuItem("����");
		
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
