import java.awt.event.ActionEvent;
import javax.swing.*;
public class test16 extends JPanel
{
	static final int WIDTH=300;
	static final int HEIGHT=400;
	test16()
	{
		JFrame frame=new JFrame();
		frame.setTitle("��ݼ����Գ���");
		frame.setSize(WIDTH,HEIGHT);
		frame.setVisible(true);
		frame.setContentPane(this);
		
		JMenuBar menubar=new JMenuBar();
		JMenu open=new JMenu("��");
		JMenuItem open1=new JMenuItem("�򿪵�һ������");
		JMenuItem open2=new JMenuItem("�򿪵ڶ�������");
		JMenuItem close=new JMenuItem("�رյ�һ����������");
		menubar.add(open);
		open.add(open1);
		open.add(open2);
		open.add(close);
		frame.setJMenuBar(menubar);
		menuAction1 menuaction1=new menuAction1("�򿪵�һ������");
		menuAction2 menuaction2=new menuAction2("�򿪵ڶ�������");
		menuAction3 menuaction3=new menuAction3("�رյ�һ����������");
		open1.setAction(menuaction1);
		open2.setAction(menuaction2);
		close.setAction(menuaction3);
		open1.getInputMap(2).put(KeyStroke.getKeyStroke("H"), "open1");
	    open1.getActionMap().put("open1", menuaction1);
	    open2.getInputMap(2).put(KeyStroke.getKeyStroke("G"), "open2");
	    open2.getActionMap().put("open2", menuaction2);
	    close.getInputMap(2).put(KeyStroke.getKeyStroke("F"), "close");
	    close.getActionMap().put("close", menuaction3);
	}
	public static void main(String[] args)
	{
		new test16();
	}
}
class frame1 extends JFrame
{
	static final int WIDTH=200;
	static final int HEIGHT=200;
	frame1()
	{
	    setTitle("��һ������");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
	}
}
class frame2 extends JFrame
{
	static final int WIDTH=200;
	static final int HEIGHT=200;
	frame2()
	{
		setTitle("�ڶ�������");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		JPanel pane=new JPanel();
		setContentPane(pane);
		JButton button=new JButton("���ǵڶ�������");
		pane.add(button);
	}
}
class menuAction1 extends AbstractAction
{
	static frame1 f1;
	public  menuAction1(String text)
	{
		super(text);
	}
	public void actionPerformed(ActionEvent arg0) {
		 f1=new frame1();
	}
}
class menuAction2 extends AbstractAction
{
	static frame2 f2;
	public menuAction2(String text)
	{
		super(text);
	}
	public void actionPerformed(ActionEvent arg0) {
		f2=new frame2();
	}
}
class menuAction3 extends AbstractAction
{
	public menuAction3(String text)
	{
		super(text);
	}
	public void actionPerformed(ActionEvent arg0) {
		menuAction1.f1.dispose();
		menuAction2.f2.dispose();
	}
}
