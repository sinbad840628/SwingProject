package com.swing.chapter05;

//��δ�����Ҫ��Ϊ����չʾ���ʹ��GridBagLayout���ֹ��������ַ�ʽ��������������е����
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test7 extends JPanel//�˴���̳���JPanel��
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
JFrame loginframe;
    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {//�˷���������ӿؼ���������
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
} 
    test7()
    {
        loginframe=new JFrame("��Ϣ����ϵͳ"); //���ö�������
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�����䶥�������Ĺر���
        GridBagLayout lay=new GridBagLayout();//���������鲼�ַ�ʽ���� 
        setLayout(lay);                        
        loginframe.add(this, BorderLayout.WEST);
        loginframe.setSize(WIDTH,HEIGHT);
        Toolkit kit=Toolkit.getDefaultToolkit();//���ö����������Ϊ����
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        loginframe.setLocation(x,y);
        JButton ok=new JButton("ȷ��");
        JButton cancel=new JButton("����");
        JLabel title=new JLabel("���ֹ��������Դ���");
        JLabel name=new JLabel("�û���");
        JLabel password=new JLabel("�� ��");
        final JTextField nameinput=new JTextField(15);
        final JTextField passwordinput=new JTextField(15);
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=3;
        constraints.weighty=4;
        add(title,constraints,0,0,4,1); //ʹ�������鲼����ӿؼ�                
        add(name,constraints,0,1,1,1);
        add(password,constraints,0,2,1,1);
        add(nameinput,constraints,2,1,1,1);
        add(passwordinput,constraints,2,2,1,1);
        add(ok,constraints,0,3,1,1);
        add(cancel,constraints,2,3,1,1);
        loginframe.setResizable(false);
        loginframe.setVisible(true);  
    }
    
    public static void main(String[] args)
    {
        new  test7();
    }
}

