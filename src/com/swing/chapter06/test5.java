//��γ��������Ҫ�Ǵ���һ���ָ�������彫���������ֳ��������֣���������ͨ��ť����ֱ�ӵ����ָ����������������
import javax.swing.*;
import java.awt.Dimension;
public class test5
{
 public static void main (String[] args)
 {
  JButton b1= new JButton ("ȷ��");//����������ͨ��ť���
  JButton b2 = new JButton ("ȡ��");
  JSplitPane splitPane = new JSplitPane ();//����һ���ָ�������
  splitPane.setOneTouchExpandable (true); //�÷ָ�����ʾ����ͷ
  splitPane.setContinuousLayout (true); //���û������ָ��߼�ͷʱ��ϵͳ���ػ�ͼ��
  splitPane.setPreferredSize (new Dimension (100,200));
  splitPane.setOrientation (JSplitPane.HORIZONTAL_SPLIT); //���÷ָ���Ϊˮƽ�ָ���
  splitPane.setLeftComponent (b1); //��b1�ŵ��ָ�����ߣ���b2�ŵ��ָ����ұ�
  splitPane.setRightComponent (b2);
  splitPane.setDividerSize (3); //���÷ָ��ߴ�СΪ3����λ
  splitPane.setDividerLocation(50); //���÷ָ��ߵ�λ��λ���м�
  JFrame frame = new JFrame ("���Դ���");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
  frame.setVisible (true);
  frame.setContentPane (splitPane);
  frame.pack ();
 }
}
