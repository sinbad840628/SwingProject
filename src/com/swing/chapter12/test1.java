package com.swing.chapter12;

//这段程序代码主要是向读者展示四种不同的对话框的创建方法
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class test1 extends JPanel
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
    test1()
    {
    	JFrame f=new JFrame("对话框测试窗口");
    	Toolkit kit=Toolkit.getDefaultToolkit();
    	Dimension screenSize=kit.getScreenSize();
    	int width=screenSize.width;
    	int height=screenSize.height;
    	int x=(width-WIDTH)/2;
    	int y=(height-HEIGHT)/2;
    	f.setLocation(x,y);
    	f.setSize(WIDTH,HEIGHT);
    	f.setContentPane(this);
    	f.setVisible(true);
    	setLayout(new FlowLayout());

    	JButton b1=new JButton("showMessageDialog");//创建四个按钮组件，这四个按钮组件引发的动作事件是显示出四个不同类型的对话框
    	JButton b2=new JButton("showConfirmDialog");
    	JButton b3=new JButton("showOptionDialog");
    	JButton b4=new JButton("showInputDialog");
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {

                JOptionPane.showMessageDialog(null,"这是一个消息对话框");//这是一个showMessageDialog静态方法显示的对话框
            }
        });
       b2.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

             JOptionPane.showConfirmDialog(null,"这是一个有关confirm的消息","这是一个有关confirm的对话框", JOptionPane.YES_NO_CANCEL_OPTION);  //这是一个showConfirmDialog静态方法显示的对话框
           }	
       });
       b3.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

               Object[] options={"OK","CANCEL"};
               JOptionPane.showOptionDialog(null,"点击ok按钮继续","警告",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
               
           }//这是一个showOptionDialog静态方法显示的对话框
       });
       b4.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

               Object[] options={"第一","第二","第三"};
               JOptionPane.showInputDialog(null,"请选择一个","输入",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("blue.gif"),options,options[0]);
           }//这是一个showInputDialog静态方法显示的对话框
       });
    }
    public static void main(String[] args)
    {
    	new test1();
    }
}
