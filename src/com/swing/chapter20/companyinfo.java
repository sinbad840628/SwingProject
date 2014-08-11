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
///将所有的文本框组件都设定为静态变量，目的是在其他的类中可以自由调用
///这里的 sql语句只要的目的是将数据库中表的数据提取出来
///姓名使用了下拉列表框对象
	String sql="select * from company ";
	static  JComboBox nameinput;
///下面两句代码的含义是建立数据库的连接
	companystore store=new companystore();
	Connection con=store.getConnection(); 
	static JTextField codeinput;
	static JTextField sexinput;
	static JTextField departmentinput;
	static JTextField addressinput;
	static JTextField birthdayinput;
	static JTextField dutyinput;
	static  JTextField salaryinput;
///下面方法的含义是可以在容器中添加组件
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
		  JLabel name=new JLabel("姓名");
	      JLabel code=new JLabel("工号");
	      JLabel department=new JLabel("部门");
	      JLabel sex=new JLabel("性别");
	      JLabel address=new JLabel("家庭地址");
	      JLabel birthday=new JLabel("出生年月");
	      JLabel duty=new JLabel("职位");   
	      JLabel salary=new JLabel("薪水");
		 codeinput=new JTextField(10);
	      nameinput=new JComboBox();
	      departmentinput=new JTextField(10);
	      sexinput=new JTextField(10);
	      addressinput=new JTextField(10);
	      birthdayinput=new JTextField(10);
	      dutyinput=new JTextField(10);
	      salaryinput=new JTextField(10);
	      JLabel title=new JLabel("同事基本信息");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///使用网格组布局添加控件
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
///建立Vector数据结构对象，将存储在其中的基本类对象中数据提取出来，再将数据放到文本
 /// 框组件中去，在这里就通过直接调用前面的同事存储类中的方法而提取数据结构中的数据。
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
///当选择下拉选项框中任意项时发生的事件处理，当选择了任何一个姓名，将会将数据结构中的所有数据都提取出来，按照不同的文本框将其放入其中。
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
