//��δ�����Ҫ��Ϊ����չʾ�˴�����ǩ�ķ���������ͨ���ڹ�������Ϊ��ǩ��ʼ��ֵ
import javax.swing.*;
public class test1
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
        JLabel label1=new JLabel("����һ����ǩ���Գ���");//����������ǩ���
        JLabel label2=new JLabel("����һ�����ɱ༭�ı�ǩ�ؼ�");
        contentPane.add(label1); //����ǩ�����ӵ����������
        contentPane.add(label2);
    }
}
