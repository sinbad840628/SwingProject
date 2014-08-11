//这段程序代码主要是创建一个登录窗口，唯一跟本章第一个实例不同的是这里将原来输入密码的文本域变成了密码文本框组件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
///这是一个登录类。设计成一个继承容器的类。
class login extends JPanel
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JFrame loginframe;

    public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
       constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);

}                                        ///这是一个构造器方法
    login()
    {
       …………………….//与本节第一例中相同位置内容相同
        final JPasswordField passwordinput=new JPasswordField(8);//创建一个JPasswordField对象
        …………………….//与本节第一例中相同位置内容相同
}
 class windowsclose extends JPanel
 {
	 JFrame jf;
 
	 windowsclose()
	 {
		   jf=new JFrame("确认窗口");
		   jf.setVisible(true);
		   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   jf.setContentPane(this);
		   JLabel l=new JLabel("真的要放弃登陆吗？");
		   JLabel l2=new JLabel();
		   JButton b1=new JButton("是");
		   JButton b2=new JButton("否");
		   GridBagConstraints constraints1=new GridBagConstraints();
	        constraints1.fill=GridBagConstraints.NONE;
	        constraints1.anchor=GridBagConstraints.EAST;
	        constraints1.weightx=3;
	        constraints1.weighty=3;
	        GridBagLayout layout=new GridBagLayout();
	        setLayout(layout);
	        add(l,constraints1,1,0,1,1);                 //使用网格组布局添加组件
	        add(b1,constraints1,0,1,1,1);
	        add(b2,constraints1,2,1,1,1);
	        add(l2,constraints1,1,1,1,1);
	        jf.pack();
	        b1.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	               jf.dispose();
	            }
	    });
	     b2.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	               jf.dispose();	               
	            }
	    });
	 }
	 public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
	    {
	        constraints.gridx=x;
	        constraints.gridy=y;
	        constraints.gridwidth=w;
	        constraints.gridheight=h;
	        add(c,constraints);
	   }           
 }
public class test
{
    public static void main(String[] args)
    {
        login log=new login();
    }
}
