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
      f=new JFrame("�ҵ�ͨѶ¼ϵͳ������");
      JMenuBar menubar1=new JMenuBar();
      
  	  p=new JPanel();  
  	  f.setContentPane(p);
      f.setJMenuBar(menubar1);
///�����˵�ϵͳ
      JMenu menu1=new JMenu("ͬѧͨѶϵͳ");
      JMenu menu2=new JMenu("ͬ��ͨѶϵͳ");
      JMenu menu3=new JMenu("����ͨѶϵͳ");
      JMenu menu4=new JMenu("��ѯϵͳ");
      JMenu menu5=new JMenu("����ϵͳ");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      item1=new JMenuItem("ͬѧ������Ϣϵͳ");
      item2=new JMenuItem("ͬѧ��ϵ��ʽϵͳ");
      JMenuItem item3=new JMenuItem("�˳�ͨѶ¼ϵͳ");
      JMenuItem item4=new JMenuItem("ͬ�»�����Ϣϵͳ");
      JMenuItem item5=new JMenuItem("ͬ����ϵ��ʽϵͳ");
      JMenuItem item6=new JMenuItem("���ѻ�����Ϣϵͳ");
      JMenuItem item7=new JMenuItem("������ϵ��ʽϵͳ");
      JMenuItem item8=new JMenuItem("ͬѧ��ѯϵͳ");
      JMenuItem item9=new JMenuItem("ͬ�²�ѯϵͳ");
      JMenuItem item10=new JMenuItem("���Ѳ�ѯϵͳ");
      JMenuItem item11=new JMenuItem("�汾��Ϣ");
      JMenuItem item12=new JMenuItem("������Ϣ");
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
      JButton button1 = new JButton("ͬѧ��ѯϵͳ");
      JButton button2 = new JButton("ͬ�²�ѯϵͳ");
      JButton button3 = new JButton("���Ѳ�ѯϵͳ");
      closebutton1=new JButton("�ر�");
      closebutton2=new JButton("�ر�");
      closebutton3=new JButton("�ر�");
      addbutton1=new JButton("���ͬѧ��Ϣ����");
      addbutton2=new JButton("���ͬ����Ϣ����");
      addbutton3=new JButton("���������Ϣ����");
      delbutton1=new JButton("ɾ��ͬѧ��Ϣ����");
      delbutton2=new JButton("ɾ��ͬ����Ϣ����");
      delbutton3=new JButton("ɾ��������Ϣ����");
      updatebutton1=new JButton("����ͬѧ��Ϣ����");
      updatebutton2=new JButton("����ͬ����Ϣ����");
      updatebutton3=new JButton("����������Ϣ����");
