//这段程序代码主要是为读者展示如何创建单选按钮菜单项
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class test7  
{
      JRadioButtonMenuItem  item1;
	f=new JFrame("测试窗口");
      JRootPane rp=new JRootPane();
      f.setContentPane(rp);
      f.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();
      rp.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("文件");
      JMenu menu2=new JMenu("编辑");
      JMenu menu3=new JMenu("视图");
      JMenu menu4=new JMenu("运行");
      JMenu menu5=new JMenu("工具");
      JMenu menu6=new JMenu("帮助");
     
 menu1.setMnemonic('F'); //设置了几个菜单的快捷键
      menu2.setMnemonic('E');
      menu3.setMnemonic('V');
      menu4.setMnemonic('R');
      menu5.setMnemonic('T');
      menu6.setMnemonic('H');
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);

      JMenuItem item1=new JMenuItem("打开",'O'); //设置了几个菜单项的快捷键
      JMenuItem item2=new JMenuItem("保存",'S');
      JMenuItem item3=new JMenuItem("打印",'P');
      JMenuItem item4=new JMenuItem("退出",'Q');
      JMenuItem item5=new JMenuItem("查找");
      JMenuItem item6=new JMenuItem("替换");
      JMenuItem item7=new JMenuItem("剪切");
      JMenuItem item8=new JMenuItem("拷贝");
      JMenuItem item9=new JMenuItem("展开图");
      JMenuItem item10=new JMenuItem("分屏图");
      JMenuItem item11=new JMenuItem("在dos下运行");
      JMenuItem item12=new JMenuItem("在windows下运行");
      JMenuItem item13=new JMenuItem("看图工具");
      JMenuItem item14=new JMenuItem("快速运行工具");
      JMenuItem item15=new JMenuItem("版本信息");
      JMenuItem item16=new JMenuItem("帮助信息");
      menu1.add(item1);
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu1.addSeparator();
      menu1.add(item4);
      menu2.add(item5);
      menu2.add(item6);
      menu2.addSeparator();
      menu2.add(item7);
      menu2.add(item8);
      menu3.add(item9);
      menu3.add(item10);
      menu4.add(item11);
      menu4.add(item12);
      menu5.add(item13);
      menu5.add(item14);
      menu6.add(item15);
      menu6.add(item16);
      f.setVisible(true);
      f.setSize(WIDTH,HEIGHT);
      Toolkit kit=Toolkit.getDefaultToolkit();
      Dimension screenSize=kit.getScreenSize();
      int width=screenSize.width;
      int height=screenSize.height;
      int x=(width-WIDTH)/2;
      int y=(height-HEIGHT)/2;
      f.setLocation(x,y);
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
  new test7();
 }
}
