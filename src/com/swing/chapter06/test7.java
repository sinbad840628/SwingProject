//这段程序主要是创建一个JTabbedPane面板，为每一个标签设置一个名称
import javax.swing.*;
import java.awt.*;
public class test7
{
 public static void main(String[] args)
 {
  try
{//显示外观风格
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e){} 
JFrame frame = new JFrame ("资金状况");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);//默认为false
  JTabbedPane tp=new JTabbedPane();//创建一个选项卡容器，将之添加到顶层容器内
  frame.setContentPane(tp);
  JPanel panel1 = new JPanel ();
  JPanel panel2 = new JPanel ();
  JPanel panel3 = new JPanel ();
  JPanel panel4 = new JPanel ();
  JPanel panel5 = new JPanel ()
  tp.addTab("panel1", panel1); //添加选项卡容器，并且设置其中每个选项卡的标签以及其是否可启用
  tp.setEnabledAt(0,true);
  tp.setTitleAt(0,"个人收入状况");
  tp.addTab ("panel2", panel2);
  tp.setEnabledAt (1, true);
  tp.setTitleAt (1,"工资");
  tp.addTab ("panel3", panel3);
  tp.setEnabledAt (2, true);
  tp.setTitleAt (2,"奖金");
  tp.addTab ("panel4", panel4);
  tp.setEnabledAt(0,true);
  tp.setTitleAt(3,"津贴");
  tp.addTab ("panel5", panel5);
  tp.setEnabledAt(4,true);
  tp.setTitleAt(4,"社保");
///设置其大小以及其选项卡的位置方向
  tp.setPreferredSize (new Dimension (500,200));
  tp.setTabPlacement (JTabbedPane.TOP);
///设置选项卡在容器内的显示形式
  tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
  frame.pack();
 }
}
