//这段程序代码主要是为读者展示如何创建一个进度条组件
import javax.swing.*;
import java.awt.*;
public class test1
{
static final int WIDTH=300;
    static final int HEIGHT=200;
public static void main(String[] args)
	   {
		JFrame jf=new JFrame("添加内容面板测试程序");
	     jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     JProgressBar pb=new JProgressBar();//创建一个进度条对象
	     contentPane.add(pb);     
	}
}
