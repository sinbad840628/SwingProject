//这段程序代码是利用DefaultComboBoxModel模型创建一个下拉列表框
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class test9
{
   String[] s = {"主板","硬盘","内存","电源","键盘","鼠标","显示器","光驱"};
   public test9()
{
      JFrame f=new JFrame("JComboBox3");	
      Container contentPane=f.getContentPane();
      
      ComboBoxModel mode=new AModel();//创建一个ComboBoxModel对象
      JComboBox combo=new JComboBox(mode);//使用上面的对象来创建一个下拉列表框
      combo.setBorder(BorderFactory.createTitledBorder("电脑配件"));
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
//利用继承DefaultComboBoxModel类创建一个用来创建下拉列表框对象的类
   class AModel extends DefaultComboBoxModel
{
   	  AModel(String[] s)
{
   	  	for (int i=0;i<s.length;i++)
   	  		addElement(s[i]);
   	  }
   }
}
