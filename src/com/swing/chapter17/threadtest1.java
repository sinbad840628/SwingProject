//��γ��������ҪΪ����չʾ���ȡ����������
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
        ������������������������..//����������ͬλ��������ͬ
    }
	public threadtest1()
	{
		������������������������..//����������ͬλ��������ͬ

	button1.addActionListener
	(//�������������빤���̣߳�Ȼ��ִ����
new ActionListener()
    {
        public void actionPerformed(ActionEvent e) 
        {
        	(wor1 = new worker()).execute();
        }
    }
	);

    button2.addActionListener
    (//�������������빤���̣߳�Ȼ��ִ����
    new ActionListener()
    {
        public void actionPerformed(ActionEvent Event) 
        {
        	(wor2 = new worker()).execute();
        }	
    } 
    );

    button3.addActionListener
    (//�������˰�ťʱ����̨������ֹͣ�����һὫĿǰ��������ʾ���ı�����С�
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
    (//�������˰�ťʱ����̨������ֹͣ�����һὫĿǰ��������ʾ���ı�����С�
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
