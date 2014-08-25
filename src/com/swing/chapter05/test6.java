package com.swing.chapter05;
//这段代码主要是用GirdLayout布局管理器与顶层窗口关联，在这个布局管理器中添加FlowLayout布局管理器和BorderLayout布局管理器，最后，在这些布局管理器中添加控件
import javax.swing.*;
import java.awt.*;
public class test6
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {

    	 JFrame jf=new JFrame("测试程序");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         jf.setContentPane(contentPane);
         JButton b1=new JButton("港币");//创建了二十五个普通按钮组件
         JButton b2=new JButton("人民币");
         JButton b3=new JButton("美元");
         JButton b4=new JButton("欧元");
         JButton b5=new JButton("英镑");
         JButton b6=new JButton("主板");
         JButton b7=new JButton("内存");
         JButton b8=new JButton("硬盘");
         JButton b9=new JButton("显示器");
         JButton b10=new JButton("鼠标");
         JButton b11=new JButton("大米");
         JButton b12=new JButton("蔬菜");
         JButton b13=new JButton("稻子");
         JButton b14=new JButton("猪肉");
         JButton b15=new JButton("牛肉");
         JButton b16=new JButton("面包");
         JButton b17=new JButton("蛋糕");
         JButton b18=new JButton("巧克力");
         JButton b19=new JButton("奶酪");
         JButton b20=new JButton("苹果派");
         JButton b21=new JButton("笔记本");
         JButton b22=new JButton("电话");
         JButton b23=new JButton("办公桌");
         JButton b24=new JButton("钢笔");
         JButton b25=new JButton("文件夹");
         GridLayout gird=new GridLayout(3,3);
         jf.setLayout(gird);
         JPanel p1=new JPanel();//创建五个中间容器，并且将第一个和第二个，第四个、第五个中间容器的布局方式设置为BorderLayout，而第三个设置为FlowLayout
         JPanel p2=new JPanel();
         JPanel p3=new JPanel();
         JPanel p4=new JPanel();
         JPanel p5=new JPanel();
         p1.setLayout(new BorderLayout());
         p2.setLayout(new BorderLayout());
         p3.setLayout(new FlowLayout());
         p4.setLayout(new BorderLayout());
         p5.setLayout(new BorderLayout());
         contentPane.add(p1); //将五个中间容器添加到外层中间容器中
         contentPane.add(p2);
         contentPane.add(p3);
         contentPane.add(p4);
         contentPane.add(p5);
         p1.add(b1,"North");//将第一个组件到第五个组件添加到p1
         p1.add(b2,"West");
         p1.add(b3,"South");
         p1.add(b4,"East");
         p1.add(b5,"Center");
         p2.add(b6,"North");//将第六个组件到第十个组件添加到p2
         p2.add(b7,"West");
         p2.add(b8,"South");
         p2.add(b9,"East");
         p2.add(b10,"Center");
         p3.add(b11); //将第十一个组件到第十五个组件添加到p3
         p3.add(b12);
         p3.add(b13);
         p3.add(b14);
         p3.add(b15);
         p4.add(b16,"North");//将第十六个组件到第二十个组件添加到p4
         p4.add(b17,"West");
         p4.add(b18,"South");
         p4.add(b19,"East");
         p4.add(b20,"Center");
         p5.add(b21,"North");//创建第二十一个组件到第二十五个组件添加到 p5
         p5.add(b22,"West");
         p5.add(b23,"South");
         p5.add(b24,"East");
         p5.add(b25,"Center");
         jf.pack();
      }  
}
