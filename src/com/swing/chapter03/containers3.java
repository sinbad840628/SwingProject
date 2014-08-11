package com.swing.chapter03;
//这段代码主要是为读者介绍如何设置按钮组件的边框
import javax.swing.*;
import java.awt.Color;
public class containers3
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("添加内容面板测试程序");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel contentPane=new JPanel( );
        jf.setContentPane(contentPane);
        JButton b1=new JButton("确定");
        JButton b2=new JButton("取消");
        contentPane.add(b1);
        contentPane.add(b2);
        b1.setBorder(BorderFactory.createLineBorder(Color.red));//用来设置按钮组件的边框
    }
}
