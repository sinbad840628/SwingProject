import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
public class test4 extends JPanel
{
	   static final int WIDTH=300;
    static final int HEIGHT=150;
    JFileChooser fileChooser = null;
    JFrame frame;
    JTextArea text;
    test4()
    {
    	frame=new JFrame();
    	frame.setTitle("文件选择器测试程序");
    	frame.setVisible(true);
    	frame.setSize(WIDTH,HEIGHT);
    	text=new JTextArea(10,10);
    	add(text);
    	JMenuBar menubar=new JMenuBar();
    	JMenu menu1=new JMenu("文件");
    	JMenu menu2=new JMenu("颜色系统");
    	JMenu menu3=new JMenu("退出系统");
    	JMenuItem item1=new JMenuItem("打开txt文档");
    	JMenuItem item2=new JMenuItem("打开Word文档");
    	JMenuItem item3=new JMenuItem("保存");
    	JMenuItem item4=new JMenuItem("设置背景为红色");
    	JMenuItem item5=new JMenuItem("设置背景为蓝色");
    	JMenuItem item6=new JMenuItem("设置背景为黑色");
    	JMenuItem item7=new JMenuItem("退出系统");
    	menubar.add(menu1);
    	menubar.add(menu2);
    	menubar.add(menu3);
    	menu1.add(item1);
    	menu1.add(item2);
    	menu1.add(item3);
    	menu2.add(item4);
    	menu2.add(item5);
    	menu2.add(item6);
    	menu3.add(item7);
    	
    	frame.setJMenuBar(menubar);
    	frame.setContentPane(this);
    	
    	fileChooser = new JFileChooser("D:\\");
    	item1.addActionListener(new ActionListener()
    	{
    		File file = null;
		     int result=0;
    		 public void actionPerformed(ActionEvent Event) 
             {
    			 fileChooser.addChoosableFileFilter(new JAVAFileFilter("txt"));
    			 fileChooser.setApproveButtonText("确定");
    	         fileChooser.setDialogTitle("打开文件");
    	         result = fileChooser.showOpenDialog(frame);
    	         if (result == JFileChooser.APPROVE_OPTION)
    	            {
    	                file = fileChooser.getSelectedFile();
    	                frame.setTitle("您选择打开的文件名称为："+file.getName());
    	            }
    	            else if(result == JFileChooser.CANCEL_OPTION)
    	            {
    	            	frame.setTitle("您没有选择任何文件");
    	            }
    	         FileInputStream fileInStream = null;
    	            if(file != null)
    	            {
    	                try{
    	                    //利用FileInputStream将文件内容放入此数据流中以便读取.
    	                    fileInStream = new FileInputStream(file);
    	                }catch(FileNotFoundException fe){

    	                    return;
    	                }
    	                int readbyte;
    	                try{
    	                    //以read()方法读取FileInputStream对象内容,当返回值为-1时代表读完此数据流.将所读到的字符显示
    	                    //在textarea中.
    	                    while( (readbyte = fileInStream.read()) != -1)
    	                    {
    	                        text.append(String.valueOf((char)readbyte));
    	                    }
    	                }catch(IOException ioe){
    	                    
    	                }
    	                finally{//回收FileInputStream对象,避免资源的浪费.
    	                    try{
    	                        if(fileInStream != null)
    	                            fileInStream.close();
    	                    }catch(IOException ioe2){}
    	                }
    	            }
    	        }
    	});
    }
    public static void main(String[] args)
    {
    	new test4();
    }
}
///创建一个类，作为过滤文件类型
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
    public String getDescription()
{
    	if (ext.equals("txt"))
    	    return "JAVA Source File(*.txt";
    	
    	return "";
    }

}
