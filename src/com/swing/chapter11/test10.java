//这段程序主要是向读者展示如何创建JTextPane组件，并且像WORD文档一样，可以修改文字属性
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;

public class test10{
 	private JTextPane textPane;
 	
 	public test10()
{
 	  textPane=new JTextPane();
 	  textPane.setBackground(Color.white);
 	  textPane.setEditable(false);	
 	}
	public void setRED_Bold_20(String str)
{//此方法主要设置str字符串的属性，例如属性值、字体、颜色，然后将str插入到JTextPane中
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// 创建一个属性集
 	  StyleConstants.setForeground(attrset,Color.red);//设置前景色为红色
 	  StyleConstants.setBold(attrset,true);//设置字体为粗体
 	  insert(str,attrset);	
 	}
///此方法主要设置str字符串的属性，例如属性值、字体、颜色，然后将str插入到JTextPane中
 	public void setGREEN_Italic_Bold_22(String str)
{
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// 创建一个属性集
 	  StyleConstants.setForeground(attrset,Color.green); //设置前景色为绿色
 	  StyleConstants.setItalic(attrset,true);//设置字体
 	  StyleConstants.setFontSize(attrset,21);//设置字体大小
 	  insert(str,attrset);	
 	}
///此方法主要设置str字符串的属性，例如属性值、颜色，然后将str插入到JTextPane中
 	public void setBLack_UnderLine_Italic_24(String str)
{
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// 创建一个属性集
 	  StyleConstants.setForeground(attrset,Color.black); //设置前景色为黑色
 	  StyleConstants.setUnderline(attrset,true);//设置文字带下划线
 	  StyleConstants.setItalic(attrset,true);//设置字体
 	  StyleConstants.setFontSize(attrset,32);//设置字体大小
 	  insert(str,attrset);	
 	}
   
 	public void insert(String str,AttributeSet attrset) //这个方法最主要的用途是将字符串插入到JTextPane中。
{
 	  Document docs=textPane.getDocument();//利用getDocument()方法取得JTextPane的Document instance.0
 	  str=str+"\n";
 	  try
{
 	    docs.insertString(docs.getLength(),str,attrset); 	    	
 	  }
catch(BadLocationException ble)
{
 	     System.out.println("BadLocationException:"+ble);	
 	  }	
 	}
	public Component getComponent()
{
	  return textPane;	
	}
	public static void main(String[] args)
{
	  test10 pane=new test10();
	  pane.setRED_Bold_20("这是一本有关JAVA图形编程的书籍");
	  pane.setGREEN_Italic_Bold_22("这是一本软件编程的书籍");
	  pane.setBLack_UnderLine_Italic_24("这是一本有关JAVA软件编程的书籍");
	  
	  JFrame f=new JFrame("JTextPane1");
	  f.getContentPane().add(pane.getComponent());
	  f.setSize(450,180);
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter()
{
          	public void windowClosing(WindowEvent e)
{
          	  System.exit(0);	
          	}
          });
	}
}
