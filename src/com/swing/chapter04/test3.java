import javax.swing.*;
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
        JPanel contentPane=new JPanel( );
        jf.setContentPane(contentPane);
        //创建两个按钮，并且将按钮添加到内容面板中
        JButton b1=new JButton("确定");
        JButton b2=new JButton("取消");
        contentPane.add(b1);
        contentPane.add(b2);
    }
}
