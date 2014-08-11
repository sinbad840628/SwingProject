//这段代码主要是为读者展示如何使用SpringLayout布局管理器为组件进行布局
import javax.swing.*;
import java.awt.*;
//产生不同的箱子布局管理器对象，每个对象放置不同的控件
public class test10
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
	 JFrame jf=new JFrame("测试程序");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         jf.setContentPane(contentPane);
        JButton b1=new JButton("测试程序模块1");//创建了两个普通按钮组件、一个标签组件，将它们添加到中间容器中
        JButton b2=new JButton("测试程序模块2");
        JLabel l=new JLabel("测试程序");
        contentPane.add(l);
        contentPane.add(b2);
        contentPane.add(b1);
        // 创建一个 SpringLayout布局管理器，并且将之作为中间容器的布局方式
        SpringLayout lay=new SpringLayout();
        contentPane.setLayout(lay);
        //针对每个组件设置其与边界的距离
        lay.putConstraint(SpringLayout.NORTH,l, 5,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,l, 85,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,l, 85,SpringLayout.EAST,contentPane);
        lay.putConstraint(SpringLayout.NORTH,b1, 55,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,b1, 5,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,b1, 25,SpringLayout.EAST,contentPane);
        lay.putConstraint(SpringLayout.NORTH,b2, 105,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,b2, 5,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,b2, 25,SpringLayout.EAST,contentPane);
    }
}
