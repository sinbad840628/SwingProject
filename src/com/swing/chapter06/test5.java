//这段程序代码主要是创建一个分割内容面板将顶层容器分成两个部分，将两个普通按钮组件分别加到被分割的两个部分容器中
import javax.swing.*;
import java.awt.Dimension;
public class test5
{
 public static void main (String[] args)
 {
  JButton b1= new JButton ("确定");//创建两个普通按钮组件
  JButton b2 = new JButton ("取消");
  JSplitPane splitPane = new JSplitPane ();//创建一个分隔容器类
  splitPane.setOneTouchExpandable (true); //让分割线显示出箭头
  splitPane.setContinuousLayout (true); //当用户操作分割线箭头时，系统会重绘图形
  splitPane.setPreferredSize (new Dimension (100,200));
  splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT); //设置分割线为水平分割线
  splitPane.setLeftComponent (b1); //将b1放到分割线左边，将b2放到分割线右边
  splitPane.setRightComponent (b2);
  splitPane.setDividerSize (3); //设置分割线大小为3个单位
  splitPane.setDividerLocation(50); //设置分割线的位置位于中间
  JFrame frame = new JFrame ("测试窗口");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);
  frame.setContentPane (splitPane);
  frame.pack ();
 }
}
