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
public class friendinfo extends JPanel
{	
	private static final long serialVersionUID = 1L;
	static  JComboBox nameinput;
	 friendstore store=new friendstore();
	 Connection con=store.getConnection(); 
	 static  JTextField sexyinput;
	 static  JTextField birthdayinput;
	 static  JTextField addressinput;
	 static  JTextField companyinput;
	 static  JTextField dutyinput;
	 static  JTextField salaryinput;
	 String sql="select * from comfriend";
///���淽���ĺ����ǿ�����������������
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	friendinfo()
	{     
		  GridBagLayout lay=new GridBagLayout();
		  setLayout(lay);
		  JLabel name=new JLabel("����");
	       JLabel sex=new JLabel("�Ա�");
	       JLabel birthday=new JLabel("��������");
	       JLabel address=new JLabel("��ͥ��ַ");
	       JLabel company=new JLabel("���ڹ�˾");
	       JLabel duty=new JLabel("ְλ");
	       JLabel salary=new JLabel("нˮ");       
		  salaryinput=new JTextField(10);
	       nameinput=new JComboBox();
	       sexyinput=new JTextField(10);
	       birthdayinput=new JTextField(10);
	       addressinput=new JTextField(10);
	       companyinput=new JTextField(20);
	       dutyinput=new JTextField(10);
	       JLabel title=new JLabel("���ѻ�����Ϣ");
	       GridBagConstraints constraints=new GridBagConstraints();
	       constraints.fill=GridBagConstraints.NONE;
	       constraints.weightx=4;
	       constraints.weighty=6;
///ʹ�������鲼����ӿؼ�
		  add(title,constraints,0,0,4,1);                 
	       add(name,constraints,0,1,1,1);
	       add(sex,constraints,0,2,1,1);
	       add(birthday,constraints,0,3,1,1);
	       add(address,constraints,0,4,1,1);
	       add(nameinput,constraints,1,1,1,1);
	       add(sexyinput,constraints,1,2,1,1);
	       add(birthdayinput,constraints,1,3,1,1);
	       add(addressinput,constraints,1,4,1,1);
	       add(company,constraints,2,1,1,1);
	       add(duty,constraints,2,2,1,1);
	       add(salary,constraints,2,3,1,1);
	       add(companyinput,constraints,3,1,1,1);
	       add(dutyinput,constraints,3,2,1,1);
	       add(salaryinput,constraints,3,3,1,1);
	       Vector vec=store.getfriend(con,sql);
///����Vector���ݽṹ���󣬽��洢�����еĻ����������������ȡ�������ٽ����ݷŵ��ı�
  ///�������ȥ���������ͨ��ֱ�ӵ���ǰ������Ѵ洢���еķ�������ȡ���ݽṹ�е�����
	        for(int i=0;i<vec.size();i++)
	        {     
	            friend one =(friend)vec.get(i);
	            String nameselect=one.getname();
	            nameinput.addItem(nameselect);
	        } 
	        String namestring=(String)nameinput.getSelectedItem();
	        friend p=store.getobject(con,namestring);       
	        String inputsex=p.getsex();
	        String inputbirthday=p.getbirthday();
	        String inputaddress=p.getaddress();
	        String inputcompany=p.getcompany();
	        String inputduty=p.getduty();
	        String inputsalary=p.getsalary();
	        sexyinput.setText(inputsex);
	        birthdayinput.setText(inputbirthday);
	        addressinput.setText(inputaddress);
	        companyinput.setText(inputcompany);
	        dutyinput.setText(inputduty);   
	        salaryinput.setText(inputsalary);
///��ѡ������ѡ�����������ʱ�������¼�������ѡ�����κ�һ�����������Ὣ���ݽṹ�е��������ݶ���ȡ���������ղ�ͬ���ı�����������С�
	        nameinput.addItemListener(new ItemListener ()
	        { 
	            public void itemStateChanged(ItemEvent e)
	            {
	            	String namestring=(String)nameinput.getSelectedItem();
	    	        friend p=store.getobject(con,namestring);       
	    	        String inputsex=p.getsex();
	    	        String inputbirthday=p.getbirthday();
	    	        String inputaddress=p.getaddress();
	    	        String inputcompany=p.getcompany();
	    	        String inputduty=p.getduty();
	    	        String inputsalary=p.getsalary();
	    	        sexyinput.setText(inputsex);
	    	        birthdayinput.setText(inputbirthday);
	    	        addressinput.setText(inputaddress);
	    	        companyinput.setText(inputcompany);
	    	        dutyinput.setText(inputduty);   
	    	        salaryinput.setText(inputsalary);
	            }
	        });
	}
}
