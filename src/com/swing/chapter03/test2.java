package com.swing.chapter03;

//��δ�����Ҫ���ö����������ڴ��в˵��Ķ��������������ͨ�����
import javax.swing.*;
public class test2
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("���Դ���");
        JPanel pane=new JPanel();
        JMenuBar menubar=new JMenuBar();
        frame.setContentPane(pane);
        frame.setJMenuBar(menubar);
        JLabel label1=new JLabel("��ǩ"); //�����ĸ���ǩ���
        JLabel label2=new JLabel("��ǩ");
        JLabel label3=new JLabel("��ǩ");
        JLabel label4=new JLabel("��ǩ");
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);
        pane.add(label4);        
        JMenu menu1=new JMenu("�˵�һ"); //�����˵�
        JMenu menu2=new JMenu("�˵���");
        JMenu menu3=new JMenu("�˵���");
        JMenu menu4=new JMenu("�˵���");
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        JMenuItem item1=new JMenuItem("�˵���һ");
        JMenuItem item2=new JMenuItem("�˵����");
        JMenuItem item3=new JMenuItem("�˵�����");
        JMenuItem item4=new JMenuItem("�˵�����");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
