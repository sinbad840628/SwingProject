package com.swing.chapter17;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test3 extends Thread
{
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JTextField text1;
	JTextField text2;
	test3()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�����̲߳��Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		
		pane.setLayout(new GridLayout(4,1));
		text1=new JTextField(10);
		text2=new JTextField(10);
		JButton button1=new JButton("������һ");
		JButton button2=new JButton("��������");
		pane.add(text1);
		pane.add(button1);
		pane.add(text2);
		pane.add(button2);
		button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
				SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground()throws Exception 
					{
						try
						{
							sleep(1000);
						}
						catch(Exception e){}

						new compute(1000000);
						text1.setText(""+compute.sum);
						return null;
					}
				};
            
				work.execute();	
            }
        });
		button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
				SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() 
					{
						new computer(100);
						text2.setText(""+computer.sum);
						return null;
					}
				};
				work.execute();	
            }
        });
			

        }
	public static void main(String[] args)
	{
		new test3();
	}
}
class computer
{
	static int sum=0;
	computer(int n)
	{
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
	}
}
