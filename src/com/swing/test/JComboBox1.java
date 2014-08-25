package com.swing.test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox1 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("JComboBox");
		
		Container contentPane = f.getContentPane();
		contentPane.setLayout( new GridLayout(1,2));
		String[] s = {"����","Ӣ��","����","�й�","�¹�","�ձ�"};
		Vector v = new Vector();
		v.addElement("Nokia 8850");
		v.addElement("Nokia 8250");
		v.addElement("Nokia 8088");
		v.addElement("Nokia GD92");
		v.addElement("Other");
		
		JComboBox combo1 = new JComboBox(s);
		combo1.addItem("����");
		combo1.setBorder( BorderFactory.createTitledBorder("����ϲ��ȥ�ĸ��������أ�") );
		
		JComboBox combo2 = new JComboBox(v);
		combo2.setBorder( BorderFactory.createTitledBorder("����ϲ����һ���ֻ��أ�"));
		
		contentPane.add(combo1);
		contentPane.add(combo2);
		
		f.pack();
		f.show();
		f.setVisible(true);
		
		combo1.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ı���ѡ��" + e.toString());
			}
			
		});
		
		combo2.addItemListener( new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ı���Choice��");
			}
		});
		
		f.addWindowListener( new WindowAdapter() {
			
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}	
		} );
	}
}
