//这段程序代码主要是为读者展示如何创建一个具有可选择文件类型的对话框
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;//由于我们在程序中要使用到File与FileFilter对象,因此要使用import File与FileFilter这两个类.
import javax.swing.filechooser.FileFilter;
public class test2 implements ActionListener
{
  JFrame f=null;
  JLabel label=null;
  JFileChooser fileChooser=null;
  public test2()
{
     f=new JFrame("FileFilterDemo");	
     Container contentPane=f.getContentPane();
     
     JButton b=new JButton("打开文件");
     b.addActionListener(this);
     
     label=new JLabel(" ",JLabel.CENTER);
     label.setPreferredSize(new Dimension(150,30));
     contentPane.add(label,BorderLayout.CENTER);
     contentPane.add(b,BorderLayout.SOUTH);
     f.pack();
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter(){
     	public void windowClosing(WindowEvent e){
     	  System.exit(0);	
     	}     	
     });
  }	
  public static void main(String[] args)
{
  	  new test2();
  }
  //处理用户按下"打开旧文件"按钮事件.
  public void actionPerformed(ActionEvent e)
{
  	 fileChooser=new JFileChooser("C:\\winnt");//以c:\\winnt为打开文件为对话框的默认路径
      //利用addChoosableFileFilter()方法加入欲过滤的文件类型,使用addChoosableFileFilter()可以加入多种文件类型, 
      //若你只需要过滤出一种文件类型,可使用setFileFilter()方法.
  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("class"));
  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("java"));
  	 int result=fileChooser.showOpenDialog(f);
///如果选择确定按钮的话，那么则可以打开现有的文件
  	 if (result==JFileChooser.APPROVE_OPTION)
{
  	   File file=fileChooser.getSelectedFile();
  	   label.setText("你选择了:"+file.getName()+"文件");	  	   
  	 }
///否则如果单击取消的话，那么就会在标签中显示"你没有选取文件"
else if (result==fileChooser.CANCEL_OPTION){
  	 	label.setText("你没有选取文件");
  	 }
  }
}
//以JAVAFileFilter类继承FileFilter抽象类,并实现accept()与getDescription()方法.
class JAVAFileFilter extends FileFilter
{
    String ext;
    public JAVAFileFilter(String ext){
        this.ext=ext;	
    }	
   /*在accept()方法中,当程序所抓到的是一个目录而不是文件时,我们返回true值,表示将此目录显示出来.*/
    public boolean accept(File file)
{
      if (file.isDirectory())
{
         return true;	
      }	
      String fileName=file.getName();
      int index=fileName.lastIndexOf('.');
      if (index>0 && index<fileName.length()-1)
{
      	  //表示文件名称不为".xxx"现"xxx."之类型
      	  String extension=fileName.substring(index+1).toLowerCase();
          //若所抓到的文件扩展名等于我们所设置要显示的扩展名(即变量ext值),则返回true,表示将此文件显示出来,否则返回true.
      	  if (extension.equals(ext))
      	    return true;
      }
      return false;
    }
    //实现getDescription()方法,返回描述文件的说明字符串!!!
    public String getDescription()
{
    	if (ext.equals("java"))
    	    return "JAVA Source File(*.java)";
    	if (ext.equals("class"))
    	    return "JAVA Class File(*.class)";
    	return "";
    }
}
