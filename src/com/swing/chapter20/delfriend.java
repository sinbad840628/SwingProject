import java.sql.Connection;
import java.sql.Statement;

public class delfriend 
{
	delfriend()
	{
		  String namestring=(String)friendinfo.nameinput.getSelectedItem();
	      friendstore store=new friendstore();
	      try
	      {
	          Connection con=store.getConnection(); 
	          Statement st=con.createStatement();
	          String sql="delete from comfriend where name='"+namestring+"'";
	          st.executeUpdate(sql);
	      }
	      catch(Exception e){}
	      friendinfo.nameinput.removeItem(namestring);

	}
}
