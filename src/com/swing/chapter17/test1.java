package com.swing.chapter17;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;


//这段程序代码主要为读者展示如何使用“SwingUtilities.invokeLater()”方法来处理不同的线程
import javax.swing.*;
class process  extends  Thread 
{
   static final int WIDTH=700;
   static final int HEIGHT=400;
	  public  process()
  {
    JFrame frame=new JFrame("Swing多线程测试程序");
    JPanel panel=new JPanel();
    frame.setContentPane(panel);
    JButton button1=new JButton("按钮一");
JButton button2=new JButton("按钮二");
JButton button3=new JButton("按钮三");
JButton button4=new JButton("按钮四");
panel.setLayout(new GridLayout(2,2));
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
Toolkit kit=Toolkit.getDefaultToolkit();
Dimension screenSize=kit.getScreenSize();
int width=screenSize.width;
int height=screenSize.height;
int x=(width-WIDTH)/2;
int y=(height-HEIGHT)/2;
frame.setLocation(x,y);
frame.setVisible(true);
frame.setResizable(false);
}
}
public class test1
{
	static process p;
	public static void main(String[] args)
	{
		try
		{
		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				p=new process();
				try
			    {
			    p.sleep(30000);
			    }catch(Exception e){}
				}
		});
		}catch(Exception e){}
	   JFrame frame=new JFrame("Swing多线程测试程序");
    JPanel panel=new JPanel();
    frame.setContentPane(panel);
    JButton button1=new JButton("按钮一");
JButton button2=new JButton("按钮二");
JButton button3=new JButton("按钮三");
JButton button4=new JButton("按钮四");
panel.setLayout(new GridLayout(2,2));
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
Toolkit kit=Toolkit.getDefaultToolkit();
Dimension screenSize=kit.getScreenSize();
int width=screenSize.width;
int height=screenSize.height;
int x=(width-process.WIDTH)/2;
int y=(height- process.HEIGHT)/2;
frame.setLocation(x,y);
frame.setVisible(true);
frame.setResizable(false);
	}
}
