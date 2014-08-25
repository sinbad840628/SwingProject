package com.swing.test;

import   javax.swing.*;   
import   java.awt.*;   
import   java.awt.event.*;   
import   javax.swing.text.*;   
import   java.io.*;   
  
public   class   TestPaneDemo   {   
    JFrame   frame;   
    JTextPane   textPane;   
    File   file;   
    Icon   image;   
  
    public   TestPaneDemo(){   
        frame   =   new   JFrame("JTextPane");   
        textPane   =   new   JTextPane();   
        file   =   new   File("./classes/test/icon.gif");   
        image   =   new   ImageIcon(file.getAbsoluteFile().toString());   
    }   
  
    public   void   insert(String   str,   AttributeSet   attrSet)   {   
        Document   doc   =   textPane.getDocument();   
        str   ="\n"   +   str   ;   
        try   {   
            doc.insertString(doc.getLength(),   str,   attrSet);   
        }   
        catch   (BadLocationException   e)   {   
            System.out.println("BadLocationException:   "   +   e);   
        }   
    }   
  
    public   void   setDocs(String   str,Color   col,boolean   bold,int   fontSize)   {   
        SimpleAttributeSet   attrSet   =   new   SimpleAttributeSet();   
        StyleConstants.setForeground(attrSet,   col);   
        //��ɫ   
        if(bold==true){   
            StyleConstants.setBold(attrSet,   true);   
        }//��������   
        StyleConstants.setFontSize(attrSet,   fontSize);   
        //�����С   
        insert(str,   attrSet);   
    }   
  
    public   void   gui()   {   
        textPane.insertIcon(image);   
        setDocs("��һ�е�����",Color.red,false,20);   
        setDocs("�ڶ��е�����",Color.BLACK,true,25);   
        setDocs("�����е�����",Color.BLUE,false,20);   
        frame.getContentPane().add(textPane,   BorderLayout.CENTER);   
        frame.addWindowListener(new   WindowAdapter()   {   
            public   void   windowClosing(WindowEvent   e)   {   
                System.exit(0);   
            }});   
        frame.setSize(200,300);   
        frame.setVisible(true);   
    }   
    public   static   void   main(String[]   args)   {   
        TestPaneDemo   test   =   new   TestPaneDemo();   
        test.gui();   
    }   
}