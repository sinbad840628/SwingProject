//��γ��������ҪΪ����չʾ�Զ�ˮƽ�ʹ�ֱ���򶼻���ֹ�����
import javax.swing.*;
public class test4
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
        JScrollPane sp=new JScrollPane(ta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS ,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS  );
        jf.setContentPane(sp);
  }
 }
