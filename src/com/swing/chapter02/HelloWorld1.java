package com.swing.chapter02;

//��δ�����Ҫ�Ǵ�����һ���˵��������ڲ˵��´������������߰�ť������ͬһ����������
import javax.swing.*;
import java.awt.*;
public class HelloWorld1  
{
private static final long serialVersionUID = 1L;
static final int WIDTH=600;
    static final int HEIGHT=400;
    JPopupMenu pop;
    JMenuItem item2;
    JFrame f;
    JMenuItem item1;
    JPanel p;
    JToolBar bar;
    public HelloWorld1() 
    {
      f=new JFrame("�ҵĲ��Խ���");
      JMenuBar menubar1=new JMenuBar();
  	 p=new JPanel();  
  	 f.setContentPane(p);
      f.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("�˵�1");
      JMenu menu2=new JMenu("�˵�2");
      JMenu menu3=new JMenu("�˵�3");
      JMenu menu4=new JMenu("�˵�4");
      JMenu menu5=new JMenu("�˵�5");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      item1=new JMenuItem("�Ӳ˵�1");
      item2=new JMenuItem("�Ӳ˵�2");
      JMenuItem item3=new JMenuItem("�Ӳ˵�3");
      JMenuItem item4=new JMenuItem("�Ӳ˵�4");
      JMenuItem item5=new JMenuItem("�Ӳ˵�5");
      JMenuItem item6=new JMenuItem("�Ӳ˵�6");
      JMenuItem item7=new JMenuItem("�Ӳ˵�7");
      JMenuItem item8=new JMenuItem("�Ӳ˵�8");
      JMenuItem item9=new JMenuItem("�Ӳ˵�9");
      JMenuItem item10=new JMenuItem("�Ӳ˵�10");
      JMenuItem item11=new JMenuItem("�Ӳ˵�11");
      JMenuItem item12=new JMenuItem("�Ӳ˵�12");
      menu1.add(item1);
      menu1.addSeparator();
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu2.add(item4);
      menu2.addSeparator();
      menu2.add(item5);
      menu3.add(item6);
      menu3.addSeparator();
      menu3.add(item7);
      menu4.add(item8);
      menu4.addSeparator();
      menu4.add(item9);
      menu4.addSeparator();
      menu4.add(item10);
      menu5.add(item11);
      menu5.addSeparator();
      menu5.add(item12);
      JButton button1 = new JButton("����1");
      JButton button2 = new JButton("����2");
      JButton button3 = new JButton("����3");
      bar = new JToolBar();
      bar.add(button1);   
      bar.add(button2);        
      bar.add(button3);
      BorderLayout bord = new BorderLayout();
      p.setLayout(bord);
      p.add("North",bar);     
      f.setVisible(true);
      f.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      f.setLocation(x,y); 
}
 public static void main(String[] args)
 {
	 new HelloWorld();
 }
}
