package com.swing.chapter02;

//��δ�����Ҫ�Ǵ���һ����¼���ڽ��棬��������������ı��������ͨ��ť�������ǩ����������ǰ��������鲼�ֹ���ʽ���֣�
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
///����һ����¼�ࡣ��Ƴ�һ���̳��������ࡣ
///WIDTH��ָ���������ܵĿ�ȡ�
///HEIGHT��ָ���������ܵĳ��ȡ�
 class HelloWorld extends JPanel
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
JFrame loginframe;
///���������鲼�ַ�ʽ��������ķ���
///xָ�ؼ�λ�ڵڼ��С�
///yָ�ؼ�λ�ڵڼ��С�
///wָ�ؼ���Ҫռ���С�
///hָ�ؼ���Ҫռ���С�
    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
}                                         //�˷���������ӿؼ���������
///����һ������������
///loginframe�Ǿ���ָ�������Ŀ��
/// setDefaultCloseOperation����һ��ʹ�ô�������Ĺرտؼ���Ч����ⷽ��
/// lay��һ�������鲼�ֹ������Ķ���
/// nameinput�����������û������ı���
/// passwordinput����������������ı���
/// title��������ʾ����ı�ǩ��
/// name��������ʾ���������ı�ǩ��
///password��������ʾ�����롱�ı�ǩ��
///ok��һ����ť��ʹ����ϵͳ��
///cancel��һ����ť��ʹ�˳������ϵͳ��
/// ok.addActionListener��һ������ϵͳ�����¼�����������
///cancel.addActionListener��һ���˳�ϵͳ�ͽ��涯���¼��ļ���������
    HelloWorld()
    {
        loginframe=new JFrame("��ӭ����Java����"); 
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout lay=new GridBagLayout();  
        setLayout(lay);                        
        loginframe.add(this, BorderLayout.WEST);
        loginframe.setSize(WIDTH,HEIGHT);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        loginframe.setLocation(x,y);
        JButton ok=new JButton("��¼");
        JButton cancel=new JButton("����");
        JLabel title=new JLabel("��ӭ����Java����");
        JLabel name=new JLabel("�û���");
        JLabel password=new JLabel("�� ��");
        final JTextField nameinput=new JTextField(15);
        final JTextField passwordinput=new JTextField(15);
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=3;
        constraints.weighty=4;
        add(title,constraints,0,0,4,1);                 //ʹ�������鲼����ӿؼ�
        add(name,constraints,0,1,1,1);
        add(password,constraints,0,2,1,1);
        add(nameinput,constraints,2,1,1,1);
        add(passwordinput,constraints,2,2,1,1);
        add(ok,constraints,0,3,1,1);
        add(cancel,constraints,2,3,1,1);
        loginframe.setResizable(false);
        loginframe.setVisible(true);  
        
    }
    public static void main(String[] args){
        HelloWorld hello=new HelloWorld();}
}
