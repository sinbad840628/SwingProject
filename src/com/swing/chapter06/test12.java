import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.*;
public class  test12 extends JTabbedPane
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
                                  
    test12()
    {
    	   JFrame frame=new JFrame();
    	   frame.setTitle("面板综合测试窗口");
    	   frame.setSize(WIDTH,HEIGHT);
    	   frame.setVisible(true);
    	   frame.setContentPane(this);
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        int x=(width-WIDTH)/2;
        int y=(height-HEIGHT)/2;
        frame.setLocation(x,y);
        
        studentinfo info=new studentinfo();
        addTab("info", info);
  	    setEnabledAt(0,true);
  	    setTitleAt(0,"基本信息");    	
    }
    public static void main(String[] args)
    {
    	new test12();
    }
}
class studentinfo extends JPanel
{
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }          
	studentinfo()
	{
		JLabel name=new JLabel("姓名");
		JLabel sexy=new JLabel("性别");
		JLabel age=new JLabel("年龄");
		JLabel birthday=new JLabel("出生年月");
		JLabel address=new JLabel("家庭地址");
		JTextField nameinput=new JTextField(10);
		JTextField sexyinput=new JTextField(10);
		JTextField ageinput=new JTextField(10);
		JTextField birthdayinput=new JTextField(10);
		JTextField addressinput=new JTextField(10);
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		GridBagConstraints constraints=new GridBagConstraints();
	    constraints.fill=GridBagConstraints.NONE;
	    constraints.weightx=2;
	    constraints.weighty=5;
	    add(name,constraints,0,0,1,1);
	    add(nameinput,constraints,1,0,1,1);
	    add(sexy,constraints,0,1,1,1);
	    add(sexyinput,constraints,1,1,1,1);
	    add(age,constraints,0,2,1,1);
	    add(ageinput,constraints,1,2,1,1);
	    add(birthday,constraints,0,3,1,1);
	    add(birthdayinput,constraints,1,3,1,1);
	    add(address,constraints,0,4,1,1);
	    add(addressinput,constraints,1,4,1,1);
	}
}
