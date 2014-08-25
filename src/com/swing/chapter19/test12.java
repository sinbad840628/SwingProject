package com.swing.chapter19;

//这段程序代码主要为读者展示如何为组件指定键绑定功能
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
public class test12  
{
private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    static JFrame f;
    JMenuItem item1;
    JPanel p;
    static JTabbedPane tp;
    public test12() 
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
		  //与19.4中的实例相同位置加黑部分内容相同
      buttonAction buttonaction=new buttonAction("磨砂分厂职工信息");
      button1.setAction(buttonaction);
      menuAction menuaction=new menuAction("退出");
      item4.setAction(menuaction);
///将快捷键B同button1绑定，也就是说当按“B”就相当于单击button1按钮组件。
      button1.getInputMap(2).put(KeyStroke.getKeyStroke("B"), "open");
      button1.getActionMap().put("open", buttonaction);
      item4.getInputMap(2).put(KeyStroke.getKeyStroke("A"), "QUIT");
      item4.getActionMap().put("QUIT", menuaction);
    }
public static void main(String args[]) 
{
  new test12();
 }
}
class info extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	info()
	{  
		……………………………//与19.4中的实例相同位置加黑部分内容相同
	}
}
class buttonAction extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public buttonAction(String text)
	{
		  super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		   ……………………………//与19.4中的实例相同位置加黑部分内容相同
	}
}
class menuAction extends AbstractAction
{
	public menuAction(String text)
	{
		super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		int i=JOptionPane.showConfirmDialog(null,"是否真的需要退出系统","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
    	if(i==0)
    	{
    		test.f.dispose();
    	}
		
	}
}
