package com.swing.chapter17;

//��δ�����Ҫ��Ϊ����չʾ��δ����������ڳ���������������������������ͬһʱ���ڴ򿪣���Ϊ���Ƕ����ڹ����߳�
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class test2
{
	public static void main(String[] args)
	{
		try
		{
		SwingUtilities.invokeAndWait(new Runnable()
		{
			public void run()
			{
				new mainframe();
		}});

		}
		catch(Exception e){}
	}
}
class mainframe extends Thread
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
	mainframe()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(true);
		JButton button1=new JButton("�򿪵�һ������");
		JButton button2=new JButton("�򿪵ڶ�������");
		JButton button3=new JButton("�򿪵���������");
		JButton button4=new JButton("�򿪵��ĸ�����");
		JButton button5=new JButton("�򿪵��������");
		JButton button6=new JButton("�򿪵���������");
		pane.setLayout(new GridLayout(2,3));
		pane.add(button1);
		pane.add(button2);
		pane.add(button3);
		pane.add(button4);
		pane.add(button5);
		pane.add(button6);
		button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
				SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame1 f=new frame1();
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

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame2 f=new frame2();
						return null;
					}
				};
				work.execute();
            } });
		button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
            	SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame3 f=new frame3();
						return null;
					}
				};
				work.execute();
            } });
		button4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
            	SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame4 f=new frame4();
						return null;
					}
				};
				work.execute();
            } });
		button5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
            	SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame5 f=new frame5();
						return null;
					}
				};
				work.execute();
            } });
		button6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
				
            	SwingWorker work=new SwingWorker()
				{

					protected Object doInBackground() throws Exception {
						try
						{
							sleep(10000);
						}
						catch(Exception e){}
						frame6 f=new frame6();
						return null;
					}
				};
				work.execute();
            } });
	}
class frame1 
		{//����һ������
			frame1()
			{
				JFrame frame=new JFrame("SwingWorker���Գ���1");
				JPanel pane=new JPanel();
				frame.setContentPane(pane);
				Toolkit kit=Toolkit.getDefaultToolkit();
				Dimension screenSize=kit.getScreenSize();
				int width=screenSize.width;
				int height=screenSize.height;
				int x=(width-mainframe.WIDTH)/2;
				int y=(height-mainframe.HEIGHT)/2;
				frame.setLocation(x,y);
				frame.setVisible(true);
				frame.setResizable(false);
				JButton button1=new JButton("���ǵ�һ�����ڵĽ��");
				pane.add(button1,"Center");
			}
		}
//���潫�����ڶ�����ť������򿪵ĵڶ������ڵľ�����롣
class frame2 
{//����һ������
	frame2()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���1");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-mainframe.WIDTH)/2;
		int y=(height-mainframe.HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(false);
		JButton button2=new JButton("���ǵڶ������ڵĽ��");
		pane.add(button2,"Center");//���һ�������еĴ���������ͬ
	}
}
class frame3 
{//����һ������
	frame3()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���1");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-mainframe.WIDTH)/2;
		int y=(height-mainframe.HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(false);
		JButton button3=new JButton("���ǵ��������ڵĽ��");
		pane.add(button3,"Center");//���һ�������еĴ���������ͬ
	}
}
class frame4 
{//����һ������
	frame4()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���1");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-mainframe.WIDTH)/2;
		int y=(height-mainframe.HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(false);
		JButton button4=new JButton("���ǵ��ĸ����ڵĽ��");
		pane.add(button4,"Center");//���һ�������еĴ���������ͬ
	}
}
class frame5 
{//����һ������
	frame5()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���1");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-mainframe.WIDTH)/2;
		int y=(height-mainframe.HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(false);
		JButton button5=new JButton("���ǵ�������ڵĽ��");
		pane.add(button5,"Center");//���һ�������еĴ���������ͬ
	}
}
class frame6 
{
	frame6()
	{
		JFrame frame=new JFrame("SwingWorker���Գ���1");
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-mainframe.WIDTH)/2;
		int y=(height-mainframe.HEIGHT)/2;
		frame.setLocation(x,y);
		frame.setVisible(true);
		frame.setResizable(false);
		JButton button6=new JButton("���ǵ��������ڵĽ��");
		pane.add(button6,"Center");//���һ�������еĴ���������ͬ
     }
}
}
