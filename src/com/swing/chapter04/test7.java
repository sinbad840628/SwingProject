package com.swing.chapter04;
import javax.swing.*;
public class test7
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
         JCheckBox jc1=new JCheckBox("��ë��");//����������ѡ��ť�����ҽ�֮��ӵ����������
         JCheckBox jc2=new JCheckBox("����");
         JCheckBox jc3=new JCheckBox("������");
         JCheckBox jc4=new JCheckBox("��ѧ��");
         JCheckBox jc5=new JCheckBox("��Ӱ");
         JCheckBox jc6=new JCheckBox("¼��");
         contentPane.add(jc1);
         contentPane.add(jc2);
         contentPane.add(jc3);
         contentPane.add(jc4);
         contentPane.add(jc5);
         contentPane.add(jc6);
    }  
}
