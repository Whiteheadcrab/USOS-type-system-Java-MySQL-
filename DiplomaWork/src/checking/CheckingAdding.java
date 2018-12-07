package checking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckingAdding {
	
	public void AddingUser(String name , int id ) throws Exception
	{
		name = "test4";
		id=4;
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        Statement stmt = myConn.createStatement();
        PreparedStatement preparedstmt = null;
        String query = "INSERT INTO logininformation(id,name) VALUES (?,?)";
        preparedstmt = myConn.prepareStatement(query);
        preparedstmt.setInt(1, id);
        preparedstmt.setString(2, name);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
    	}
		catch (Exception e)
		{
			throw new Exception("Can't create user");
		}
	}
}
