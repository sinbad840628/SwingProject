//��δ�����Ҫ��Ϊ����չʾ��ν�������������ӵ��ڶ����������������������е������ͬ���򣬶�������������������Ҳ�ֱ������λ�������ͬ����İ�ť���
import javax.swing.*;
import java.awt.*;
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
         JPanel contentPane=new JPanel();
         jf.setContentPane(contentPane);
         JButton b1=new JButton("�۱�");//�����˶�ʮ�����ͨ��ť���
         JButton b2=new JButton("�����");
         JButton b3=new JButton("��Ԫ");
         JButton b4=new JButton("ŷԪ");
         JButton b5=new JButton("Ӣ��");
         JButton b6=new JButton("����");
         JButton b7=new JButton("�ڴ�");
         JButton b8=new JButton("Ӳ��");
         JButton b9=new JButton("��ʾ��");
         JButton b10=new JButton("���");
         JButton b11=new JButton("����");
         JButton b12=new JButton("�߲�");
         JButton b13=new JButton("����");
         JButton b14=new JButton("����");
         JButton b15=new JButton("ţ��");
         JButton b16=new JButton("���");
         JButton b17=new JButton("����");
         JButton b18=new JButton("�ɿ���");
         JButton b19=new JButton("����");
         JButton b20=new JButton("ƻ����");
         JButton b21=new JButton("�ʼǱ�");
         JButton b22=new JButton("�绰");
         JButton b23=new JButton("�칫��");
         JButton b24=new JButton("�ֱ�");
         JButton b25=new JButton("�ļ���");
         jf.setLayout(new BorderLayout());
         JPanel p1=new JPanel();//����������м����������ҽ����ǵĲ��ֹ����������ó�BorderLayout��ʽ��
         JPanel p2=new JPanel();
         JPanel p3=new JPanel();
         JPanel p4=new JPanel();
         JPanel p5=new JPanel();
         p1.setLayout(new BorderLayout());
         p2.setLayout(new BorderLayout());
         p3.setLayout(new BorderLayout());
         p4.setLayout(new BorderLayout());
         p5.setLayout(new BorderLayout());
         contentPane.add(p1,"North");//������м���������ֱ���뵽�ϲ��м������У������ǰ���BorderLayout�ķ�ʽ���в���
         contentPane.add(p2,"South");
         contentPane.add(p3,"East");
         contentPane.add(p4,"West");
         contentPane.add(p5,"Center");
         p1.add(b1,"North");///���ӵ�һ�����������ͨ��ť�������BorderLayout��ʽ���ֵ�p1�м�������
         p1.add(b2,"West");
         p1.add(b3,"South");
         p1.add(b4,"East");
         p1.add(b5,"Center");
         p2.add(b6,"North");//���ӵ���������ʮ����ͨ��ť�������BorderLayout��ʽ���ֵ�p2�м�������
         p2.add(b7,"West");
         p2.add(b8,"South");
         p2.add(b9,"East");
         p2.add(b10,"Center");
         p3.add(b11,"North");//���ӵ�ʮһ������ʮ�����ͨ��ť�������BorderLayout��ʽ���ֵ�p3�м�������
         p3.add(b12,"West");
         p3.add(b13,"South");
         p3.add(b14,"East");
         p3.add(b15,"Center");
         p4.add(b16,"North");//���ӵ�ʮ�������ڶ�ʮ����ͨ��ť�������BorderLayout��ʽ���ֵ�p4�м�������
         p4.add(b17,"West");
         p4.add(b18,"South");
         p4.add(b19,"East");
         p4.add(b20,"Center");
         p5.add(b21,"North");//���ӵڶ�ʮһ�����ڶ�ʮ�����ͨ��ť�������BorderLayout��ʽ���ֵ�p5�м�������
         p5.add(b22,"West");
         p5.add(b23,"South");
         p5.add(b24,"East");
         p5.add(b25,"Center");
         }  
}
