//这段代码主要是为读者展示如何创建单选按钮组件，并且将这些单选按钮组件添加到一个按钮组中
import javax.swing.*;
public class test5
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
          JRadioButton jr1=new JRadioButton("忽略");//创建三个单选按钮
          JRadioButton jr2=new JRadioButton("继续");
          JRadioButton jr3=new JRadioButton("跳过");
          ButtonGroup  bg=new ButtonGroup();//将三个单选按钮划分到一个按钮组中
          bg.add(jr1);
          bg.add(jr2);
          bg.add(jr3);
          contentPane.add(jr1); //将三个单选按钮添加到内容面板中
          contentPane.add(jr2);
          contentPane.add(jr3);
    }  
}
