//��δ�����Ҫ��Ϊ���߽�����δ����ڵ��¼�
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
public class test3 extends JFrame 
{
    public test3()
    {
    	    super.setTitle("���Դ���");
///���¼�Դע���������
        WindowListener wh=new windowhandler();
        addWindowListener(wh);
    }
    public static void main(String[] args)
    {
        test3 me=new test3();
        me.setSize(400,300);
        me.setVisible(true);
}
///����һ�������¼�������
class windowhandler implements WindowListener 
{
    public void windowActivated(WindowEvent e)//�˷�������Ҫ��������Ҫ��ʵ��
    {}
    public void windowClosed(WindowEvent e) //�˷�������Ҫ��������Ҫ��ʵ��
    {}
    public void windowClosing(WindowEvent e)
    {
	    JButton b1=new JButton("ȷ��");
         JButton b2=new JButton("ȡ��");
         JLabel l=new JLabel("����ȷ���ر�ϵͳ����");
         JDialog d=new JDialog((JFrame)e.getSource(),"ϵͳ������!",true)//����һ���Ի���
         d.setSize(200,100);
         d.setLocation(0,0);
         JPanel p=new JPanel();
         p.setLayout(new GridLayout(1,2));
         d.add(p,"South");
         d.add(l,"Center");
         p.add(b1);
         p.add(b2);  
         d.setVisible(true);
         b1.setVisible(true);
         b2.setVisible(true);
         l.setVisible(true);
    }
    public void windowDeactivated(WindowEvent e){} //�˷�������Ҫ��������Ҫ��ʵ��
    public void windowIconified(WindowEvent e){} //�˷�������Ҫ��������Ҫ��ʵ��
    public void windowDeiconified(WindowEvent e){} //�˷�������Ҫ��������Ҫ��ʵ��
    public void windowOpened(WindowEvent e){} //�˷�������Ҫ��������Ҫ��ʵ��
    }
}
