package com.swing.test;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBox2 {

	String[] s = {"美国","英国","法国","中国","德国","日本"};
	
	public JComboBox2(){
		JFrame f = new JFrame("JComboBox");
		Container contentPane = f.getContentPane();
		
		ComboBoxModel model = new UserDefineComboBoxModel();
		
		JComboBox combo = new JComboBox(model);
		combo.setBorder( BorderFactory.createTitledBorder("你最喜欢哪个国家？"));
		contentPane.add(combo);
		
		f.pack();
		f.show();
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	class UserDefineComboBoxModel extends AbstractListModel implements ComboBoxModel{
		String item = null;

		@Override
		public int getSize() {
			// TODO Auto-generated method stub
			return s.length;
		}

		@Override
		public Object getElementAt(int index) {
			// TODO Auto-generated method stub
			return s[index++];
		}

		@Override
		public void setSelectedItem(Object anItem) {
			// TODO Auto-generated method stub
			item = (String)anItem;
		}

		@Override
		public Object getSelectedItem() {
			// TODO Auto-generated method stub
			return item;
		}				
	}
	
	public static void main(String[] args){
		new JComboBox2();
	}
}
