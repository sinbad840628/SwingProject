package com.swing.chapter06;

// ��γ��������Ҫ��Ϊ����չʾ���ʹ��JPanel�м�����
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
    public static void main(String[] args)
    {
    	  
        jf.setLayout(new BorderLayout());JFrame jf=new JFrame("���Գ���");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel contentPane=new JPanel();//���������м����������ҽ�contentPane�ŵ�����������
        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        jf.setContentPane(contentPane);
        JButton b1=new JButton("С��");//�����Ÿ���ͨ��ť�������p1��p5����������Ϊ�����֡�
        JButton b2=new JButton("С��");
        JButton b3=new JButton("С��");
        JButton b4=new JButton("С��");
        JButton b5=new JButton("СǮ");
        JButton b6=new JButton("С��");
        JButton b7=new JButton("С��");
        JButton b8=new JButton("С��");
        JButton b9=new JButton("��");
        FlowLayout fl=new FlowLayout();
        FlowLayout fl1=new FlowLayout();
        FlowLayout fl2=new FlowLayout();
        FlowLayout fl3=new FlowLayout();
        FlowLayout fl4=new FlowLayout();
        P1.setLayout(fl);
        P2.setLayout(fl1);
        P3.setLayout(fl2);
        P4.setLayout(fl3);
        P5.setLayout(fl4);

        p1.add(b1); //��b1��b2�ӵ�p1�У���b3��b4�ӵ�p2�У���b5��b6�ӵ�p3�У���b7��b8�ӵ�p4�У���b9�ӵ�p5��
        p1.add(b2);
        p2.add(b3);
        p2.add(b4);
        p3.add(b5);
        p3.add(b6);
        p4.add(b7);
        p4.add(b8);
        p5.add(b9);
        contentPane.add(p1,"North");//��p1��p5�����尴��BorderLayout���ַ�ʽ���õ�contentPane�����
        contentPane.add(p2,"South");
        contentPane.add(p3,"East");
        contentPane.add(p4,"West");
        contentPane.add(p5,"Center");
}
 }
