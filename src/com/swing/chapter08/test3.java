//这段程序代码主要是为读者展示如何使用AbstractListModel抽象类创建列表框
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
     JList list=new JList(mode);//利用ListModel建立一个JList.
     list.setVisibleRowCount(5);//设置程序一打开时所能看到的数据项个数。	
     list.setBorder(BorderFactory.createTitledBorder("配置一台电脑需要的组件"));
     
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
class DataModel extends AbstractListModel//创建一个类，实现抽象类AbstractListModel，这个类用来创建一个列表框
{
  String[] s={"主板","显示器","内存","CPU","硬盘","电源","键盘","鼠标"};
  public Object getElementAt(int index)
{                                       
     return (index+1)+"."+s[index++];	
  }	
  public int getSize()
{
  	 return s.length;
  }
}
