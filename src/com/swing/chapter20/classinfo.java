import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.util.Vector;
public class classinfo extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
///将所有的文本框组件都设定为静态变量，目的是在其他的类中可以自由调用
///这里的 sql语句只要的目的是将数据库中表的数据提取出来
///姓名使用了下拉列表框对象
	String sql="select * from classmate";
	static  JComboBox nameinput;
	static  JTextField addressinput;
	static  JTextField homeaddressinput;
	static  JTextField sexyinput;
	static JTextField cityinput;
	static JTextField companyinput;
	static JTextField dutyinput;
	static JTextField salaryinput;
///下面两句代码的含义是建立数据库的连接
	classmatestore store=new classmatestore();
	Connection con=store.getConnection(); 
///下面方法的含义是可以在容器中添加组件
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }         
	classinfo()
	{     
		 GridBagLayout lay=new GridBagLayout(); 
	      setLayout(lay);
		  JLabel name=new JLabel("姓名");
	      JLabel sex=new JLabel("性别");
	      JLabel address=new JLabel("居住地址");
	      JLabel homeaddress=new JLabel("家庭地址");
	      JLabel city=new JLabel("所在城市");
	      JLabel company=new JLabel("所在公司");
	      JLabel duty=new JLabel("职位");
	      JLabel salary=new JLabel("薪水");       
	      nameinput=new JComboBox();
	      sexyinput=new JTextField(10);
	      addressinput=new JTextField(10);
	      homeaddressinput=new JTextField(10);
	      cityinput=new JTextField(10);
	      companyinput=new JTextField(10);
	      dutyinput=new JTextField(10);
	      salaryinput=new JTextField(10);
	      JLabel title=new JLabel("同学基本信息");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///使用网格组布局管理器添加控件
		 add(title,constraints,0,0,4,1);                 
	      add(name,constraints,0,1,1,1);
	      add(sex,constraints,0,2,1,1);
	      add(address,constraints,0,3,1,1);
	      add(homeaddress,constraints,0,4,1,1);
	      add(nameinput,constraints,1,1,1,1);
	      add(sexyinput,constraints,1,2,1,1);
	      add(addressinput,constraints,1,3,1,1);
	      add(homeaddressinput,constraints,1,4,1,1);
	      add(city,constraints,2,1,1,1);
	      add(company,constraints,2,2,1,1);
	      add(duty,constraints,2,3,1,1);
	      add(salary,constraints,2,4,1,1);
	      add(cityinput,constraints,3,1,1,1);
	      add(companyinput,constraints,3,2,1,1);
	      add(dutyinput,constraints,3,3,1,1);
	      add(salaryinput,constraints,3,4,1,1);
///建立Vector数据结构对象，将存储在其中的基本类对象中数据提取出来，再将数据放到文本
  ///框组件中去，在这里就通过直接调用前面的同学存储类中的方法而提取数据结构中的数据。
	      Vector vec=store.getclassmate(con,sql);
	        for(int i=0;i<vec.size();i++)
	        {     
	            classmate one =(classmate)vec.get(i);
	            String nameselect=one.getname();
	            nameinput.addItem(nameselect);
	        }
	        String namestring=(String)nameinput.getSelectedItem();
	        classmate p=store.getobject(con,namestring);       
	        String inputsex=p.getsex();
	        String inputaddress=p.getaddress();
	        String inputhomeaddress=p.gethomeaddress();
	        String inputcity=p.getcity();
	        String inputcompany=p.getcompany();
	        String inputduty=p.getduty();
	        String inputsalary=p.getsalary();
	        sexyinput.setText(inputsex);
	        addressinput.setText(inputaddress);
	        homeaddressinput.setText(inputhomeaddress);
	        cityinput.setText(inputcity);
	        companyinput.setText(inputcompany);
	        dutyinput.setText(inputduty);   
	        salaryinput.setText(inputsalary);
///当选择下拉选项框中任意项时发生的事件处理，当选择了任何一个姓名，将会将数据结构中的所有数据都提取出来，按照不同的文本框将其放入其中。
	        nameinput.addItemListener(new ItemListener ()
	        { 
	            public void itemStateChanged(ItemEvent e)
	            {
	            	String namestring=(String)nameinput.getSelectedItem();
	     	        classmate p=store.getobject(con,namestring);       
	     	        String inputsex=p.getsex();
	     	        String inputaddress=p.getaddress();
	     	        String inputhomeaddress=p.gethomeaddress();
	     	        String inputcity=p.getcity();
	     	        String inputcompany=p.getcompany();
	     	        String inputduty=p.getduty();
	     	        String inputsalary=p.getsalary();
	     	        sexyinput.setText(inputsex);
	     	        addressinput.setText(inputaddress);
	     	        homeaddressinput.setText(inputhomeaddress);
	     	        cityinput.setText(inputcity);
	     	        companyinput.setText(inputcompany);
	     	        dutyinput.setText(inputduty);   
	     	        salaryinput.setText(inputsalary);
	            }
	        });
	}
}
