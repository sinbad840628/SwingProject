import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;
public class test9
{
	static JButton b;
	test9()
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


     Public static void main(String[] args)
{
    new test9();
}
	}
	class install implements ActionListener
	{
		 JFrame f ;
		 JProgressBar progressbar;
		 JLabel label;
		 Timer timer;
		 int value=100;
		install()
		{
		   f = new JFrame("progressbar Example");
	           Container contentPane = f.getContentPane();
	           label = new JLabel("ģ��ж�س���");
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
	            	if(value>0)
	            	{
	            	value--;//�����������˶�
	                progressbar.setValue(value);
	            }
	            else
	            {
	                timer.stop();
	                progressbar.setValue(100);
	            }
	        
		}
			
		}
	}
