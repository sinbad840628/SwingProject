package com.swing.chapter16;

import java.awt.GridLayout;

import javax.swing.*;
public class test3 extends JPanel
{
	static final int WIDTH=500;
	static final int HEIGHT=300;
	test3()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�۸������Գ���");
		frame.setSize(WIDTH,HEIGHT);
		
		frame.setContentPane(this);
		setLayout(new GridLayout(4,2));
		JLabel title=new JLabel("�۸�������");
		JLabel name=new JLabel("�����û�");
		JLabel code=new JLabel("���Ժ���");
		

		JTextField nameinput=new JTextField(10);
		JTextField codeinput=new JTextField(10);
		try
		  {
			  UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		  }
		  catch(Exception e){}
		JButton input=new JButton("ȷ��");
		JButton quit=new JButton("�˳�");
		add(title);
		add(new JLabel());
		add(name);
		add(nameinput);
		add(code);
		add(codeinput);
		add(input);
		add(quit);
		
		frame.setVisible(true);
	}
	public static void main(String[] args)
	{
		new test3();
	}
}
