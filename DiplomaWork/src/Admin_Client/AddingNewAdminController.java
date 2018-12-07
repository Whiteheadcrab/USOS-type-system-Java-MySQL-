package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class AddingNewAdminController {
	
	public void Add(String name ,int password) throws Exception
	{
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "INSERT INTO adminlogins(adminsname,adminspassword) VALUES (?,?)";
        preparedstmt = myConn.prepareStatement(query);
        preparedstmt.setString(1, name);
        preparedstmt.setInt(2, password);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
 	    JOptionPane.showMessageDialog(null, "New admin account for "+name+" have been created");
    	}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "New admin account for "+name+" have been created");
		}
		
	}

}
