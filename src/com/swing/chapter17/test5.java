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
		frame.setTitle("��ʱ������Դ���");
		JPanel pane=new JPanel();
		text=new JTextField(10);
		JButton button1=new JButton("��ʼ����");
		JButton button2=new JButton("�����ʱ�Ľ��");
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
        ///����һ���ڲ��࣬ʹ���乹������ֵ
		private static class counter 
		{
			private final int sum;

			counter(int sum) 
			{
				this.sum=sum;
			}
		}
        ///����һ��worker�࣬�����̳�SwingWorker�࣬����Ҫʵ��doInBackground()��process()������
		private class worker extends SwingWorker<Void, counter> 
		{
        ///���������Ҫ��ʵ��һ����������
			protected Void doInBackground() 
			{
				int sum = 0;
				while (!isCancelled()) 
				{
					sum++;
				}
            ///ʹ��publish()�������м����ݴ�������
				publish(new counter(sum));
				return null;
			}

           ///���������Ҫ�ǽ��м����ݴ�publish()��������ȡ�������ڷ��뵽�¼��ַ��߳���ȥ��ʾ
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
