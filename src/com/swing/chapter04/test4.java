package com.swing.chapter04;
//��δ�����Ҫ��Ϊ����չʾ��δ�����ѡ��ť���
import javax.swing.*; 
public class test4
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
          JRadioButton jr1=new JRadioButton("����");//����������ѡ��ť�����ҽ�������ӵ����������
          JRadioButton jr2=new JRadioButton("����");
          JRadioButton jr3=new JRadioButton("����");
          contentPane.add(jr1);
          contentPane.add(jr2);
          contentPane.add(jr3);
    }
}
