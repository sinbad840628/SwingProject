package com.swing.chapter06;

//��γ��������Ҫ�ǽ�������ͨ��ť��������õ�JLayeredPane�����У���Ϊ��������ť����ֳ�������ͬ�Ĳ�Σ������Ļ����͵���������һ����İ�ť��������ͻᱻ��ʾ������һ��������
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test10 extends JFrame implements ActionListener 
{
	private static final long serialVersionUID = 1L;
	static final int WIDTH=300;
    static final int HEIGHT=150;
    JLayeredPane lp=new JLayeredPane();
    static JButton b1=new JButton("ȷ��");
    static JButton b2=new JButton("ȡ��");
    public test10() 
{
///���ö��������ı���
      super("���Դ���");
      ///���½���JLayeredPane�ŵ�����������
      super.setContentPane(lp);
      b1.addActionListener(this); // ��ť�¼�
      b2.addActionListener(this);
  ����lp.add(b1, new Integer(200)); // �������ӵ�JLayeredPane�У�ָ�����ڵĲ�
  ����lp.add(b2, new Integer(300));
  ����b1.setBounds(new Rectangle(100, 100, 100, 100)); // Button����λ��
  ����b1.setVisible(true); // ��ʾ
  ����b2.setBounds(new Rectangle(50, 50, 100, 100));
  ����b2.setVisible(true);
  ����this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  ����this.setSize(360, 260);
  ����this.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) 
 {
  if (e.getActionCommand().equals("ȷ��")) 
  { // �ж����ĸ���ť�Ķ���
   lp.setLayer(b1, 300); // ���������������
   lp.setLayer(b2, 200);
  } 
  else if (e.getActionCommand().equals("ȡ��"))
  {
   lp.setLayer(b1, 200);
   lp.setLayer(b2, 300);
  }
 }
 public static void main(String args[]) {
  new test10();
 }
}
