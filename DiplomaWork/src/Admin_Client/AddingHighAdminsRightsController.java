package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AddingHighAdminsRightsController {
	
	public void Add(int id) throws Exception
	{
		String name = ""; 
		int password = 0;
		
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
    		password=myRs.getInt("adminspassword");
    		PreparedStatement preparedstmt = null;
            String query = "INSERT INTO highadminstable(id,highadminsname,adminsrights) VALUES (?,?,?)";
            preparedstmt = myConn.prepareStatement(query);
            preparedstmt.setInt(1, id);
            preparedstmt.setString(2, name);
            preparedstmt.setInt(3, 0);
        	// Execute SQL query  
            preparedstmt.execute();
            JOptionPane.showMessageDialog(null, "Admin "+name+" received new rights");
     	    preparedstmt.close();
    		}
    	}
    	myConn.close();
    			
		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "Admin "+name+" didn't received new rights");
		}
		
	}

}
