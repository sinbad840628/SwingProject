//��δ�����Ҫ��Ϊ����չʾ��δ����������еĳ�����м���
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
		frame=new JFrame("�м����������");
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
        JButton button1=new JButton("���к�̨������һ");
        JButton button2=new JButton("���к�̨��������");
        JButton button3=new JButton("��ʱ�������һ");
        JButton button4=new JButton("��ʱ���������");
        text1=new JTextField(10);
        add(button1,constraints,1,0,1,1);
        add(button3,constraints,0,1,1,1);
        add(text1,constraints,2,1,1,1);
        add(button2,constraints,1,2,1,1);
        add(button4,constraints,0,3,1,1);
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
	}

	private static class counter 
	{//����һ���ڲ��࣬ʹ���乹������ֵ
		private final int sum;

		counter(int sum) 
		{
			this.sum=sum;
		}
	}

	private class worker extends SwingWorker<Void, counter> 
	{//����һ��worker�࣬�����̳�SwingWorker�࣬����Ҫʵ��doInBackground()��process()���������������Ҫ��ʵ��һ����������
		protected Void doInBackground() 
		{
			int sum = 0;
			while (!isCancelled()) 
			{
				sum++;
			}
			publish(new counter(sum)); //ʹ��publish()�������м����ݴ�������
			return null;
		}
		protected void process(List<counter> count) 
		{//���������Ҫ�ǽ��м����ݴ�publish()��������ȡ�������ڷ��뵽�¼��ַ��߳���ȥ��ʾ
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
