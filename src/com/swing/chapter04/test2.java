 //��δ�����Ҫ��Ϊ����չʾʹ�á�setText()���ķ���Ϊ��ǩ��ʼ��ֵ
import javax.swing.*;
public class test2
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
           JLabel label1=new JLabel();
           JLabel label2=new JLabel();
           label1.setText("��ǩ��������ʾĳ���ؼ��Ŀؼ�");
           label2.setText("��ǩ��������ʾ˵�����ļ��Ŀؼ�");
           contentPane.add(label1);
           contentPane.add(label2);
}
