//��γ�������Ǵ��������б��Ȼ��˫����ߵ��б���ĳ�����������б���ƶ����ұ��б�����˫���ұ��б���е�ĳ��������ұ��ƶ�������б��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class test6 extends MouseAdapter
{
  JList list1=null;	
  JList list2=null;	
  DefaultListModel mode1=null;
  DefaultListModel mode2=null;
  String[] s = {"Java������","C������","Hibernate��","Visual Basic��","ASP��","Dephi��","������װ��","Photoshop��"};
  //Download by http://www.codefans.net
  public test6()
{
  	JFrame f=new JFrame("JList");
  	Container contentPane=f.getContentPane();
  	contentPane.setLayout(new GridLayout(1,2));
  	
  	mode1=new DataModel(1);
  	list1=new JList(mode1);
  	list1.setBorder(BorderFactory.createTitledBorder("ͼ������!"));
  	list1.addMouseListener(this);//һ��������¼�����ִ��.
  	
  	mode2=new DataModel(2);
  	list2=new JList(mode2);
  	list2.setBorder(BorderFactory.createTitledBorder("������Ҫѡ����飺"));
  	list2.addMouseListener(this);//һ��������¼�����ִ��.
  	
  	contentPane.add(new JScrollPane(list1));
  	contentPane.add(new JScrollPane(list2));
   f.pack();
   f.setVisible(true);
   f.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
         System.exit(0);
      }
   });    
  }
  public static void main(String[] args){
  	 new test6();
  }
 //�������˫���¼�.
  public void mouseClicked(MouseEvent e)
{
  	 int index;
  	 if (e.getSource()==list1)
{
  	   if (e.getClickCount()==2)
{
///��˫������б����ѡ�������߽�����ȥ�������ұ��б���н��������
  	      index=list1.locationToIndex(e.getPoint());
  	      String tmp=(String)mode1.getElementAt(index);
  	      mode2.addElement(tmp);
  	      list2.setModel(mode2);
  	      mode1.removeElementAt(index);
  	      list1.setModel(mode1);
  	   }	
  	 }
  	 if (e.getSource()==list2)
{
  	   if (e.getClickCount()==2)
{
///��˫���ұ��б����ѡ������ұ߽�����ȥ����������б���н��������
  	      index=list2.locationToIndex(e.getPoint());
  	      String tmp=(String)mode2.getElementAt(index);
  	      mode1.addElement(tmp);
  	      list1.setModel(mode1);
  	      mode2.removeElementAt(index);
  	      list2.setModel(mode2);
  	   }	
  	 }
  }
///��DateModel�̳�DefaultListModel�࣬����һ���б����
  class DataModel extends DefaultListModel
{
  	  DataModel(int flag)
{
  	  	  if (flag==1)
{
  	  	  	 for (int i=0;i<s.length;i++)  
addElement(s[i]);	  	  	  	 
  	  	  }
  	  }
  }
}
