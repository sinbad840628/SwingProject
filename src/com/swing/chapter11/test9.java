//这段程序代码主要向读者展示如何创建一个带URL地址的JEditorPane组件
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class test9
{
  public static void main(String[] args)
{
  	 JEditorPane editPane=null;
  	 try{
  	   URL address=new URL("http://www.google.com");
  	   editPane=new JEditorPane(address); //创建一个带URL地址的JEditorPane组件 	   
  	   } 
catch(MalformedURLException e)
{
  	   System.out.println("Malformed URL:"+e);	
  	 }
catch(IOException e)
{
  	   System.out.println("IOException:"+e);	
  	 }
   	  editPane.setEditable(false);
   	  JFrame f=new JFrame("网页测试窗口");
   	  f.setContentPane(new JScrollPane(editPane));
   	  f.setSize(200,250);
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
