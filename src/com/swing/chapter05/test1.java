package com.swing.chapter05;
//Download by http://www.codefans.net
//��δ�����Ҫ��Ϊ����չʾ���ʹ��BorderLayout���ֹ�������������в���
import javax.swing.*;
import java.awt.*;
public class test1
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {

    	 JFrame jf=new JFrame("���Գ���");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         jf.setContentPane(contentPane);
         JButton b1=new JButton("����");
         JButton b2=new JButton("����");
         JButton b3=new JButton("˯��");
         JButton b4=new JButton("����");
         JButton b5=new JButton("��ʳ");
         BorderLayout lay=new BorderLayout();//����һ�����ֹ��������󣬽��м���������Ϊ�˲��ֹ���
         jf.setLayout(lay);
         contentPane.add(b1,"North");//�������ͨ��ť����ֱ��ն����ϡ����������������λ��ӵ��м�������
         contentPane.add(b2,"South");
         contentPane.add(b3,"East");
         contentPane.add(b4,"West");
         contentPane.add(b5,"Center");
    }  
}
