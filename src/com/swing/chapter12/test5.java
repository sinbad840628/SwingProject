package com.swing.chapter12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test5  extends JApplet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=400;
	static final int HEIGHT=400;
	static JPanel content;
	static JApplet applet;
	static JLabel label=new JLabel();
	public void init()//JApplet�ĳ�ʼ��״̬
	{
		getContentPane().add(label);
		label.setText("������ҵĳ�ʼ״̬");
	}
	public void start()//JApplet������״̬
	{
		label.setText("����������е�״̬");;
	}
	public void  stop()//JApplet��ֹͣ״̬
	{
		label.setText("�����ֹͣ����״̬");
	}
	public void destroy()//����״̬
	{
		label.setText("���������״̬");
	}
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setTitle("�����������Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		content=new JPanel();
		frame.setContentPane(content);
		JButton init=new JButton("��ʼ״̬");
		JButton run=new JButton("����״̬");
		JButton stop=new JButton("ֹͣ");
		JButton destory=new JButton("����");
		JPanel pane=new JPanel();
		pane.add(init);
		pane.add(run);
		pane.add(stop);
		pane.add(destory);
		content.add(pane,"North");
		applet=new test5();
		content.add(applet,"Center");
		init.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
				applet.init();
			}
		});
		run.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
				applet.start();
			}
		});
		stop.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
				applet.stop();
			}
		});
		destory.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
				applet.destroy();
			}
		});
	}
	}
