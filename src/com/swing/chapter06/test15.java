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
    	   frame.setTitle("�й�JRootPane�����ۺϳ���");
           frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
           Dimension screenSize=kit.getScreenSize();
           int width=screenSize.width;
           int height=screenSize.height;
           int x=(width-WIDTH)/2;
           int y=(height-HEIGHT)/2;
           frame.setLocation(x,y);
           frame.setVisible(true);
            ��������������������.//������ʵ������ͬλ�ô��Ӻڲ���������ͬ
           JRootPane root=new JRootPane();
           frame.setContentPane(root);
           frame.setJMenuBar(menubar);
    ��
    }
    info pane1=new info();
        info1 pane2=new info1();
        
    
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
///����һ���࣬�������������������Ϣ������в���
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("�ײ�");
		JLabel label2=new JLabel("�۲�");
		JLabel label3=new JLabel("�ܲ�");
		JLabel label4=new JLabel("���ܲ�");
		JLabel label5=new JLabel("����");
		JLabel price1=new JLabel("����");
		JLabel number1=new JLabel("����");
		JLabel sum1=new JLabel("�ܼ�");
		JLabel price2=new JLabel("����");
		JLabel number2=new JLabel("����");
		JLabel sum2=new JLabel("�ܼ�");
		JLabel price3=new JLabel("����");
		JLabel number3=new JLabel("����");
		JLabel sum3=new JLabel("�ܼ�");
		JLabel price4=new JLabel("����");
		JLabel number4=new JLabel("����");
		JLabel sum4=new JLabel("�ܼ�");
		JLabel price5=new JLabel("����");
		JLabel number5=new JLabel("����");
		JLabel sum5=new JLabel("�ܼ�");
		
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
///����һ���࣬������������������JInternalFrame����
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("��һ������",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("�ڶ�������",true,true,true);
	     JLabel l1=new JLabel("��Щ�߲˶������ʵ�");
	     JLabel l2=new JLabel("��Щ�߲˶��Ǹս�����");
	     JLabel l3=new JLabel("��Щ�߲˶��Ǻܱ��˵�");
	     JLabel l4=new JLabel("��Щ�߲˶��ǽ������ϸյ���");
	     JLabel l5=new JLabel("��Щ�߲˶���������");
	     JLabel l6=new JLabel("��Щ�߲˶�����Ӫ����");
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
4.  �������ʵ���еĶ��㴰���е���������JRootPane��塣��Ч��ͼ��������
�������Ŀ��Ҫ��Ҫ������߶���JRootPane�������ճ̶ȡ���������������ʾ��
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
    	   frame.setTitle("�й�JRootPane�����ۺϳ���");
        frame.setSize(WIDTH,HEIGHT);
    	   Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        frame.setVisible(true);
        ��������������������.//������ʵ������ͬλ�ô��Ӻڲ���������ͬ
        JRootPane root=new JRootPane();
        frame.setContentPane(root);
        frame.setJMenuBar(menubar);
    ��
    }
    info pane1=new info();
        info1 pane2=new info1();
        
    
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
///����һ���࣬�������������������Ϣ������в���
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("�ײ�");
		JLabel label2=new JLabel("�۲�");
		JLabel label3=new JLabel("�ܲ�");
		JLabel label4=new JLabel("���ܲ�");
		JLabel label5=new JLabel("����");
		JLabel price1=new JLabel("����");
		JLabel number1=new JLabel("����");
		JLabel sum1=new JLabel("�ܼ�");
		JLabel price2=new JLabel("����");
		JLabel number2=new JLabel("����");
		JLabel sum2=new JLabel("�ܼ�");
		JLabel price3=new JLabel("����");
		JLabel number3=new JLabel("����");
		JLabel sum3=new JLabel("�ܼ�");
		JLabel price4=new JLabel("����");
		JLabel number4=new JLabel("����");
		JLabel sum4=new JLabel("�ܼ�");
		JLabel price5=new JLabel("����");
		JLabel number5=new JLabel("����");
		JLabel sum5=new JLabel("�ܼ�");
		
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
///����һ���࣬������������������JInternalFrame����
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("��һ������",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("�ڶ�������",true,true,true);
	     JLabel l1=new JLabel("��Щ�߲˶������ʵ�");
	     JLabel l2=new JLabel("��Щ�߲˶��Ǹս�����");
	     JLabel l3=new JLabel("��Щ�߲˶��Ǻܱ��˵�");
	     JLabel l4=new JLabel("��Щ�߲˶��ǽ������ϸյ���");
	     JLabel l5=new JLabel("��Щ�߲˶���������");
	     JLabel l6=new JLabel("��Щ�߲˶�����Ӫ����");
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
4.  �������ʵ���еĶ��㴰���е���������JRootPane��塣��Ч��ͼ��������
�������Ŀ��Ҫ��Ҫ������߶���JRootPane�������ճ̶ȡ���������������ʾ��
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
    	   frame.setTitle("�й�JRootPane�����ۺϳ���");
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
///����һ���࣬�������������������Ϣ������в���
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("�ײ�");
		JLabel label2=new JLabel("�۲�");
		JLabel label3=new JLabel("�ܲ�");
		JLabel label4=new JLabel("���ܲ�");
		JLabel label5=new JLabel("����");
		JLabel price1=new JLabel("����");
		JLabel number1=new JLabel("����");
		JLabel sum1=new JLabel("�ܼ�");
		JLabel price2=new JLabel("����");
		JLabel number2=new JLabel("����");
		JLabel sum2=new JLabel("�ܼ�");
		JLabel price3=new JLabel("����");
		JLabel number3=new JLabel("����");
		JLabel sum3=new JLabel("�ܼ�");
		JLabel price4=new JLabel("����");
		JLabel number4=new JLabel("����");
		JLabel sum4=new JLabel("�ܼ�");
		JLabel price5=new JLabel("����");
		JLabel number5=new JLabel("����");
		JLabel sum5=new JLabel("�ܼ�");
		
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
///����һ���࣬������������������JInternalFrame����
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("��һ������",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("�ڶ�������",true,true,true);
	     JLabel l1=new JLabel("��Щ�߲˶������ʵ�");
	     JLabel l2=new JLabel("��Щ�߲˶��Ǹս�����");
	     JLabel l3=new JLabel("��Щ�߲˶��Ǻܱ��˵�");
	     JLabel l4=new JLabel("��Щ�߲˶��ǽ������ϸյ���");
	     JLabel l5=new JLabel("��Щ�߲˶���������");
	     JLabel l6=new JLabel("��Щ�߲˶�����Ӫ����");
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
4.  �������ʵ���еĶ��㴰���е���������JRootPane��塣��Ч��ͼ��������
�������Ŀ��Ҫ��Ҫ������߶���JRootPane�������ճ̶ȡ���������������ʾ��
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
    	   frame.setTitle("�й�JRootPane�����ۺϳ���");
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
        JMenu menu1=new JMenu("�߲���Ϣ");
        JMenu menu2=new JMenu("ˮ����Ϣ");
        JMenu menu3=new JMenu("�̾���Ϣ");
        JMenu menu4=new JMenu("�ٻ���Ϣ");
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        JMenuItem item1=new JMenuItem("������Ϣ");
        JMenuItem item2=new JMenuItem("����");
        JMenuItem item3=new JMenuItem("��ӡ");
        JMenuItem item4=new JMenuItem("�˳�");
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
    ��
     public static void main(String[] args)
    {
    	new test15();
    }
}
//����һ���࣬�������������������Ϣ������в���
class info extends JPanel
{                      
	info()
	{
		JLabel label1=new JLabel("�ײ�");
		JLabel label2=new JLabel("�۲�");
		JLabel label3=new JLabel("�ܲ�");
		JLabel label4=new JLabel("���ܲ�");
		JLabel label5=new JLabel("����");
		JLabel price1=new JLabel("����");
		JLabel number1=new JLabel("����");
		JLabel sum1=new JLabel("�ܼ�");
		JLabel price2=new JLabel("����");
		JLabel number2=new JLabel("����");
		JLabel sum2=new JLabel("�ܼ�");
		JLabel price3=new JLabel("����");
		JLabel number3=new JLabel("����");
		JLabel sum3=new JLabel("�ܼ�");
		JLabel price4=new JLabel("����");
		JLabel number4=new JLabel("����");
		JLabel sum4=new JLabel("�ܼ�");
		JLabel price5=new JLabel("����");
		JLabel number5=new JLabel("����");
		JLabel sum5=new JLabel("�ܼ�");
		
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
///����һ���࣬������������������JInternalFrame����
class info1 extends JPanel
{
	info1()
	{
		 
		 JInternalFrame jif=new JInternalFrame("��һ������",true,true,true);
	     JInternalFrame jif1=new JInternalFrame("�ڶ�������",true,true,true);
	     JLabel l1=new JLabel("��Щ�߲˶������ʵ�");
	     JLabel l2=new JLabel("��Щ�߲˶��Ǹս�����");
	     JLabel l3=new JLabel("��Щ�߲˶��Ǻܱ��˵�");
	     JLabel l4=new JLabel("��Щ�߲˶��ǽ������ϸյ���");
	     JLabel l5=new JLabel("��Щ�߲˶���������");
	     JLabel l6=new JLabel("��Щ�߲˶�����Ӫ����");
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
    ��
    }
    ������������������������//������ʵ������ͬλ�ô��ļӺڲ���������ͬ
    

    

    
