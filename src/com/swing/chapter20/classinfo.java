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
///�����е��ı���������趨Ϊ��̬������Ŀ���������������п������ɵ���
///����� sql���ֻҪ��Ŀ���ǽ����ݿ��б��������ȡ����
///����ʹ���������б�����
	String sql="select * from classmate";
	static  JComboBox nameinput;
	static  JTextField addressinput;
	static  JTextField homeaddressinput;
	static  JTextField sexyinput;
	static JTextField cityinput;
	static JTextField companyinput;
	static JTextField dutyinput;
	static JTextField salaryinput;
///�����������ĺ����ǽ������ݿ������
	classmatestore store=new classmatestore();
	Connection con=store.getConnection(); 
///���淽���ĺ����ǿ�����������������
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
		  JLabel name=new JLabel("����");
	      JLabel sex=new JLabel("�Ա�");
	      JLabel address=new JLabel("��ס��ַ");
	      JLabel homeaddress=new JLabel("��ͥ��ַ");
	      JLabel city=new JLabel("���ڳ���");
	      JLabel company=new JLabel("���ڹ�˾");
	      JLabel duty=new JLabel("ְλ");
	      JLabel salary=new JLabel("нˮ");       
	      nameinput=new JComboBox();
	      sexyinput=new JTextField(10);
	      addressinput=new JTextField(10);
	      homeaddressinput=new JTextField(10);
	      cityinput=new JTextField(10);
	      companyinput=new JTextField(10);
	      dutyinput=new JTextField(10);
	      salaryinput=new JTextField(10);
	      JLabel title=new JLabel("ͬѧ������Ϣ");
	      GridBagConstraints constraints=new GridBagConstraints();
	      constraints.fill=GridBagConstraints.NONE;
	      constraints.weightx=4;
	      constraints.weighty=6;
///ʹ�������鲼�ֹ�������ӿؼ�
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
///����Vector���ݽṹ���󣬽��洢�����еĻ����������������ȡ�������ٽ����ݷŵ��ı�
  ///�������ȥ���������ͨ��ֱ�ӵ���ǰ���ͬѧ�洢���еķ�������ȡ���ݽṹ�е����ݡ�
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
///��ѡ������ѡ�����������ʱ�������¼�������ѡ�����κ�һ�����������Ὣ���ݽṹ�е��������ݶ���ȡ���������ղ�ͬ���ı�����������С�
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
