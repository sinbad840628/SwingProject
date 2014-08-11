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
	///通过结果集中的getString方法从数据库中表中提取表字段的数据
///再将提取出来的数据赋值给同事对象。
///最后将同事对象存储到vector数据结构中

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
///通过结果集中的getString方法从数据库中表中提取表字段的数据
///再将提取出来的数据赋值给同事对象。
///最后将同事对象存储到vector数据结构中
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
///通过设置数据库的URL,密码，用户名来建立与数据库的连接
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
