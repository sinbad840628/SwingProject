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
public class addfriend extends JPanel
{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final JTextField sexyinput;
	 final JTextField birthdayinput;
	 final JTextField addressinput;
	 final JTextField companyinput;
	 final  JTextField dutyinput;
	 final JTextField salaryinput;
	 final JTextField nameinput;
  JTextField  telinput;
	 JTextField   phoneinput;
	 static final int WIDTH=600;
	 static final int HEIGHT=300;
	 JFrame frame;
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
    {
        constraints.gridx=x;
        constraints.gridy=y;
        constraints.gridwidth=w;
        constraints.gridheight=h;
        add(c,constraints);
    }      
	addfriend()
	{
		  frame=new JFrame("���������Ϣ����");
		  frame.setContentPane(this);
		  Toolkit kit=Toolkit.getDefaultToolkit();
	      Dimension screenSize=kit.getScreenSize();
	      int width=screenSize.width;
	      int height=screenSize.height;
	      int x=(width-WIDTH)/2;
	      int y=(height-HEIGHT)/2;
	      frame.setLocation(x,y);   
	      frame.setSize(WIDTH,HEIGHT);
	      frame.setVisible(true);
		 GridBagLayout lay=new GridBagLayout();
		  setLayout(lay);
		  JLabel name=new JLabel("����");
	      JLabel sex=new JLabel("�Ա�");
	      JLabel birthday=new JLabel("��������");
	      JLabel address=new JLabel("��ͥ��ַ");
	      JLabel company=new JLabel("���ڹ�˾");
	      JLabel duty=new JLabel("ְλ");
	      JLabel salary=new JLabel("нˮ");     
	      JLabel tel=new JLabel("������ϵ��ʽ");
	      JLabel phone=new JLabel("��ͥ�绰");
		  salaryinput=new JTextField(10);
	      nameinput=new JTextField(10);
	      sexyinput=new JTextField(10);
	      birthdayinput=new JTextField(10);
	      addressinput=new JTextField(10);
	      companyinput=new JTextField(10);
	      dutyinput=new JTextField(10);
	      telinput=new JTextField(10);
	      phoneinput=new JTextField(10);
	      JLabel title=new JLabel("���ѻ�����Ϣ");
	      JButton addbutton=new JButton("���������Ϣ����");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
		  add(title,constraints,0,0,4,1);                 //ʹ�������鲼����ӿؼ�
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
	      add(tel,constraints,0,5,1,1);
	      add(phone,constraints,2,4,1,1);
	      add(telinput,constraints,1,5,1,1);
	      add(phoneinput,constraints,3,4,1,1);
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
                  String  birthdaytext=birthdayinput.getText();
                  String  addresstext=addressinput.getText();
                  String companytext=companyinput.getText();
                  String dutytext=dutyinput.getText();
                  String salarytext=salaryinput.getText();
                  String teltext=telinput.getText();
                  String phonetext=phoneinput.getText();
                  friendstore store=new friendstore();
                  Connection con=store.getConnection(); 
                  Statement st=con.createStatement();
                  String sql="insert into comfriend values('"+nametext+"','"+sextext+"','"+birthdaytext+"','"+addresstext+"','"+companytext+"','"+dutytext+"','"+salarytext+"','"+teltext+"','"+phonetext+"')";
                  st.executeUpdate(sql);
                  friend ss=new friend(nametext);
                  ss.setsex(sextext);
                  ss.setbirthday(birthdaytext);
                  ss.setaddress(addresstext);
                  ss.setcompany(companytext);
                  ss.setduty(dutytext);
                  ss.setsalary(salarytext);
                  ss.settel(teltext);
                  ss.setphone(phonetext);
                  Vector vec=new Vector();
                  vec.add(ss);
                  friendinfo.nameinput.addItem(nametext);
                  friendinfo.nameinput.setSelectedItem(nametext);
                  friendinfo.sexyinput.setText(sextext);
                  friendinfo.birthdayinput.setText(birthdaytext);
                  friendinfo.addressinput.setText(addresstext);
                  friendinfo.companyinput.setText(companytext);
                  friendinfo.dutyinput.setText(dutytext);
                  friendinfo.salaryinput.setText(salarytext);
                 
              }
              catch(Exception e){}
              frame.dispose();               

	    	  }
	      });
	     
	}
	public static void main(String[] args)
	{
		new addfriend();
	}
}
