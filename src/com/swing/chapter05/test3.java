//��δ�����Ҫ��Ϊ����չʾFlowLayout���ֹ�������ʹ�÷���
import javax.swing.*;
import java.awt.*;
public class test3
{
static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
         JFrame jf=new JFrame("���Գ���");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         jf.setContentPane(contentPane);
         JButton b1=new JButton("�۱�");
         JButton b2=new JButton("�����");
         JButton b3=new JButton("��Ԫ");
         JButton b4=new JButton("ŷԪ");
         JButton b5=new JButton("Ӣ��");
         contentPane.setLayout(new FlowLayout());//���м������Ĳ��ֹ���������ΪFlowLayout
         contentPane.add(b1); //�������ť�ֱ���FlowLayout���ֹ�������ʽ��ӵ��м�������
         contentPane.add(b2);
         contentPane.add(b3);
         contentPane.add(b4);
         contentPane.add(b5);
         jf.pack();
        }  
}
