//��γ��������Ҫ��Ϊ����չʾ���ʹ�ù�ϣ���������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class test2{
  public test2(){
    JFrame f=new JFrame("���������");
    Container contentPane=f.getContentPane(); 
    String[] s1={"���","����","���"};//���������ַ�������	
    String[] s2={"ƻ��","����","�㽶"};
    String[] s3={"��ͷ","����","����","���","����"};
    Hashtable hashtable1=new Hashtable();//����������ϣ�����
    Hashtable hashtable2=new Hashtable();
    hashtable1.put("�߲�",s1); //��s1��ӵ���ϣ�����1�У����Ҹ��ַ�����������Ϊ"�߲�"����s2��ӵ���ϣ�����1�У����Ҹ��ַ�����������Ϊ"ˮ��"������ϣ�����1��ӵ���ϣ�����2�У����Ҹ��ַ�����������Ϊ"����"����s3��ӵ���ϣ�����2�У����Ҹ��ַ�����������Ϊ"�е�"
    hashtable1.put("ˮ��",s2);
    hashtable1.put("����",hashtable2);
    hashtable2.put("�е�",s3);
    Font font = new Font("Dialog", Font.PLAIN, 12);
    Enumeration keys = UIManager.getLookAndFeelDefaults().keys();
   /**����widnows����**/
    while (keys.hasMoreElements()) {
         Object key = keys.nextElement();
         if (UIManager.get(key) instanceof Font) {
             UIManager.put(key, font);
         }
   } 
   try{
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//���ý���Ĺ۸���  
   }catch(Exception el){
      System.exit(0);  
   }
   /**����widnows����**/
    JTree tree=new JTree(hashtable1);
    JScrollPane scrollPane=new JScrollPane();
    scrollPane.setViewportView(tree);
  	contentPane.add(scrollPane);
  	f.pack();
  	f.setVisible(true);
  	f.addWindowListener(new WindowAdapter(){
  		 public void windowClosing(WindowEvent e){
  		   System.exit(0);	
  		 }
  	});
  }		
  public static void main(String[] args){
  	 new test2();
  }
}
