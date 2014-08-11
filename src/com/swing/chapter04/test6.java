//这段代码主要是为读者展示如何创建单选按钮组件，以及如何将它们放在不同的按钮组中
import javax.swing.*;
public class test6
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
         //创建六个单选按钮，并且将之分成三组按钮组
         JRadioButton jr1=new JRadioButton("羽毛球");
         JRadioButton jr2=new JRadioButton("足球");
         JRadioButton jr3=new JRadioButton("电脑书");
         JRadioButton jr4=new JRadioButton("数学书");
         JRadioButton jr5=new JRadioButton("电影");
         JRadioButton jr6=new JRadioButton("录像");
         ButtonGroup  bg1=new ButtonGroup();
         ButtonGroup  bg2=new ButtonGroup();
         ButtonGroup  bg3=new ButtonGroup();
         bg1.add(jr1);
         bg1.add(jr2);
         bg2.add(jr3);
         bg2.add(jr4);
         bg3.add(jr5);
         bg3.add(jr6);
///将六个单选按钮添加到内容面板中
         contentPane.add(jr1);
         contentPane.add(jr2);
         contentPane.add(jr3);
         contentPane.add(jr4);
         contentPane.add(jr5);
    }  
}
