import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test9 extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    JTextField text5;
    JTextField text6;
    JTextField text7;
    JTextField text8;
    JTextField text9;
    JTextField text10;
    JTextField text11;
    test9()
    {
        JFrame frame=new JFrame();
        frame.setTitle("���ִη����Գ���");
        frame.setVisible(true);
        frame.setSize(WIDTH,HEIGHT);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setContentPane(this);
        
        JLabel label1=new JLabel("ԭʼ����");
        JLabel label2=new JLabel("һ�η����");
        JLabel label3=new JLabel("���η����");
        JLabel label4=new JLabel("���η����");
        JLabel label5=new JLabel("�Ĵη����");
        JLabel label6=new JLabel("��η����");
        JLabel label7=new JLabel("���η����");
        JLabel label8=new JLabel("�ߴη����");
        JLabel label9=new JLabel("�˴η����");
        JLabel label10=new JLabel("�Ŵη����");
        JLabel label11=new JLabel("ʮ�δη����");
        
        text1=new JTextField(10);
        text2=new JTextField(10);
        text3=new JTextField(10);
        text4=new JTextField(10);
        text5=new JTextField(10);
        text6=new JTextField(10);
        text7=new JTextField(10);
        text8=new JTextField(10);
        text9=new JTextField(10);
        text10=new JTextField(10);
        text11=new JTextField(10);
        
        JButton compute=new JButton("������");
        
        setLayout(new GridLayout(12,2));
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(label3);
        add(text3);
        add(label4);
        add(text4);
        add(label5);
        add(text5);
        add(label6);
        add(text6);
        add(label7);
        add(text7);
        add(label8);
        add(text8);
        add(label9);
        add(text9);
        add(label10);
        add(text10);
        add(label11);
        add(text11);
        add(compute);
        compute.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
            {
        		Double d=Double.parseDouble(text1.getText());
        		text2.setText(""+Math.pow(d,1));//Math.pow()��һ�����ֵļ��η��ķ���
        		text3.setText(""+Math.pow(d,2));
        		text4.setText(""+Math.pow(d,3));
        		text5.setText(""+Math.pow(d,4));
        		text6.setText(""+Math.pow(d,5));
        		text7.setText(""+Math.pow(d,6));
        		text8.setText(""+Math.pow(d,7));
        		text9.setText(""+Math.pow(d,8));
        		text10.setText(""+Math.pow(d,9));
        		text11.setText(""+Math.pow(d,10));
            }
        });
       
    }
    public static void main(String[] args)
    {
    	new test9();
    }
}
