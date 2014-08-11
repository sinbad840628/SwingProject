import java.sql.Connection;
import java.sql.Statement;
public class updatefriend 
{

	classmatestore store=new classmatestore();
	Connection con=store.getConnection(); 
	updatefriend()
	{
		
    		try
    		{
    	    Statement st=con.createStatement();
    		String sex=friendinfo.sexyinput.getText();
    		String name=(String)friendinfo.nameinput.getSelectedItem();
    		String address=friendinfo.addressinput.getText();
    		String birthday=friendinfo.birthdayinput.getText();
    		String duty=friendinfo.dutyinput.getText();
    		String salary=friendinfo.salaryinput.getText();
    		String company=friendinfo.companyinput.getText();
    		String sql1="update comfriend set sex='"+sex+"' where name='"+name+"'";
    		String sql2="update comfriend set address='"+address+"' where name='"+name+"'";
    		String sql3="update comfriend set birthday='"+birthday+"' where name='"+name+"'";
    		String sql4="update comfriend set company='"+company+"' where name='"+name+"'";
    		String sql5="update comfriend set duty='"+duty+"' where name='"+name+"'";
    		String sql6="update comfriend set salary='"+salary+"' where name='"+name+"'";
///将上面的SQL语句通过executeUpdate()方法来将数据库进行更新
    		st.executeUpdate(sql1);
    		st.executeUpdate(sql2);
    		st.executeUpdate(sql3);
    		st.executeUpdate(sql4);
    		st.executeUpdate(sql5);
    		st.executeUpdate(sql6);
    		}catch(Exception e){}
    	
	}
}
