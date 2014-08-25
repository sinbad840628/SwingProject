package com.swing.chapter10;

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
    	frame.setTitle("�ļ�ѡ�������Գ���");
    	frame.setVisible(true);
    	frame.setSize(WIDTH,HEIGHT);
    	text=new JTextArea(10,10);
    	add(text);
    	JMenuBar menubar=new JMenuBar();
    	JMenu menu1=new JMenu("�ļ�");
    	JMenu menu2=new JMenu("��ɫϵͳ");
    	JMenu menu3=new JMenu("�˳�ϵͳ");
    	JMenuItem item1=new JMenuItem("��txt�ĵ�");
    	JMenuItem item2=new JMenuItem("��Word�ĵ�");
    	JMenuItem item3=new JMenuItem("����");
    	JMenuItem item4=new JMenuItem("���ñ���Ϊ��ɫ");
    	JMenuItem item5=new JMenuItem("���ñ���Ϊ��ɫ");
    	JMenuItem item6=new JMenuItem("���ñ���Ϊ��ɫ");
    	JMenuItem item7=new JMenuItem("�˳�ϵͳ");
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
    	new test4();
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
    public String getDescription()
{
    	if (ext.equals("txt"))
    	    return "JAVA Source File(*.txt";
    	
    	return "";
    }

}
