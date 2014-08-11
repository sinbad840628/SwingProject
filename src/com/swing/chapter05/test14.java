import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
public class test14 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
                     
    test14()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("学生信息窗口");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	frame.setContentPane(this);
    	
    	student st=new student();
    	JPanel pane2=new JPanel();
    	JPanel pane3=new JPanel();
    	
    	JLabel Title=new JLabel("学生信息窗口");
    	
    	
    	
    	JLabel title1=new JLabel("评   语");
    	JTextArea comment=new JTextArea(10,10);
    	
    	JLabel title2=new JLabel("功能区");
    	JButton add=new JButton("添加");
    	JButton del=new JButton("删除");
    	JButton find=new JButton("查询");
    	JButton close=new JButton("关闭");
    	
    	
        
        pane2.setLayout(new BorderLayout());
        pane2.add(title1,"North");
        pane2.add(comment,"Center");
        
        pane3.setLayout(new GridLayout(5,1));
        pane3.add(title2);
        pane3.add(add);
        pane3.add(del);
        pane3.add(find);
        pane3.add(close);
        
        setLayout(new BorderLayout());
        add(Title,"North");
        add(st,"West");
        add(pane2,"Center");
        add(pane3,"East"); 	
    }
    public static void main(String[] args)
    {
    	new test14();
    }
}
//创建一个类，通过这个类将学生基本信息的组件按网格组布局方式布局
class student extends JPanel
{
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
     }               
	student()
	{
		JLabel title=new JLabel("学生基本信息");
    	JLabel name=new JLabel("姓名");
    	JLabel sexy=new JLabel("性别");
    	JLabel birthday=new JLabel("出生年月");
    	JLabel address=new JLabel("家庭地址");
    	JTextField nameinput=new JTextField(5);
    	JTextField sexyinput=new JTextField(5);
    	JTextField birthdayinput=new JTextField(5);
    	JTextField addressinput=new JTextField(5);
		GridBagLayout lay=new GridBagLayout();  
		setLayout(lay);
    	GridBagConstraints constraints=new GridBagConstraints();
      constraints.fill=GridBagConstraints.NONE;
      constraints.anchor=GridBagConstraints.EAST;
      constraints.weightx=2;
      constraints.weighty=4;
      add(title,constraints,0,0,4,1);
      add(name,constraints,0,1,1,1);
      add(nameinput,constraints,1,1,1,1);
      add(sexy,constraints,0,2,1,1);
      add(sexyinput,constraints,1,2,1,1);
      add(birthday,constraints,0,3,1,1);
      add(birthdayinput,constraints,1,3,1,1);
      add(address,constraints,0,4,1,1);
      add(addressinput,constraints,1,4,1,1);
	}
}
