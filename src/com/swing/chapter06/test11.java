//这段程序代码主要是创建一个JRootPane面板，然后，在这个面板中添加菜单
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test11 extends JFrame 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=600;
    static final int HEIGHT=300;
    public test11() 
    {
     super("测试窗口");//设置顶层容器的标题，并且将rootPane设置为其依附在顶层容器上的面板
     JRootPane rp=new JRootPane();
     super.setContentPane(rp);
      JMenuBar menubar1=new JMenuBar();//创建一个菜单，并且将菜单添加到rootPane 中。
      rp.setJMenuBar(menubar1);
      JMenu menu1=new JMenu("文件");
      JMenu menu2=new JMenu("编辑"); //创建菜单项
      JMenu menu3=new JMenu("视图");
      JMenu menu4=new JMenu("帮助");
      menubar1.add(menu1);
      menubar1.add(menu2);
      menubar1.add(menu3);
      JMenuItem item1=new JMenuItem("打开");
      JMenuItem item2=new JMenuItem("保存");
      JMenuItem item3=new JMenuItem("打印");
      JMenuItem item4=new JMenuItem("退出");
      menu1.add(item1);
      menu1.add(item2);
      menu1.addSeparator();
      menu1.add(item3);
      menu1.addSeparator();
      menu1.add(item4);
      this.setVisible(true);
      }
public static void main(String args[]) {
  new test11();
 }
}
