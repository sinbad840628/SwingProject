package com.swing.chapter04;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class test8 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=200;
    test8()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("���ʹ�ð�ť�Ĳ��Գ���");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setContentPane(this);
    	JLabel name=new JLabel("����");
    	JRadioButton jr1=new JRadioButton("��");
        JRadioButton jr2=new JRadioButton("Ů");
        ButtonGroup  bg=new ButtonGroup();
        bg.add(jr1); //��������ѡ��ť���ֵ�ͬһ����ѡ��ť��bg��
        bg.add(jr2);
        JLabel interesting=new JLabel("��Ȥ����");
        JCheckBox jc1=new JCheckBox("��ë��");
        JCheckBox jc2=new JCheckBox("����");
        JCheckBox jc3=new JCheckBox("������");
        JCheckBox jc4=new JCheckBox("��ѧ��");
        JCheckBox jc5=new JCheckBox("��Ӱ");
        JCheckBox jc6=new JCheckBox("¼��");
        
        add(name);
        add(jr1);
        add(jr2);
        add(interesting);
        add(jc1);
        add(jc2);
        add(jc3);
        add(jc4);
        add(jc5);
        add(jc6);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
    	new test8();
    }
}
