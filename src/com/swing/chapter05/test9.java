//��γ�����Ҫ��Ϊ����չʾ���ʹ��BoxLayout ���ֹ��������������в���
import javax.swing.*;
import java.awt.*;
public class test9
{
  
    public static void main(String[] args)
    {
        BoxLayoutFrame frame1=new BoxLayoutFrame();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.show();
    }
}
class BoxLayoutFrame extends JFrame
{
    private static final int WIDTH=300;
    private static final int HEIGHT=200;
    public BoxLayoutFrame()
    {

        setTitle("������ʽ���ֹ�����");//���ö����������ơ���С
        setSize(WIDTH,HEIGHT);
        Container con=getContentPane();//����һ���м�����
        JLabel label1=new JLabel(" ������");//������ǩ������ı������
        JTextField textField1=new JTextField(10);
        textField1.setMaximumSize(textField1.getPreferredSize());
        Box hbox1=Box.createHorizontalBox();//����һ��ˮƽ����
        hbox1.add(label1); //��ˮƽ���������һ����ǩ��������Ҵ���һ�����ɼ��ġ�20����λ�����������֮�������һ���ı������
        hbox1.add(Box.createHorizontalStrut(20));
        hbox1.add(textField1);  
        JLabel label2=new JLabel(" ���룺");//������ǩ������ı������
        JTextField textField2=new JTextField(10);
        textField2.setMaximumSize(textField2.getPreferredSize());
        Box hbox2=Box.createHorizontalBox();//����һ��ˮƽ����
        hbox2.add(label2); //��ˮƽ���������һ����ǩ��������Ҵ���һ�����ɼ��ġ�20����λ�����������֮�������һ���ı������
        hbox2.add(Box.createHorizontalStrut(20));
        hbox2.add(textField2);  
        JButton button1=new JButton("ȷ��");//����������ͨ��ť��������Ҵ���һ��ˮƽ���ӣ���������ť��ӵ�������
        JButton button2=new JButton("ȡ��");
        Box hbox3=Box.createHorizontalBox();
        hbox3.add(button1);
        hbox3.add(button2);
        Box vbox=Box.createVerticalBox();//����һ����ֱ���ӣ�������ӽ�����ˮƽ������ӵ����У�����һ������ glue �����
        vbox.add(hbox1);
        vbox.add(hbox2);
        vbox.add(Box.createVerticalGlue());
        vbox.add(hbox3);
        con.add(vbox,BorderLayout.CENTER); // ����ֱ������ӵ�BorderLayout���ֹ������е��м�λ��  
    }
}
