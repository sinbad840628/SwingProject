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
public class classmatefind 
{
	private static final long serialVersionUID = 1L;
	 String sql="select * from classmate";
	 classmatestore store=new classmatestore();
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
	classmatefind()
	{     
		 pane=new JPanel();
		 GridBagLayout lay=new GridBagLayout();
		 pane.setLayout(lay);
		 JLabel name=new JLabel("姓名");
	      JLabel sex=new JLabel("性别");
	      JLabel address=new JLabel("所在地址");
	      JLabel homeaddress=new JLabel("家庭地址");
	      JLabel city=new JLabel("所在城市");
	      JLabel company=new JLabel("所在公司");   
	      JLabel duty=new JLabel("职位");
	      JLabel salary=new JLabel("薪水");
          JLabel namefindlabel=new JLabel("按姓名查询");
          JButton namefindbutton=new JButton("查询");
          JButton closebutton=new JButton("关闭窗口");
		  final JTextField sexinput=new JTextField(10);
	      final JTextField nameinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final JTextField homeaddressinput=new JTextField(10);
	      final JTextField cityinput=new JTextField(10);
	      final JTextField companyinput=new JTextField(10);
	      final JTextField dutyinput=new JTextField(10);
	      final JTextField salaryinput=new JTextField(10);
	      final JTextField namefind=new JTextField(10);
	      JLabel title=new JLabel("同学查询结果信息");
	      JLabel title1=new JLabel("查询系统");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=7;
	      constraints.weighty=8;
		  add(title,constraints,0,0,4,1);                 //使用网格组布局添加控件
	      add(name,constraints,0,1,1,1);
	      add(sex,constraints,0,2,1,1);
	      add(address,constraints,0,3,1,1);
	      add(homeaddress,constraints,0,4,1,1);
	      add(nameinput,constraints,1,1,1,1);
	      add(sexinput,constraints,1,2,1,1);
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
	      add(title1,constraints,0,5,4,1);
	      add(namefindlabel,constraints,0,6,1,1);
	      add(namefind,constraints,1,6,1,1);
	      add(namefindbutton,constraints,2,6,1,1);
	      add(closebutton,constraints,3,6,1,1);
///通过输入姓名，来查询数据库中相应姓名的其它所有信息，并且将之显示在查询窗口的文本况中。 
	      namefindbutton.addActionListener(new ActionListener()
	      {
	    	  public void actionPerformed(ActionEvent Event) 
	            {
	    		   String namestring=namefind.getText();
	  	        classmate p=store.getobject(con,namestring);       
	  	        String inputsex=p.getsex();
	  	        String inputaddress=p.getaddress();
	  	        String inputhomeaddress=p.gethomeaddress();
	  	        String inputcity=p.getcity();
	  	        String inputcompany=p.getcompany();
	  	        String inputduty=p.getduty();
	  	        String inputsalary=p.getsalary();
	  	        nameinput.setText(namefind.getText());
	  	        sexinput.setText(inputsex);
	  	        addressinput.setText(inputaddress);
	  	        homeaddressinput.setText(inputhomeaddress);
	  	        cityinput.setText(inputcity);
	  	        companyinput.setText(inputcompany);
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
