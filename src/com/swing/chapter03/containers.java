package com.swing.chapter03;

//��δ�����Ҫ��Ϊ���߽��������һ�����������ڻ�ȡһ����壬Ҳ����˵���ڶ��������ڲ���һ��Ĭ�ϵ��������
import javax.swing.*;;
public class containers
{
       static final int WIDTH=300;
       static final int HEIGHT=200;
       public static void main(String[] args)
       {
            JFrame jf=new JFrame("������������Գ���");///����һ���������������
            jf.setSize(WIDTH,HEIGHT); ///���ö������������Ĵ�С
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ///���ö������������Ĺرչ���
            jf.setVisible(true); ///���ö���������Ŀɼ���
            JPanel contentPane=new JPanel( ); ///����һ���м����������
            jf.setContentPane(contentPane);//���м������������contentPane����Ϊ�������
    }
}
