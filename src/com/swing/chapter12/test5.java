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
	public void init()//JApplet的初始化状态
	{
		getContentPane().add(label);
		label.setText("这个是我的初始状态");
	}
	public void start()//JApplet的运行状态
	{
		label.setText("这个是我运行的状态");;
	}
	public void  stop()//JApplet的停止状态
	{
		label.setText("这个是停止运行状态");
	}
	public void destroy()//销毁状态
	{
		label.setText("这个是销毁状态");
	}
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setTitle("顶层容器测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		content=new JPanel();
		frame.setContentPane(content);
		JButton init=new JButton("初始状态");
		JButton run=new JButton("运行状态");
		JButton stop=new JButton("停止");
		JButton destory=new JButton("消除");
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
