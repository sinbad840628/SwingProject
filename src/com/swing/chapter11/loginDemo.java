package com.swing.chapter11;

//这段程序代码主要创建一个登录窗口，输入正确的用户名和密码，窗口消失，输入错误，会清空密码框
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
        loginframe=new JFrame("一个综合实例"); 
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
        JButton ok=new JButton("登录");
        JButton cancel=new JButton("放弃");
        JLabel title=new JLabel("登陆窗口");
        JLabel name=new JLabel("用户名");
        JLabel password=new JLabel("密 码");
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
        {//处理登陆按钮组件的动作事件
            public void actionPerformed(ActionEvent Event) 
            {
                String nametext=nameinput.getText();
                String passwordtext=passwordinput.getText();
                String str=new String(passwordtext);
                boolean x=(nametext.equals("starsong")); //在此设置密码和用户名
                boolean y=(str.equals("750720"));    
                boolean z=(x&&y); //当输入正确的密码和用户名后，主窗口就会消失
                if (z==true)
                {
                    loginframe.dispose();
                   
                }
                else if(z==false)
                {

                    nameinput.setText("");//当输入不正确的用户名和密码时，系统会将文本框内容给清空
                    passwordinput.setText("");
                }
            }
        });
    }
}
