//这段程序代码主要是为读者展示如何创建按钮组件和标签组件，并且将处理按钮组件的动作事件
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
public class test9 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=200;
    JTextField text1;
    JTextField text2;
    String str;
    Test9()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("测试窗口");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
    	text1=new JTextField(5);//这个文本组件用来输入带计算的数据
    	text2=new JTextField(5);//这个文本框用来显示计算结果
    	JLabel label1=new JLabel("平方");
    	JLabel label2=new JLabel("立方");
    	JLabel label3=new JLabel("四次方");
    	JButton button1=new JButton("平方结果");
    	JButton button2=new JButton("立方结果");
    	JButton button3=new JButton("四次方结果");
    	
    	frame.setContentPane(this);
    	setLayout(new GridLayout(4,2));//让面板具有GridLayout布局管理器，其知识在后面会有所介绍
    	add(text1);
    	add(text2);
    	add(label1);
    	add(button1);
    	add(label2);
    	add(button2);
    	add(label3);
    	add(button3);
    	button1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),2));
    		}
    	});
    	button2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),3));
    		}
    	});
    	button3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),4));
    		}
    	});
    	
    }
    public static void main(String[] args)
    {
    	new test9();
    }
}
