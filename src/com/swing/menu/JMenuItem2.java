package com.swing.menu;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JMenuItem2 extends JFrame{

	JTextArea theArea = null;
	
	public JMenuItem2(){
		super("JMenuItem2");
		theArea = new JTextArea();
		theArea.setEditable(false);
		
		getContentPane().add(new JScrollPane(theArea));
		
		JMenuBar mBar = new JMenuBar();
		mBar.setOpaque(true);
		
		JMenu mfile = buildFileMenu();
		mBar.add(mfile);
		setJMenuBar(mBar);
	}
	
	public JMenu buildFileMenu(){
		JMenu thefile = new JMenu("File");
		JMenuItem newF = new JMenuItem("New", new ImageIcon("icons/news24.gif"));
		JMenuItem open = new JMenuItem("Open", new ImageIcon("icons/open24.gif"));
		JMenuItem close = new JMenuItem("Close", new ImageIcon("icons/close24.gif"));
		JMenuItem exit = new JMenuItem("Exit", new ImageIcon("icons/exit24.gif"));
		
		newF.setMnemonic('N');
		open.setMnemonic('O');
		close.setMnemonic('C');
		exit.setMnemonic('X');
		
		thefile.add(newF);
		thefile.add(open);
		thefile.add(close);
		thefile.addSeparator();
		thefile.add(exit);
		return thefile;
	}
	
	public static void main(String[] args) {
		JFrame f = new JMenuItem2();
		f.setSize(400,200);
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
