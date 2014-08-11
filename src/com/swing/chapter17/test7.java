import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.*;
public class test7 extends Thread
{
	/**
	 * 
	 */
		public static void main(String[] args)
		{
			 try
			 {
			 SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						frame1 f=new frame1();
						try
					    {
					        f.sleep(3000);
					    }catch(Exception e){}
					}
				});
        
         }catch(Exception e){}		 
          new frame2();
		}
	
}
class frame1 extends Thread
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
