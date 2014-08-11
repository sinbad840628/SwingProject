package com.swing.chapter12;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test4  
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=400;
	static final int HEIGHT=400;
	JPanel content;
	test4()
	{
		JFrame frame=new JFrame();
		frame.setTitle("¶¥²ãÈÝÆ÷²âÊÔ´°¿Ú");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		content=new JPanel();
		frame.setContentPane(content);
		JButton red=new JButton("ºìÉ«");
		JButton blue=new JButton("À¶É«");
		JButton green=new JButton("ÂÌÉ«");
		JButton black=new JButton("ºÚÉ«");
		JPanel pane=new JPanel();
		pane.add(red);
		pane.add(blue);
		pane.add(green);
		pane.add(black);
		content.add(pane,"North");
		red.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				content.setBackground(Color.red);
			}			
		});
		blue.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				content.setBackground(Color.blue);
			}			
		});
		green.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				content.setBackground(Color.green);
			}			
		});
		black.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				content.setBackground(Color.black);
			}			
		});
	}
	public static void main(String[] args)
	{
		new test4();
	}
	}
