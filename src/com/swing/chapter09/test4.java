//��γ��������Ҫ��Ϊ����չʾ��������ķ���
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test4 
{
	   static final int WIDTH=300;
    static final int HEIGHT=200;
    public static void main(String[] args)
    {
    	JFrame jf=new JFrame("���ʹ�û���");
    	jf.setSize(WIDTH,HEIGHT);
	     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jf.setVisible(true);
	     JPanel contentPane=new JPanel( );
	     jf.setContentPane(contentPane);
	     JSlider s=new JSlider(0,100,0);//����һ���������
	     contentPane.add(s);     
	     s.setMajorTickSpacing(20);//�������̶�
	     s.setMinorTickSpacing(5);//���ôο̶�
	     s.setPaintTicks(true);//�ÿ̶����ֳ���
	     s.setSnapToTicks(true);//�û��黬��������������
	     s.setPaintLabels(true);//�ÿ̶��ϵ�������ʾ����
      }
}
