//��γ�����Ҫ�Ǵ���һ��JTabbedPane��壬Ϊÿһ����ǩ����һ������
import javax.swing.*;
import java.awt.*;
public class test7
{
 public static void main(String[] args)
 {
  try
{//��ʾ��۷��
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e){} 
JFrame frame = new JFrame ("�ʽ�״��");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);//Ĭ��Ϊfalse
  JTabbedPane tp=new JTabbedPane();//����һ��ѡ���������֮��ӵ�����������
  frame.setContentPane(tp);
  JPanel panel1 = new JPanel ();
  JPanel panel2 = new JPanel ();
  JPanel panel3 = new JPanel ();
  JPanel panel4 = new JPanel ();
  JPanel panel5 = new JPanel ()
  tp.addTab("panel1", panel1); //���ѡ�������������������ÿ��ѡ��ı�ǩ�Լ����Ƿ������
  tp.setEnabledAt(0,true);
  tp.setTitleAt(0,"��������״��");
  tp.addTab ("panel2", panel2);
  tp.setEnabledAt (1, true);
  tp.setTitleAt (1,"����");
  tp.addTab ("panel3", panel3);
  tp.setEnabledAt (2, true);
  tp.setTitleAt (2,"����");
  tp.addTab ("panel4", panel4);
  tp.setEnabledAt(0,true);
  tp.setTitleAt(3,"����");
  tp.addTab ("panel5", panel5);
  tp.setEnabledAt(4,true);
  tp.setTitleAt(4,"�籣");
///�������С�Լ���ѡ���λ�÷���
  tp.setPreferredSize (new Dimension (500,200));
  tp.setTabPlacement (JTabbedPane.TOP);
///����ѡ��������ڵ���ʾ��ʽ
  tp.setTabLayoutPolicy (JTabbedPane.SCROLL_TAB_LAYOUT);
  frame.pack();
 }
}
