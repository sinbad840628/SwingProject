package com.swing.chapter03;
//��δ�����Ҫ��Ϊ���߽���������ð�ť����ı߿�
import javax.swing.*;
import java.awt.Color;
public class containers3
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("������������Գ���");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel contentPane=new JPanel( );
        jf.setContentPane(contentPane);
        JButton b1=new JButton("ȷ��");
        JButton b2=new JButton("ȡ��");
        contentPane.add(b1);
        contentPane.add(b2);
        b1.setBorder(BorderFactory.createLineBorder(Color.red));//�������ð�ť����ı߿�
    }
}
