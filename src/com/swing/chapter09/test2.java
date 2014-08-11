//这段程序代码主要是为读者展示使用“JProgressBar(int orient)”构造器创建一个带垂直方向的进度条组件
import javax.swing.*;
import java.awt.*;
public class test2
{
	static final int WIDTH=300;
    static final int HEIGHT=200;
	public static void main(String[] args)
	{
	     JFrame jf=new JFrame("进度条测试程序");
	     jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     JProgressBar pb=new JProgressBar(JProgressBar.VERTICAL);//创建一个垂直方向的进度条对象
	     contentPane.add(pb);     
	}
}
