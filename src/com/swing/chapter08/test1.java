package com.swing.chapter08;

//��γ��������Ҫ��Ϊ����չʾ���ʹ�����鴴���б��
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class test1
{
	public static void main(String[] args)
	{
		   JFrame f=new JFrame("���Դ���");
		   f.setSize(400,300);
	        f.setLocation(0,0);
	        f.setVisible(true);
	        JPanel p=new JPanel();
	        f.setContentPane(p);
	        p.setLayout(new BorderLayout());
//�����ݴ洢������name��
	        String[] name={"����","��已�","��ѩ��","������","������","������","����","����"};
	        JList l=new JList(name);//ͨ��JList(String text)�������������е�����ֱ���о����б����
	        JTextField tf=new JTextField();
	        p.add(l,"North");
	        p.add(tf,"South");
//�˷�������;���ǵ�ѡ���б���е�����һ��ʱ�����Ὣѡ������ʾ���ı�����
	        while(true)
	        {
	            tf.setText((String)l.getSelectedValue());
	        }   
	}
}
