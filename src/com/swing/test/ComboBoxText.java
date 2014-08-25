package com.swing.test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxText {
 private String[][] xxx = {
   {"浙江","杭州","温州","绍兴","舟山",},
   {"江苏","南京","无锡","徐州","蒙眬",},
   {"上海","闵行区","普陀区","金山区",},
 };
 
 private Object[] a(){
  Object[] os = new Object[xxx.length];
  for(int i=0; i<xxx.length; i++){
   os[i]=xxx[i][0];
  }
  return os;
 }
 
 private Object[] b(Object a){
  for(int i=0; i<xxx.length; i++){
   if(xxx[i][0].equals(a)){
    Object[] o = new Object[xxx[i].length-1];
    for(int j=0; j<o.length; j++)
     o[j]=xxx[i][j+1];
    return o;
   }
  }
  return new Object[]{};
 }
 
 public static void main(String[] args) {
  final ComboBoxText ct = new ComboBoxText();
  final JComboBox ca = new JComboBox(ct.a());
  final JComboBox cb = new JComboBox();
  ca.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e) {
    cb.removeAllItems();
    Object selected = ca.getSelectedItem();
    Object[] newItems = ct.b(selected);
    for(int i=0; i<newItems.length; i++)
     cb.addItem(newItems[i]);
   }
  });
  ca.setSelectedIndex(-1);
  JFrame f = new JFrame();f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  f.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
  f.add(ca);f.add(cb);f.setVisible(true);
  f.setSize(200,100);
 }
}
