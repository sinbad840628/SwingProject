package com.swing.chapter04;
//��δ�����Ҫ��Ϊ����չʾ��δ�����ѡ��ť��������ҽ���Щ��ѡ��ť�����ӵ�һ����ť����
import javax.swing.*;
public class test5
{
static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
          JFrame jf=new JFrame("���Գ���");
          jf.setSize(WIDTH,HEIGHT);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jf.setVisible(true);
          JPanel contentPane=new JPanel( );
          jf.setContentPane(contentPane);
          JRadioButton jr1=new JRadioButton("����");//����������ѡ��ť
          JRadioButton jr2=new JRadioButton("����");
          JRadioButton jr3=new JRadioButton("����");
          ButtonGroup  bg=new ButtonGroup();//��������ѡ��ť���ֵ�һ����ť����
          bg.add(jr1);
          bg.add(jr2);
          bg.add(jr3);
          contentPane.add(jr1); //��������ѡ��ť��ӵ����������
          contentPane.add(jr2);
          contentPane.add(jr3);
    }  
}
