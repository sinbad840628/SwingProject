import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class test8
{
	static JButton b;
	test8()
	{
		JFrame frame=new JFrame();
		frame.setSize(30,30);
		frame.setVisible(true);
		JPanel pane=new JPanel();
		b=new JButton();
		pane.add(b);
		frame.setContentPane(pane);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
            {
				install t=new install();
				t.timer.start();

				
		        }
            
		});
	}
		public static void main(String[] args)
		{
			new test8();
		}
	}
	class install implements ActionListener
	{
		 JFrame f ;
		 JProgressBar progressbar;
		 JLabel label;
		 Timer timer;

		install()
		{
			f = new JFrame("progressbar Example");
	        Container contentPane = f.getContentPane();
	        label = new JLabel("ģ�ⰲװ����");
	        progressbar = new JProgressBar();//����һ��������
	        progressbar.setOrientation(JProgressBar.HORIZONTAL);//�����䷽��Ϊˮƽ����
	        progressbar.setMinimum(0);//��С�̶�0
	        progressbar.setMaximum(100);//���̶�100
	        progressbar.setValue(0);
	        progressbar.setStringPainted(true);
	        
	        progressbar.setPreferredSize(new Dimension(200,30));
	        JPanel panel = new JPanel();
	      
	        
	        timer = new Timer(50,this);//����һ���¼��������
	        contentPane.add(panel,BorderLayout.NORTH);
	        contentPane.add(progressbar,BorderLayout.CENTER);
	        contentPane.add(label,BorderLayout.SOUTH);
	        f.pack();
	        f.setVisible(true);
	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        });

		}
		public void actionPerformed(ActionEvent e) 
		{	
			if(e.getSource() == timer)
	        {
	            int value = progressbar.getValue();
	            if( value < 100)
	            {
	                value++;//��������ǰ�˶�
	                progressbar.setValue(value);
	            }
	            else
	            {
	                timer.stop();
	                progressbar.setValue(0);
	            }
	        }
			
		}

	}
