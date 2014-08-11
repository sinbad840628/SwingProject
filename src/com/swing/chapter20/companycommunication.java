package com.swing.chapter20;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class companycommunication 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JComboBox nameinput;
	String sql="select * from company ";
	companystore store=new companystore();
	Connection con=store.getConnection(); 
	static JTextField homephonetext;
	static JTextField moteltext;
	static JLabel title;
	static JLabel title1;
	static JLabel name;
	static JButton closebutton;
	static JPanel pane;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        pane.add(c,constraints);
    } 
	companycommunication()
	{
		pane=new JPanel();
		 GridBagLayout lay=new GridBagLayout();
		 pane.setLayout(lay);
		 GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=6;
	      constraints.weighty=6;
	      title=new JLabel("��˾�绰����");
	      title1=new JLabel("���˵绰����");
	      name=new JLabel("����");
	      nameinput=new JComboBox();
	      homephonetext=new JTextField(20);
	      moteltext=new JTextField(20);
	      closebutton=new JButton("�رմ˴���");
	      add(title,constraints,1,1,3,1);
	      add(homephonetext,constraints,1,2,3,1);
	      add(title1,constraints,1,3,3,1);
	      add(moteltext,constraints,1,4,3,1);
	      add(closebutton,constraints,2,5,3,1);
	      add(name,constraints,1,0,1,1);
	      add(nameinput,constraints,2,0,1,1);
///�����ݽṹ�еĻ���������ȡ���ݣ��ٽ����ݷŵ��ı�����
	      Vector vec=store.getcompany(con,sql);
	        for(int i=0;i<vec.size();i++)
	        {     
	            company one =(company)vec.get(i);
	            String nameselect=one.getname();
	            nameinput.addItem(nameselect);
	        }
	        String namestring=(String)nameinput.getSelectedItem();
	        company p=store.getobject(con,namestring);       
	        String inputtel=p.gettel();
	        String inputmotel=p.getmotel();
	        homephonetext.setText(inputtel);
	        moteltext.setText(inputmotel);
///���������ı����¼��������������б���е�����ѡ������ı�������ʾ����Ӧ�����ĵ绰������ֻ�������Ϣ

	        nameinput.addItemListener(new ItemListener ()
	        { 
	            public void itemStateChanged(ItemEvent e)
	            {
	            	String namestring=(String)nameinput.getSelectedItem();
	    	        company p=store.getobject(con,namestring);       
	    	        String inputtel=p.gettel();
	    	        String inputmotel=p.getmotel();
	    	        homephonetext.setText(inputtel);
	    	        moteltext.setText(inputmotel);
	            }
 });
	        closebutton.addActionListener(new ActionListener()
	        {
	            public void actionPerformed(ActionEvent Event) 
	            {
	            	pane.setVisible(false);
	            }
	        });
	        pane.setVisible(false);
	}
}
