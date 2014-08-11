//这段程序代码主要为读者展示如何使用遍历策略来规范众多组件的焦点子系统
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Download by http://www.codefans.net
public class test11  
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
	static final int HEIGHT=300;
	static JButton button1;
	static JButton button2;
	static JButton button3;
	static JButton button4;
	static JButton button5;
	static JButton button6;
	static JButton button7;
    public test11() 
    {
    	  JFrame frame=new JFrame("焦点测试程序");
    	  JPanel pane=new JPanel();
		  frame.setContentPane(pane);
		  button1=new JButton("测试按钮一");
		  button2=new JButton("测试按钮二");
		  button3=new JButton("测试按钮三");
		  button4=new JButton("测试按钮四");
		  button5=new JButton("测试按钮五");
		  button6=new JButton("测试按钮六");
		  button7=new JButton("测试按钮七");
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
		  framefocus focus1=new framefocus();
		  frame.setFocusTraversalPolicy(focus1);
		  
		  frame.addWindowListener(new WindowAdapter()
		  {
			  public void windowActivated(WindowEvent e)
			  {
				  button1.requestFocusInWindow();
			  }
		  });

    }
public static void main(String args[]) 
{
  new test11();
 }
}
class framefocus extends FocusTraversalPolicy
{//焦点遍历策略，这里是向后遍历，也就是说当按TAB键时，当前按钮组件的下一个按钮组件是哪一个
	public Component getComponentAfter(Container arg0, Component arg1)
	{
		
		if(arg1.equals(test.button1))//如果当前组件是按钮一的话，则下一个遍历对象则是按钮二
		{
			return test.button2;
		}
		else if(arg1.equals(test.button2))
		{
			return test.button4;
		}
		else if(arg1.equals(test.button4))
		{
			return test.button3;
		}
		else if(arg1.equals(test.button3))
		{
			return test.button5;
		}
		else if(arg1.equals(test.button5))
		{
			return test.button7;
		}
		else if(arg1.equals(test.button7))
		{
			return test.button6;
		}
		return test.button1;
	}

	public Component getComponentBefore(Container arg0, Component arg1) 
	{//焦点遍历策略，这里是向前遍历，也就是说当按TAB键时，当前按钮组件的下一个按钮组件是哪一个
		if(arg1.equals(test.button6))
		{
			return test.button7;
		}
		else if(arg1.equals(test.button7))
		{
			return test.button5;
		}
		else if(arg1.equals(test.button5))
		{
			return test.button3;
		}
		else if(arg1.equals(test.button3))
		{
			return test.button4;
		}
		else if(arg1.equals(test.button4))
		{
			return test.button2;
		}
		else if(arg1.equals(test.button2))
		{
			return test.button1;
		}
		return test.button1;
	}

	public Component getDefaultComponent(Container arg0) 
	{
		
		return test.button1;
	}

	public Component getFirstComponent(Container arg0) 
	{
	
		return test.button1;
	}

	public Component getLastComponent(Container arg0)
	{
		
		return test.button6;
	}
}
