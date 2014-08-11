import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;
public class test5
{
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JTextField text;
	private worker wor1;
	test5()
	{
		JFrame frame=new JFrame();
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setTitle("临时任务测试窗口");
		JPanel pane=new JPanel();
		text=new JTextField(10);
		JButton button1=new JButton("开始计算");
		JButton button2=new JButton("获得临时的结果");
		pane.setLayout(new GridLayout(3,1));
		pane.add(text);
		pane.add(button1);
		pane.add(button2);
		frame.setContentPane(pane);
		
		button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
            	(wor1 = new worker()).execute();
            }
        });
		button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   	
            	wor1.cancel(true);
    			wor1 = null;		
			}
        });
	}
        ///创建一个内部类，使用其构造器赋值
		private static class counter 
		{
			private final int sum;

			counter(int sum) 
			{
				this.sum=sum;
			}
		}
        ///创建一个worker类，这个类继承SwingWorker类，所以要实现doInBackground()和process()方法。
		private class worker extends SwingWorker<Void, counter> 
		{
        ///这个方法主要是实现一个计数功能
			protected Void doInBackground() 
			{
				int sum = 0;
				while (!isCancelled()) 
				{
					sum++;
				}
            ///使用publish()方法将中间数据储存起来
				publish(new counter(sum));
				return null;
			}

           ///这个方法主要是将中间数据从publish()方法中提取出来，在放入到事件分发线程中去显示
			protected void process(List<counter> count) 
			{
				counter cou = count.get(count.size() - 1);
				
				text.setText(String.format("%d", cou.sum));
			}
		}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new test5();
			}
		});
	}
}
