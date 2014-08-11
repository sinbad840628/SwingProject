import java.sql.Connection;
import java.sql.Statement;
public class updateclassmate 
{
	    classmatestore store=new classmatestore();
		Connection con=store.getConnection(); 
	updateclassmate() 
	{
     		try
     		{
     	    Statement st=con.createStatement();
     		String sex=classinfo.sexyinput.getText();
     		String name=(String)classinfo.nameinput.getSelectedItem();
     		String address=classinfo.addressinput.getText();
     		String homeaddress=classinfo.homeaddressinput.getText();
     		String city=classinfo.cityinput.getText();
     		String company=classinfo.companyinput.getText();
     		String duty=classinfo.dutyinput.getText();
     		String salary=classinfo.salaryinput.getText();
///将需要更新的列以SQL语句的形式给出
     		String sql1="update classmate set sex='"+sex+"' where name='"+name+"'";
     		String sql2="update classmate set address='"+address+"' where name='"+name+"'";
     		String sql3="update classmate set homeaddress='"+homeaddress+"' where name='"+name+"'";
     		String sql4="update classmate set city='"+city+"' where name='"+name+"'";
     		String sql5="update classmate set company='"+company+"' where name='"+name+"'";
     		String sql6="update classmate set duty='"+duty+"' where name='"+name+"'";
     		String sql7="update classmate set salary='"+salary+"' where name='"+name+"'";
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
