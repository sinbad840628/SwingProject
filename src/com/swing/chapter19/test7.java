import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class test7
{
	 static final int WIDTH=600;
	 static final int HEIGHT=300;
public static void main(String[] args)
	{
		  JFrame frame=new JFrame("边框测试程序");
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
		  RedLineBorder border=new RedLineBorder();
		  pane.setBorder(border);
///创建了五个图标组件对象
		  ImageIcon icon1=new ImageIcon("d:/11.gif","picture");
		  ImageIcon icon2=new ImageIcon("d:/111.gif","picture");
		  ImageIcon icon3=new ImageIcon("d:/cash_sleep.gif","picture");
		  ImageIcon icon4=new ImageIcon("d:/cash_walk.gif","picture");
		  ImageIcon icon5=new ImageIcon("d:/btn_submit_registration.gif","picture");
///将五个图标对象分别加入到五个标签中
		  JLabel label1=new JLabel(icon1);
		  JLabel label2=new JLabel(icon2);
		  JLabel label3=new JLabel(icon3);
		  JLabel label4=new JLabel(icon4);
		  JLabel label5=new JLabel(icon5);
		  pane.add(label1);
		  pane.add(label2);
		  pane.add(label3);
		  pane.add(label4);
		  pane.add(label5);
	}
}
class RedLineBorder implements Border{
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){     
        g.setColor(Color.red);//设置为红色
        g.drawRect(x,y, width, height);//画出边框
    }
    public Insets getBorderInsets(Component c){
        return new Insets(1,1,1,1); //四周都是1
    }
    public boolean isBorderOpaque(){
        return false; //背景透明
    }
}
