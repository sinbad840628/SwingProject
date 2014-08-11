import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
public class test5 extends JPanel
{
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JFileChooser fileChooser = null;
    JFrame frame;
    JTextArea text;
    test5()
    {
    	……………………………………//与上例中加黑部分相同内容
    	item2.addActionListener(new ActionListener()
    	{
    		File file = null;
		     int result=0;
    		 public void actionPerformed(ActionEvent Event) 
             {
    			 fileChooser.addChoosableFileFilter(new JAVAFileFilter("doc"));
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
    	new test5();
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
    //实现getDescription()方法,返回描述文件的说明字符串!!!
   

    public String getDescription()
{
    	if (ext.equals("doc"))
    	    return "JAVA Source File(*.doc";
    	
    	return "";
    }
}
