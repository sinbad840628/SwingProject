package com.swing.chapter03;
//��δ�����Ҫ��Ϊ���߽���������Ѿ������õ���������������ͨ���
import javax.swing.*;;
public class containers1
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
JButton b1=new JButton("ȷ��");//����������ť���
        JButton b2=new JButton("ȡ��");
        contentPane.add(b1);//�������������Ӱ�ť�������
        contentPane.add(b2); //�������������Ӱ�ť�������
     }
}
