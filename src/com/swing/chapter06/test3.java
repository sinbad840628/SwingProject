//��δ�����Ҫ��Ϊ����չʾ���ʹ��JScrollPane��������ı�������й�������
import javax.swing.*;
public class test3
{
    static final int WIDTH=300;
    static final int HEIGHT=150;
    public static void main(String[] args)
    {
        JFrame jf=new JFrame("���Գ���");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        JTextArea ta=new JTextArea("������ĳĳ�����˾�ĹǸɿ�����Ա�����ǻ�߳�Ϊ�����񣡣���");//����һ���ı��������һ����������壬���ҽ������������ӵ�����������
        JScrollPane sp=new JScrollPane(ta);
        jf.setContentPane(sp);
    }
 }