///�����ܰ�ť�����ӵ�������
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
///��JTabbedPane�����ӵ���������ڵ��м�λ�ã���������ӡ�ɾ���͸��������������ӵ������������ײ�	
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
        	  ///��������ѯϵͳ�е�ͬѧ��ѯϵͳ���ᵯ��ǰ����Ƶ�ͬѧ��ϵ��ʽ��	
        	  classmatecommunication cc=new classmatecommunication();
        	  p.add("Center",cc.pane);
        	  cc.pane.setVisible(true);
          }
      });
      item3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///���һ���Ի���ϵͳ�������Ҫ�˳�ϵͳ�Ļ������������ʧ
        		int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///��JTabbedPane�����ӵ���������ڵ��м�λ�ã���������ӡ�ɾ���͸��������������ӵ������������ײ�	
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
///��������ѯϵͳ�е�ͬ�²�ѯϵͳ���ᵯ��ǰ����Ƶ�ͬ����ϵ��ʽ��
        	  companycommunication cc1=new companycommunication();
        	  p.add("Center",cc1.pane);
        	  cc1.pane.setVisible(true);
          }
      });
      item6.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        ///��JTabbedPane�����ӵ���������ڵ��м�λ�ã���������ӡ�ɾ���͸��������������ӵ������������ײ�	
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
///��������ѯϵͳ�е����Ѳ�ѯϵͳ���ᵯ��ǰ����Ƶ�������ϵ��ʽ��
        	  friendcommunication fc=new friendcommunication();
        	  p.add("Center",fc.pane);
        	  fc.pane.setVisible(true);
          }
      });
      item8.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///��������ѯϵͳ�е�ͬѧ��ѯϵͳ���ᵯ��ǰ����Ƶ�ͬѧ��ѯ��
        	  classmatefind cf=new classmatefind();
        	  p.add("Center",cf.pane);
        	  cf.pane.setVisible(true);
        	  
          }
      });
      item9.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///��������ѯϵͳ�е�ͬ�²�ѯϵͳ���ᵯ��ǰ����Ƶ�ͬ�²�ѯ��
        	  companyfind cf1=new companyfind();
        	  p.add("Center",cf1.pane);
        	  cf1.pane.setVisible(true);
          }
      });
      item10.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///��������ѯϵͳ�е����Ѳ�ѯϵͳ���ᵯ��ǰ����Ƶ����Ѳ�ѯ��
        	  friendfind ff=new friendfind();
        	  p.add("Center",ff.pane);
        	  ff.pane.setVisible(true);
          }
      });
      item11.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///ͨ���汾��Ϣ�Ĺ�����������һ���汾��Ϣ�Ŀ��
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
///ʵ�ֹ������е�ͬѧ��ѯϵͳ
        	  classmatefind cf=new classmatefind();
        	  p.add("Center",cf.pane);
        	  cf.pane.setVisible(true);
        	  
              
          }
      });
      button2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///ʵ�ֹ������е�ͬ�²�ѯϵͳ
        	  companyfind cf1=new companyfind();
        	  p.add("Center",cf1.pane);
        	  cf1.pane.setVisible(true);

          }
      });
      button3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///ʵ�ֹ������е����Ѳ�ѯϵͳ
        	  friendfind ff=new friendfind();
        	  p.add("Center",ff.pane);
        	  ff.pane.setVisible(true);
          }
      });
      closebutton1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///�������ڹرչ��ܵ�ʵ����ͨ��������Ƴ��ķ�ʽ
             tab1.setVisible(false);
             p1.setVisible(false);
          }
      });
      closebutton2.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {   
///�������ڹرչ��ܵ�ʵ����ͨ��������Ƴ��ķ�ʽ
        	  tab2.setVisible(false);
              p2.setVisible(false);
          }
      });
      closebutton3.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
///�������ڹرչ��ܵ�ʵ����ͨ��������Ƴ��ķ�ʽ
        	  tab3.setVisible(false);
              p3.setVisible(false);
          }
      });
      addbutton1.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///ͨ��������������һ����ӹ��ܵĿ�ܴ���
    		  new addclassmate();
    		  
    	  }
      });
      addbutton2.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///ͨ��������������һ����ӹ��ܵĿ�ܴ���
    		new addcompany();
    		 }
      });
      addbutton3.addActionListener(new ActionListener()
      {
    	  public void actionPerformed(ActionEvent Event)
    	  {
///ͨ��������������һ����ӹ��ܵĿ�ܴ���
    		  new addfriend();
    	  }
      });
      delbutton1.addActionListener(new ActionListener()
      {
   	  public void actionPerformed(ActionEvent Event)
    	  {
///ͨ������������һ��ɾ������ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����ɾ������","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///ͨ������������һ��ɾ������ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����ɾ������","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///ͨ������������һ��ɾ������ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����ɾ������","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///ͨ���������������¹��ܵ�ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����Ҫ���´���","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///ͨ���������������¹��ܵ�ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����Ҫ���´���","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
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
///ͨ���������������¹��ܵ�ģ��
    		  int i=JOptionPane.showConfirmDialog(null,"�Ƿ����Ҫ���´���","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
    	    	if(i==0)
    	    	{
    		  new updatefriend();
    	    	}
    	  }
      });
    }
}
