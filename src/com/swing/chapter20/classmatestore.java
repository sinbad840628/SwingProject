import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class classmatestore 
{
///����ķ���������һ��Vector���ݽṹ��Ȼ����ȡ���ݿ��е����ݴ洢��Vector��
    public Vector getclassmate(Connection con,String sql)
	  {
		     Vector v=new Vector();
	       try
	       {
	           Statement st=con.createStatement();///�������ݿ������
	           ResultSet rs=st.executeQuery(sql);
	           while(rs.next())
	           {
///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ��ͬѧ����
///���ͬѧ����洢��vector���ݽṹ��
	        	     String name=rs.getString(1);
	        	     classmate cl=new classmate(name);
	               String sexy=rs.getString(2);
	               String address=rs.getString(3);
	               String homeaddress=rs.getString(4);
	               String city=rs.getString(5);
	               String company=rs.getString(6);
	               String duty=rs.getString(7);
	               String salary=rs.getString(8);
	               String contact=rs.getString(9);
	               String homephone=rs.getString(10);
	               cl.setsexy(sexy);;
	               cl.setaddress(address);
	               cl.sethomeaddress(homeaddress);
	               cl.setcity(city);
	               cl.setcompany(company);
	               cl.setduty(duty);
	               cl.setsalary(salary);  
	               cl.setcontact(contact);
	               cl.sethomephone(homephone);   
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
	  public classmate getobject(Connection con,String name)
	  {
	      classmate c=null;
	      try
	      {
	          Statement st=con.createStatement();
	          String sql="select * from classmate where name='"+name+"'";
	          ResultSet rs=st.executeQuery(sql);
///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ��ͬѧ����
///���ͬѧ����洢��vector���ݽṹ��
	          while(rs.next())
	          {
	        	    name=rs.getString(1);
	              String sexy=rs.getString(2);
	              String address=rs.getString(3);
	              String homeaddress=rs.getString(4);
	              String city=rs.getString(5);
	              String company=rs.getString(6);
	              String duty=rs.getString(7);
	              String salary=rs.getString(8);
	              String contact=rs.getString(9);
	              String homephone=rs.getString(10);
	              c=new classmate(name);
	              c.setsexy(sexy);
	              c.setaddress(address);
	              c.sethomeaddress(homeaddress);
	              c.setcity(city);
	              c.setcompany(company);
	              c.setduty(duty);
	              c.setsalary(salary);  
	              c.setcontact(contact);
	              c.sethomephone(homephone);   
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
	      catch(SQLException e)
	      {
	          e.printStackTrace();
	      }
	      catch(ClassNotFoundException ex)
	      {
	          ex.printStackTrace();
	      }
	      return con;
    } 
}
