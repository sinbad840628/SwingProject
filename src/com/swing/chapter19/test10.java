package com.swing.chapter19;

//��γ��������Ҫ��Ϊ����չʾ������ڶ�������Ϊ���ָ��Ĭ�Ͻ���
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test10  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button4;
 public test10() 
 {
    	  JFrame frame=new JFrame("������Գ���");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  JButton button1=new JButton("���԰�ťһ");
		  JButton button2=new JButton("���԰�ť��");
		  JButton button3=new JButton("���԰�ť��");
		  button4=new JButton("���԰�ť��");
		  JButton button5=new JButton("���԰�ť��");
		  JButton button6=new JButton("���԰�ť��");
		  JButton button7=new JButton("���԰�ť��");
		  pane.add(button1);
		  pane.add(button2);
		  pane.add(button3);
		  pane.add(button4);
		  pane.add(button5);
		  pane.add(button6);
		  pane.add(button7);
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
		  
		  frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button4.requestFocusInWindow();//�ô��ڱ�����ʱ��button4��ť������Զ���ý���
			  }
		  });

    }
public static void main(String args[]) 
{
  new test10();
 }
}
