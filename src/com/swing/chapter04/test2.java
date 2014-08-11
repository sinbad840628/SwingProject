 //这段代码主要是为读者展示使用“setText()”的方法为标签初始赋值
import javax.swing.*;
public class test2
{
static final int WIDTH=300;
          static final int HEIGHT=200;
         public static void main(String[] args)
         {

           JFrame jf=new JFrame("测试程序");
           jf.setSize(WIDTH,HEIGHT);
           jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           jf.setVisible(true);
           JPanel contentPane=new JPanel( );
           jf.setContentPane(contentPane);
           JLabel label1=new JLabel();
           JLabel label2=new JLabel();
           label1.setText("标签是用来标示某个控件的控件");
           label2.setText("标签是用来标示说明性文件的控件");
           contentPane.add(label1);
           contentPane.add(label2);
}
