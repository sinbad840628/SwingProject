package com.swing.test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConfirmDialog implements ActionListener {

	JFrame f = null;
	JLabel label = null;
	
	public ConfirmDialog(){
		f = new JFrame("OptionPane Demo");
		Container contentPane = f.getContentPane();
		
		JPanel panel = new JPanel();
		panel.setLayout( new GridLayout(2,2));
		
		JButton b = new JButton("Show DEFAULT_OPTION");
		b.addActionListener(this);
		panel.add(b);
		
		b = new JButton("SHOW YES_NO_OPTION");
		b.addActionListener(this);
		panel.add(b);
		
		b = new JButton("SHOW YES_NO_CANCEL_OPTION");
		b.addActionListener(this);
		panel.add(b);
		
		b = new JButton("SHOW OK_CANCEL_OPTION");
		b.addActionListener(this);
		panel.add(b);
		
		label = new JLabel(" ",JLabel.CENTER);
		
		contentPane.add(label,BorderLayout.NORTH);
		contentPane.add(panel,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new ConfirmDialog();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		String title = "Confirm Dialog";
		String message = "";
		int messageType = JOptionPane.INFORMATION_MESSAGE;
		int optionType = JOptionPane.YES_NO_OPTION;
		
		if( cmd.equals("Show DEFAULT_OPTION") ){
			optionType = JOptionPane.DEFAULT_OPTION;
			message = "Show DEFAULT_OPTION Buttons";
		}else if( cmd.equals("SHOW YES_NO_OPTION") ){
			optionType = JOptionPane.YES_NO_OPTION;
			message = "Show YES_NO_OPTION Buttons";
		}else if( cmd.equals("SHOW YES_NO_CANCEL_OPTION")){
			optionType = JOptionPane.YES_NO_CANCEL_OPTION;
			message = "Show YES_NO_CANCEL_OPTION Buttons";
		}else if(cmd.equals("SHOW OK_CANCEL_OPTION")){
			optionType = JOptionPane.OK_CANCEL_OPTION;
			message = "Show OK_CANCEL_OPTION Button";
		}
		
		int result = JOptionPane.showConfirmDialog(f, message,title,optionType,messageType);
		if (result == JOptionPane.YES_OPTION) {
			label.setText("你选择了 Yes or OK");
		}else if(result == JOptionPane.NO_OPTION){
			label.setText("你选择了 NO");
		}else if(result == JOptionPane.CANCEL_OPTION){
			label.setText("您选择了：Cancel");
		}else if (result == JOptionPane.CLOSED_OPTION) {
			label.setText("您没做任何选择，并关闭了对话框");
		}
	}
}
