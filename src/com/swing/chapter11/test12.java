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
		frame.setTitle("文本组件测试窗口");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		text=new JTextField(10);
		JLabel label=new JLabel("      输入数据，可以显示出相应的信息");
		show=new JLabel("只要你输入正确，才会显示出此信息");
		setLayout(new GridLayout(3,1));
		add(label);
		add(text);
		add(show);
		show.setVisible(false);
       ///下面的事情处理是键盘的事件处理，当在文本组件中输入信息，回车就会产生事件。
		text.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Event)
			{
                   ///输入文本后，回车就会在文本框中出现“输入正确”的字样，并且还会让show标签出现。
		           text.setText("输入正确");
		           show.setVisible(true);
			}
		});
	}
	public static void main(String[] args)
	{
		new test12();
	}
}
