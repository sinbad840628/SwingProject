package com.swing.chapter13;

//��γ��������Ҫ��Ϊ����չʾ��δ���һ�����в˵����Ͳ˵��Ĳ˵����
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1 extends JFrame 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
    static final int HEIGHT=300;
    public test1() 
    {
      super("�˵��Ĵ������Դ���");
      JRootPane rp=new JRootPane();
      super.setContentPane(rp);
      super.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();// ����һ���˵���
      rp.setJMenuBar(menubar1);//���˵������뵽�������
      JMenu menu1=new JMenu("�ļ�");//���������˵�
      JMenu menu2=new JMenu("�༭");
      JMenu menu3=new JMenu("��ͼ");
      JMenu menu4=new JMenu("����");
      JMenu menu5=new JMenu("����");
      JMenu menu6=new JMenu("����");
      menubar1.add(menu1); //�ڲ˵�������Ӳ˵�
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);
      this.setVisible(true);
      }
public static void main(String args[]) {
  new test1();
 }
}
