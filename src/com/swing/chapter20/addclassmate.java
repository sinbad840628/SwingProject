import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class addclassmate extends JPanel
{
	private static final long serialVersionUID = 1L;
	 final JTextField nameinput;
	 static final int WIDTH=600;
	 static final int HEIGHT=300;
	 JFrame frame;
	 static classmate ss;
///此方法含义是在容器中添加组件，并且按照网格组布局管理器的规则添加
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
   {
       constraints.gridx=x;
       constraints.gridy=y;
       constraints.gridwidth=w;
       constraints.gridheight=h;
       add(c,constraints);
   }         
	addclassmate()
	{     
		  frame=new JFrame("同学信息添加窗口");
		 frame.setContentPane(this);
///确定窗口框架的显示位置和大小
		 Toolkit kit=Toolkit.getDefaultToolkit();
	      Dimension screenSize=kit.getScreenSize();
	      int width=screenSize.width;
	      int height=screenSize.height;
	      int x=(width-WIDTH)/2;
	      int y=(height-HEIGHT)/2;
	      frame.setLocation(x,y);      
	      frame.setVisible(true);
	      frame.setSize(WIDTH,HEIGHT);
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
	      JLabel contact=new JLabel("移动电话");
	      JLabel homephone=new JLabel("家庭电话");
	      nameinput=new JTextField(10);
	      final JTextField sexyinput=new JTextField(10);
	      final JTextField addressinput=new JTextField(10);
	      final JTextField homeaddressinput=new JTextField(10);
	      final JTextField cityinput=new JTextField(10);
	      final  JTextField companyinput=new JTextField(10);
	      final JTextField dutyinput=new JTextField(10);
	      final JTextField salaryinput=new JTextField(10);
	      final JTextField contactinput=new JTextField(10);
	      final JTextField homephoneinput=new JTextField(10);
	      JLabel title=new JLabel("同学基本信息");
	      JButton addbutton=new JButton("添加同学信息数据");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///使用网格组布局添加控件
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
	      add(contact,constraints,0,5,1,1);
	      add(homephone,constraints,2,5,1,1);
	      add(contactinput,constraints,1,5,1,1);
	      add(homephoneinput,constraints,3,5,1,1);
	      add(addbutton,constraints,0,6,2,1);
///单击添加按钮后，会将数据保存到Vector数据结构中，再从此数据结构中将数据保存到数据库中，同时，会将新添加的数据添加到基本信息界面中。 
	      addbutton.addActionListener(new ActionListener()
	      {
	    	  public void actionPerformed(ActionEvent Event) 
	    	  {
	    		try
	    		{
	    		  String nametext=nameinput.getText();
	    		  String sextext=sexyinput.getText();
                  String  addresstext=addressinput.getText();
                  String  homeaddresstext=homeaddressinput.getText();
                  String citytext=cityinput.getText();
                  String companytext=companyinput.getText();
                  String dutytext=dutyinput.getText();
                  String salarytext=salaryinput.getText();
                  String contacttext=contactinput.getText();
                  String homephonetext=homephoneinput.getText();
                  classmatestore store=new classmatestore();
                  Connection con=store.getConnection(); 
                  Statement st=con.createStatement();
                  String sql="insert into classmate values('"+nametext+"','"+sextext+"','"+addresstext+"','"+homeaddresstext+"','"+citytext+"','"+companytext+"','"+dutytext+"','"+salarytext+"','"+contacttext+"','"+homephonetext+"')";
                  st.executeUpdate(sql);
                  ss=new classmate(nametext);
                  ss.setsexy(sextext);
                  ss.setaddress(addresstext);
                  ss.sethomeaddress(homeaddresstext);
                  ss.setcity(citytext);
                  ss.setcompany(companytext);
                  ss.setduty(dutytext);
                  ss.setsalary(salarytext);
                  ss.setcontact(contacttext);
                  ss.sethomephone(homephonetext);
                  Vector vec=new Vector();
                  vec.add(ss);   
                  classinfo.nameinput.addItem(nametext);
                  classinfo.nameinput.setSelectedItem(nametext);
                  classinfo.sexyinput.setText(sextext);
                  classinfo.addressinput.setText(addresstext);
                  classinfo.homeaddressinput.setText(homeaddresstext);
                  classinfo.companyinput.setText(companytext);
                  classinfo.dutyinput.setText(dutytext);
                  classinfo.salaryinput.setText(salarytext);
              }
              catch(Exception e){}
              frame.dispose();               
	    	  }
	      });
	    	  }
}
