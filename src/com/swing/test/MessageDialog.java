package com.swing.test;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.swing.chapter20.mainframe;

public class MessageDialog implements ActionListener {

	JFrame f = null;
	
	public MessageDialog() {
		// TODO Auto-generated constructor stub
		// TODO Auto-generated method stub
		f = new JFrame("OptionPane Demo");
		Container contentPane = f.getContentPane();
		contentPane.setLayout( new GridLayout(2,3));
		
		JButton b = new JButton("Show Error Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		b = new JButton("Show Information Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		b = new JButton("Show Warning Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		b = new JButton("Show Question Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		b = new JButton("Show Plain Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		b = new JButton("Show User Define Icon");
		b.addActionListener(this);
		contentPane.add(b);
		
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new MessageDialog();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		String title = "Message Dialog";
		String message = "";
		int type = JOptionPane.PLAIN_MESSAGE;
		
		if (cmd.equals("Show Error Icon")) {
			type = JOptionPane.ERROR_MESSAGE;
			message = "Error Message";
		}else if(cmd.equals("Show Information Icon")){
			type = JOptionPane.INFORMATION_MESSAGE;
			message = "Information Message";
		}else if(cmd.equals("Show Warning Icon")){
			type = JOptionPane.WARNING_MESSAGE;
			message = "Warning Message";
		}else if(cmd.equals("Show Question Icon")){
			type = JOptionPane.QUESTION_MESSAGE;
			message = "Question Message";
		}else if(cmd.equals("Show Plain Icon")){
			type = JOptionPane.PLAIN_MESSAGE;
			message = "Plain Message";
		}else if(cmd.equals("Show User Define Icon")){
			type= JOptionPane.PLAIN_MESSAGE;
			message = "User Define Message";
			JOptionPane.showMessageDialog(f, message,title,type,new ImageIcon("glass.jpg"));
			return ;
		}
		JOptionPane.showMessageDialog(f, message,title,type);
	}
	
	

}
