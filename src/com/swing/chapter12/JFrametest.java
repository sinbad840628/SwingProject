package com.swing.chapter12;

//��γ��������Ҫ��Ϊ����չʾ��δ���һ������������Ҳ���Ǵ���
import javax.swing.*;
import java.awt.*;
public class JFrametest extends JPanel
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=700;
    static final int HEIGHT=400;
    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    } 
	JFrametest()
	{
		 JFrame f=new JFrame("��֯��ְ������ϵͳ");//ʹ�á�JFrame(String str )���Ĺ��������������������ࡣ
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     f.setSize(WIDTH,HEIGHT);
	     f.setVisible(true);
	     Toolkit kit=Toolkit.getDefaultToolkit();
	     Dimension screenSize=kit.getScreenSize();
	     int width=screenSize.width;
	     int height=screenSize.height;
	     int x=(width-WIDTH)/2;
	     int y=(height-HEIGHT)/2;
	     f.setLocation(x,y);
	     f.setContentPane(this);
	     GridBagLayout lay=new GridBagLayout();  
	     setLayout(lay); 
	     JLabel l=new JLabel("ְ����Ϣ��ѯ����");
	     JLabel l1=new JLabel("����ְ�����ֲ�ѯ");
	     JLabel l2=new JLabel("����ְ�����Ų�ѯ");
	     JTextField tf1=new JTextField(15);
	     JTextField tf2=new JTextField(15);
	     JButton b=new JButton("��ѯ");
	     JButton b1=new JButton("��ѯ");
	     GridBagConstraints constraints=new GridBagConstraints();
	     constraints.fill=GridBagConstraints.NONE;
	     constraints.weightx=3;
	     constraints.weighty=3;
	     add(l,constraints,0,0,3,1);
	     add(l1,constraints,0,1,1,1);
	     add(l2,constraints,0,2,1,1);
	     add(tf1,constraints,1,1,1,1);
	     add(tf2,constraints,1,2,1,1);
	     add(b,constraints,2,1,1,1);
	     add(b1,constraints,2,2,1,1);        		
	}
	public static void main(String[] args)
	{
		new JFrametest();
	}
}
