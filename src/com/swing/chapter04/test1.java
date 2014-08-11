//这段代码主要是为读者展示了创建标签的方法，并且通过在构造器中为标签初始赋值
import javax.swing.*;
public class test1
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
        JLabel label1=new JLabel("这是一个标签测试程序");//创建两个标签组件
        JLabel label2=new JLabel("这是一个不可编辑的标签控件");
        contentPane.add(label1); //将标签组件添加到内容面板中
        contentPane.add(label2);
    }
}
