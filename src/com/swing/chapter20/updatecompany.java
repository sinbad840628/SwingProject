import java.sql.Connection;
import java.sql.Statement;
public class updatecompany 
{
 
	classmatestore store=new classmatestore();
	Connection con=store.getConnection(); 
	updatecompany()
	{
		
      		try
      		{
      	    Statement st=con.createStatement();
      		String sex=companyinfo.sexinput.getText();
      		String name=(String)companyinfo.nameinput.getSelectedItem();
      		String address=companyinfo.addressinput.getText();
      		String code=companyinfo.codeinput.getText();
      		String department=companyinfo.departmentinput.getText();
      		String duty=companyinfo.dutyinput.getText();
      		String salary=companyinfo.salaryinput.getText();
      		String birthday=companyinfo.birthdayinput.getText();
///将需要更新的列以SQL语句的形式给出
      		String sql1="update company set sex='"+sex+"' where name='"+name+"'";
      		String sql2="update company set address='"+address+"' where name='"+name+"'";
      		String sql3="update company set code='"+code+"' where name='"+name+"'";
      		String sql4="update company set department='"+department+"' where name='"+name+"'";
      		String sql5="update company set duty='"+duty+"' where name='"+name+"'";
      		String sql6="update company set salary='"+salary+"' where name='"+name+"'";
            String sql7="update company set birthday='"+birthday+"' where name='"+name+"'";
///将上面的SQL语句通过executeUpdate()方法来将数据库进行更新
      		st.executeUpdate(sql1);
      		st.executeUpdate(sql2);
      		st.executeUpdate(sql3);
      		st.executeUpdate(sql4);
      		st.executeUpdate(sql5);
      		st.executeUpdate(sql6);
      		st.executeUpdate(sql7);
      		}catch(Exception e){}
     	}
}
