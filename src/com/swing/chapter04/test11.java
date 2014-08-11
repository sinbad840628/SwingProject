//这个程序代码主要是为读者展示如何创建复选框按钮组件以及复选框按钮组件的“setEnable()”方法的使用
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class test11 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=200;
    JCheckBox jc1;
    JCheckBox jc2;
    JCheckBox jc3;
    JCheckBox jc4;
    JCheckBox jc5;
    JCheckBox jc6;
    test11()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("测试窗口");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
        jc1=new JCheckBox("男");
        jc2=new JCheckBox("女");
        jc3=new JCheckBox("初中");
        jc4=new JCheckBox("高中");
        jc5=new JCheckBox("本科");
        jc6=new JCheckBox("硕士");
        JLabel label1=new JLabel("性别");
        JLabel label2=new JLabel("学历");
        
        frame.setContentPane(this);
        setLayout(new GridLayout(5,2));
        add(label1);
        add(new JLabel());
        add(jc1);
        add(jc2);
        add(label2);
        add(jc3);
        add(jc4);
        add(jc5);
        add(jc6);
        jc1.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc2.setEnabled(false);
        	}
        });
        jc2.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc1.setEnabled(false);
        	}
        });
        jc3.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc4.setEnabled(false);
        		jc5.setEnabled(false);
        		jc6.setEnabled(false);
        	}
        });
        jc4.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc3.setEnabled(false);
        		jc5.setEnabled(false);
        		jc6.setEnabled(false);
        	}
        });
        jc5.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc4.setEnabled(false);
        		jc3.setEnabled(false);
        		jc6.setEnabled(false);
        	}
        });
        jc6.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent Event)
        	{
        		jc4.setEnabled(false);
        		jc5.setEnabled(false);
        		jc3.setEnabled(false);
        	}
        });
    }
    public static void main(String[] args)
    {
    	new test11();
    }
}
