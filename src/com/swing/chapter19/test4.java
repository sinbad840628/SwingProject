package com.swing.chapter19;

//��γ��������Ҫ��Ϊ����չʾ���Ϊ������ӱ߿�
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
		  JFrame frame=new JFrame("�߿���Գ���");
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
		  pane.setBorder(BorderFactory.createLineBorder(Color.red));//�����������ı߿����ɫΪ��ɫ
	}
}
