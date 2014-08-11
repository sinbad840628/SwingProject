import java.sql.Connection;
	import java.sql.Statement;
	public class delclassmate 
	{
	delclassmate()
	{
		  String namestring=(String)classinfo.nameinput.getSelectedItem();
	      classmatestore store=new classmatestore();
	      try
	      {
	          Connection con=store.getConnection(); 
	          Statement st=con.createStatement();
	          String sql="delete from classmate where name='"+namestring+"'";
	          st.executeUpdate(sql);
	      }
	      catch(Exception e){}
	      classinfo.nameinput.removeItem(namestring);
	}
	}
