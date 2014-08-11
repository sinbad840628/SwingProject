import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test8
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    frametest frame1;
    frametest frame2;
    test8()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("菜单项事件处理测试程序");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        
        JMenuBar menubar=new JMenuBar();
        JMenu menu1=new JMenu("操作窗口");
        JMenu menu2=new JMenu("退出系统");
        menubar.add(menu1);
        menubar.add(menu2);
        JMenuItem item1=new JMenuItem("打开窗口一");
        JMenuItem item2=new JMenuItem("关闭窗口一");
        JMenuItem item3=new JMenuItem("打开窗口二");
        JMenuItem item4=new JMenuItem("关闭窗口二");
        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        menu1.addSeparator();
        menu1.add(item4);
        frame.setJMenuBar(menubar);
        item1.addActionListener(new ActionListener()
        {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame1=new frametest("第一个窗口");
			}

        });
        item2.addActionListener(new ActionListener()
        {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame1.dispose();
			}

        });
        item3.addActionListener(new ActionListener()
        {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame2=new frametest("第二个窗口");
			}

        });
        item4.addActionListener(new ActionListener()
        {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame2.dispose();
			}

        });

    }
    public static void main(String[] args)
    {
    	new test8();
    }
}
class frametest extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	frametest(String str)
	{
		setTitle(str);
		setVisible(true);
		setSize(200,300);
		Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-200)/2;
        int y=(height-300)/2;
        setLocation(x,y);
	}
}	
