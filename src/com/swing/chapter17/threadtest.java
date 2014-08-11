//这段代码主要是为读者展示如何处理正在运行的程序的中间结果
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
public class threadtest 
{
	static final int WIDTH=600;
	static final int HEIGHT=800;
	JFrame frame;
	JPanel pane;
	static JTextField text1;
	private worker wor1;
	private worker wor2;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        pane.add(c,constraints);
    }
	public threadtest()
	{
		frame=new JFrame("中间结果任务测试");
		pane=new JPanel();
		frame.setContentPane(pane);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocation(x,y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
		GridBagLayout layout=new GridBagLayout();
        pane.setLayout(layout);
        GridBagConstraints  constraints=new GridBagConstraints();
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.EAST;
        constraints.weightx=4;
        constraints.weighty=3; 
        JButton button1=new JButton("运行后台计数器一");
        JButton button2=new JButton("运行后台计数器二");
        JButton button3=new JButton("临时结果操作一");
        JButton button4=new JButton("临时结果操作二");
        text1=new JTextField(10);
        add(button1,constraints,1,0,1,1);
        add(button3,constraints,0,1,1,1);
        add(text1,constraints,2,1,1,1);
        add(button2,constraints,1,2,1,1);
        add(button4,constraints,0,3,1,1);
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
	}

	private static class counter 
	{//创建一个内部类，使用其构造器赋值
		private final int sum;

		counter(int sum) 
		{
			this.sum=sum;
		}
	}

	private class worker extends SwingWorker<Void, counter> 
	{//创建一个worker类，这个类继承SwingWorker类，所以要实现doInBackground()和process()方法。这个方法主要是实现一个计数功能
		protected Void doInBackground() 
		{
			int sum = 0;
			while (!isCancelled()) 
			{
				sum++;
			}
			publish(new counter(sum)); //使用publish()方法将中间数据储存起来
			return null;
		}
		protected void process(List<counter> count) 
		{//这个方法主要是将中间数据从publish()方法中提取出来，在放入到事件分发线程中去显示
			counter cou = count.get(count.size() - 1);
			text1.setText(String.format("%d", cou.sum));
		}
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new threadtest();
			}
		});
	}
	
}
