import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Download by http://www.codefans.net
import javax.swing.*;
public class test15 extends JPanel
{
	static final int WIDTH=400;
	static final int HEIGHT=600;
	JTextArea text;
	test15()
	{
	    JFrame frame=new JFrame("简单文本组件");
	    frame.setContentPane(this);
	    frame.setSize(WIDTH,HEIGHT);
	    frame.setVisible(true);
	    setLayout(new BorderLayout());
	    JPanel pane=new JPanel();
	    text=new JTextArea(10,20);
	    add(text,"North");
	    add(pane,"Center");
	    pane.setLayout(new GridLayout(2,2));
	   
	    JButton button1=new JButton("拷贝");
	    JButton button2=new JButton("剪切");
	    JButton button3=new JButton("粘贴");
	    JButton button4=new JButton("打印");
	    
	    pane.add(button1);
	    pane.add(button2);
	    pane.add(button3);
	    pane.add(button4);
	    
	    button1.addActionListener(new ActionListener()
	    {

			public void actionPerformed(ActionEvent arg0) 
			{
				text.copy();
			}
	    	
	    });
	    button2.addActionListener(new ActionListener()
	    {

			public void actionPerformed(ActionEvent arg0) 
			{
				text.cut();
			}
	    	
	    });
	    button3.addActionListener(new ActionListener()
	    {

			public void actionPerformed(ActionEvent arg0) 
			{
				text.paste();
			}	
	    });
	    button4.addActionListener(new ActionListener()
	    {

			public void actionPerformed(ActionEvent arg0) 
			{
			 try
			 {
				text.print();
			 }
			 catch(Exception e){}
			}
	    	
	    });
	    
	}
	public static void main(String[] args)
	{
		new test15();
	}
}
