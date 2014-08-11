//这段代码主要是让读者清楚如何在带有菜单的顶层容器中添加普通组件。
import javax.swing.*;
public class test2
{
    static  final int WIDTH=300;
    static  final int HEIGHT=400;
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        frame.setTitle("测试窗口");
        JPanel pane=new JPanel();
        JMenuBar menubar=new JMenuBar();
        frame.setContentPane(pane);
        frame.setJMenuBar(menubar);
        JLabel label1=new JLabel("标签"); //创建四个标签组件
        JLabel label2=new JLabel("标签");
        JLabel label3=new JLabel("标签");
        JLabel label4=new JLabel("标签");
        pane.add(label1);
        pane.add(label2);
        pane.add(label3);
        pane.add(label4);        
        JMenu menu1=new JMenu("菜单一"); //创建菜单
        JMenu menu2=new JMenu("菜单二");
        JMenu menu3=new JMenu("菜单三");
        JMenu menu4=new JMenu("菜单四");
        menubar.add(menu1);
        menubar.add(menu2);
        menubar.add(menu3);
        menubar.add(menu4);
        JMenuItem item1=new JMenuItem("菜单项一");
        JMenuItem item2=new JMenuItem("菜单项二");
        JMenuItem item3=new JMenuItem("菜单项三");
        JMenuItem item4=new JMenuItem("菜单项四");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);

        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
    }
}
