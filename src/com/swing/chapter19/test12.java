package com.swing.chapter19;

//��γ��������ҪΪ����չʾ���Ϊ���ָ�����󶨹���
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
public class test12  
{
private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    static JFrame f;
    JMenuItem item1;
    JPanel p;
    static JTabbedPane tp;
    public test12() 
    {
    	JFrame frame=new JFrame("�߿���Գ���");
		  Toolkit kit=Toolkit.getDefaultToolkit();
		  Dimension screenSize=kit.getScreenSize();
		  int width=screenSize.width;
		  int height=screenSize.height;
		  int x=(width-WIDTH)/2;
		  int y=(height-HEIGHT)/2;
		  frame.setLocation(x,y);
	      frame.setSize(WIDTH, HEIGHT);
		  frame.setVisible(true);
		  frame.pack();
		  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  pane.setBorder(BorderFactory.createLineBorder(Color.red));//�����������ı߿����ɫΪ��ɫ
		  //��19.4�е�ʵ����ͬλ�üӺڲ���������ͬ
      buttonAction buttonaction=new buttonAction("ĥɰ�ֳ�ְ����Ϣ");
      button1.setAction(buttonaction);
      menuAction menuaction=new menuAction("�˳�");
      item4.setAction(menuaction);
///����ݼ�Bͬbutton1�󶨣�Ҳ����˵������B�����൱�ڵ���button1��ť�����
      button1.getInputMap(2).put(KeyStroke.getKeyStroke("B"), "open");
      button1.getActionMap().put("open", buttonaction);
      item4.getInputMap(2).put(KeyStroke.getKeyStroke("A"), "QUIT");
      item4.getActionMap().put("QUIT", menuaction);
    }
public static void main(String args[]) 
{
  new test12();
 }
}
class info extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	info()
	{  
		����������������������//��19.4�е�ʵ����ͬλ�üӺڲ���������ͬ
	}
}
class buttonAction extends AbstractAction
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public buttonAction(String text)
	{
		  super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		   ����������������������//��19.4�е�ʵ����ͬλ�üӺڲ���������ͬ
	}
}
class menuAction extends AbstractAction
{
	public menuAction(String text)
	{
		super(text);
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
    	if(i==0)
    	{
    		test.f.dispose();
    	}
		
	}
}
