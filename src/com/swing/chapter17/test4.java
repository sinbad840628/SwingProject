import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class test4 extends Thread
{
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JTextField text1;
	JTextField text2;
	test4()
	{
		………………………….//与上例中加黑部分内容相同
		button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
				         try
                        {
                        	sleep(10000);
                        }catch(Exception e){}
						new compute(1000000);
						text1.setText(""+compute.sum);
						
            }
        });
		button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent Event) 
            {   
			      		new compute(100);
						text2.setText(""+compute.sum);
					
			}
        });
        }
	public static void main(String[] args)
	{
		new test4();
	}
}
class compute
{
	static int sum=0;
	compute(int n)
	{
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
		}
	}
}
