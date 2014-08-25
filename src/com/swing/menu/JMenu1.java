package com.swing.menu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenu1 extends JFrame{
	JTextArea theArea = null;
	public JMenu1(){
		super("JMenu1");
		theArea = new JTextArea();
		theArea.setEditable(false);
		
		getContentPane().add(new JScrollPane(theArea));
		JMenuBar MBar = new JMenuBar();
		
		JMenu mfile = buildFileMenu();
		
		MBar.add(mfile);
		setJMenuBar(MBar);
		
	}
	
	public JMenu buildFileMenu(){
		JMenu thefile = new JMenu("File");
		thefile.setIcon( new ImageIcon("icons/file.gif"));
		return thefile;
	}
	
	public static void main(String[] args){
		JFrame F = new JMenu1();
		F.setSize(400,200);
		F.addWindowListener( new WindowAdapter() {
			public void WindowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		F.setVisible(true);
	}
}
