//��γ��������Ҫ�ǽ����㴰�ڷֳ��������֣�ÿһ���������һ���������ֵ�������壬������������������ͨ��ť���
import javax.swing.*;
import java.awt.*;
public class test6
{
 public static void main (String[] args)
 {
///�����ĸ���ͨ��ť���
  JButton b1=new JButton ("ȷ��");
  JButton b2=new JButton ("ȡ��");
  JButton b3=new JButton("����");
  JButton b4=new JButton("����");
///���������м����������ұ�����Ϊ�����ֵĲ��ַ�ʽ
  JPanel p1=new JPanel();
  JPanel p2=new JPanel();
  p1.setLayout(new FlowLayout());
  p2.setLayout(new FlowLayout());
///��b1��b2�ŵ�p1�У���b3��b4�ŵ�p2�С�
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
  JFrame frame = new JFrame ("���Դ���");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);
  frame.setContentPane (splitPane);
  frame.pack ();
 }
}
