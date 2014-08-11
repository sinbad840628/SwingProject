//这段程序代码主要是为读者展示如何创建一个工具条组件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test9 extends JFrame 
{
	   private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    public test9() 
    {
    	   super("工具条测试窗口");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
///创建三个普通按钮组件
        JButton button1 = new JButton("图标一");
        JButton button2 = new JButton("图标二");
        JButton button3 = new JButton("图标三");
///创建一个工具条，再将上面创建的三个普通按钮组件添加到工具条中
        JToolBar bar = new JToolBar();
        bar.add(button1);   
        bar.add(button2);        
        bar.add(button3);
        JTextArea edit = new JTextArea(8,40);//创建一个文本区组件
        JScrollPane scroller = new JScrollPane(edit);
        JPanel pane = new JPanel();
        BorderLayout bord = new BorderLayout();
        pane.setLayout(bord);
        pane.add("North",bar);
        pane.add("Center",scroller);
        setContentPane(pane);
        pack();
        setVisible(true);
      }
public static void main(String args[]) {
	new test9();
 }
}
