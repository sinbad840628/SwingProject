package com.swing.chapter19;

//��γ��������ҪΪ����չʾ���ʹ�ñ����������淶�ڶ�����Ľ�����ϵͳ
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Download by http://www.codefans.net
public class test11  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button1;
	static JButton button2;
	static JButton button3;
	static JButton button4;
	static JButton button5;
	static JButton button6;
	static JButton button7;
    public test11() 
    {
    	  JFrame frame=new JFrame("������Գ���");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  button1=new JButton("���԰�ťһ");
		  button2=new JButton("���԰�ť��");
		  button3=new JButton("���԰�ť��");
		  button4=new JButton("���԰�ť��");
		  button5=new JButton("���԰�ť��");
		  button6=new JButton("���԰�ť��");
		  button7=new JButton("���԰�ť��");
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
		  framefocust focus1=new framefocust();
		  frame.setFocusTraversalPolicy(focus1);
		  
		  frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button1.requestFocusInWindow();
			  }
		  });

    }
public static void main(String args[]) 
{
  new test11();
 }
}
class framefocust extends FocusTraversalPolicy
{//����������ԣ���������������Ҳ����˵����TAB��ʱ����ǰ��ť�������һ����ť�������һ��
	public Component getComponentAfter(Container arg0, Component arg1)
	{
		
		if(arg1.equals(test11.button1))//�����ǰ����ǰ�ťһ�Ļ�������һ�������������ǰ�ť��
		{
			return test11.button2;
		}
		else if(arg1.equals(test11.button2))
		{
			return test11.button4;
		}
		else if(arg1.equals(test11.button4))
		{
			return test11.button3;
		}
		else if(arg1.equals(test11.button3))
		{
			return test11.button5;
		}
		else if(arg1.equals(test11.button5))
		{
			return test11.button7;
		}
		else if(arg1.equals(test11.button7))
		{
			return test11.button6;
		}
		return test11.button1;
	}

	public Component getComponentBefore(Container arg0, Component arg1) 
	{//����������ԣ���������ǰ������Ҳ����˵����TAB��ʱ����ǰ��ť�������һ����ť�������һ��
		if(arg1.equals(test11.button6))
		{
			return test11.button7;
		}
		else if(arg1.equals(test11.button7))
		{
			return test11.button5;
		}
		else if(arg1.equals(test11.button5))
		{
			return test11.button3;
		}
		else if(arg1.equals(test11.button3))
		{
			return test11.button4;
		}
		else if(arg1.equals(test11.button4))
		{
			return test11.button2;
		}
		else if(arg1.equals(test11.button2))
		{
			return test11.button1;
		}
		return test11.button1;
	}

	public Component getDefaultComponent(Container arg0) 
	{
		
		return test11.button1;
	}

	public Component getFirstComponent(Container arg0) 
	{
	
		return test11.button1;
	}

	public Component getLastComponent(Container arg0)
	{
		
		return test11.button6;
	}
}
