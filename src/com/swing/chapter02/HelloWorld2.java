package com.swing.chapter02;

//这段代码主要是创建了一个JTabbedPane面板，这个面板也就是标签页面板
import javax.swing.*;
import java.awt.*;
public class HelloWorld2  extends JTabbedPane
{
private static final long serialVersionUID = 1L;
static final int WIDTH=600;
    static final int HEIGHT=400;
    public HelloWorld2() 
    {
      JFrame f=new JFrame("测试窗口");
      JPanel p=new JPanel();
      f.setContentPane(p);
      f.setVisible(true);
	     p.setLayout(new BorderLayout());
	     JPanel panel1 = new JPanel ();
	     JPanel panel2 = new JPanel ();
	     JPanel panel3 = new JPanel ();
	     JPanel panel4 = new JPanel ();
	     JPanel panel5 = new JPanel ();
	     panel1.setLayout(new BorderLayout());
	     addTab("panel1", panel1);
	     setEnabledAt(0,true);
	     setTitleAt(0,"测试页1");
	     addTab ("panel2", panel2);
	     setEnabledAt (1, true);
	     setTitleAt (1,"测试页2");
	     addTab ("panel3", panel3);
	     setEnabledAt (2, true);
	     setTitleAt (2,"测试页3");
	     addTab ("panel4", panel4);
	     setEnabledAt(0,true);
	     setTitleAt(3,"测试页4");
	     addTab ("panel5", panel5);
	     setEnabledAt(4,true);
	     setTitleAt(4,"测试页6");
	     setPreferredSize (new Dimension (500,200));
	     setTabPlacement (JTabbedPane.TOP);
	     setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
	     p.add("Center",this);
	     setVisible(true);
 } 
 public static void main(String[] args)
 {
	 new HelloWorld();
 }
}
