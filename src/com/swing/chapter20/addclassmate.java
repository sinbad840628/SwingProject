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
///�˷����������������������������Ұ��������鲼�ֹ������Ĺ������
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
		  frame=new JFrame("ͬѧ��Ϣ��Ӵ���");
		 frame.setContentPane(this);
///ȷ�����ڿ�ܵ���ʾλ�úʹ�С
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

		 JLabel name=new JLabel("����");
	      JLabel sex=new JLabel("�Ա�");
	      JLabel address=new JLabel("��ס��ַ");
	      JLabel homeaddress=new JLabel("��ͥ��ַ");
	      JLabel city=new JLabel("���ڳ���");
	      JLabel company=new JLabel("���ڹ�˾");
	      JLabel duty=new JLabel("ְλ");
	      JLabel salary=new JLabel("нˮ");  
	      JLabel contact=new JLabel("�ƶ��绰");
	      JLabel homephone=new JLabel("��ͥ�绰");
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
	      JLabel title=new JLabel("ͬѧ������Ϣ");
	      JButton addbutton=new JButton("���ͬѧ��Ϣ����");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///ʹ�������鲼����ӿؼ�
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
///������Ӱ�ť�󣬻Ὣ���ݱ��浽Vector���ݽṹ�У��ٴӴ����ݽṹ�н����ݱ��浽���ݿ��У�ͬʱ���Ὣ����ӵ�������ӵ�������Ϣ�����С� 
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
