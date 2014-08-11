//这个实例主要是创建五个按钮组件，这个五个按钮组件上的文本将会通过不同HTML文档，使其展现出不同的外观
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class test1 
{
	static final int WIDTH=700;
	static final int HEIGHT=400;
  public static void main(String[] args)
  {
	  JFrame frame=new JFrame("<html><b>HTML文本测试程序</b></html>");//创建一个顶层容器类对象，并且其标题使用粗体
	  Toolkit kit=Toolkit.getDefaultToolkit();
	  Dimension screenSize=kit.getScreenSize();
	  int width=screenSize.width;
	  int height=screenSize.height;
	  int x=(width-WIDTH)/2;
	  int y=(height-HEIGHT)/2;
	  frame.setLocation(x,y);
   frame.setSize(WIDTH, HEIGHT);
	  frame.setVisible(true);
	  frame.pack();
	  JButton button1=new JButton("<html><b>第一个按钮组件</b><br>"+"<font color=red>测试一</font></html>");//创建五个按钮组件，每个按钮组件上面的文字外观、颜色不一样
	  JButton button2=new JButton("<html><b>第二个按钮组件</b><br>"+"<font color=blue>测试二</font></html>");
	  JButton button3=new JButton("<html><b>第三个按钮组件</b><br>"+"<font color=green>测试三</font></html>");
	  JButton button4=new JButton("<html><b>第四个按钮组件</b><br>"+"<font color=orange>测试四</font></html>");
	  JButton button5=new JButton("<html><b>第五个按钮组件</b><br>"+"<font color=grey>测试五</font></html>");
	  JPanel panel=new JPanel();
	  panel.add(button1);
	  panel.add(button2);
	  panel.add(button3);
	  panel.add(button4);
	  panel.add(button5);
	  frame.setContentPane(panel);
  }
}
