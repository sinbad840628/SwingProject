//这段程序主要是创建一个文本区组件，然后，使用这个组件的拷贝、粘贴、剪切三个功能
import java.awt.event.*;
import javax.swing.*;
//Download by http://www.codefans.net
public class test6  implements ActionListener
{
	JTextArea textarea=null;
	JButton button1,button2,button3;
	public test6(){
      JFrame f=new JFrame("文本区测试窗口	");	
      Container contentPane=f.getContentPane();
      contentPane.setLayout(new BorderLayout());
       textarea=new JTextArea(10,15);//创建一个文本区对象，然此对象长度为10个字符，宽度为15个字符
         JScrollPane scrollPane=new JScrollPane(textarea);//将文本区放入到滚动条组件中，使得文本区组件可以滚动观察
         JPanel panel=new JPanel();
         panel.setLayout(new GridLayout(1,3));
         button1=new JButton("拷贝");
         button1.addActionListener(this);
         button2=new JButton("粘贴");
         button2.addActionListener(this);
         button3=new JButton("剪切");
         button3.addActionListener(this);
           panel.add(button1);
           panel.add(button2);
           panel.add(button3);
           
           contentPane.add(scrollPane,BorderLayout.CENTER);
           contentPane.add(panel,BorderLayout.SOUTH);
           
           f.pack();
           f.setVisible(true);
           f.addWindowListener(new WindowAdapter(){
           	  public void windowClosing(WindowEvent e){
           	  	 System.exit(0);
           	  }
           });
    }	
    public static void main(String[] args){
     new test6();	
    }

    public void actionPerformed(ActionEvent e) //此方法为按钮组件的动作时间
{
      if (e.getSource()==button1) //当单击拷贝按钮，则执行拷贝功能
{
        textarea.copy();	
      }	
      if (e.getSource()==button2) //当单击粘贴按钮，则执行粘贴功能
{
        textarea.paste();	
      }	
      if (e.getSource()==button3)
{
        textarea.cut();	//当单击剪切按钮，则执行剪切功能
      }	
    }
}
