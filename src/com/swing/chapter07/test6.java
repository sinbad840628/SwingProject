//��γ��������Ҫ��Ϊ����չʾ���ʹ�ý����¼�������λ�ý����Լ����ʧȥ����
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//����̳��˽���������ӿ�
public class test6 extends JFrame implements FocusListener
{
	List info=new List(10);
	JTextField tf=new JTextField("");
	JButton button=new JButton("ȷ��");
	public test6(String title)
	{
	  super(title);
	  add(info,"North");
	  add(tf,"Center");
	  add(button,"South");
	  tf.addFocusListener(this);	  
	}
	public void focusGained(FocusEvent e)
	{
		if(e.isTemporary())//����������¼��ı�ʶΪ��ʱ�Ի���������
			info.add("��ʱ�Ի��");
		else info.add("�����Ի��");
	}
	public void focusLost(FocusEvent e)
	{
		if(e.isTemporary())//����������¼��ı�ʶΪ��ʱ�Ի���������
			info.add("��ʱ��ʧȥ");
		else info.add("������ʧȥ");
	}
	public static void main(String[] args)
	{
		test6 t=new test6("���Դ���");
		t.pack();
		t.setVisible(true);
	}
}
