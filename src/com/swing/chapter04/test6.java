//��δ�����Ҫ��Ϊ����չʾ��δ�����ѡ��ť������Լ���ν����Ƿ��ڲ�ͬ�İ�ť����
import javax.swing.*;
public class test6
{
static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
          JFrame jf=new JFrame("���Գ���");
          jf.setSize(WIDTH,HEIGHT);
          jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          jf.setVisible(true);
          JPanel contentPane=new JPanel( );
          jf.setContentPane(contentPane);
         //����������ѡ��ť�����ҽ�֮�ֳ����鰴ť��
         JRadioButton jr1=new JRadioButton("��ë��");
         JRadioButton jr2=new JRadioButton("����");
         JRadioButton jr3=new JRadioButton("������");
         JRadioButton jr4=new JRadioButton("��ѧ��");
         JRadioButton jr5=new JRadioButton("��Ӱ");
         JRadioButton jr6=new JRadioButton("¼��");
         ButtonGroup  bg1=new ButtonGroup();
         ButtonGroup  bg2=new ButtonGroup();
         ButtonGroup  bg3=new ButtonGroup();
         bg1.add(jr1);
         bg1.add(jr2);
         bg2.add(jr3);
         bg2.add(jr4);
         bg3.add(jr5);
         bg3.add(jr6);
///��������ѡ��ť��ӵ����������
         contentPane.add(jr1);
         contentPane.add(jr2);
         contentPane.add(jr3);
         contentPane.add(jr4);
         contentPane.add(jr5);
    }  
}
