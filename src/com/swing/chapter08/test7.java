//这段程序代码创建了两个下拉列表框，其中一个是使用数组创建的，另一个是使用Vector数据结构来创建的。
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
  	String[] s = {"桃花","梅花","玫瑰","牡丹","月季","茉莉","菊花","樱花"};//创建一个数组，用来构造下拉列表框
  	Vector v=new Vector();//创建一个Vector，用来构造下拉列表框
///往Vector中添加元素
  	v.addElement("王鹏");
  	v.addElement("谭妮");
  	v.addElement("朱敏");
  	v.addElement("宋兵");
  	v.addElement("李丽");
     v.addElement("章儒");
     
    JComboBox combo1=new JComboBox(s); //利用数组创建下拉列表框
    combo1.addItem("映山红");//利用JComboBox类所提供的addItem()方法，加入一个项目到此JComboBox中。
    combo1.setBorder(BorderFactory.createTitledBorder("你最喜欢哪种花?"));
    JComboBox combo2=new JComboBox(v); //利用Vector创建下拉列表框
    combo2.setBorder(BorderFactory.createTitledBorder("你最好的朋友呢？"));   
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
