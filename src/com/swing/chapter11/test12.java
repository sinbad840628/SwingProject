import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class test12 extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
	static final int HEIGHT=300;
	JTextField text;
	JLabel show;
	test12()
	{
		JFrame frame=new JFrame();
		frame.setTitle("�ı�������Դ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		text=new JTextField(10);
		JLabel label=new JLabel("      �������ݣ�������ʾ����Ӧ����Ϣ");
		show=new JLabel("ֻҪ��������ȷ���Ż���ʾ������Ϣ");
		setLayout(new GridLayout(3,1));
		add(label);
		add(text);
		add(show);
		show.setVisible(false);
       ///��������鴦���Ǽ��̵��¼����������ı������������Ϣ���س��ͻ�����¼���
		text.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
                   ///�����ı��󣬻س��ͻ����ı����г��֡�������ȷ�������������һ�����show��ǩ���֡�
		           text.setText("������ȷ");
		           show.setVisible(true);
			}
		});
	}
	public static void main(String[] args)
	{
		new test12();
	}
}
