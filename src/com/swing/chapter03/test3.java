//这段代码主要是考查读者是否熟悉如何在顶层容器内的内容面板
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class test3
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    static JTextField text1;
    static JTextField text2;
    static JTextField text3;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("测试窗口");
        JPanel pane=new JPanel();
        frame.setContentPane(pane);
        text1=new JTextField(10);
        text2=new JTextField(10);
        text3=new JTextField(10);
        JLabel label1=new JLabel("* ");
        JButton button=new JButton("=");
        pane.add(text1);
        pane.add(label1);
        pane.add(text2);
        pane.add(button);
        pane.add(text3);
        button.addActionListener(new ActionListener()//下面是一个按钮的动作事件，在本书的后面会给以详细的讲述
        {
        	public void actionPerformed(ActionEvent Event) 
            {
                String str1=text1.getText();//从文本框中提取文本
                Double d1=Double.parseDouble(str1);//将文本转换成双精度型数据
                String str2=text2.getText();//从文本框中提取文本
                Double d2=Double.parseDouble(str2); //将文本转换成双精度型数据
                Double d3=d1*d2;
                String str3=""+d3;//将双精度数据转换成字符串数据
                text3.setText(str3); //将结果赋给第三个文本框      
            }
        });
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
