package com.swing.chapter11;

//��γ��������Ҫ�������չʾ��δ�ӡ�ı����
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.*;
public class test11  extends JPanel
{
	static JTextArea text;
	test11()
	{
	    JFrame frame=new JFrame("��ӡ���Գ���");
	    frame.setContentPane(this);
	    frame.setVisible(true);
	    text=new JTextArea(10,10);
	    JButton button=new JButton("��ӡ�ĵ�");
	    setLayout(new FlowLayout());
	    add(text);
	    add(button);
	    button.addActionListener(new ActionListener()
	    {
	    	 public void actionPerformed(ActionEvent Event)
	    	  {
	    		 try
	    		 {
	    		 text.print();//�����ı��Ĵ�ӡ����
	    	  }
	    		 catch(Exception e){}
	    	  }
	    	 
	    });
	}
    public static void main(String args[])    
    {
      new test11();
    }
}
