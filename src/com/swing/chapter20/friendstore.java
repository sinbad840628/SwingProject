import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
public class friendstore 
{
   public Vector getfriend(Connection con,String sql)
   {
	 Vector v=new Vector();
     try
     {
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(sql);
         while(rs.next())
         {
///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ�����Ѷ���
///������Ѷ���洢��vector���ݽṹ��
             String name=rs.getString(1);
             String sexy=rs.getString(2);
             String birthday=rs.getString(3);
             String address=rs.getString(4);
             String company=rs.getString(5);
             String duty=rs.getString(6);
             String salary=rs.getString(7);
             String tel=rs.getString(8);
             String phone=rs.getString(9);
             friend ss=new friend(name);
             ss.setsex(sexy);
             ss.setbirthday(birthday);
             ss.setaddress(address);
             ss.setcompany(company);
             ss.setduty(duty);
             ss.setsalary(salary);  
             ss.settel(tel);
             ss.setphone(phone);
             v.add(ss);
         }
         rs.close();
     }
     catch(Exception e)
     {
           e.printStackTrace();
     }
     return v;
   }
 public friend getobject(Connection con,String name)
 {
   friend f=null;
   try
     {
         Statement st=con.createStatement();
         String sql="select * from comfriend where name='"+name+"'";
         ResultSet rs=st.executeQuery(sql);
///ͨ��������е�getString���������ݿ��б�����ȡ���ֶε�����
///�ٽ���ȡ���������ݸ�ֵ�����Ѷ���
///������Ѷ���洢��vector���ݽṹ��
         while(rs.next())
         {
        	 name=rs.getString(1);
             String sexy=rs.getString(2);
             String birthday=rs.getString(3);
             String address=rs.getString(4);
             String company=rs.getString(5);
             String duty=rs.getString(6);
             String salary=rs.getString(7);
             String tel=rs.getString(8);
             String phone=rs.getString(9);
             f=new friend(name);
             f.setsex(sexy);
             f.setbirthday(birthday);
             f.setaddress(address);
             f.setcompany(company);
             f.setduty(duty);
             f.setsalary(salary);  
             f.settel(tel);
             f.setphone(phone);   
         }
         rs.close();
        
     }
     catch(Exception e)
     {
           e.printStackTrace();
     }
    return f;
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
