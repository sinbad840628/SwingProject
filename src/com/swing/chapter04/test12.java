import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class test12 extends JPanel
{
	   static final int WIDTH=300;
    static final int HEIGHT=200;
    JCheckBox jc1;
    JCheckBox jc2;
    JCheckBox jc3;
    JCheckBox jc4;
    JCheckBox jc5;
    JCheckBox jc6;
    test12()
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
        JButton button1=new JButton("确认性别");
        JButton button2=new JButton("确认学历");
        
        frame.setContentPane(this);
        setLayout(new GridLayout(5,2));
        add(label1);
        add(button1);
        add(jc1);
        add(jc2);
        add(label2);
        add(button2);
        add(jc3);
        add(jc4);
        add(jc5);
        add(jc6);
        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	if(jc1.isSelected())
            	{
            		jc2.setEnabled(false);
            	}
                if(jc2.isSelected())
            	{
                     jc1.setEnabled(false);
            	}
            }
        });
        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
            	if(jc3.isSelected())
            	{
            		jc4.setEnabled(false);
            		jc5.setEnabled(false);
            		jc6.setEnabled(false);
            	}
            	else if(jc4.isSelected())
            	{
            		jc3.setEnabled(false);
            		jc5.setEnabled(false);
            		jc6.setEnabled(false);
            	}
            	else if(jc5.isSelected())
            	{
            		jc4.setEnabled(false);
            		jc3.setEnabled(false);
            		jc6.setEnabled(false);
            	}
            	else if(jc6.isSelected())
            	{
            		jc4.setEnabled(false);
            		jc3.setEnabled(false);
            		jc5.setEnabled(false);
            	}
         
            }
        });
    }
    public static void main(String[] args)
    {
    	new test12();
    }
}
