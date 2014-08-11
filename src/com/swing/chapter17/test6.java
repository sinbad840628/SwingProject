import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class test6 extends Thread
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=200;
	static final int HEIGHT=200;
	test6()
	{
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setSize(WIDTH,HEIGHT);
		JPanel pane=new JPanel();
		frame.setContentPane(pane);
		frame.setTitle("测试窗口");
		
		JButton button1=new JButton("打开第一个窗口");
		JButton button2=new JButton("打开第二个窗口");
		pane.add(button1);
		pane.add(button2);
		button1.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
			  SwingWorker work=new SwingWorker()
		      {

			    protected Object doInBackground() throws Exception 
			    {
				     try
				     {
					     sleep(10000);
				     }
				     catch(Exception e){}
	                 new frame1();  
	                 return null;
	            }
				 
	         };
			  work.execute();
	         }
		});
		button2.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
				 
	              new frame2();  
	         }
		});
	}
		public static void main(String[] args)
		{
			new test6();
		}
	
}
class frame1
{
	static final int WIDTH=200;
	static final int HEIGHT=200;
	frame1()
	{
		JFrame frame=new JFrame("测试窗口一");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
	}
}
class frame2
{
	static final int WIDTH=200;
	static final int HEIGHT=200;
	frame2()
	{
		JFrame frame=new JFrame("测试窗口二");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
	}
}
