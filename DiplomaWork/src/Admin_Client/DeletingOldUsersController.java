package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DeletingOldUsersController {
	
	public void deleting (int id , String name) throws Exception
	{
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "DELETE FROM logininformation WHERE name='"+name+"'";
        preparedstmt = myConn.prepareStatement(query);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, "There is no user with such id in table logininformation");
		}
		
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "DELETE FROM studentstable WHERE id = "+id;
        preparedstmt = myConn.prepareStatement(query);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null, "There is no user with such id in table studenstable");
		}
		
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "DELETE FROM usersprofiles WHERE idusersprofiles ="+id;
        preparedstmt = myConn.prepareStatement(query);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "There is no user with such id in table idusersprofiles");
		}
	}

}
