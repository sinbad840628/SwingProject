//��γ��������Ҫ��Ϊ����չʾ��δ���һ�����������
import javax.swing.*;
import java.awt.*;
public class test1
{
static final int WIDTH=300;
    static final int HEIGHT=200;
public static void main(String[] args)
	   {
		JFrame jf=new JFrame("������������Գ���");
	     jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     JProgressBar pb=new JProgressBar();//����һ������������
	     contentPane.add(pb);     
	}
}
