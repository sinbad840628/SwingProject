//这段程序代码主要是为读者展示如何创建一个具有菜单条和菜单的菜单组件
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1 extends JFrame 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
    static final int HEIGHT=300;
    public test1() 
    {
      super("菜单的创建测试窗口");
      JRootPane rp=new JRootPane();
      super.setContentPane(rp);
      super.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();// 创建一个菜单条
      rp.setJMenuBar(menubar1);//将菜单条加入到根面板中
      JMenu menu1=new JMenu("文件");//创建几个菜单
      JMenu menu2=new JMenu("编辑");
      JMenu menu3=new JMenu("视图");
      JMenu menu4=new JMenu("运行");
      JMenu menu5=new JMenu("工具");
      JMenu menu6=new JMenu("帮助");
      menubar1.add(menu1); //在菜单条中添加菜单
      menubar1.add(menu2);
      menubar1.add(menu3);
      menubar1.add(menu4);
      menubar1.add(menu5);
      menubar1.add(menu6);
      this.setVisible(true);
      }
public static void main(String args[]) {
  new test1();
 }
}
