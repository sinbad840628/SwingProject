package com.swing.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class DialogDemo implements ActionListener {

	JFrame f = null;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals("借用物品")){
			new LendingSystem(f);
		}else if(cmd.equals("离开系统")){
			System.exit(0);
		}		
	}//end of actionPerformed

	public DialogDemo(){
		f = new JFrame("JDialog Example");
		Container contentPane = f.getContentPane();
		JPanel buttonPanel = new JPanel();
		JButton b = new JButton("借用物品");
		b.addActionListener(this);
		
		buttonPanel.add(b);
		b = new JButton("离开系统");
		b.addActionListener(this);
		buttonPanel.add(b);
		
		buttonPanel.setBorder( BorderFactory.createTitledBorder( BorderFactory.createLineBorder(Color.blue,2),
				"借用物品系统",TitledBorder.CENTER,TitledBorder.TOP));
		contentPane.add(buttonPanel,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});		
	}
	
	public static void main(String[] args){
		new DialogDemo();
	}
	
	class LendingSystem implements ActionListener{

		JTextField staffField,objectField,borrowDateField,returnDateField,reasonField;
		JDialog dialog;
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			if (cmd.equals("确定")) {
				
			}
			else if(cmd.equals("取消")){
				dialog.dispose();
			}
		}
		
		LendingSystem(JFrame f){
			dialog = new JDialog(f,"借用物品",true);
			GridBagConstraints c;
			int gridX,gridY,gridWidth,gridHeight,anchor,fill,ipadX,ipadY;
			double weightX,weightY;
			Insets inset;
			
			GridBagLayout gridBag = new GridBagLayout();
			Container dialogPane = dialog.getContentPane();
			dialogPane.setLayout(gridBag);
			
			JLabel label = new JLabel("员工编号：");
			gridX = 0;
			gridY = 0;
			gridWidth = 1;
			gridHeight = 1;
			weightX = 0;
			weightY = 0;
			anchor = GridBagConstraints.CENTER;
			fill = GridBagConstraints.BOTH;
			inset = new Insets(0, 0, 0, 0);
			ipadX = 0;
			ipadY = 0;
			
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(label, c);
			dialogPane.add(label);
			
			label = new JLabel("借用日期：");
			gridX = 0;
			gridY = 1;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(label, c);
			dialogPane.add(label);
			
			label = new JLabel("归还日期：");
			gridX = 3;
			gridY = 1;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(label, c);
			dialogPane.add(label);
			
			label = new JLabel("借用原因：");
			gridX = 0;
			gridY = 2;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(label, c);
			dialogPane.add(label);
			
			staffField = new JTextField();
			gridX = 1;
			gridY = 0;
			gridWidth = 2;
			gridHeight = 1;
			weightX = 1;
			weightY = 0;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(staffField, c);
			dialogPane.add(staffField);
			
			objectField = new JTextField();
			gridX = 4;
			gridY = 0;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(objectField, c);
			dialogPane.add(objectField); 
			
			borrowDateField = new JTextField();
			gridX = 1;
			gridY = 1;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(borrowDateField, c);
			dialogPane.add(borrowDateField); 
			
			returnDateField = new JTextField();
			gridX = 4;
			gridY = 1;			
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(returnDateField, c);
			dialogPane.add(returnDateField); 
			
			reasonField = new JTextField();
			gridX = 1;
			gridY = 2;
			gridWidth = 5;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(reasonField, c);
			dialogPane.add(reasonField); 
			
			JPanel panel = new JPanel();
			panel.setLayout( new GridLayout(1,2));
			JButton b = new JButton("确定");
			panel.add(b);
			
			b = new JButton("取消");
			b.addActionListener(this);
			panel.add(b);
			
			gridX = 0;
			gridY = 3;
			gridWidth = 6;
			weightX = 1;
			weightY = 1;
			c = new GridBagConstraints(gridX,gridY,gridWidth,gridHeight,weightX,weightY,anchor,fill,inset,ipadX,ipadY);
			gridBag.setConstraints(panel, c);
			dialogPane.add(panel); 
			
			dialog.setBounds(200,150,400,130);
			dialog.show();
		}
	}
}
