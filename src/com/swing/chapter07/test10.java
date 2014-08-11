import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test10 extends JSplitPane 
{
	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
static final int WIDTH=300;
    static final int HEIGHT=150;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JTextField info;
    test10()
    {
        JFrame frame=new JFrame();
        frame.setTitle("��Ϣ��ѯ���Գ���");
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
        JPanel pane1=new JPanel();
        JPanel pane2=new JPanel();
        
        button1=new JButton("�ҵ�����");
        button2=new JButton("�ҵ��Ա�");
        button3=new JButton("�ҵ�����");
        button4=new JButton("�ҵĹ����ص�");
        button5=new JButton("�ҵļ�ͥ��ַ");
        button6=new JButton("�ҵ���ϵ��ʽ");
        
        info=new JTextField(10);
        
        setOneTouchExpandable (true);
        setContinuousLayout (true);
        setPreferredSize (new Dimension (100,200));
        setOrientation (JSplitPane.HORIZONTAL_SPLIT);
        setLeftComponent (pane1);
        setRightComponent (pane2);
        setDividerSize (3);
        setDividerLocation(50);  

        pane1.setLayout(new GridLayout(6,1));
        pane2.setLayout(new GridLayout(1,1));
        pane1.add(button1);
        pane1.add(button2);
        pane1.add(button3);
        pane1.add(button4);
        pane1.add(button5);
        pane1.add(button6);
        pane2.add(info);
        
        frame.setContentPane(this);
        button1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		info.setText("����");
        		
        	}
        });
        button2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		info.setText("��");
        		
        	}
        });
        button3.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		info.setText("32");
        		
        	}
        });
        	button4.addActionListener(new ActionListener()
            {
            	public void actionPerformed(ActionEvent e) 
            	{
            		info.setText("�Ϻ�");
            		
            	}
            });
            	button5.addActionListener(new ActionListener()
                {
                	public void actionPerformed(ActionEvent e) 
                	{
                		info.setText("�Ϻ��ֶ�");
                		
                	}
                });
        	button6.addActionListener(new ActionListener()
            {
            	public void actionPerformed(ActionEvent e) 
            	{
            		info.setText("�޿ɷ��");
            		
            	}
            });
    }
    
    public static void main(String[] args)
    {
    	new test10();
    }
}
