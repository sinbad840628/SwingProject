//��γ��������Ҫ���������Ļ����ϣ���ÿ����ǩѡ�����ӻ������
import javax.swing.*;
import java.awt.*;
public class test8
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

//�����˸���ǩ�����������м���������Ϊ�����֣����ҽ���ǩ����ֱ���뵽����
  JLabel l1=new JLabel("����״��");
  JLabel l2=new JLabel("3000Ԫ/��");
  JLabel l3=new JLabel("����״��");
  JLabel l4=new JLabel("1500Ԫ/��");
  JLabel l5=new JLabel("����״��");
  JLabel l6=new JLabel("500Ԫ/��");
  JLabel l7=new JLabel("�籣״��");
  JLabel l8=new JLabel("200Ԫ/��");
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
