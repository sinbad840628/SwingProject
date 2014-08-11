//这段程序代码主要为读者展示如何创建一个菜单和工具条组件，并且将菜单中的几个菜单项提取出来，作为工具条中的工具按钮。
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test10  
{
	　 private static final long serialVersionUID = 1L;
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
      ……………………//与上例中加黑部分内容相同
      JButton button1 = new JButton("磨砂分厂职工信息");
      JButton button2 = new JButton("纺纱分厂职工信息");
      JButton button3 = new JButton("人事部职工信息");
      JToolBar bar = new JToolBar();
      bar.add(button1);   
      bar.add(button2);        
      bar.add(button3);
      p.add("North",bar);
      ……………………//与上例中加黑部分内容相同

///处理工具条中第一个工具按钮的动作事件，其功能与前面的程序中菜单项功能一样
      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	    ……………………//与上例中菜单动作事件加黑部分内容相同
          }
      }
      );
     
      item4.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent Event) 
          {
        	int i=JOptionPane.showConfirmDialog(null,"是否真的需要退出系统","退出确认对话框", JOptionPane.YES_NO_CANCEL_OPTION);
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
……………………//与上例中相同位置加黑部分内容相同
}
