package com.swing.chapter12;

import javax.swing.JApplet;



public class test2 extends JApplet
{
public void init()//��init���������һ�λ��������ڳ�ʼ��ҳ��ʱ�������
{
System.out.println("��ӭ��ҽ���JApplet����ѧϰҳ��!");
}
public void start()//��start���������һ�λ�������������ʱ�������
{
System.out.println("���ڳ����������С�");
}
public void stop()
{
System.out.println("����ֹͣ�����ˡ�");//��stop���������һ�λ�����������ͣʱ�������
}
}
