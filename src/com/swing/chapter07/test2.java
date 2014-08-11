//这段程序代码主要是为读者展示如何使用匿名类处理事件，通过将上例进行修改，使用匿名类处理动作事件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test2
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    static JTextField l=new JTextField(20);
    public static void main(String[] args)
    {
    	 JFrame jf=new JFrame("测试程序");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         contentPane.setLayout(new BorderLayout());
         jf.setContentPane(contentPane);
         JButton b=new JButton("清空文本框中的信息");
         contentPane.add(l,"North");
         contentPane.add(b,"South");

//创建一个匿名类来处理按钮的动作事件
         b.addActionListener(new ActionListener()
         {
        	 public void actionPerformed(ActionEvent Event)
        	 {
        		l.setText(""); //将文本框文本清空
        	 }
         });       
         }  
}
