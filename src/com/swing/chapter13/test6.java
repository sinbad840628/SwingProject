//��γ��������Ҫ��Ϊ����չʾ��δ���һ����ѡ��˵���
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test6  
{
	   private static final long serialVersionUID = 1L;
	   static final int WIDTH=600;
    static final int HEIGHT=300;
    JPopupMenu pop;
    JMenuItem item2;
    JFrame f;
    JCheckBoxMenuItem item1;
    public test6() 
    {
������Item1=new JCheckBoxMenuItem(���򿪡�);
      ����������������������//��������ʡ��������ͬ
      item1.setAccelerator( KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true) );
      item2.setAccelerator( KeyStroke.getKeyStroke('S', java.awt.Event.CTRL_MASK, true) );
      item3.setAccelerator( KeyStroke.getKeyStroke('P', java.awt.Event.CTRL_MASK, true) );
      item4.setAccelerator( KeyStroke.getKeyStroke('Q', java.awt.Event.CTRL_MASK, true) );
      ����������������������//��������ʡ��������ͬ

      menu1.addMenuListener(new MenuListener()
      {//�ڲ˵����������ӿ��У����õ�����򿪲˵���ʱ������˵��������
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
  new test6();
 }
}
