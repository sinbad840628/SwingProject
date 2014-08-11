//这段程序代码主要是在上例的基础上，在每个标签选项卡中添加基本组件
import javax.swing.*;
import java.awt.*;
public class test8
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

//创建八个标签组件，将五个中间容器设置为流布局，并且将标签组件分别放入到其中
  JLabel l1=new JLabel("工资状况");
  JLabel l2=new JLabel("3000元/月");
  JLabel l3=new JLabel("奖金状况");
  JLabel l4=new JLabel("1500元/月");
  JLabel l5=new JLabel("津贴状况");
  JLabel l6=new JLabel("500元/月");
  JLabel l7=new JLabel("社保状况");
  JLabel l8=new JLabel("200元/月");
  panel2.setLayout(new FlowLayout());
  panel3.setLayout(new FlowLayout());
  panel4.setLayout(new FlowLayout());
  panel5.setLayout(new FlowLayout());
  panel2.add(l1);
  panel2.add(l2);
  panel3.add(l3);
  panel3.add(l4);
  panel4.add(l5);
  panel4.add(l6);
  panel5.add(l7);
  panel5.add(l8);
  frame.pack();
 }
}
