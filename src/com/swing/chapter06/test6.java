//这段程序代码主要是将顶层窗口分成两个部分，每一个部分添加一个带流布局的内容面板，再在内容面板中添加普通按钮组件
import javax.swing.*;
import java.awt.*;
public class test6
{
 public static void main (String[] args)
 {
///创建四个普通按钮组件
  JButton b1=new JButton ("确定");
  JButton b2=new JButton ("取消");
  JButton b3=new JButton("优秀");
  JButton b4=new JButton("良好");
///创建两个中间容器，并且被设置为流布局的布局方式
  JPanel p1=new JPanel();
  JPanel p2=new JPanel();
  p1.setLayout(new FlowLayout());
  p2.setLayout(new FlowLayout());
///将b1和b2放到p1中，将b3和b4放到p2中。
  p1.add(b1);
  p1.add(b2);
  p2.add(b3);
  p2.add(b4);
  JSplitPane splitPane = new JSplitPane ();
  splitPane.setOneTouchExpandable (true);
  splitPane.setContinuousLayout (true);
  splitPane.setPreferredSize (new Dimension (50,100));
  splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT);
splitPane.setLeftComponent (p1);
  splitPane.setRightComponent (p2);
  splitPane.setDividerSize (3);
  splitPane.setDividerLocation(50);
  JFrame frame = new JFrame ("测试窗口");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);
  frame.setContentPane (splitPane);
  frame.pack ();
 }
}
