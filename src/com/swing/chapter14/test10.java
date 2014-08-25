package com.swing.chapter14;

//��γ��������Ҫ��Ϊ����չʾ��δ���ѡ��������ʹ��ѡ�������Բ�ͬ�ķ�ʽѡ�����еĵ�Ԫ��
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class test10 implements ActionListener,ListSelectionListener
{
   JTable table=null;
   ListSelectionModel selectionMode=null;
   JLabel label=null;//��ʾ�û�ѡȡ���֮��
   public test10()
{
   	   JFrame f=new JFrame();
  	   Object[][] p = {
   			 {"����","91","100","191"},
   			 {"��ѩ��","82","100","182"},
   			 {"÷ͥ","47","100","147"},
   			 {"����","61","100","161"},
   			 {"���","90","100","190"},
       };
       String[] n = {"����","����","��ѧ","�ܷ�"};    
   	   table=new JTable(p,n);
   	   table.setPreferredScrollableViewportSize(new Dimension(400,80));
   	   table.setCellSelectionEnabled(true);//ʹ�ñ���ѡȡ����cellΪ��λ,����������Ϊ��λ.����û��д����,����ѡȡ�������ʱ������Ϊ��λ.
   	   selectionMode=table.getSelectionModel();//ȡ��table��ListSelectionModel.
   	   selectionMode.addListSelectionListener(this);
   	   JScrollPane s=new JScrollPane(table);
   	   JPanel panel=new JPanel();
   	   JButton b=new JButton("��һѡ��");
   	   panel.add(b);
   	   b.addActionListener(this);
   	   b=new JButton("��������ѡ��");
   	   panel.add(b);
   	   b.addActionListener(this);
   	   b=new JButton("����ѡ��");   	   
   	   panel.add(b);
   	   b.addActionListener(this);
   	   label=new JLabel("��ѡȡ��������:");
   	   Container contentPane=f.getContentPane();
   	   contentPane.add(panel,BorderLayout.NORTH);
   	   contentPane.add(s,BorderLayout.CENTER);
   	   contentPane.add(label,BorderLayout.SOUTH);
   	   f.setTitle("ѡ�����Ĳ���ʵ��");
   	   f.pack();
   	   f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });   	   
   }
      public void actionPerformed(ActionEvent e){ /*����ť�¼�,����ListSelectionModel�����������setSelectionMode()���������ñ��ѡȡģʽ.*/
   	  if (e.getActionCommand().equals("��һѡ��"))
   	     selectionMode.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   	  if (e.getActionCommand().equals("��������ѡ��"))
   	     selectionMode.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
   	  if (e.getActionCommand().equals("����ѡ��"))
   	     selectionMode.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
   	  table.revalidate();
   }    
   
   public void valueChanged(ListSelectionEvent el) /*���û�ѡȡ�������ʱ�ᴥ��ListSelectionEvent,����ʵ��ListSelectionListener������������һ�¼�.ListSelectionListener����ֻ����һ������,�Ǿ���valueChanged().*/ 	
{
   	  String tempString="";
       //JTable��getSelectedRows()��getSelectedColumns()�����᷵����ѡȡ���cell��index Array����.
   	  int[] rows=table.getSelectedRows();
   	  int[] columns=table.getSelectedColumns();
      
   	    for (int i=0;i<rows.length;i++){ //JTable��getValueAt()�����᷵��ĳ�е�cell����,����ֵ��Object��������,���Ҫ����ת��String��������.
   	      for (int j=0;j<columns.length;j++)
                tempString = tempString+" "+(String)table.getValueAt(rows[i], columns[j]);      
   	    }
   	   label.setText("��ѡȡ��������:"+tempString);
   }
   public static void main(String[] args){
   	  new test10();
   }
}
