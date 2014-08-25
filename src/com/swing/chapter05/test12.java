package com.swing.chapter05;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
public class test12 extends JPanel
{
	    static final int WIDTH=300;
	    static final int HEIGHT=150;
	    JFrame computer;
	    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
	    {
	        constraints.gridx=x;
	        constraints.gridy=y;
	        constraints.gridwidth=w;
	        constraints.gridheight=h;
	        add(c,constraints);
	    } 
	    test12()
	    {
	    	 computer=new JFrame("简单计算器模拟界面");
	    	 computer.setContentPane(this);
	    	 computer.setSize(WIDTH,HEIGHT);
	    	 computer.setVisible(true);
	      GridBagLayout lay=new GridBagLayout();//创建网格组布局方式对象 
	      setLayout(lay);   
	    	 GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.anchor=GridBagConstraints.EAST;
	      constraints.weightx=6;
	      constraints.weighty=6;
	        
	      JTextField text=new JTextField(20);
	    	 JButton button1=new JButton("ON");
	      JButton button2=new JButton("AC");
	      JButton button3=new JButton("+/-");
	      JButton button4=new JButton("C");
	      JButton button5=new JButton("1");
	      JButton button6=new JButton("2");
	      JButton button7=new JButton("3");
	      JButton button8=new JButton("4");
	      JButton button9=new JButton("5");
	    	 JButton button10=new JButton("6");
	      JButton button11=new JButton("7");
	      JButton button12=new JButton("8");
	      JButton button13=new JButton("9");
	      JButton button14=new JButton("0");
	      JButton button15=new JButton("%");
	      JButton button16=new JButton("*");
	      JButton button17=new JButton("+");
	    	 JButton button18=new JButton("_");	       
	      JButton button19=new JButton("=");
	      JButton button20=new JButton(".");
	        
	      add(text,constraints,0,0,5,1);
	      add(button5,constraints,0,1,1,1);
	      add(button6,constraints,1,1,1,1);
	      add(button7,constraints,2,1,1,1);
	      add(button8,constraints,0,2,1,1);
	      add(button9,constraints,1,2,1,1);
	      add(button10,constraints,2,2,1,1);
	      add(button11,constraints,0,3,1,1);
	      add(button12,constraints,1,3,1,1);
	      add(button13,constraints,2,3,1,1);
	      add(button14,constraints,0,4,1,1);
	      add(button17,constraints,1,4,1,1);
	      add(button18,constraints,2,4,1,1);
	      add(button16,constraints,4,4,1,1);
	      add(button15,constraints,4,1,1,1);
	        add(button19,constraints,4,2,1,1);
	        add(button20,constraints,4,3,1,1);
	        add(button1,constraints,5,1,1,1);
	        add(button2,constraints,5,2,1,1);
	        add(button3,constraints,5,3,1,1);
	        add(button4,constraints,5,4,1,1);
	    }
        public static void main(String[] args)
        {
        	new test12();
        }
}
