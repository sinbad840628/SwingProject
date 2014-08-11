import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class companystore 
{
	public Vector getcompany(Connection con,String sql)
	   {
		 Vector v=new Vector();
	     try
	     {
	         Statement st=con.createStatement();
	         ResultSet rs=st.executeQuery(sql);
	         while(rs.next())
	         {
	///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ��ͬ�¶���
///���ͬ�¶���洢��vector���ݽṹ��

	        	 String name=rs.getString(1);
	        	 company cl=new company(name);
	             String code=rs.getString(2);
	             String department=rs.getString(3);
	             String sex=rs.getString(4);
	             String address=rs.getString(5);
	             String birthday=rs.getString(6);
	             String duty=rs.getString(7);
	             String salary=rs.getString(8);
	             String tel=rs.getString(9);
	             String motel=rs.getString(10);
	             cl.setcode(code);
	             cl.setdepartment(department);
	             cl.setaddress(address);
	             cl.setsex(sex);
	             cl.setbirthday(birthday);
	             cl.setduty(duty);
	             cl.setsalary(salary);  
	             cl.settel(tel);
	             cl.setmotel(motel);
	             v.add(cl);
	         }
	         rs.close();
	     }
	     catch(Exception e)
	     {
	           e.printStackTrace();
	     }
	     return v;
	   }
	 public company getobject(Connection con,String name)
	 {
	   company c=null;
	   try
	     {
	         Statement st=con.createStatement();
	         String sql="select * from company where name='"+name+"'";
	         ResultSet rs=st.executeQuery(sql);
///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ��ͬ�¶���
///���ͬ�¶���洢��vector���ݽṹ��
	         while(rs.next())
	         {
	        	 name=rs.getString(1);
	             String code=rs.getString(2);
	             String department=rs.getString(3);
	             String sex=rs.getString(4);
	             String address=rs.getString(5);
	             String birthday=rs.getString(6);
	             String duty=rs.getString(7);
	             String salary=rs.getString(8);
	             String tel=rs.getString(9);
	             String motel=rs.getString(10);
	             c=new company(name);
	             c.setcode(code);
	             c.setaddress(address);
	             c.setdepartment(department);;
	             c.setsex(sex);
	             c.setbirthday(birthday);
	             c.setduty(duty);
	             c.setsalary(salary);  
	             c.settel(tel);
	             c.setmotel(motel);
	         }
	         rs.close();
	        
	     }
	     catch(Exception e)
	     {
	           e.printStackTrace();
	     }
	    return c;
	 }
///ͨ���������ݿ��URL,���룬�û��������������ݿ������
	 public Connection getConnection()
	 {
	     Connection con=null;
	     String url1="jdbc:odbc:combook";
	     String username="";
	     String password="";
	     try
	     {
	         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	         con=DriverManager.getConnection(url1,username,password);
	     }
	     catch(SQLException e){e.printStackTrace();
	     }
	     catch(ClassNotFoundException ex){ex.printStackTrace();
	     }
	     return con;
	 } 
}
