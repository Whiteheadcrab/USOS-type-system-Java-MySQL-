package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class CheckingOfAdminsAdd {
	
	public void checking(String name,int id) throws Exception
	{
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from highadminstable");
    	// Process the result set
    	while (myRs.next())
    	{
            if(id==myRs.getInt("id"))
            {
    			if (name.equals(myRs.getString("highadminsname")))
    			{
                     AddingNewAdminFrame addadmin = new AddingNewAdminFrame();
                     addadmin.setVisible(true);
    			}

    	     }
    			
		}
		}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, "You don't have rights for this");
		}	
     }
}
