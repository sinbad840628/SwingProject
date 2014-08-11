//这段程序代码主要是为读者展示如何为组件指定默认焦点
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test9  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button;
 public test9() 
 {
    	  JFrame frame=new JFrame("焦点测试程序");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  button=new JButton("测试按钮");
		  pane.add(button);
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
		  
		  frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button.requestFocusInWindow();//让按钮组件在窗口被激活时，立即获得动作焦点
			  }
		  });
    }
public static void main(String args[]) 
{
  new test9();
 }
}
