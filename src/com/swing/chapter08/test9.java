//��γ������������DefaultComboBoxModelģ�ʹ���һ�������б��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test9
{
   String[] s = {"����","Ӳ��","�ڴ�","��Դ","����","���","��ʾ��","����"};
   public test9()
{
      JFrame f=new JFrame("JComboBox3");	
      Container contentPane=f.getContentPane();
      
      ComboBoxModel mode=new AModel();//����һ��ComboBoxModel����
      JComboBox combo=new JComboBox(mode);//ʹ������Ķ���������һ�������б��
      combo.setBorder(BorderFactory.createTitledBorder("�������"));
      contentPane.add(combo);
      f.pack();
      f.setVisible(true);
      f.addWindowListener(new WindowAdapter()
{
    	 public void windowClosing(WindowEvent e)
{
    	  System.exit(0);	
    	}
      });   
   }
   public static void main(String[] args)
{
      new test9();	
   }	
//���ü̳�DefaultComboBoxModel�ഴ��һ���������������б��������
   class AModel extends DefaultComboBoxModel
{
   	  AModel(String[] s)
{
   	  	for (int i=0;i<s.length;i++)
   	  		addElement(s[i]);
   	  }
   }
}
