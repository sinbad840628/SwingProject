import javax.swing.*;
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
        JPanel contentPane=new JPanel( );
        jf.setContentPane(contentPane);
        //����������ť�����ҽ���ť��ӵ����������
        JButton b1=new JButton("ȷ��");
        JButton b2=new JButton("ȡ��");
        contentPane.add(b1);
        contentPane.add(b2);
    }
}
