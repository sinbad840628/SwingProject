package com.swing.chapter14;

//��γ��������Ҫ��Ϊ����չʾ�������ķ������������ķ�����Ҫ��ͨ����JTable(int numRows,int numColumns)�����������numRowsָ������numColumnָ������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test2{
	public test2(){
		 JFrame f=new JFrame();
		 JTable table=new JTable(10,10);//����һ��ʮ�к�ʮ�еĿձ��
		 table.setPreferredScrollableViewportSize(new Dimension(550,30));
		 JScrollPane scrollPane=new JScrollPane(table);
		 f.getContentPane().add(scrollPane,BorderLayout.CENTER);
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
			 test2 b=new test2();
		 }
	 }
