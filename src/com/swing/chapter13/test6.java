//这段程序代码主要是为读者展示如何创建一个复选框菜单项
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
　　　Item1=new JCheckBoxMenuItem(“打开”);
      ……………………………//与上例中省略内容相同
      item1.setAccelerator( KeyStroke.getKeyStroke('O', java.awt.Event.CTRL_MASK, true) );
      item2.setAccelerator( KeyStroke.getKeyStroke('S', java.awt.Event.CTRL_MASK, true) );
      item3.setAccelerator( KeyStroke.getKeyStroke('P', java.awt.Event.CTRL_MASK, true) );
      item4.setAccelerator( KeyStroke.getKeyStroke('Q', java.awt.Event.CTRL_MASK, true) );
      ……………………………//与上例中省略内容相同

      menu1.addMenuListener(new MenuListener()
      {//在菜单鼠标监听器接口中，设置当点击打开菜单项时，保存菜单项将被禁用
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
