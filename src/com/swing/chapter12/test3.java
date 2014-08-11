package com.swing.chapter12;

//这段程序代码主要向读者展示如何在主运行函数中创建一个JApplet
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class test3 extends JApplet {
public void init() {
	//Download by http://www.codefans.net
getContentPane().add(new JLabel("Applet!"));
}
// 应用程序入口：
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
