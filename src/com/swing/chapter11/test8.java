//这段程序代码主要是为读者展示如何创建一个文本格式的JEditorPane组件
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class test8{
  public static void main(String[] args){
    String str=new String("我是一名程序员.\n我是一名优秀的程序员!\n我是一名优秀的JAVA程序员!");
    JEditorPane editPane=new JEditorPane("text/plain",str);//创建一个JEditorPane组件，以str为内容，以text/plain为格式
    editPane.setEditable(false);
    
    JFrame f=new JFrame("JEditorPane2");
    f.setContentPane(new JScrollPane(editPane));
    f.pack();
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
    	  public void windowClosing(WindowEvent e){
    	  	 System.exit(0);
    	  }
    });
  }	
}
