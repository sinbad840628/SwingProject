//��γ��������Ҫ�����չʾ��δ���һ����URL��ַ��JEditorPane���
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
  	   editPane=new JEditorPane(address); //����һ����URL��ַ��JEditorPane��� 	   
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
   	  JFrame f=new JFrame("��ҳ���Դ���");
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
