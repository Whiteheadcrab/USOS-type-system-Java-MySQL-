package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RemovingHighAdminsRightsController {
	
	public void Remove(int id) throws Exception
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
    		if (id == myRs.getInt("id"))
    		{
            String name = myRs.getString("highadminsname");
    		PreparedStatement preparedstmt = null;
            String query = "DELETE FROM highadminstable WHERE id="+id;
            preparedstmt = myConn.prepareStatement(query);
        	// Execute SQL query  
            preparedstmt.execute();
            JOptionPane.showMessageDialog(null, "Admin "+name+" lost his rights");
     	    preparedstmt.close();
    		}
    	}
    	myConn.close();
    			
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Admin with id "+id+" don't have highadmins rights");
		}
		
	}
}
