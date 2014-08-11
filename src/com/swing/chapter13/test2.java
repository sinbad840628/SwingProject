//这段程序代码主要是为读者展示如何在菜单中添加菜单项
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test2 extends JFrame 
{
private static final long serialVersionUID = 1L;
static final int WIDTH=600;
    static final int HEIGHT=300;
    public test2() 
    {
      super("测试窗口");
      JRootPane rp=new JRootPane();
      super.setContentPane(rp);
      super.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();
      rp.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("文件");
      JMenu menu2=new JMenu("编辑");
      JMenu menu3=new JMenu("视图");
      JMenu menu4=new JMenu("运行");
      JMenu menu5=new JMenu("工具");
      JMenu menu6=new JMenu("帮助");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);

      JMenuItem item1=new JMenuItem("打开");//创建菜单项组件
      JMenuItem item2=new JMenuItem("保存");
      JMenuItem item3=new JMenuItem("打印");
      JMenuItem item4=new JMenuItem("退出");
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
      JMenuItem item15=new JMenuItem("版本号");
      JMenuItem item16=new JMenuItem("帮助信息");

      menu1.add(item1); //在不同的菜单组件中添加不同菜单项
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
      this.setVisible(true);
      this.pack();
      }
public static void main(String args[]) {
  new test2();
 }
}
