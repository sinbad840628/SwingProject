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
        frame.setTitle("信息查询测试程序");
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
        
        button1=new JButton("我的姓名");
        button2=new JButton("我的性别");
        button3=new JButton("我的年龄");
        button4=new JButton("我的工作地点");
        button5=new JButton("我的家庭地址");
        button6=new JButton("我的联系方式");
        
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
        		info.setText("王鹏");
        		
        	}
        });
        button2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent e) 
        	{
        		info.setText("男");
        		
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
            		info.setText("上海");
            		
            	}
            });
            	button5.addActionListener(new ActionListener()
                {
                	public void actionPerformed(ActionEvent e) 
                	{
                		info.setText("上海浦东");
                		
                	}
                });
        	button6.addActionListener(new ActionListener()
            {
            	public void actionPerformed(ActionEvent e) 
            	{
            		info.setText("无可奉告");
            		
            	}
            });
    }
    
    public static void main(String[] args)
    {
    	new test10();
    }
}
