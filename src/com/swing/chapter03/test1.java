package com.swing.chapter03;

//��δ�����Ҫ��Ϊ���߽�������ν���ͨ�����ӵ����������
import javax.swing.*;
public class test1
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("���Դ���");
        JPanel pane=new JPanel();
        frame.setContentPane(pane);
        JButton button1=new JButton("��ťһ");
        JButton button2=new JButton("��ť��");
        JButton button3=new JButton("��ť��");
        JButton button4=new JButton("��ť��");
        JLabel label=new JLabel("��ǩ");
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(label);
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
