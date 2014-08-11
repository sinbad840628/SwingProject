//这段程序代码主要是为读者展示如何在众多的组件中为组件指定默认焦点
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test10  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button4;
 public test10() 
 {
    	  JFrame frame=new JFrame("焦点测试程序");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  JButton button1=new JButton("测试按钮一");
		  JButton button2=new JButton("测试按钮二");
		  JButton button3=new JButton("测试按钮三");
		  button4=new JButton("测试按钮四");
		  JButton button5=new JButton("测试按钮五");
		  JButton button6=new JButton("测试按钮六");
		  JButton button7=new JButton("测试按钮七");
		  pane.add(button1);
		  pane.add(button2);
		  pane.add(button3);
		  pane.add(button4);
		  pane.add(button5);
		  pane.add(button6);
		  pane.add(button7);
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
				  button4.requestFocusInWindow();//让窗口被激活时，button4按钮组件会自动获得焦点
			  }
		  });

    }
public static void main(String args[]) 
{
  new test10();
 }
}
