package com.swing.chapter11;

//��γ��������Ҫ����һ����¼���ڣ�������ȷ���û��������룬������ʧ��������󣬻���������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class loginDemo extends JPanel{
	public static void main(String[] args)
    {
        loginDemo log=new loginDemo();
    }
	
private static final long serialVersionUID = 1L;
	   static final int WIDTH=300;
    static final int HEIGHT=150;
    JFrame loginframe;
    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
} 
    loginDemo()
    {
        loginframe=new JFrame("һ���ۺ�ʵ��"); 
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
        JLabel title=new JLabel("��½����");
        JLabel name=new JLabel("�û���");
        JLabel password=new JLabel("�� ��");
        final JTextField nameinput=new JTextField(15);
        final JTextField passwordinput=new JTextField(15);
        GridBagConstraints constraints=new GridBagConstraints();
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=3;
        constraints.weighty=4;
        add(title,constraints,0,0,2,1);                 
        add(name,constraints,0,1,1,1);
        add(password,constraints,0,2,1,1);
        add(nameinput,constraints,2,1,1,1);
        add(passwordinput,constraints,2,2,1,1);
        add(ok,constraints,0,3,1,1);
        add(cancel,constraints,2,3,1,1);
        loginframe.setResizable(false);
        loginframe.setVisible(true);  

        ok.addActionListener(new ActionListener()
        {//�����½��ť����Ķ����¼�
            public void actionPerformed(ActionEvent Event) 
            {
                String nametext=nameinput.getText();
                String passwordtext=passwordinput.getText();
                String str=new String(passwordtext);
                boolean x=(nametext.equals("starsong")); //�ڴ�����������û���
                boolean y=(str.equals("750720"));    
                boolean z=(x&&y); //��������ȷ��������û����������ھͻ���ʧ
                if (z==true)
                {
                    loginframe.dispose();
                   
                }
                else if(z==false)
                {

                    nameinput.setText("");//�����벻��ȷ���û���������ʱ��ϵͳ�Ὣ�ı������ݸ����
                    passwordinput.setText("");
                }
            }
        });
    }
}
