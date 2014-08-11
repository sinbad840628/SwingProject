import java.sql.Connection;
import java.sql.Statement;

public class delcompany 
{
	delcompany()
	{
		  String namestring=(String)companyinfo.nameinput.getSelectedItem();
	      companystore store=new companystore();
	      try
	      {
	          Connection con=store.getConnection(); 
	          Statement st=con.createStatement();
	          String sql="delete from company where name='"+namestring+"'";
	          st.executeUpdate(sql);
	      }
	      catch(Exception e){}
	      companyinfo.nameinput.removeItem(namestring);
	}
}
