import javax.swing.*;
public class test7
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
         JCheckBox jc1=new JCheckBox("羽毛球");//创建六个复选按钮，并且将之添加到内容面板中
         JCheckBox jc2=new JCheckBox("足球");
         JCheckBox jc3=new JCheckBox("电脑书");
         JCheckBox jc4=new JCheckBox("数学书");
         JCheckBox jc5=new JCheckBox("电影");
         JCheckBox jc6=new JCheckBox("录像");
         contentPane.add(jc1);
         contentPane.add(jc2);
         contentPane.add(jc3);
         contentPane.add(jc4);
         contentPane.add(jc5);
         contentPane.add(jc6);
    }  
}
