package com.swing.chapter17;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;


//��γ��������ҪΪ����չʾ���ʹ�á�SwingUtilities.invokeLater()������������ͬ���߳�
import javax.swing.*;
class process  extends  Thread 
{
   static final int WIDTH=700;
   static final int HEIGHT=400;
	  public  process()
  {
    JFrame frame=new JFrame("Swing���̲߳��Գ���");
    JPanel panel=new JPanel();
    frame.setContentPane(panel);
    JButton button1=new JButton("��ťһ");
JButton button2=new JButton("��ť��");
JButton button3=new JButton("��ť��");
JButton button4=new JButton("��ť��");
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
	   JFrame frame=new JFrame("Swing���̲߳��Գ���");
    JPanel panel=new JPanel();
    frame.setContentPane(panel);
    JButton button1=new JButton("��ťһ");
JButton button2=new JButton("��ť��");
JButton button3=new JButton("��ť��");
JButton button4=new JButton("��ť��");
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
