//这段代码主要是为读者展示FlowLayout布局管理器的使用方法
import javax.swing.*;
import java.awt.*;
public class test3
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
         JButton b1=new JButton("港币");
         JButton b2=new JButton("人民币");
         JButton b3=new JButton("美元");
         JButton b4=new JButton("欧元");
         JButton b5=new JButton("英镑");
         contentPane.setLayout(new FlowLayout());//将中间容器的布局管理器设置为FlowLayout
         contentPane.add(b1); //将五个按钮分别按照FlowLayout布局管理器方式添加到中间容器中
         contentPane.add(b2);
         contentPane.add(b3);
         contentPane.add(b4);
         contentPane.add(b5);
         jf.pack();
        }  
}
