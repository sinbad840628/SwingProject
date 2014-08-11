//这段程序代码主要是为读者展示如何使用哈希表创建树组件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class test2{
  public test2(){
    JFrame f=new JFrame("树组件测试");
    Container contentPane=f.getContentPane(); 
    String[] s1={"青菜","大蒜","大葱"};//创建三个字符串数组	
    String[] s2={"苹果","梨子","香蕉"};
    String[] s3={"馒头","包子","饺子","馄饨","面条"};
    Hashtable hashtable1=new Hashtable();//创建两个哈希表对象
    Hashtable hashtable2=new Hashtable();
    hashtable1.put("蔬菜",s1); //将s1添加到哈希表对象1中，并且给字符串数组命名为"蔬菜"，将s2添加到哈希表对象1中，并且给字符串数组命名为"水果"，将哈希表对象1添加到哈希表对象2中，并且给字符串数组命名为"点心"，将s3添加到哈希表对象2中，并且给字符串数组命名为"中点"
    hashtable1.put("水果",s2);
    hashtable1.put("点心",hashtable2);
    hashtable2.put("中点",s3);
    Font font = new Font("Dialog", Font.PLAIN, 12);
    Enumeration keys = UIManager.getLookAndFeelDefaults().keys();
   /**定义widnows界面**/
    while (keys.hasMoreElements()) {
         Object key = keys.nextElement();
         if (UIManager.get(key) instanceof Font) {
             UIManager.put(key, font);
         }
   } 
   try{
      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//设置界面的观感器  
   }catch(Exception el){
      System.exit(0);  
   }
   /**定义widnows界面**/
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
