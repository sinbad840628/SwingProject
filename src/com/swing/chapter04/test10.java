//这个程序代码主要是为读者展示、单选按钮组件的创建，以及单选按钮组件的“setEnable()”方法的使用
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class test10 extends JPanel
{
	　　static final int WIDTH=300;
    static final int HEIGHT=200;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;
    JRadioButton r6;
    test10()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("测试窗口");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
        r1=new JRadioButton("男");
        r2=new JRadioButton("女");
        r3=new JRadioButton("初中");
        r4=new JRadioButton("高中");
        r5=new JRadioButton("本科");
        r6=new JRadioButton("硕士");
        JLabel label1=new JLabel("性别");
        JLabel label2=new JLabel("学历");
        
        frame.setContentPane(this);
        setLayout(new GridLayout(5,2));
        add(label1);
        add(new JLabel());
        add(r1);
        add(r2);
        add(label2);
        add(r3);
        add(r4);
        add(r5);
        add(r6);
        r1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r2.setEnabled(false);
        	}
        });
        r2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r1.setEnabled(false);
        	}
        });
        r3.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r5.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r4.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r3.setEnabled(false);
        		r5.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r5.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r3.setEnabled(false);
        		r6.setEnabled(false);
        	}
        });
        r6.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		r4.setEnabled(false);
        		r5.setEnabled(false);
        		r3.setEnabled(false);
        	}
        });
    }
    public static void main(String[] args)
    {
    	new test10();
    }
}
