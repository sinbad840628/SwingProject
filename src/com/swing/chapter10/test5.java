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
    	����������������������������//�������мӺڲ�����ͬ����
    	item2.addActionListener(new ActionListener()
    	{
    		File file = null;
		     int result=0;
    		 public void actionPerformed(ActionEvent Event) 
             {
    			 fileChooser.addChoosableFileFilter(new JAVAFileFilter("doc"));
    			 fileChooser.setApproveButtonText("ȷ��");
    	         fileChooser.setDialogTitle("���ļ�");
    	         result = fileChooser.showOpenDialog(frame);
    	         if (result == JFileChooser.APPROVE_OPTION)
    	            {
    	                file = fileChooser.getSelectedFile();
    	                frame.setTitle("��ѡ��򿪵��ļ�����Ϊ��"+file.getName());
    	            }
    	            else if(result == JFileChooser.CANCEL_OPTION)
    	            {
    	            	frame.setTitle("��û��ѡ���κ��ļ�");
    	            }
    	         FileInputStream fileInStream = null;
    	            if(file != null)
    	            {
    	                try{
    	                    //����FileInputStream���ļ����ݷ�������������Ա��ȡ.
    	                    fileInStream = new FileInputStream(file);
    	                }catch(FileNotFoundException fe){

    	                    return;
    	                }
    	                int readbyte;
    	                try{
    	                    //��read()������ȡFileInputStream��������,������ֵΪ-1ʱ��������������.�����������ַ���ʾ
    	                    //��textarea��.
    	                    while( (readbyte = fileInStream.read()) != -1)
    	                    {
    	                        text.append(String.valueOf((char)readbyte));
    	                    }
    	                }catch(IOException ioe){
    	                    
    	                }
    	                finally{//����FileInputStream����,������Դ���˷�.
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
///����һ���࣬��Ϊ�����ļ�����
class JAVAFileFilter extends FileFilter
{
    String ext;
    public JAVAFileFilter(String ext){
        this.ext=ext;	
    }	
   /*��accept()������,��������ץ������һ��Ŀ¼�������ļ�ʱ,���Ƿ���trueֵ,��ʾ����Ŀ¼��ʾ����.*/
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
      	  //��ʾ�ļ����Ʋ�Ϊ".xxx"��"xxx."֮����
      	  String extension=fileName.substring(index+1).toLowerCase();
          //����ץ�����ļ���չ����������������Ҫ��ʾ����չ��(������extֵ),�򷵻�true,��ʾ�����ļ���ʾ����,���򷵻�true.
      	  if (extension.equals(ext))
      	    return true;
      }
      return false;
    }
    //ʵ��getDescription()����,���������ļ���˵���ַ���!!!
   

    public String getDescription()
{
    	if (ext.equals("doc"))
    	    return "JAVA Source File(*.doc";
    	
    	return "";
    }
}
