package com.swing.chapter20;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class version extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=200;
    static final int HEIGHT=100;
    JFrame versionframe;
    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
}          
    version()
    {
      versionframe=new JFrame("ͨѶ¼ϵͳ�汾��Ϣ");
      versionframe.setContentPane(this);
      versionframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      versionframe.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      versionframe.setLocation(x,y);
      versionframe.setVisible(true);
      GridBagConstraints constraints=new GridBagConstraints();
      constraints.fill=GridBagConstraints.NONE;
      constraints.anchor=GridBagConstraints.EAST;
      constraints.weightx=3;
      constraints.weighty=2;
      JLabel label1=new JLabel("ͨѶ¼��Ϣϵͳ�汾��Ϣ");
      JLabel label2=new JLabel("������汾version 1.0");
      JLabel label3=new JLabel("���ߣ�����");
      add(label1,constraints,1,0,2,1);
      add(label2,constraints,1,1,2,1);
      add(label3,constraints,2,2,1,1);
    }
}
