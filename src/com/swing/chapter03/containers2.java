package com.swing.chapter03;
//这段代码主要是读者能够清楚如何为组件添加工具提示功能
import javax.swing.*;;
public class containers2
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
        b1.setToolTipText("这个按钮是一个确定按钮");//设置按钮组件的工具提示功能
        b2.setToolTipText("这个按钮是一个取消按钮");
    }
}
