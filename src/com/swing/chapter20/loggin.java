package com.swing.chapter20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
///����һ����¼�ࡣ��Ƴ�һ���̳��������ࡣ
class loggins extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
///WIDTH��ָ���������ܵĿ�ȡ�
///HEIGHT��ָ���������ܵĳ��ȡ�
 static final int WIDTH=300;
 static final int HEIGHT=150;
JFrame loginframe;
///�˷���������ӿؼ���������
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
}                                         
///����һ������������
///loginframe�Ǿ���ָ�������Ŀ��
///setDefaultCloseOperation����һ��ʹ�ô�������Ĺرտؼ���Ч����ⷽ��
///lay��һ�������鲼�ֹ������Ķ���
///nameinput�����������û������ı���
///passwordinput����������������ı���
///title��������ʾ����ı�ǩ��
///name��������ʾ���������ı�ǩ��
///password��������ʾ�����롱�ı�ǩ��
///ok��һ����ť��ʹ����ϵͳ��
///cancel��һ����ť��ʹ�˳������ϵͳ��
///ok.addActionListener��һ������ϵͳ�����¼�����������
///cancel.addActionListener��һ���˳�ϵͳ�ͽ��涯���¼��ļ���������
    loggins()
    {
        loginframe=new JFrame("�ҵ�ͨѶ��ϵͳ"); 
        loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridBagLayout lay=new GridBagLayout();  
        setLayout(lay);                        
        loginframe.add(this, BorderLayout.WEST);
        loginframe.setSize(WIDTH,HEIGHT);
///ͨ������Ĵ��������õ�½���ڵ�λ��
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        loginframe.setLocation(x,y);

        JButton ok=new JButton("��¼");
        JButton cancel=new JButton("����");
        JLabel title=new JLabel("ͨѶ��ϵͳ��½����");
        JLabel name=new JLabel("�û���");
        JLabel password=new JLabel("�� ��");
        final JTextField nameinput=new JTextField(15);
        final JTextField passwordinput=new JTextField(15);
///���������鲼�ֹ������Ĳ���
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=4;
        constraints.weighty=4;
///ʹ�������鲼����ӿؼ�
        add(title,constraints,2,0,2,1);            
        add(name,constraints,1,1,2,1);
        add(password,constraints,1,2,2,1);
        add(nameinput,constraints,3,1,2,1);
        add(passwordinput,constraints,3,2,2,1);
        add(ok,constraints,1,3,1,1);
        add(cancel,constraints,3,3,1,1);
        loginframe.setResizable(false);
        loginframe.setVisible(true);  
///��������ȷ������ť�󣬻��������¼�������Ĵ��뽫�����¼�����Ľ��
        ok.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {
                String nametext=nameinput.getText();
                String passwordtext=passwordinput.getText();
                String str=new String(passwordtext);
                boolean x=(nametext.equals("starsong"));
                boolean y=(str.equals("750720"));     //�ڴ�����������û���
                boolean z=(x&&y);
///��������û�������ȷ�Ļ���������뵽���˵����棬����û����������벻��ȷ�Ļ�����ôϵͳ���Ὣ����������գ����û���������
                if (z==true)
                {
                 new mainframe(); //�˽�����Ǻ����������
                 loginframe.dispose();
                }
                else if(z==false)
                {
                    nameinput.setText("");
                    passwordinput.setText("");
                }
            }
        });
///����������������ť�󣬻��������¼�������Ĵ�������˴��¼�����Ľ���ķ�ʽ
        cancel.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {
                loginframe.dispose();
            }
        });
    }
}
public class loggin
{
	
    public static void main(String[] args)
    {
        new loggins();}
}
