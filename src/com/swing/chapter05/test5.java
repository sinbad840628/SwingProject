//��δ�����Ҫ��Ϊ����չʾ���ʹ��GridLayout���ֹ��������ڳ����н��Ÿ���ͨ��ť������մ˲��ֹ�������������������С�
import javax.swing.*;
import java.awt.*;
public class test5
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
         JButton b6=new JButton("����");
         JButton b7=new JButton("�ڴ�");
         JButton b8=new JButton("Ӳ��");
         JButton b9=new JButton("��ʾ��");

         GridLayout gird=new GridLayout(3,3); //����һ�� GridLayout���ֹ��������󣬽�֮������Ϊ3��������Ϊ3,���ҽ�֮��Ϊ�м������Ĳ��ֹ�����
         contentPane.setLayout(gird);

         contentPane.add(b1); //���Ÿ���ͨ��ť���һһ��ӵ��м�������
         contentPane.add(b2);
         contentPane.add(b3);
         contentPane.add(b4);
         contentPane.add(b5);
         contentPane.add(b6);
         contentPane.add(b7);
         contentPane.add(b8);
         contentPane.add(b9);
         jf.pack();
      }  
}
