//��γ�����Ҫ�Ǵ���һ���ı��������Ȼ��ʹ���������Ŀ�����ճ����������������
import java.awt.event.*;
import javax.swing.*;
//Download by http://www.codefans.net
public class test6  implements ActionListener
{
	JTextArea textarea=null;
	JButton button1,button2,button3;
	public test6(){
      JFrame f=new JFrame("�ı������Դ���	");	
      Container contentPane=f.getContentPane();
      contentPane.setLayout(new BorderLayout());
       textarea=new JTextArea(10,15);//����һ���ı�������Ȼ�˶��󳤶�Ϊ10���ַ������Ϊ15���ַ�
         JScrollPane scrollPane=new JScrollPane(textarea);//���ı������뵽����������У�ʹ���ı���������Թ����۲�
         JPanel panel=new JPanel();
         panel.setLayout(new GridLayout(1,3));
         button1=new JButton("����");
         button1.addActionListener(this);
         button2=new JButton("ճ��");
         button2.addActionListener(this);
         button3=new JButton("����");
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

    public void actionPerformed(ActionEvent e) //�˷���Ϊ��ť����Ķ���ʱ��
{
      if (e.getSource()==button1) //������������ť����ִ�п�������
{
        textarea.copy();	
      }	
      if (e.getSource()==button2) //������ճ����ť����ִ��ճ������
{
        textarea.paste();	
      }	
      if (e.getSource()==button3)
{
        textarea.cut();	//���������а�ť����ִ�м��й���
      }	
    }
}
