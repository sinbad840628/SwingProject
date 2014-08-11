import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class classmatestore 
{
///下面的方法将建立一个Vector数据结构，然后提取数据库中的数据存储到Vector中
    public Vector getclassmate(Connection con,String sql)
	  {
		     Vector v=new Vector();
	       try
	       {
	           Statement st=con.createStatement();///建立数据库的连接
	           ResultSet rs=st.executeQuery(sql);
	           while(rs.next())
	           {
///通过结果集中的getString方法从数据库中表中提取表字段的数据
///再将提取出来的数据赋值给同学对象。
///最后将同学对象存储到vector数据结构中
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
///通过结果集中的getString方法从数据库中表中提取表字段的数据
///再将提取出来的数据赋值给同学对象。
///最后将同学对象存储到vector数据结构中
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
