//这段程序代码为读者展示如何自定义一个边框
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class test6
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
