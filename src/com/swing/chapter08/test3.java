//��γ��������Ҫ��Ϊ����չʾ���ʹ��AbstractListModel�����ഴ���б��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test3
{
  public test3()
{
     JFrame f=new JFrame("JList");
     Container contentPane=f.getContentPane();
     ListModel mode=new DataModel();
     JList list=new JList(mode);//����ListModel����һ��JList.
     list.setVisibleRowCount(5);//���ó���һ��ʱ���ܿ����������������	
     list.setBorder(BorderFactory.createTitledBorder("����һ̨������Ҫ�����"));
     
     contentPane.add(new JScrollPane(list));
     f.pack();
   
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter(){
     	 public void windowClosing(WindowEvent e){
     	   System.exit(0);	
     	 }
     });
  }	
  public static void main(String[] args){
  	 new test3();
  }
}
class DataModel extends AbstractListModel//����һ���࣬ʵ�ֳ�����AbstractListModel���������������һ���б��
{
  String[] s={"����","��ʾ��","�ڴ�","CPU","Ӳ��","��Դ","����","���"};
  public Object getElementAt(int index)
{                                       
     return (index+1)+"."+s[index++];	
  }	
  public int getSize()
{
  	 return s.length;
  }
}
