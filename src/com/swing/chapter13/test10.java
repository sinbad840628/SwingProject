//��γ��������ҪΪ����չʾ��δ���һ���˵��͹�������������ҽ��˵��еļ����˵�����ȡ��������Ϊ�������еĹ��߰�ť��
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test10  
{
	�� private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    JFrame f;
    JMenuItem item1;
    JPanel p;
    JTabbedPane tp;
    public test10() 
    {
      ����������������//�������мӺڲ���������ͬ
      JButton button1 = new JButton("ĥɰ�ֳ�ְ����Ϣ");
      JButton button2 = new JButton("��ɴ�ֳ�ְ����Ϣ");
      JButton button3 = new JButton("���²�ְ����Ϣ");
      JToolBar bar = new JToolBar();
      bar.add(button1);   
      bar.add(button2);        
      bar.add(button3);
      p.add("North",bar);
      ����������������//�������мӺڲ���������ͬ

///���������е�һ�����߰�ť�Ķ����¼����书����ǰ��ĳ����в˵����һ��
      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	    ����������������//�������в˵������¼��Ӻڲ���������ͬ
          }
      }
      );
     
      item4.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	int i=JOptionPane.showConfirmDialog(null,"�Ƿ������Ҫ�˳�ϵͳ","�˳�ȷ�϶Ի���", JOptionPane.YES_NO_CANCEL_OPTION);
        	if(i==0)
        	{
        		f.dispose();
        	}
          }
      }
      );
      menu1.addMenuListener(new MenuListener()
      {
    	  public void menuSelected(MenuEvent event)
    	  {
    		  item2.setEnabled(!item1.isSelected());
    	  }
    	  public void menuDeselected(MenuEvent event){}
    	  public void menuCanceled(MenuEvent event){}
      });
    }
public static void main(String args[]) 
{
  new test10();
 }
}
class info extends JPanel
{
����������������//����������ͬλ�üӺڲ���������ͬ
}
