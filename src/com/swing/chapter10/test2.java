package com.swing.chapter10;

//��γ��������Ҫ��Ϊ����չʾ��δ���һ�����п�ѡ���ļ����͵ĶԻ���
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;//���������ڳ�����Ҫʹ�õ�File��FileFilter����,���Ҫʹ��import File��FileFilter��������.
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
     
     JButton b=new JButton("���ļ�");
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
  //�����û�����"�򿪾��ļ�"��ť�¼�.
  public void actionPerformed(ActionEvent e)
{
  	 fileChooser=new JFileChooser("C:\\winnt");//��c:\\winntΪ���ļ�Ϊ�Ի����Ĭ��·��
      //����addChoosableFileFilter()�������������˵��ļ�����,ʹ��addChoosableFileFilter()���Լ�������ļ�����, 
      //����ֻ��Ҫ���˳�һ���ļ�����,��ʹ��setFileFilter()����.
  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("class"));
  	 fileChooser.addChoosableFileFilter(new JAVAFileFilter("java"));
  	 int result=fileChooser.showOpenDialog(f);
///���ѡ��ȷ����ť�Ļ�����ô����Դ����е��ļ�
  	 if (result==JFileChooser.APPROVE_OPTION)
{
  	   File file=fileChooser.getSelectedFile();
  	   label.setText("��ѡ����:"+file.getName()+"�ļ�");	  	   
  	 }
///�����������ȡ���Ļ�����ô�ͻ��ڱ�ǩ����ʾ"��û��ѡȡ�ļ�"
else if (result==fileChooser.CANCEL_OPTION){
  	 	label.setText("��û��ѡȡ�ļ�");
  	 }
  }
}
//��JAVAFileFilter��̳�FileFilter������,��ʵ��accept()��getDescription()����.
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
    	if (ext.equals("java"))
    	    return "JAVA Source File(*.java)";
    	if (ext.equals("class"))
    	    return "JAVA Class File(*.class)";
    	return "";
    }
}
