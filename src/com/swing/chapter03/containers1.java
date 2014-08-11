package com.swing.chapter03;
//这段代码主要是为读者介绍如何在已经创建好的内容面板中添加普通组件
import javax.swing.*;;
public class containers1
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
JButton b1=new JButton("确定");//创建两个按钮组件
        JButton b2=new JButton("取消");
        contentPane.add(b1);//在内容面板中添加按钮基本组件
        contentPane.add(b2); //在内容面板中添加按钮基本组件
     }
}
