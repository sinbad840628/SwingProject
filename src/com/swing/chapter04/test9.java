//��γ��������Ҫ��Ϊ����չʾ��δ�����ť����ͱ�ǩ��������ҽ�����ť����Ķ����¼�
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class test9 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=200;
    JTextField text1;
    JTextField text2;
    String str;
    Test9()
    {
    	JFrame frame=new JFrame();
    	frame.setTitle("���Դ���");
    	frame.setSize(WIDTH,HEIGHT);
    	frame.setVisible(true);
    	
    	text1=new JTextField(5);//����ı����������������������
    	text2=new JTextField(5);//����ı���������ʾ������
    	JLabel label1=new JLabel("ƽ��");
    	JLabel label2=new JLabel("����");
    	JLabel label3=new JLabel("�Ĵη�");
    	JButton button1=new JButton("ƽ�����");
    	JButton button2=new JButton("�������");
    	JButton button3=new JButton("�Ĵη����");
    	
    	frame.setContentPane(this);
    	setLayout(new GridLayout(4,2));//��������GridLayout���ֹ���������֪ʶ�ں������������
    	add(text1);
    	add(text2);
    	add(label1);
    	add(button1);
    	add(label2);
    	add(button2);
    	add(label3);
    	add(button3);
    	button1.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),2));
    		}
    	});
    	button2.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),3));
    		}
    	});
    	button3.addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent Event)
    		{
    			str=text1.getText();
    			text2.setText(""+Math.pow(Double.parseDouble(str),4));
    		}
    	});
    	
    }
    public static void main(String[] args)
    {
    	new test9();
    }
}
