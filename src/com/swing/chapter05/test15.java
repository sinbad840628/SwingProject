package com.swing.chapter05;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Download by http://www.codefans.net
import javax.swing.*;
public class test15 
{
	   static final int WIDTH=300;
    static final int HEIGHT=150;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JPanel pane;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JPanel p5;
    JPanel p6;
    JPanel p7;
    JPanel p8;
    JPanel p9;
    CardLayout card;
    test15()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("Êý×Ö·­¹ö´°¿Ú");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	pane=new JPanel();
    	p1=new JPanel();
    	p2=new JPanel();
    	p3=new JPanel();
    	p4=new JPanel();
    	p5=new JPanel();
    	p6=new JPanel();
    	p7=new JPanel();
    	p8=new JPanel();
    	p9=new JPanel();
    	
    	frame.setContentPane(pane);
    	b1=new JButton("1");
    	b2=new JButton("2");
    	b3=new JButton("3");
    	b4=new JButton("4");
    	b5=new JButton("5");
    	b6=new JButton("6");
    	b7=new JButton("7");
    	b8=new JButton("8");
    	b9=new JButton("9");
    	
    	card=new CardLayout();
    	pane.setLayout(card);
    	p1.add(b1);
    	p2.add(b2);
    	p3.add(b3);
    	p4.add(b4);
    	p5.add(b5);
    	p6.add(b6);
    	p7.add(b7);
    	p8.add(b8);
    	p9.add(b9);
    	
    	pane.add(p1,"p1");
    	pane.add(p2,"p2");
    	pane.add(p3,"p3");
    	pane.add(p4,"p4");
    	pane.add(p5,"p5");
    	pane.add(p6,"p6");
    	pane.add(p7,"p7");
    	pane.add(p8,"p8");
    	pane.add(p9,"p9");
	    
    	b1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p2");
        	}
        });
    	b2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p3");
        	}
        });
    	b3.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p4");
        	}
        });
    	b4.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p5");
        	}
        });
    	b5.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p6");
        	}
        });
    	b6.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p7");
        	}
        });
    	b7.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p8");
        	}
        });
    	b8.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p9");
        	}
        });
    	b9.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		card.show(pane, "p1");
        	}
        });
    }
    
    public static void main(String[] args)
    {
    	new test15();
    }
}
