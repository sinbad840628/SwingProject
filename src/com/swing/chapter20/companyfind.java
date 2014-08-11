package com.swing.chapter20;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class companyfind 
{
	private static final long serialVersionUID = 1L;
	String sql="select * from company ";
	companystore store=new companystore();
	Connection con=store.getConnection(); 
	static JPanel pane;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        pane.add(c,constraints);
    }         
	companyfind()
	{     
		  pane=new JPanel();
		  GridBagLayout lay=new GridBagLayout();
		  pane.setLayout(lay);
		  JLabel name=new JLabel("����");
	      JLabel code=new JLabel("����");
	      JLabel department=new JLabel("����");
	      JLabel sex=new JLabel("�Ա�");
	      JLabel address=new JLabel("��ͥ��ַ");
	      JLabel birthday=new JLabel("��������");
	      JLabel duty=new JLabel("ְλ");   
	      JLabel salary=new JLabel("нˮ");
          JLabel namefindlabel=new JLabel("��������ѯ");
          JButton namefindbutton=new JButton("��ѯ");
          JButton closebutton=new JButton("�رմ���");
		 final JTextField codeinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField departmentinput=new JTextField(10);
	      final JTextField sexinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final JTextField birthdayinput=new JTextField(10);
	      final JTextField dutyinput=new JTextField(10);
	      final JTextField salaryinput=new JTextField(10);
	      final JTextField namefind=new JTextField(10);
	      JLabel title=new JLabel("ͬ�²�ѯ�����Ϣ");
	      JLabel title1=new JLabel("��ѯϵͳ");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1);                 //ʹ�������鲼����ӿؼ�
	      add(name,constraints,0,1,1,1);
	      add(code,constraints,0,2,1,1);
	      add(sex,constraints,0,3,1,1);
	      add(department,constraints,0,4,1,1);
	      add(nameinput,constraints,1,1,1,1);
	      add(codeinput,constraints,1,2,1,1);
	      add(sexinput,constraints,1,3,1,1);
	      add(departmentinput,constraints,1,4,1,1);
	      add(birthday,constraints,2,1,1,1);
	      add(address,constraints,2,2,1,1);
	      add(duty,constraints,2,3,1,1);
	      add(salary,constraints,2,4,1,1);
	      add(birthdayinput,constraints,3,1,1,1);
	      add(addressinput,constraints,3,2,1,1);
	      add(dutyinput,constraints,3,3,1,1);
	      add(salaryinput,constraints,3,4,1,1);
	      add(title1,constraints,0,5,4,1);
	      add(namefindlabel,constraints,0,6,1,1);
	      add(namefind,constraints,1,6,1,1);
	      add(namefindbutton,constraints,2,6,1,1);
	      add(closebutton,constraints,3,6,1,1);
///ͨ����������������ѯ���ݿ�����Ӧ����������������Ϣ�����ҽ�֮��ʾ�ڲ�ѯ���ڵ��ı����С�
	      namefindbutton.addActionListener(new ActionListener()
	      {
	    	  public void actionPerformed(ActionEvent Event) 
	            {
	      String namestring=(String)namefind.getText();
	        company p=store.getobject(con,namestring);       
	        String inputcode=p.getcode();
	        String inputsex=p.getsex();
	        String inputbirthday=p.getbirthday();
	        String inputdepartment=p.getdepartment();
	        String inputaddress=p.getaddress();
	        String inputduty=p.getduty();
	        String inputsalary=p.getsalary();
	        nameinput.setText(namefind.getText());
	        sexinput.setText(inputsex);
	        codeinput.setText(inputcode);
	        birthdayinput.setText(inputbirthday);
	        addressinput.setText(inputaddress);
	        departmentinput.setText(inputdepartment);
	        dutyinput.setText(inputduty);   
	        salaryinput.setText(inputsalary);
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
