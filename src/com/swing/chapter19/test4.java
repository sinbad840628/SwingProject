package com.swing.chapter19;

//这段程序代码主要是为读者展示如何为容器添加边框
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
//Download by http://www.codefans.net
public class test4
{
	 static final int WIDTH=600;
	 static final int HEIGHT=300;
	public static void main(String[] args)
	{
		  JFrame frame=new JFrame("边框测试程序");
		  Toolkit kit=Toolkit.getDefaultToolkit();
		  Dimension screenSize=kit.getScreenSize();
		  int width=screenSize.width;
		  int height=screenSize.height;
		  int x=(width-WIDTH)/2;
		  int y=(height-HEIGHT)/2;
		  frame.setLocation(x,y);
	      frame.setSize(WIDTH, HEIGHT);
		  frame.setVisible(true);
		  frame.pack();
		  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  pane.setBorder(BorderFactory.createLineBorder(Color.red));//设置内容面板的边框的颜色为红色
	}
}
