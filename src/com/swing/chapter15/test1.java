//��γ��������Ҫ��Ϊ����չʾ���ͨ��JTree()�����������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1
{
  public test1()
{
  	JFrame f=new JFrame("���������");
  	Container contentPane=f.getContentPane();
  	JTree tree=new JTree();//����һ��ϵͳĬ�ϵ������
  	JScrollPane scrollPane=new JScrollPane();//����һ�����������
  	scrollPane.setViewportView(tree);//���������ӵ������������
  	contentPane.add(scrollPane);//�������������ӵ��м�������
  	f.pack();
  	f.setVisible(true);
  	f.addWindowListener(new WindowAdapter()
{
  		 public void windowClosing(WindowEvent e){
  		   System.exit(0);	
  		 }
  	  });
     }		
  public static void main(String[] args)
{
  	 new test1();
  }
}
