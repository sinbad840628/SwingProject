package com.swing.chapter05;
//��δ�����Ҫ��Ϊ����չʾ���ʹ��GroupLayout���ֹ��������в���
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class test11 extends JFrame 
{
private static final long serialVersionUID = 1L;
public test11() throws HeadlessException 
{
   Container c = getContentPane();//����һ���м����������Ҵ���һ��GroupLayout���ֹ���������
   GroupLayout layout = new GroupLayout(c);
   JButton b1 = new JButton("��ť 1");//����������ͨ��ť������ı������
   JButton b2 = new JButton("��ť 2");
   JTextField text = new JTextField("�ı�"); 
   GroupLayout.SequentialGroup hsg = layout.createSequentialGroup();//����һ��hsg�飬��������ťһ��һ������ӵ�������
   hsg.addComponent(b1);
   hsg.addComponent(b2);
   GroupLayout.ParallelGroup hpg = 
   layout.createParallelGroup(GroupLayout.Alignment.CENTER); //����һ��hpg�飬���ı��������������Ǹ�����ӵ����У����Ҿ�������
   hpg.addComponent(text).addGroup(hsg); 
   layout.setHorizontalGroup(hpg); //��ˮƽ����ȷ��hpg����������ť�����λ��
   GroupLayout.ParallelGroup vpg = layout.createParallelGroup();//����һ��vpg�飬����ˮƽ��������������ť�����λ��  
   vpg.addComponent(b1); 
   vpg.addComponent(b2); 
   GroupLayout.SequentialGroup vsg = layout.createSequentialGroup();// ���ı��������ǰ�������������ť�������ͬʱ��ӵ�vsg����
   vsg.addComponent(text).addGroup(vpg);
   layout.setVerticalGroup(vsg); //�ش�ֱ����ȷ��vsg��vpg���ı��������λ��
   this.setLayout(layout); 
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   pack();
}
public static void main(String[] args) 
{
test11 demo = new test11();
demo.setVisible(true);
}
}
