//��γ��������Ҫ��������JInternalFrame���ڣ���������JInternalFrame���ڷŵ�һ���������������������
import javax.swing.*;
import java.awt.*;
public class test9
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
	public static void main(String[] args)
	{
	   JFrame jf=new JFrame("���Գ���");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JPanel contentPane=new JPanel();//����һ���м����������ҽ�֮��ӵ����������ڣ���֮����Ϊ�����֡�
        jf.setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout());
        JDesktopPane dp=new JDesktopPane();//����һ������������������dp��ӵ����ϴ������м�������
        dp.setLayout(new FlowLayout());
        contentPane.add(dp);
        JInternalFrame jif=new JInternalFrame("��һ������",true,true,true); //��������JIntenaFrame���������Ҵ���������ǩ������ֱ�������ӵ�����JInternaFrame������
        JInternalFrame jif1=new JInternalFrame("�ڶ�������",true,true,true);
        JLabel l1=new JLabel("�����ҵ�һ������");
        JLabel l2=new JLabel("��Ҳ�����һ������");
        JLabel l3=new JLabel("��ͬʱ������һ������");
        JLabel l4=new JLabel("�����ҵڶ�������");
        JLabel l5=new JLabel("��Ҳ����ڶ�������");
        JLabel l6=new JLabel("��ͬʱ�����ڶ�������");
        jif.setLayout(new FlowLayout());
        jif1.setLayout(new FlowLayout());
        jif.add(l1);
        jif.add(l2);
        jif.add(l3);
        jif1.add(l4);
        jif1.add(l5);
        jif1.add(l6);
        dp.add(jif);
        dp.add(jif1);
        jif.setVisible(true);
        jif1.setVisible(true);
       }
}
