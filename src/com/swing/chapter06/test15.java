import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class test15 
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
    test15()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("有关JRootPane面板的综合程序");
           frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
           Dimension screenSize=kit.getScreenSize();
           int width=screenSize.width;
           int height=screenSize.height;
           int x=(width-WIDTH)/2;
           int y=(height-HEIGHT)/2;
           frame.setLocation(x,y);
           frame.setVisible(true);
            ………………………….//与上面实例中相同位置处加黑部分内容相同
           JRootPane root=new JRootPane();
           frame.setContentPane(root);
           frame.setJMenuBar(menubar);
    ｝
    }
    info pane1=new info();
        info1 pane2=new info1();
        
    
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
///创建一个类，这个类是用来将所有信息组件进行布局
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("白菜");
		JLabel label2=new JLabel("芹菜");
		JLabel label3=new JLabel("萝卜");
		JLabel label4=new JLabel("胡萝卜");
		JLabel label5=new JLabel("土豆");
		JLabel price1=new JLabel("单价");
		JLabel number1=new JLabel("数量");
		JLabel sum1=new JLabel("总价");
		JLabel price2=new JLabel("单价");
		JLabel number2=new JLabel("数量");
		JLabel sum2=new JLabel("总价");
		JLabel price3=new JLabel("单价");
		JLabel number3=new JLabel("数量");
		JLabel sum3=new JLabel("总价");
		JLabel price4=new JLabel("单价");
		JLabel number4=new JLabel("数量");
		JLabel sum4=new JLabel("总价");
		JLabel price5=new JLabel("单价");
		JLabel number5=new JLabel("数量");
		JLabel sum5=new JLabel("总价");
		
		JTextField text1=new JTextField();
		JTextField text12=new JTextField();
		JTextField text13=new JTextField();
		JTextField text2=new JTextField();
		JTextField text22=new JTextField();
		JTextField text23=new JTextField();
		JTextField text3=new JTextField();
		JTextField text32=new JTextField();
		JTextField text33=new JTextField();
		JTextField text4=new JTextField();
		JTextField text42=new JTextField();
		JTextField text43=new JTextField();
		JTextField text5=new JTextField();
		JTextField text52=new JTextField();
		JTextField text53=new JTextField();
		
		setLayout(new GridLayout(5,7));
		add(label1);
		add(price1);
		add(text1);
		add(number1);
		add(text12);
		add(sum1);
		add(text13);	
		add(label2);
		add(price2);
		add(text2);
		add(number2);
		add(text22);
		add(sum2);
		add(text23);
		add(label3);
		add(price3);
		add(text3);
		add(number3);
		add(text32);
		add(sum3);
		add(text33);
		add(label4);
		add(price4);
		add(text4);
		add(number4);
		add(text42);
		add(sum4);
		add(text43);
		add(label5);
		add(price5);
		add(text5);
		add(number5);
		add(text52);
		add(sum5);
		add(text53);
	}
}
///创建一个类，这个类是用来添加两个JInternalFrame面板的
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("第一个窗口",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("第二个窗口",true,true,true);
	     JLabel l1=new JLabel("这些蔬菜都是新鲜的");
	     JLabel l2=new JLabel("这些蔬菜都是刚进货的");
	     JLabel l3=new JLabel("这些蔬菜都是很便宜的");
	     JLabel l4=new JLabel("这些蔬菜都是今天早上刚到的");
	     JLabel l5=new JLabel("这些蔬菜都是批发的");
	     JLabel l6=new JLabel("这些蔬菜都是有营养的");
	     jif.setLayout(new GridLayout(3,1));
	     jif1.setLayout(new GridLayout(3,1));
	     jif.add(l1);
	     jif.add(l2);
	     jif.add(l3);
	     jif1.add(l4);
	     jif1.add(l5);
	     jif1.add(l6);
	     JDesktopPane dp=new JDesktopPane();
	     dp.setLayout(new FlowLayout());
	     dp.add(jif);
	     dp.add(jif1);
	     jif.setVisible(true);
	     jif1.setVisible(true);
	     add(dp);
	}
}
4.  将上面的实例中的顶层窗口中的面板更换成JRootPane面板。其效果图如上例。
答：这个题目主要是要考察读者对于JRootPane面板的掌握程度。其具体代码如下所示。
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class test15 
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    test15()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("有关JRootPane面板的综合程序");
        frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setVisible(true);
        ………………………….//与上面实例中相同位置处加黑部分内容相同
        JRootPane root=new JRootPane();
        frame.setContentPane(root);
        frame.setJMenuBar(menubar);
    ｝
    }
    info pane1=new info();
        info1 pane2=new info1();
        
    
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
///创建一个类，这个类是用来将所有信息组件进行布局
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("白菜");
		JLabel label2=new JLabel("芹菜");
		JLabel label3=new JLabel("萝卜");
		JLabel label4=new JLabel("胡萝卜");
		JLabel label5=new JLabel("土豆");
		JLabel price1=new JLabel("单价");
		JLabel number1=new JLabel("数量");
		JLabel sum1=new JLabel("总价");
		JLabel price2=new JLabel("单价");
		JLabel number2=new JLabel("数量");
		JLabel sum2=new JLabel("总价");
		JLabel price3=new JLabel("单价");
		JLabel number3=new JLabel("数量");
		JLabel sum3=new JLabel("总价");
		JLabel price4=new JLabel("单价");
		JLabel number4=new JLabel("数量");
		JLabel sum4=new JLabel("总价");
		JLabel price5=new JLabel("单价");
		JLabel number5=new JLabel("数量");
		JLabel sum5=new JLabel("总价");
		
		JTextField text1=new JTextField();
		JTextField text12=new JTextField();
		JTextField text13=new JTextField();
		JTextField text2=new JTextField();
		JTextField text22=new JTextField();
		JTextField text23=new JTextField();
		JTextField text3=new JTextField();
		JTextField text32=new JTextField();
		JTextField text33=new JTextField();
		JTextField text4=new JTextField();
		JTextField text42=new JTextField();
		JTextField text43=new JTextField();
		JTextField text5=new JTextField();
		JTextField text52=new JTextField();
		JTextField text53=new JTextField();
		
		setLayout(new GridLayout(5,7));
		add(label1);
		add(price1);
		add(text1);
		add(number1);
		add(text12);
		add(sum1);
		add(text13);	
		add(label2);
		add(price2);
		add(text2);
		add(number2);
		add(text22);
		add(sum2);
		add(text23);
		add(label3);
		add(price3);
		add(text3);
		add(number3);
		add(text32);
		add(sum3);
		add(text33);
		add(label4);
		add(price4);
		add(text4);
		add(number4);
		add(text42);
		add(sum4);
		add(text43);
		add(label5);
		add(price5);
		add(text5);
		add(number5);
		add(text52);
		add(sum5);
		add(text53);
	}
}
///创建一个类，这个类是用来添加两个JInternalFrame面板的
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("第一个窗口",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("第二个窗口",true,true,true);
	     JLabel l1=new JLabel("这些蔬菜都是新鲜的");
	     JLabel l2=new JLabel("这些蔬菜都是刚进货的");
	     JLabel l3=new JLabel("这些蔬菜都是很便宜的");
	     JLabel l4=new JLabel("这些蔬菜都是今天早上刚到的");
	     JLabel l5=new JLabel("这些蔬菜都是批发的");
	     JLabel l6=new JLabel("这些蔬菜都是有营养的");
	     jif.setLayout(new GridLayout(3,1));
	     jif1.setLayout(new GridLayout(3,1));
	     jif.add(l1);
	     jif.add(l2);
	     jif.add(l3);
	     jif1.add(l4);
	     jif1.add(l5);
	     jif1.add(l6);
	     JDesktopPane dp=new JDesktopPane();
	     dp.setLayout(new FlowLayout());
	     dp.add(jif);
	     dp.add(jif1);
	     jif.setVisible(true);
	     jif1.setVisible(true);
	     add(dp);
	}
}
4.  将上面的实例中的顶层窗口中的面板更换成JRootPane面板。其效果图如上例。
答：这个题目主要是要考察读者对于JRootPane面板的掌握程度。其具体代码如下所示。
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class test15 
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    test15()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("有关JRootPane面板的综合程序");
        frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setVisible(true);
        info pane1=new info();
        info1 pane2=new info1();
        
    
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
///创建一个类，这个类是用来将所有信息组件进行布局
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("白菜");
		JLabel label2=new JLabel("芹菜");
		JLabel label3=new JLabel("萝卜");
		JLabel label4=new JLabel("胡萝卜");
		JLabel label5=new JLabel("土豆");
		JLabel price1=new JLabel("单价");
		JLabel number1=new JLabel("数量");
		JLabel sum1=new JLabel("总价");
		JLabel price2=new JLabel("单价");
		JLabel number2=new JLabel("数量");
		JLabel sum2=new JLabel("总价");
		JLabel price3=new JLabel("单价");
		JLabel number3=new JLabel("数量");
		JLabel sum3=new JLabel("总价");
		JLabel price4=new JLabel("单价");
		JLabel number4=new JLabel("数量");
		JLabel sum4=new JLabel("总价");
		JLabel price5=new JLabel("单价");
		JLabel number5=new JLabel("数量");
		JLabel sum5=new JLabel("总价");
		
		JTextField text1=new JTextField();
		JTextField text12=new JTextField();
		JTextField text13=new JTextField();
		JTextField text2=new JTextField();
		JTextField text22=new JTextField();
		JTextField text23=new JTextField();
		JTextField text3=new JTextField();
		JTextField text32=new JTextField();
		JTextField text33=new JTextField();
		JTextField text4=new JTextField();
		JTextField text42=new JTextField();
		JTextField text43=new JTextField();
		JTextField text5=new JTextField();
		JTextField text52=new JTextField();
		JTextField text53=new JTextField();
		
		setLayout(new GridLayout(5,7));
		add(label1);
		add(price1);
		add(text1);
		add(number1);
		add(text12);
		add(sum1);
		add(text13);	
		add(label2);
		add(price2);
		add(text2);
		add(number2);
		add(text22);
		add(sum2);
		add(text23);
		add(label3);
		add(price3);
		add(text3);
		add(number3);
		add(text32);
		add(sum3);
		add(text33);
		add(label4);
		add(price4);
		add(text4);
		add(number4);
		add(text42);
		add(sum4);
		add(text43);
		add(label5);
		add(price5);
		add(text5);
		add(number5);
		add(text52);
		add(sum5);
		add(text53);
	}
}
///创建一个类，这个类是用来添加两个JInternalFrame面板的
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("第一个窗口",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("第二个窗口",true,true,true);
	     JLabel l1=new JLabel("这些蔬菜都是新鲜的");
	     JLabel l2=new JLabel("这些蔬菜都是刚进货的");
	     JLabel l3=new JLabel("这些蔬菜都是很便宜的");
	     JLabel l4=new JLabel("这些蔬菜都是今天早上刚到的");
	     JLabel l5=new JLabel("这些蔬菜都是批发的");
	     JLabel l6=new JLabel("这些蔬菜都是有营养的");
	     jif.setLayout(new GridLayout(3,1));
	     jif1.setLayout(new GridLayout(3,1));
	     jif.add(l1);
	     jif.add(l2);
	     jif.add(l3);
	     jif1.add(l4);
	     jif1.add(l5);
	     jif1.add(l6);
	     JDesktopPane dp=new JDesktopPane();
	     dp.setLayout(new FlowLayout());
	     dp.add(jif);
	     dp.add(jif1);
	     jif.setVisible(true);
	     jif1.setVisible(true);
	     add(dp);
	}
}
4.  将上面的实例中的顶层窗口中的面板更换成JRootPane面板。其效果图如上例。
答：这个题目主要是要考察读者对于JRootPane面板的掌握程度。其具体代码如下所示。
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class test15 
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    test15()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("有关JRootPane面板的综合程序");
        frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setVisible(true);
        JMenuBar menubar=new JMenuBar();
        JMenu menu1=new JMenu("蔬菜信息");
        JMenu menu2=new JMenu("水果信息");
        JMenu menu3=new JMenu("烟酒信息");
        JMenu menu4=new JMenu("百货信息");
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        JMenuItem item1=new JMenuItem("基本信息");
        JMenuItem item2=new JMenuItem("保存");
        JMenuItem item3=new JMenuItem("打印");
        JMenuItem item4=new JMenuItem("退出");
        menu1.add(item1);
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        menu1.addSeparator();
        menu1.add(item4);
        JSplitPane sp=new JSplitPane();
        sp.setOneTouchExpandable (true);
        sp.setContinuousLayout (true);
        sp.setPreferredSize (new Dimension (100,200));
        sp.setOrientation (JSplitPane.HORIZONTAL_SPLIT);
        sp.setLeftComponent (pane1);
        sp.setRightComponent (pane2);
        sp.setDividerSize (3);
        sp.setDividerLocation(50);

        JRootPane root=new JRootPane();
        frame.setContentPane(root);
        frame.setJMenuBar(menubar);
    ｝
     public static void main(String[] args)
    {
    	new test15();
    }
}
//创建一个类，这个类是用来将所有信息组件进行布局
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("白菜");
		JLabel label2=new JLabel("芹菜");
		JLabel label3=new JLabel("萝卜");
		JLabel label4=new JLabel("胡萝卜");
		JLabel label5=new JLabel("土豆");
		JLabel price1=new JLabel("单价");
		JLabel number1=new JLabel("数量");
		JLabel sum1=new JLabel("总价");
		JLabel price2=new JLabel("单价");
		JLabel number2=new JLabel("数量");
		JLabel sum2=new JLabel("总价");
		JLabel price3=new JLabel("单价");
		JLabel number3=new JLabel("数量");
		JLabel sum3=new JLabel("总价");
		JLabel price4=new JLabel("单价");
		JLabel number4=new JLabel("数量");
		JLabel sum4=new JLabel("总价");
		JLabel price5=new JLabel("单价");
		JLabel number5=new JLabel("数量");
		JLabel sum5=new JLabel("总价");
		
		JTextField text1=new JTextField();
		JTextField text12=new JTextField();
		JTextField text13=new JTextField();
		JTextField text2=new JTextField();
		JTextField text22=new JTextField();
		JTextField text23=new JTextField();
		JTextField text3=new JTextField();
		JTextField text32=new JTextField();
		JTextField text33=new JTextField();
		JTextField text4=new JTextField();
		JTextField text42=new JTextField();
		JTextField text43=new JTextField();
		JTextField text5=new JTextField();
		JTextField text52=new JTextField();
		JTextField text53=new JTextField();
		
		setLayout(new GridLayout(5,7));
		add(label1);
		add(price1);
		add(text1);
		add(number1);
		add(text12);
		add(sum1);
		add(text13);	
		add(label2);
		add(price2);
		add(text2);
		add(number2);
		add(text22);
		add(sum2);
		add(text23);
		add(label3);
		add(price3);
		add(text3);
		add(number3);
		add(text32);
		add(sum3);
		add(text33);
		add(label4);
		add(price4);
		add(text4);
		add(number4);
		add(text42);
		add(sum4);
		add(text43);
		add(label5);
		add(price5);
		add(text5);
		add(number5);
		add(text52);
		add(sum5);
		add(text53);
	}
}
///创建一个类，这个类是用来添加两个JInternalFrame面板的
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("第一个窗口",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("第二个窗口",true,true,true);
	     JLabel l1=new JLabel("这些蔬菜都是新鲜的");
	     JLabel l2=new JLabel("这些蔬菜都是刚进货的");
	     JLabel l3=new JLabel("这些蔬菜都是很便宜的");
	     JLabel l4=new JLabel("这些蔬菜都是今天早上刚到的");
	     JLabel l5=new JLabel("这些蔬菜都是批发的");
	     JLabel l6=new JLabel("这些蔬菜都是有营养的");
	     jif.setLayout(new GridLayout(3,1));
	     jif1.setLayout(new GridLayout(3,1));
	     jif.add(l1);
	     jif.add(l2);
	     jif.add(l3);
	     jif1.add(l4);
	     jif1.add(l5);
	     jif1.add(l6);
	     JDesktopPane dp=new JDesktopPane();
	     dp.setLayout(new FlowLayout());
	     dp.add(jif);
	     dp.add(jif1);
	     jif.setVisible(true);
	     jif1.setVisible(true);
	     add(dp);
	}
}


        JRootPane root=new JRootPane();
        frame.setContentPane(root);
        frame.setJMenuBar(menubar);
    ｝
    }
    ………………………………//与上面实例中相同位置处的加黑部分内容相同
    

    

    
