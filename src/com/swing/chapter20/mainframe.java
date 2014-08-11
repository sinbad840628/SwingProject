package com.swing.chapter20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class mainframe  
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
    JPanel p1;
    JPanel p2;
    JPanel p3;
    tabpane tab1;
    tabpane tab2;
    tabpane tab3;
    JButton closebutton1;
    JButton closebutton2;
    JButton closebutton3;
    JButton addbutton1;
    JButton addbutton2;
    JButton addbutton3;
    JButton delbutton1;
    JButton delbutton2;
    JButton delbutton3;
    JButton updatebutton1;
    JButton updatebutton2;
    JButton updatebutton3;
    public mainframe() 
    {
      f=new JFrame("我的通讯录系统主界面");
      JMenuBar menubar1=new JMenuBar();
      
  	  p=new JPanel();  
  	  f.setContentPane(p);
      f.setJMenuBar(menubar1);
///创建菜单系统
      JMenu menu1=new JMenu("同学通讯系统");
      JMenu menu2=new JMenu("同事通讯系统");
      JMenu menu3=new JMenu("朋友通讯系统");
      JMenu menu4=new JMenu("查询系统");
      JMenu menu5=new JMenu("帮助系统");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      item1=new JMenuItem("同学基本信息系统");
      item2=new JMenuItem("同学联系方式系统");
      JMenuItem item3=new JMenuItem("退出通讯录系统");
      JMenuItem item4=new JMenuItem("同事基本信息系统");
      JMenuItem item5=new JMenuItem("同事联系方式系统");
      JMenuItem item6=new JMenuItem("朋友基本信息系统");
      JMenuItem item7=new JMenuItem("朋友联系方式系统");
      JMenuItem item8=new JMenuItem("同学查询系统");
      JMenuItem item9=new JMenuItem("同事查询系统");
      JMenuItem item10=new JMenuItem("朋友查询系统");
      JMenuItem item11=new JMenuItem("版本信息");
      JMenuItem item12=new JMenuItem("帮助信息");
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
      JButton button1 = new JButton("同学查询系统");
      JButton button2 = new JButton("同事查询系统");
      JButton button3 = new JButton("朋友查询系统");
      closebutton1=new JButton("关闭");
      closebutton2=new JButton("关闭");
      closebutton3=new JButton("关闭");
      addbutton1=new JButton("添加同学信息数据");
      addbutton2=new JButton("添加同事信息数据");
      addbutton3=new JButton("添加朋友信息数据");
      delbutton1=new JButton("删除同学信息数据");
      delbutton2=new JButton("删除同事信息数据");
      delbutton3=new JButton("删除朋友信息数据");
      updatebutton1=new JButton("更新同学信息数据");
      updatebutton2=new JButton("更新同事信息数据");
      updatebutton3=new JButton("更新朋友信息数据");
///将功能按钮组件添加到容器中
      p1=new JPanel();
      p2=new JPanel();
      p3=new JPanel();
      p1.setLayout(new FlowLayout());     
      p1.add(closebutton1);
      p1.add(addbutton1);
      p1.add(delbutton1);
      p1.add(updatebutton1);
      p2.add(closebutton2);
      p2.add(addbutton2);
      p2.add(delbutton2);
      p2.add(updatebutton2);
      p3.add(closebutton3);
      p3.add(addbutton3);
      p3.add(delbutton3);
      p3.add(updatebutton3);
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
      item1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {     
///将JTabbedPane组件添加到框架容器内的中间位置，将包含添加、删除和更新组件的容器添加到框架容器的最底部	
        	    tab1=new tabpane();
              p.add("Center",tab1);
              tab1.panel1.add(new classinfo());
              p.add("South",p1);
              tabpane.tp.setVisible(true);
              p1.setVisible(true);
          }
      });
      item2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	  ///当单击查询系统中的同学查询系统，会弹出前面设计的同学联系方式类	
        	  classmatecommunication cc=new classmatecommunication();
        	  p.add("Center",cc.pane);
        	  cc.pane.setVisible(true);
          }
      });
      item3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///设计一个对话框系统，如果需要退出系统的话，则主框架消失
        		int i=JOptionPane.showConfirmDialog(null,"是否真的需要退出系统","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
            	if(i==0)
            	{
            		f.dispose();
            	}

          }
      });
      item4.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///将JTabbedPane组件添加到框架容器内的中间位置，将包含添加、删除和更新组件的容器添加到框架容器的最底部	
        	  tab2=new tabpane();
              p.add("Center",tab2);
              tab2.panel1.add(new companyinfo());
              p.add("South",p2);
              tabpane.tp.setVisible(true);
              p2.setVisible(true);
          }
      });
      item5.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///当单击查询系统中的同事查询系统，会弹出前面设计的同事联系方式类
        	  companycommunication cc1=new companycommunication();
        	  p.add("Center",cc1.pane);
        	  cc1.pane.setVisible(true);
          }
      });
      item6.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        ///将JTabbedPane组件添加到框架容器内的中间位置，将包含添加、删除和更新组件的容器添加到框架容器的最底部	
        	  tab3=new tabpane();
              p.add("Center",tab3);
              tab3.panel1.add(new friendinfo());
              p.add("South",p3);
              tabpane.tp.setVisible(true);
              p3.setVisible(true);
          }
      });
      item7.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///当单击查询系统中的朋友查询系统，会弹出前面设计的朋友联系方式类
        	  friendcommunication fc=new friendcommunication();
        	  p.add("Center",fc.pane);
        	  fc.pane.setVisible(true);
          }
      });
      item8.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///当单击查询系统中的同学查询系统，会弹出前面设计的同学查询类
        	  classmatefind cf=new classmatefind();
        	  p.add("Center",cf.pane);
        	  cf.pane.setVisible(true);
        	  
          }
      });
      item9.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///当单击查询系统中的同事查询系统，会弹出前面设计的同事查询类
        	  companyfind cf1=new companyfind();
        	  p.add("Center",cf1.pane);
        	  cf1.pane.setVisible(true);
          }
      });
      item10.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///当单击查询系统中的朋友查询系统，会弹出前面设计的朋友查询类
        	  friendfind ff=new friendfind();
        	  p.add("Center",ff.pane);
        	  ff.pane.setVisible(true);
          }
      });
      item11.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///通过版本信息的构造器来创建一个版本信息的框架
        	new version();
          }
      });
      item12.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
             new help();
          }
      });
      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///实现工具栏中的同学查询系统
        	  classmatefind cf=new classmatefind();
        	  p.add("Center",cf.pane);
        	  cf.pane.setVisible(true);
        	  
              
          }
      });
      button2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///实现工具栏中的同事查询系统
        	  companyfind cf1=new companyfind();
        	  p.add("Center",cf1.pane);
        	  cf1.pane.setVisible(true);

          }
      });
      button3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///实现工具栏中的朋友查询系统
        	  friendfind ff=new friendfind();
        	  p.add("Center",ff.pane);
        	  ff.pane.setVisible(true);
          }
      });
      closebutton1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///在容器内关闭功能的实现是通过将组件移出的方式
             tab1.setVisible(false);
             p1.setVisible(false);
          }
      });
      closebutton2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {   
///在容器内关闭功能的实现是通过将组件移出的方式
        	  tab2.setVisible(false);
              p2.setVisible(false);
          }
      });
      closebutton3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///在容器内关闭功能的实现是通过将组件移出的方式
        	  tab3.setVisible(false);
              p3.setVisible(false);
          }
      });
      addbutton1.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器来创建一个添加功能的框架窗口
    		  new addclassmate();
    		  
    	  }
      });
      addbutton2.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器来创建一个添加功能的框架窗口
    		new addcompany();
    		 }
      });
      addbutton3.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器来创建一个添加功能的框架窗口
    		  new addfriend();
    	  }
      });
      delbutton1.addActionListener(new ActionListener()
      {
   	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建一个删除功能模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的删除此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
          	if(i==0)
          	{
          		new delclassmate();
          	}
    	  }
      });
      delbutton2.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建一个删除功能模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的删除此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
            	if(i==0)
            	{
    		          new delcompany();
            	}
    	  }
      });
      delbutton3.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建一个删除功能模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的删除此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
          	if(i==0)
          	{
  		          new delfriend();
          	}
    	  }
      });
      updatebutton1.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建更新功能的模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的要更新此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
    	      	if(i==0)
    	      	{
    		 new updateclassmate();
    	  }
    	  }
      });
      updatebutton2.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建更新功能的模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的要更新此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
    	      	if(i==0)
    	      	{
    		  new updatecompany();
    	  }
    	  }
      });
      updatebutton3.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///通过构造器创建更新功能的模块
    		  int i=JOptionPane.showConfirmDialog(null,"是否真的要更新此项","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
    	    	if(i==0)
    	    	{
    		  new updatefriend();
    	    	}
    	  }
      });
    }
}
