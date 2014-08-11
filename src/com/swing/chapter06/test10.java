package com.swing.chapter06;

//这段程序代码主要是将两个普通按钮组件，放置到JLayeredPane容器中，再为这两个按钮组件分成两个不同的层次，这样的话，就当单击下面一个层的按钮组件，它就会被显示到上面一个层上来
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test10 extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JLayeredPane lp=new JLayeredPane();
    static JButton b1=new JButton("确定");
    static JButton b2=new JButton("取消");
    public test10() 
{
///设置顶层容器的标题
      super("测试窗口");
      ///将新建的JLayeredPane放到顶层容器内
      super.setContentPane(lp);
      b1.addActionListener(this); // 按钮事件
      b2.addActionListener(this);
  　　lp.add(b1, new Integer(200)); // 将组件添加到JLayeredPane中，指定所在的层
  　　lp.add(b2, new Integer(300));
  　　b1.setBounds(new Rectangle(100, 100, 100, 100)); // Button出现位置
  　　b1.setVisible(true); // 显示
  　　b2.setBounds(new Rectangle(50, 50, 100, 100));
  　　b2.setVisible(true);
  　　this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  　　this.setSize(360, 260);
  　　this.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) 
 {
  if (e.getActionCommand().equals("确定")) 
  { // 判断是哪个按钮的动作
   lp.setLayer(b1, 300); // 重新设置组件层数
   lp.setLayer(b2, 200);
  } 
  else if (e.getActionCommand().equals("取消"))
  {
   lp.setLayer(b1, 200);
   lp.setLayer(b2, 300);
  }
 }
 public static void main(String args[]) {
  new test10();
 }
}
