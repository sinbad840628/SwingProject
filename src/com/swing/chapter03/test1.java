//这段代码主要是为读者介绍了如何将普通组件添加到内容面板中
import javax.swing.*;
public class test1
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("测试窗口");
        JPanel pane=new JPanel();
        frame.setContentPane(pane);
        JButton button1=new JButton("按钮一");
        JButton button2=new JButton("按钮二");
        JButton button3=new JButton("按钮三");
        JButton button4=new JButton("按钮四");
        JLabel label=new JLabel("标签");
        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);
        pane.add(label);
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
