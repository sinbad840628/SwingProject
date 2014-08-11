package com.swing.chapter12;

//��γ��������Ҫ�������չʾ���ֲ�ͬ�ĶԻ���Ĵ�������
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class test1 extends JPanel
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
    test1()
    {
    	JFrame f=new JFrame("�Ի�����Դ���");
    	Toolkit kit=Toolkit.getDefaultToolkit();
    	Dimension screenSize=kit.getScreenSize();
    	int width=screenSize.width;
    	int height=screenSize.height;
    	int x=(width-WIDTH)/2;
    	int y=(height-HEIGHT)/2;
    	f.setLocation(x,y);
    	f.setSize(WIDTH,HEIGHT);
    	f.setContentPane(this);
    	f.setVisible(true);
    	setLayout(new FlowLayout());

    	JButton b1=new JButton("showMessageDialog");//�����ĸ���ť��������ĸ���ť��������Ķ����¼�����ʾ���ĸ���ͬ���͵ĶԻ���
    	JButton b2=new JButton("showConfirmDialog");
    	JButton b3=new JButton("showOptionDialog");
    	JButton b4=new JButton("showInputDialog");
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {

                JOptionPane.showMessageDialog(null,"����һ����Ϣ�Ի���");//����һ��showMessageDialog��̬������ʾ�ĶԻ���
            }
        });
       b2.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

             JOptionPane.showConfirmDialog(null,"����һ���й�confirm����Ϣ","����һ���й�confirm�ĶԻ���", JOptionPane.YES_NO_CANCEL_OPTION);  //����һ��showConfirmDialog��̬������ʾ�ĶԻ���
           }	
       });
       b3.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

               Object[] options={"OK","CANCEL"};
               JOptionPane.showOptionDialog(null,"���ok��ť����","����",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
               
           }//����һ��showOptionDialog��̬������ʾ�ĶԻ���
       });
       b4.addActionListener(new ActionListener()
       {
           public void actionPerformed(ActionEvent Event) 
           {

               Object[] options={"��һ","�ڶ�","����"};
               JOptionPane.showInputDialog(null,"��ѡ��һ��","����",JOptionPane.INFORMATION_MESSAGE,new ImageIcon("blue.gif"),options,options[0]);
           }//����һ��showInputDialog��̬������ʾ�ĶԻ���
       });
    }
    public static void main(String[] args)
    {
    	new test1();
    }
}
