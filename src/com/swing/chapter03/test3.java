package com.swing.chapter03;

//��δ�����Ҫ�ǿ�������Ƿ���Ϥ����ڶ��������ڵ��������
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class test3
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    static JTextField text1;
    static JTextField text2;
    static JTextField text3;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("���Դ���");
        JPanel pane=new JPanel();
        frame.setContentPane(pane);
        text1=new JTextField(10);
        text2=new JTextField(10);
        text3=new JTextField(10);
        JLabel label1=new JLabel("* ");
        JButton button=new JButton("=");
        pane.add(text1);
        pane.add(label1);
        pane.add(text2);
        pane.add(button);
        pane.add(text3);
        button.addActionListener(new ActionListener()//������һ����ť�Ķ����¼����ڱ���ĺ���������ϸ�Ľ���
        {
        	public void actionPerformed(ActionEvent Event) 
            {
                String str1=text1.getText();//���ı�������ȡ�ı�
                Double d1=Double.parseDouble(str1);//���ı�ת����˫����������
                String str2=text2.getText();//���ı�������ȡ�ı�
                Double d2=Double.parseDouble(str2); //���ı�ת����˫����������
                Double d3=d1*d2;
                String str3=""+d3;//��˫��������ת�����ַ�������
                text3.setText(str3); //����������������ı���      
            }
        });
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
