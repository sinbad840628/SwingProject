package com.swing.chapter19;

//���ʵ����Ҫ�Ǵ��������ť�������������ť����ϵ��ı�����ͨ����ͬHTML�ĵ���ʹ��չ�ֳ���ͬ�����
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class test1 
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
  public static void main(String[] args)
  {
	  JFrame frame=new JFrame("<html><b>HTML�ı����Գ���</b></html>");//����һ��������������󣬲��������ʹ�ô���
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
	  JButton button1=new JButton("<html><b>��һ����ť���</b><br>"+"<font color=red>����һ</font></html>");//���������ť�����ÿ����ť��������������ۡ���ɫ��һ��
	  JButton button2=new JButton("<html><b>�ڶ�����ť���</b><br>"+"<font color=blue>���Զ�</font></html>");
	  JButton button3=new JButton("<html><b>��������ť���</b><br>"+"<font color=green>������</font></html>");
	  JButton button4=new JButton("<html><b>���ĸ���ť���</b><br>"+"<font color=orange>������</font></html>");
	  JButton button5=new JButton("<html><b>�������ť���</b><br>"+"<font color=grey>������</font></html>");
	  JPanel panel=new JPanel();
	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  frame.setContentPane(panel);
  }
}
