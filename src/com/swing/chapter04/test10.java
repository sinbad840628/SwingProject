package com.swing.chapter04;
//������������Ҫ��Ϊ����չʾ����ѡ��ť����Ĵ������Լ���ѡ��ť����ġ�setEnable()��������ʹ��
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class test10 extends JPanel
{
	public static final int WIDTH=300;
    static final int HEIGHT=200;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;
    JRadioButton r6;
    test10()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("���Դ���");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
        r1=new JRadioButton("��");
        r2=new JRadioButton("Ů");
        r3=new JRadioButton("����");
        r4=new JRadioButton("����");
        r5=new JRadioButton("����");
        r6=new JRadioButton("˶ʿ");
        JLabel label1=new JLabel("�Ա�");
        JLabel label2=new JLabel("ѧ��");
        
        frame.setContentPane(this);
        setLayout(new GridLayout(5,2));
        add(label1);
        add(new JLabel());
        add(r1);
        add(r2);
        add(label2);
        add(r3);
        add(r4);
        add(r5);
        add(r6);
        r1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r2.setEnabled(false);
        	}
        });
        r2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r1.setEnabled(false);
        	}
        });
        r3.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r5.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r4.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r3.setEnabled(false);
        		r5.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r5.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r3.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r6.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r5.setEnabled(false);
        		r3.setEnabled(false);
        	}
        });
    }
    public static void main(String[] args)
    {
    	new test10();
    }
}
