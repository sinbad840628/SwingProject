package com.swing.chapter03;
//��δ�����Ҫ�Ƕ����ܹ�������Ϊ�����ӹ�����ʾ����
import javax.swing.*;;
public class containers2
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
        b1.setToolTipText("�����ť��һ��ȷ����ť");//���ð�ť����Ĺ�����ʾ����
        b2.setToolTipText("�����ť��һ��ȡ����ť");
    }
}
