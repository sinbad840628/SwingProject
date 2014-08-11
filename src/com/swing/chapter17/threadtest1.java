//这段程序代码主要为读者展示如何取消背景任务
import java.awt.*;
import java.util.List;
import javax.swing.*;
public class threadtest1 
{
	static final int WIDTH=600;
	static final int HEIGHT=800;
	JFrame frame;
	JPanel pane;
	static JTextField text1;
	static worker wor1;
	static worker wor2;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        ………………………………..//与上例中相同位置内容相同
    }
	public threadtest1()
	{
		………………………………..//与上例中相同位置内容相同

	button1.addActionListener
	(//将计数工作放入工作线程，然后执行它
new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	(wor1 = new worker()).execute();
        }
    }
	);

    button2.addActionListener
    (//将计数工作放入工作线程，然后执行它
    new ActionListener()
    {
        public void actionPerformed(ActionEvent Event) 
        {
        	(wor2 = new worker()).execute();
        }	
    } 
    );

    button3.addActionListener
    (//当单击此按钮时，后台计数会停止，并且会将目前的数据显示在文本组件中。
    new ActionListener()
    {
    	public void actionPerformed(ActionEvent Event) 
        {
    		wor1.cancel(true);
			wor1 = null;	
        }	
    }
    );
    button4.addActionListener
    (//当单击此按钮时，后台计数会停止，并且会将目前的数据显示在文本组件中。
    new ActionListener()
    {
        public void actionPerformed(ActionEvent Event) 
        {
        	wor2.cancel(true);
			wor2 = null;		
        }	
    }
    );
    button5.addActionListener
    (
    new ActionListener()
    {
        public void actionPerformed(ActionEvent Event) 
        {
        	
        	wor1.cancel(true);	
        	wor2.cancel(true);
        }	
    }
    );
	}
	private static class counter 
	{
		private final int sum;

		counter(int sum) 
		{
			this.sum=sum;
		}
	}
	private class worker extends SwingWorker<Void, counter> 
	{
		protected Void doInBackground() 
		{
			int sum = 0;
			while (!isCancelled()) 
			{
				sum++;
			}
			publish(new counter(sum));
			return null;
		}

		protected void process(List<counter> count) 
		{
			counter cou = count.get(count.size() - 1);
			
			text1.setText(String.format("%d", cou.sum));
		}
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() 
{
				wor1.cancel(true);	
	          	wor2.cancel(true);
				new threadtest1();
			}
		});
	}
	
}
