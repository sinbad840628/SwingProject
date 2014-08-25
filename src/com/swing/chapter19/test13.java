package com.swing.chapter19;

//��γ��������Ҫ��Ϊ����չʾ���ʹ�ò�ͬ��ģ̬��ʽ�������㴰��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 public class test13 {
     
     private static Frame f1;
     private static Dialog d11;
     private static Dialog d12;

     private static Frame f2;
     private static Dialog d21;
     private static Dialog d22;

     private static JFrame f3;
     private static JFrame f4;
     private static FileDialog fd4;

     private static WindowListener closeWindow = new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
             e.getWindow().dispose();
         }
     };
     public static void main(String[] args) 
{
         GraphicsEnvironment ge =
               GraphicsEnvironment.getLocalGraphicsEnvironment();
         GraphicsDevice gd = ge.getDefaultScreenDevice();
         GraphicsConfiguration gc = gd.getDefaultConfiguration();
         int sw = gc.getBounds().width - 64;
         int sh = gc.getBounds().height - 64;
         Label l;
         Button b;
         MenuBar mb;
         Menu m;
         MenuItem mi;
         Font labelFont = new Font("Tahoma", 24, Font.PLAIN);
         // ��һ����������
         f1 = new Frame("Parent Frame");
         f1.setBounds(32, 32, 300, 200);//���ö��������ı߿�
         f1.addWindowListener(closeWindow);
        ///�����˵�
         mb = new MenuBar();
         m = new Menu("Test");
         mi = new MenuItem("Show modeless");
         mi.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 d11.setVisible(true);
             }
         });
         m.add(mi);
         mb.add(m);
         f1.setMenuBar(mb);
         f1.setLayout(new BorderLayout());
         l = new Label("FRAME");
         l.setAlignment(Label.CENTER);//�������з�ʽ
         l.setFont(labelFont);
         l.setBackground(Color.RED);//���ñ߿���ɫ
         f1.add(l, BorderLayout.CENTER);
         f1.setVisible(true);
         d11 = new Dialog(f1, "Modeless Dialog");  //����һ���¶Ի���          
d11.setBounds(132, 132, 300, 200);//���ñ߿�
         d11.addWindowListener(closeWindow);
         d11.setLayout(new BorderLayout());
         l = new Label("MODELESS");
         l.setAlignment(Label.CENTER);
         l.setFont(labelFont);
         l.setBackground(Color.RED);//���ñ߿���ɫ
         d11.add(l, BorderLayout.CENTER);
         b = new Button("Show document-modal");
         b.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 d12.setVisible(true);
             }
         });
         d11.add(b, BorderLayout.SOUTH);

         d12 = new Dialog((Window)d11, "Document-modal Dialog",
                            Dialog.ModalityType.DOCUMENT_MODAL);//�����Ի���
         d12.setBounds(232, 232, 300, 200);//���ñ߿�
         d12.addWindowListener(closeWindow);
         d12.setLayout(new BorderLayout());
         l = new Label("DOCUMENT_MODAL");
         l.setAlignment(Label.CENTER);
         l.setFont(labelFont);
         l.setBackground(Color.RED);//���ñ߿���ɫ
         d12.add(l, BorderLayout.CENTER);
         f2 = new Frame("Parent Frame");
         f2.setBounds(sw - 300 + 32, 32, 300, 200);
         f2.addWindowListener(closeWindow);
         mb = new MenuBar();
         m = new Menu("Test");
         mi = new MenuItem("Show modeless");
         mi.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 d21.setVisible(true);
             }
         });
         m.add(mi);
         mb.add(m);
         f2.setMenuBar(mb);
         f2.setLayout(new BorderLayout());
         l = new Label("FRAME");
         l.setBackground(Color.BLUE);
         l.setAlignment(Label.CENTER);
         l.setFont(labelFont);
         f2.add(l, BorderLayout.CENTER);
         f2.setVisible(true);
         d21 = new Dialog(f2, "Modeless Dialog");//�����¶Ի���
         d21.setBounds(sw - 400 + 32, 132, 300, 200);//������߿�
         d21.addWindowListener(closeWindow);
         d21.setLayout(new BorderLayout());
         l = new Label("MODELESS");
         l.setBackground(Color.BLUE);//���ñ߿���ɫ
         l.setAlignment(Label.CENTER);
         l.setFont(labelFont);
         d21.add(l, BorderLayout.CENTER);
         b = new Button("Show document-modal");
         b.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 d22.setVisible(true);
             }
         });
         d21.add(b, BorderLayout.SOUTH);

         d22 = new Dialog((Window)d21, "Document-modal Dialog",
                           Dialog.ModalityType.DOCUMENT_MODAL);
}
 }
