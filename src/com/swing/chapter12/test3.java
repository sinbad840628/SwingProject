package com.swing.chapter12;

//��γ��������Ҫ�����չʾ����������к����д���һ��JApplet
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class test3 extends JApplet {
public void init() {
	//Download by http://www.codefans.net
getContentPane().add(new JLabel("Applet!"));
}
// Ӧ�ó�����ڣ�
public static void main(String[] args) {
JApplet applet = new dd();
JFrame frame = new JFrame("Applet1c");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(applet);
frame.setSize(200,80);
applet.init();
applet.start();
frame.setVisible(true);
}
}
