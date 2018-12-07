package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DeletingOldAdminController {
	
	public void Delete(int id)throws Exception
	{
		int count = 0;
		String name="";
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from adminlogins");
    	// Process the result set
    	while (myRs.next())
    	{
    		if (id == myRs.getInt("adminsid"))
    		{
    		name=myRs.getString("adminsname");
    		PreparedStatement preparedstmt = null;
            String query = "DELETE FROM adminlogins WHERE adminsid="+id;
            preparedstmt = myConn.prepareStatement(query);
        	// Execute SQL query  
            preparedstmt.execute();
     	    preparedstmt.close();
     	    count = 1;
    		}
    	}
    	myConn.close();
    	if(count == 1)
    	{
    		JOptionPane.showMessageDialog(null, "Admin "+name+" have been removed");
    	}
    	else
    	{
    		JOptionPane.showMessageDialog(null, "There is no Admin with id "+id+" in database");
    	}
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Unknown Error");
		}
	}

}
