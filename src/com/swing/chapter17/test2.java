package com.swing.chapter17;

//这段代码主要是为读者展示如何处理背景任务，在程序中有六个顶层容器，可以在同一时间内打开，因为它们都处于工作线程
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
		JFrame frame=new JFrame("SwingWorker测试程序");
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
		JButton button1=new JButton("打开第一个窗口");
		JButton button2=new JButton("打开第二个窗口");
		JButton button3=new JButton("打开第三个窗口");
		JButton button4=new JButton("打开第四个窗口");
		JButton button5=new JButton("打开第五个窗口");
		JButton button6=new JButton("打开第六个窗口");
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
		{//创建一个窗口
			frame1()
			{
				JFrame frame=new JFrame("SwingWorker测试程序1");
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
				JButton button1=new JButton("这是第一个窗口的结果");
				pane.add(button1,"Center");
			}
		}
//下面将给出第二个按钮组件所打开的第二个窗口的具体代码。
class frame2 
{//创建一个窗口
	frame2()
	{
		JFrame frame=new JFrame("SwingWorker测试程序1");
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
		JButton button2=new JButton("这是第二个窗口的结果");
		pane.add(button2,"Center");//与第一个窗口中的代码内容相同
	}
}
class frame3 
{//创建一个窗口
	frame3()
	{
		JFrame frame=new JFrame("SwingWorker测试程序1");
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
		JButton button3=new JButton("这是第三个窗口的结果");
		pane.add(button3,"Center");//与第一个窗口中的代码内容相同
	}
}
class frame4 
{//创建一个窗口
	frame4()
	{
		JFrame frame=new JFrame("SwingWorker测试程序1");
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
		JButton button4=new JButton("这是第四个窗口的结果");
		pane.add(button4,"Center");//与第一个窗口中的代码内容相同
	}
}
class frame5 
{//创建一个窗口
	frame5()
	{
		JFrame frame=new JFrame("SwingWorker测试程序1");
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
		JButton button5=new JButton("这是第五个窗口的结果");
		pane.add(button5,"Center");//与第一个窗口中的代码内容相同
	}
}
class frame6 
{
	frame6()
	{
		JFrame frame=new JFrame("SwingWorker测试程序1");
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
		JButton button6=new JButton("这是第六个窗口的结果");
		pane.add(button6,"Center");//与第一个窗口中的代码内容相同
     }
}
}
