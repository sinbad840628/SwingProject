import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Download by http://www.codefans.net
import javax.swing.*;
public class test13 extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JLabel show;
	JTextArea text;
	test13()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�ı������ӡ���Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		JMenuBar bar=new JMenuBar();
		JMenu system=new JMenu("ϵͳ�˵�");
	    bar.add(system);
	    JMenuItem print=new JMenuItem("��ӡ");
	    system.add(print);
	    frame.setJMenuBar(bar);
	    frame.setContentPane(this);
	    text=new JTextArea(20,27);
	    add(text);
	    print.addActionListener(new ActionListener()
	    {

			public void actionPerformed(ActionEvent event) 
			{
				 try
	    		 {
	    		 text.print();//�����ı��Ĵ�ӡ����
	    	  }
	    		 catch(Exception e){}
				
			}
	    	
	    });
	
	}
	public static void main(String[] args)
	{
		new test13();
	}
}
