package com.swing.chapter03;

//��δ�����Ҫ��Ϊ���߽�����ν������õĲ˵������ڶ���������
import javax.swing.*;
public class menutest
{
static final int WIDTH=300;
    static final int HEIGHT=200;
public static void main(String[] args)
   {
       JFrame jf=new JFrame();
       jf.setSize(WIDTH,HEIGHT);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setTitle("ѧ������ϵͳ");
       JMenuBar menubar1=new JMenuBar();//��Ӳ˵������
       jf.setJMenuBar(menubar1);//���˵�����ӵ�����������
       JMenu menu1=new JMenu("�ļ�");  //���ò˵����
       JMenu menu2=new JMenu("�༭");
       JMenu menu3=new JMenu("��ͼ");
       menubar1.add(menu1);//���˵������ӵ��˵��������
       menubar1.add(menu2);
       menubar1.add(menu3);
       JMenuItem item1=new JMenuItem("��");//�����˵������
       JMenuItem item2=new JMenuItem("����");
       JMenuItem item3=new JMenuItem("��ӡ");
       JMenuItem item4=new JMenuItem("�˳�");
       menu1.add(item1); //���˵��������ӵ���Ӧ�Ĳ˵������ȥ
       menu1.add(item2);
       menu1.addSeparator();//�˵���֮��ķָ������
       menu1.add(item3);
       menu1.addSeparator();
       menu1.add(item4);
       jf.setVisible(true);
    }
}
