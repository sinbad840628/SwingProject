package com.swing.chapter20;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class companyinfo extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
///�����е��ı���������趨Ϊ��̬������Ŀ���������������п������ɵ���
///����� sql���ֻҪ��Ŀ���ǽ����ݿ��б��������ȡ����
///����ʹ���������б�����
	String sql="select * from company ";
	static  JComboBox nameinput;
///�����������ĺ����ǽ������ݿ������
	companystore store=new companystore();
	Connection con=store.getConnection(); 
	static JTextField codeinput;
	static JTextField sexinput;
	static JTextField departmentinput;
	static JTextField addressinput;
	static JTextField birthdayinput;
	static JTextField dutyinput;
	static  JTextField salaryinput;
///���淽���ĺ����ǿ�����������������
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	companyinfo()
	{   
		  GridBagLayout lay=new GridBagLayout();
		  setLayout(lay);
		  JLabel name=new JLabel("����");
	      JLabel code=new JLabel("����");
	      JLabel department=new JLabel("����");
	      JLabel sex=new JLabel("�Ա�");
	      JLabel address=new JLabel("��ͥ��ַ");
	      JLabel birthday=new JLabel("��������");
	      JLabel duty=new JLabel("ְλ");   
	      JLabel salary=new JLabel("нˮ");
		 codeinput=new JTextField(10);
	      nameinput=new JComboBox();
	      departmentinput=new JTextField(10);
	      sexinput=new JTextField(10);
	      addressinput=new JTextField(10);
	      birthdayinput=new JTextField(10);
	      dutyinput=new JTextField(10);
	      salaryinput=new JTextField(10);
	      JLabel title=new JLabel("ͬ�»�����Ϣ");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///ʹ�������鲼����ӿؼ�
		 add(title,constraints,0,0,4,1);                
	      add(name,constraints,0,1,1,1);
	      add(code,constraints,0,2,1,1);
	      add(department,constraints,0,3,1,1);
	      add(sex,constraints,0,4,1,1);
	      add(nameinput,constraints,1,1,1,1);
	      add(codeinput,constraints,1,2,1,1);
	      add(departmentinput,constraints,1,3,1,1);
	      add(sexinput,constraints,1,4,1,1);
	      add(address,constraints,2,1,1,1);
	      add(birthday,constraints,2,2,1,1);
	      add(duty,constraints,2,3,1,1);
	      add(salary,constraints,2,4,1,1);
	      add(addressinput,constraints,3,1,1,1);
	      add(birthdayinput,constraints,3,2,1,1);
	      add(dutyinput,constraints,3,3,1,1);
	      add(salaryinput,constraints,3,4,1,1);
///����Vector���ݽṹ���󣬽��洢�����еĻ����������������ȡ�������ٽ����ݷŵ��ı�
 /// �������ȥ���������ͨ��ֱ�ӵ���ǰ���ͬ�´洢���еķ�������ȡ���ݽṹ�е����ݡ�
	      Vector vec=store.getcompany(con,sql);
	        for(int i=0;i<vec.size();i++)
	        {     
	            company one =(company)vec.get(i);
	            String nameselect=one.getname();
	            nameinput.addItem(nameselect);
	        }
	        String namestring=(String)nameinput.getSelectedItem();
	        company p=store.getobject(con,namestring);       
	        String inputcode=p.getcode();
	        String inputsex=p.getsex();
	        String inputbirthday=p.getbirthday();
	        String inputdepartment=p.getdepartment();
	        String inputaddress=p.getaddress();
	        String inputduty=p.getduty();
	        String inputsalary=p.getsalary();
	        sexinput.setText(inputsex);
	        codeinput.setText(inputcode);
	        birthdayinput.setText(inputbirthday);
	        addressinput.setText(inputaddress);
	        departmentinput.setText(inputdepartment);
	        dutyinput.setText(inputduty);   
	        salaryinput.setText(inputsalary);
///��ѡ������ѡ�����������ʱ�������¼�������ѡ�����κ�һ�����������Ὣ���ݽṹ�е��������ݶ���ȡ���������ղ�ͬ���ı�����������С�
	        nameinput.addItemListener(new ItemListener ()
	        { 
	            public void itemStateChanged(ItemEvent e)
	            {
	            	String namestring=(String)nameinput.getSelectedItem();
	     	        company p=store.getobject(con,namestring);       
	     	        String inputcode=p.getcode();
	     	        String inputsex=p.getsex();
	     	        String inputbirthday=p.getbirthday();
	     	        String inputdepartment=p.getdepartment();
	     	        String inputaddress=p.getaddress();
	     	        String inputduty=p.getduty();
	     	        String inputsalary=p.getsalary();
	     	        sexinput.setText(inputsex);
	     	        codeinput.setText(inputcode);
	     	        birthdayinput.setText(inputbirthday);
	     	        addressinput.setText(inputaddress);
	     	        departmentinput.setText(inputdepartment);
	     	        dutyinput.setText(inputduty);   
	     	        salaryinput.setText(inputsalary);
	            }
	        });
	}
}
