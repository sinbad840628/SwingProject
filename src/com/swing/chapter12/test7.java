import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Download by http://www.codefans.net
import javax.swing.*;
import javax.swing.text.MaskFormatter;
public class test7  extends JPanel
{
	static final int WIDTH=200;
	static final int HEIGHT=300;
	MaskFormatter mf;
	JTextField text;
	JFormattedTextField text1;
	test7()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�Ի�����Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		JLabel label=new JLabel("�������û���");
		JLabel label1=new JLabel("�������½����");
		text=new JTextField();
		try
		{
		    mf = new MaskFormatter("###-##");
		    mf.setPlaceholderCharacter('_');
		}catch(Exception e){}

		text1=new JFormattedTextField(mf);
		JButton button=new JButton("��½");
		JButton button1=new JButton("����");
		setLayout(new GridLayout(3,2));
		add(label);
		add(text);
		add(label1);
		add(text1);
		add(button);
		add(button1);
		button.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent Event) 
	         {
				 if((text.getText().equals("wpzxl"))&&(text1.getText().equals("123-45")))
				 {
				 int i=JOptionPane.showConfirmDialog(null,"����һ���йص�½����Ϣ","����һ���й��йص�½�ĶԻ���", JOptionPane.YES_NO_CANCEL_OPTION);
				 if(i==0)
				 {
					 text.setText("******");
					 text1.setText("");
				 }
				 }
	         }
		});
		
	}
	public static void main(String[] args)
	{
		new test7();
	}
}
