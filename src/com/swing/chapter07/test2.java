//��γ��������Ҫ��Ϊ����չʾ���ʹ�������ദ���¼���ͨ�������������޸ģ�ʹ�������ദ�����¼�
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test2
{
    static final int WIDTH=300;
    static final int HEIGHT=200;
    static JTextField l=new JTextField(20);
    public static void main(String[] args)
    {
    	 JFrame jf=new JFrame("���Գ���");
         jf.setSize(WIDTH,HEIGHT);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jf.setVisible(true);
         JPanel contentPane=new JPanel();
         contentPane.setLayout(new BorderLayout());
         jf.setContentPane(contentPane);
         JButton b=new JButton("����ı����е���Ϣ");
         contentPane.add(l,"North");
         contentPane.add(b,"South");

//����һ��������������ť�Ķ����¼�
         b.addActionListener(new ActionListener()
         {
        	 public void actionPerformed(ActionEvent Event)
        	 {
        		l.setText(""); //���ı����ı����
        	 }
         });       
         }  
}
