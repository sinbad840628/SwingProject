//��γ�����봴�������������б������һ����ʹ�����鴴���ģ���һ����ʹ��Vector���ݽṹ�������ġ�
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;
public class test7
{
     public static void main(String[] args)
{
  	JFrame f=new JFrame("JComboBox1");
  	Container contentPane=f.getContentPane();
  	contentPane.setLayout(new GridLayout(1,2));
  	String[] s = {"�һ�","÷��","õ��","ĵ��","�¼�","����","�ջ�","ӣ��"};//����һ�����飬�������������б��
  	Vector v=new Vector();//����һ��Vector���������������б��
///��Vector�����Ԫ��
  	v.addElement("����");
  	v.addElement("̷��");
  	v.addElement("����");
  	v.addElement("�α�");
  	v.addElement("����");
     v.addElement("����");
     
    JComboBox combo1=new JComboBox(s); //�������鴴�������б��
    combo1.addItem("ӳɽ��");//����JComboBox�����ṩ��addItem()����������һ����Ŀ����JComboBox�С�
    combo1.setBorder(BorderFactory.createTitledBorder("����ϲ�����ֻ�?"));
    JComboBox combo2=new JComboBox(v); //����Vector���������б��
    combo2.setBorder(BorderFactory.createTitledBorder("����õ������أ�"));   
    contentPane.add(combo1);
    contentPane.add(combo2);
    f.pack();
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e){
    	  System.exit(0);	
    	}
    });
  }
}
