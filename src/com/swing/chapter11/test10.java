//��γ�����Ҫ�������չʾ��δ���JTextPane�����������WORD�ĵ�һ���������޸���������
import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
import java.awt.*;

public class test10{
 	private JTextPane textPane;
 	
 	public test10()
{
 	  textPane=new JTextPane();
 	  textPane.setBackground(Color.white);
 	  textPane.setEditable(false);	
 	}
	public void setRED_Bold_20(String str)
{//�˷�����Ҫ����str�ַ��������ԣ���������ֵ�����塢��ɫ��Ȼ��str���뵽JTextPane��
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// ����һ�����Լ�
 	  StyleConstants.setForeground(attrset,Color.red);//����ǰ��ɫΪ��ɫ
 	  StyleConstants.setBold(attrset,true);//��������Ϊ����
 	  insert(str,attrset);	
 	}
///�˷�����Ҫ����str�ַ��������ԣ���������ֵ�����塢��ɫ��Ȼ��str���뵽JTextPane��
 	public void setGREEN_Italic_Bold_22(String str)
{
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// ����һ�����Լ�
 	  StyleConstants.setForeground(attrset,Color.green); //����ǰ��ɫΪ��ɫ
 	  StyleConstants.setItalic(attrset,true);//��������
 	  StyleConstants.setFontSize(attrset,21);//���������С
 	  insert(str,attrset);	
 	}
///�˷�����Ҫ����str�ַ��������ԣ���������ֵ����ɫ��Ȼ��str���뵽JTextPane��
 	public void setBLack_UnderLine_Italic_24(String str)
{
 	  SimpleAttributeSet attrset=new SimpleAttributeSet();// ����һ�����Լ�
 	  StyleConstants.setForeground(attrset,Color.black); //����ǰ��ɫΪ��ɫ
 	  StyleConstants.setUnderline(attrset,true);//�������ִ��»���
 	  StyleConstants.setItalic(attrset,true);//��������
 	  StyleConstants.setFontSize(attrset,32);//���������С
 	  insert(str,attrset);	
 	}
   
 	public void insert(String str,AttributeSet attrset) //�����������Ҫ����;�ǽ��ַ������뵽JTextPane�С�
{
 	  Document docs=textPane.getDocument();//����getDocument()����ȡ��JTextPane��Document instance.0
 	  str=str+"\n";
 	  try
{
 	    docs.insertString(docs.getLength(),str,attrset); 	    	
 	  }
catch(BadLocationException ble)
{
 	     System.out.println("BadLocationException:"+ble);	
 	  }	
 	}
	public Component getComponent()
{
	  return textPane;	
	}
	public static void main(String[] args)
{
	  test10 pane=new test10();
	  pane.setRED_Bold_20("����һ���й�JAVAͼ�α�̵��鼮");
	  pane.setGREEN_Italic_Bold_22("����һ�������̵��鼮");
	  pane.setBLack_UnderLine_Italic_24("����һ���й�JAVA�����̵��鼮");
	  
	  JFrame f=new JFrame("JTextPane1");
	  f.getContentPane().add(pane.getComponent());
	  f.setSize(450,180);
     f.setVisible(true);
     f.addWindowListener(new WindowAdapter()
{
          	public void windowClosing(WindowEvent e)
{
          	  System.exit(0);	
          	}
          });
	}
}
