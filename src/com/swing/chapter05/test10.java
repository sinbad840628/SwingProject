//��δ�����Ҫ��Ϊ����չʾ���ʹ��SpringLayout���ֹ�����Ϊ������в���
import javax.swing.*;
import java.awt.*;
//������ͬ�����Ӳ��ֹ���������ÿ��������ò�ͬ�Ŀؼ�
public class test10
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
        JButton b1=new JButton("���Գ���ģ��1");//������������ͨ��ť�����һ����ǩ�������������ӵ��м�������
        JButton b2=new JButton("���Գ���ģ��2");
        JLabel l=new JLabel("���Գ���");
        contentPane.add(l);
        contentPane.add(b2);
        contentPane.add(b1);
        // ����һ�� SpringLayout���ֹ����������ҽ�֮��Ϊ�м������Ĳ��ַ�ʽ
        SpringLayout lay=new SpringLayout();
        contentPane.setLayout(lay);
        //���ÿ�������������߽�ľ���
        lay.putConstraint(SpringLayout.NORTH,l, 5,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,l, 85,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,l, 85,SpringLayout.EAST,contentPane);
        lay.putConstraint(SpringLayout.NORTH,b1, 55,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,b1, 5,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,b1, 25,SpringLayout.EAST,contentPane);
        lay.putConstraint(SpringLayout.NORTH,b2, 105,SpringLayout.NORTH,contentPane);
        lay.putConstraint(SpringLayout.WEST,b2, 5,SpringLayout.WEST,contentPane);
        lay.putConstraint(SpringLayout.EAST,b2, 25,SpringLayout.EAST,contentPane);
    }
}
