//��γ��������Ҫ��Ϊ����չʾ��δ���һ���ı���ʽ��JEditorPane���
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class test8{
  public static void main(String[] args){
    String str=new String("����һ������Ա.\n����һ������ĳ���Ա!\n����һ�������JAVA����Ա!");
    JEditorPane editPane=new JEditorPane("text/plain",str);//����һ��JEditorPane�������strΪ���ݣ���text/plainΪ��ʽ
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
