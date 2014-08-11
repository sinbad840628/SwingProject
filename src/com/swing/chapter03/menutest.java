//这段代码主要是为读者介绍如何将创建好的菜单放置在顶层容器内
import javax.swing.*;
public class menutest
{
static final int WIDTH=300;
    static final int HEIGHT=200;
public static void main(String[] args)
   {
       JFrame jf=new JFrame();
       jf.setSize(WIDTH,HEIGHT);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setTitle("学生管理系统");
       JMenuBar menubar1=new JMenuBar();//添加菜单条组件
       jf.setJMenuBar(menubar1);//将菜单条添加到顶层容器中
       JMenu menu1=new JMenu("文件");  //设置菜单组件
       JMenu menu2=new JMenu("编辑");
       JMenu menu3=new JMenu("视图");
       menubar1.add(menu1);//将菜单组件添加到菜单条组件中
       menubar1.add(menu2);
       menubar1.add(menu3);
       JMenuItem item1=new JMenuItem("打开");//创建菜单项组件
       JMenuItem item2=new JMenuItem("保存");
       JMenuItem item3=new JMenuItem("打印");
       JMenuItem item4=new JMenuItem("退出");
       menu1.add(item1); //将菜单项组件添加到相应的菜单组件中去
       menu1.add(item2);
       menu1.addSeparator();//菜单项之间的分割线组件
       menu1.add(item3);
       menu1.addSeparator();
       menu1.add(item4);
       jf.setVisible(true);
    }
}
