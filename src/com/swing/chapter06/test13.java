import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class test13 extends JSplitPane
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    static price p;
    test13()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("�ָ�����ۺϲ��Գ���");
    	   frame.setSize(WIDTH,HEIGHT);
    	   frame.setVisible(true);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setContentPane(this);
        
        JLabel label1=new JLabel("����");
        JLabel label2=new JLabel("�ڴ�");
        JLabel label3=new JLabel("Ӳ��");
        JLabel label4=new JLabel("��ʾ��");
        JLabel label5=new JLabel("CPU");
        JLabel label6=new JLabel("����");
        JLabel label7=new JLabel("���");
        JLabel label8=new JLabel("����");
        JTextField text1=new JTextField("�����ֳ�ĸ��");
        JTextField text2=new JTextField("�ڴ��Ǽӿ��ٶ�");
        JTextField text3=new JTextField("Ӳ�̴洢����");
        JTextField text4=new JTextField("��ʾ����ʾ����");
        JTextField text5=new JTextField("CPU�ǵ��Ժ���");
        JTextField text6=new JTextField("���������豸");
        JTextField text7=new JTextField("���Ҳ�������豸");
        JTextField text8=new JTextField("�����ⲿ�洢�豸");
        
        
        
        JPanel pane1=new JPanel();
        p=new price();
        
        setOneTouchExpandable (true);
        setContinuousLayout (true);
        setPreferredSize (new Dimension (100,200));
        setOrientation (JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent (pane1);
        setRightComponent (p);
        setDividerSize (3);
        setDividerLocation(50);

        pane1.setLayout(new GridLayout(8,2));
        pane1.add(label1);
        pane1.add(text1);
        pane1.add(label2);
        pane1.add(text2);
        pane1.add(label3);
        pane1.add(text3);
        pane1.add(label4);
        pane1.add(text4);
        pane1.add(label5);
        pane1.add(text5);
        pane1.add(label6);
        pane1.add(text6);
        pane1.add(label7);
        pane1.add(text7);
        pane1.add(label8);
        pane1.add(text8);
        
    }
    public static void main(String[] args)
    {
    	new test13();
    }
}
class price extends JPanel
{
	JTextField text1;
	JTextField text11;
	JTextField text12;
	JTextField text2;
	JTextField text21;
	JTextField text22;
	JTextField text3;
	JTextField text31;
	JTextField text32;
	JTextField text4;
	JTextField text41;
	JTextField text42;
	JTextField text5;
	JTextField text51;
	JTextField text52;
	JTextField text6;
	JTextField text61;
	JTextField text62;
	JTextField text7;
	JTextField text71;
	JTextField text72;
	JTextField text8;
	JTextField text81;
	JTextField text82;
	price()
	{
		JLabel name1=new JLabel("����:");
		JLabel name2=new JLabel("�ڴ�:");
		JLabel name3=new JLabel("Ӳ��:");
		JLabel name4=new JLabel("��ʾ��:");
		JLabel name5=new JLabel("CPU:");
		JLabel name6=new JLabel("����:");
		JLabel name7=new JLabel("���:");
		JLabel name8=new JLabel("����:");
		
		JLabel price1=new JLabel("����");
		JLabel number1=new JLabel("����");
		JLabel sum1=new JLabel("�ܼ�");
		JLabel price2=new JLabel("����");
		JLabel number2=new JLabel("����");
		JLabel sum2=new JLabel("�ܼ�");
		JLabel price3=new JLabel("����");
		JLabel number3=new JLabel("����");
		JLabel sum3=new JLabel("�ܼ�");
		JLabel price4=new JLabel("����");
		JLabel number4=new JLabel("����");
		JLabel sum4=new JLabel("�ܼ�");
		JLabel price5=new JLabel("����");
		JLabel number5=new JLabel("����");
		JLabel sum5=new JLabel("�ܼ�");
		JLabel price6=new JLabel("����");
		JLabel number6=new JLabel("����");
		JLabel sum6=new JLabel("�ܼ�");
		JLabel price7=new JLabel("����");
		JLabel number7=new JLabel("����");
		JLabel sum7=new JLabel("�ܼ�");
		JLabel price8=new JLabel("����");
		JLabel number8=new JLabel("����");
		JLabel sum8=new JLabel("�ܼ�");
		
		text1=new JTextField(5);
		text11=new JTextField(5);
		text12=new JTextField(5);
		text2=new JTextField(5);
		text21=new JTextField(5);
		text22=new JTextField(5);
		text3=new JTextField(5);
		text31=new JTextField(5);
		JTextField text32=new JTextField(5);
		JTextField text4=new JTextField(5);
		JTextField text41=new JTextField(5);
		text42=new JTextField(5);
		text5=new JTextField(5);
		text51=new JTextField(5);
		text52=new JTextField(5);
		text6=new JTextField(5);
		text61=new JTextField(5);
		text62=new JTextField(5);
		text7=new JTextField(5);
		text71=new JTextField(5);
		text72=new JTextField(5);
		text8=new JTextField(5);
		text81=new JTextField(5);
		text82=new JTextField(5);
		
		setLayout(new GridLayout(8,8));
		add(name1);
		add(price1);
		add(text1);
		add(number1);
		add(text11);
		add(sum1);
		add(text12);
		add(name2);
		add(price2);
		add(text2);
		add(number2);
		add(text21);
		add(sum2);
		add(text22);
		add(name3);
		add(price3);
		add(text3);
		add(number3);
		add(text31);
		add(sum3);
		add(text32);
		add(name4);
		add(price4);
		add(text4);
		add(number4);
		add(text41);
		add(sum4);
		add(text42);
		add(name5);
		add(price5);
		add(text5);
		add(number5);
		add(text51);
		add(sum5);
		add(text52);
		add(name6);
		add(price6);
		add(text6);
		add(number6);
		add(text61);
		add(sum6);
		add(text62);
		add(name7);
		add(price7);
		add(text7);
		add(number7);
		add(text71);
		add(sum7);
		add(text72);
		add(name8);
		add(price8);
		add(text8);
		add(number8);
		add(text81);
		add(sum8);
		add(text82);
		
	}
}
