//��δ���������ComboxModelģ�������������б��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test8
{
  String[] s= {"����","��ѩ��","��已�","�����","�����","����","ŷ��","����"};
  public test8()
{
    JFrame f=new JFrame("JComboBox");	
    Container contentPane=f.getContentPane();
    ComboBoxModel mode=new UserDefineComboBoxModel();//����һ��UserDefineComboBoxModel����
    JComboBox combo=new JComboBox(mode);//ͨ��UserDefineComboBoxModel����������һ�������б��
    combo.setBorder(BorderFactory.createTitledBorder("��ĺ�������˭?"));
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
  	 new test8();
  }
//����һ���̳�AbstractListModel ͬʱʵ��ComboBoxModel����ӿڵ���UserDefineComboBoxModel
  class UserDefineComboBoxModel extends AbstractListModel implements ComboBoxModel
{
  	 String item=null;
  	 public Object getElementAt(int index) //���ڼ̳�AbstractListModel�����ࡣ������Ƿֱ��ڳ�����ʵ����getElementAt()��getSize()������
{
  	   return s[index++];	
  	 }
      public int getSize()
{
  	    return s.length;	
  	 }
      public void setSelectedItem(Object anItem) //��������ʵ����ComboBoxModel interface.������Ǳ����ڳ�����ʵ��setSelectedItem()��getSelectedItem()����.
{
  	      item=(String)anItem;	
     }
     public Object getSelectedItem()
{
        return item;	
     }
  }
}
