package com.swing.chapter14;

//��γ��������Ҫ��Ϊ����չʾ�������ķ������������ķ�����Ҫ��ͨ����JTable(Object[][] rowData,Object[ ][ ] columnNames)��������������������Ϊ����������������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test1{
	public test1(){
		 JFrame f=new JFrame();
		 Object[][] playerInfo={//��������е�����
				 {"����",new Integer(91),new Integer(100),new Integer(191),new Boolean(true)},
				 {"��ѩ��",new Integer(82),new Integer(69),new Integer(151),new Boolean(true)},
				 {"÷ͥ",new Integer(47),new Integer(57),new Integer(104),new Boolean(false)},
				 {"����",new Integer(61),new Integer(57),new Integer(118),new Boolean(false)},
				 {"���",new Integer(90),new Integer(87),new Integer(177),new Boolean(true)},
		 };
		 String[] Names={"����","����","��ѧ","�ܷ�","����"};//��������еĺ����
		 JTable table=new JTable(playerInfo,Names);//��Names��playerInfoΪ����������һ�����
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));//  ���ô˱��ӿڵ���ѡ��С
		 JScrollPane scrollPane=new JScrollPane(table);//�������뵽�����������
		 f.getContentPane().add(scrollPane,BorderLayout.CENTER);//�ٽ������������ӵ��м�������
		 f.setTitle("�����Դ���");
		 f.pack();
		 f.setVisible(true);
		 f.addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent e) {
				 System.exit(0);
			 }
		 });
	}
		 public static void main(String[] args){
			 test1 b=new test1();
		 }
	 }
