//这段代码主要是为读者展示如何创建单选按钮组件
import javax.swing.*; 
public class test4
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
        　JRadioButton jr1=new JRadioButton("忽略");//创建三个单选按钮，并且将它们添加到内容面板中
       　 JRadioButton jr2=new JRadioButton("继续");
       　 JRadioButton jr3=new JRadioButton("跳过");
        　contentPane.add(jr1);
       　 contentPane.add(jr2);
        　contentPane.add(jr3);
    }
}
