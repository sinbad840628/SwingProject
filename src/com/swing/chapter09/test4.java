//这段程序代码主要是为读者展示创建滑块的方法
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test4 
{
	   static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
    	JFrame jf=new JFrame("如何使用滑块");
    	jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     JSlider s=new JSlider(0,100,0);//创建一个滑块对象
	     contentPane.add(s);     
	     s.setMajorTickSpacing(20);//设置主刻度
	     s.setMinorTickSpacing(5);//设置次刻度
	     s.setPaintTicks(true);//让刻度显现出来
	     s.setSnapToTicks(true);//让滑块滑到附近的整数处
	     s.setPaintLabels(true);//让刻度上的数字显示出来
      }
}
