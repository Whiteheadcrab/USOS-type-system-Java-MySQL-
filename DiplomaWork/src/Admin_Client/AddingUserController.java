package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class AddingUserController {

	
	public void AddingUser(String name , String surname , int id , int groupid , int semester , String status , String actfrom , String actuntil) throws Exception
	{
		String fullname= name + " " + surname;
		String groupname = null;
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from groups");
    	// Process the result set
    	while (myRs.next())
    	{
    		if (groupid == myRs.getInt("idgroups"))
    		{
    			groupname=myRs.getString("groupsname");
    			System.out.println(groupname);
    		}
    		
    	}
    	myStmt.close();
    	myConn.close();
		}
		catch (Exception e)
		{
			throw new Exception("Can't login");
		}
	
	
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "INSERT INTO logininformation(id,name) VALUES (?,?)";
        preparedstmt = myConn.prepareStatement(query);
        preparedstmt.setInt(1, id);
        preparedstmt.setString(2, fullname);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception e)
		{
			throw new Exception("Can't create user");
		}
		
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "INSERT INTO studentstable(id,name,groupname,groupid,semester) VALUES (?,?,?,?,?)";
        preparedstmt = myConn.prepareStatement(query);
        preparedstmt.setInt(1, id);
        preparedstmt.setString(2, fullname);
        preparedstmt.setString(3, groupname);
        preparedstmt.setInt(4, groupid);
        preparedstmt.setInt(5, semester);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception e)
		{
			throw new Exception("Can't create user");
		}
		
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "INSERT INTO usersprofiles(idusersprofiles,usersname,userssurname,usersstatus,usersgroup,groupid,actfrom,actuntil) VALUES (?,?,?,?,?,?,?,?)";
        preparedstmt = myConn.prepareStatement(query);
        preparedstmt.setInt(1, id);
        preparedstmt.setString(2, name);
        preparedstmt.setString(3, surname);
        preparedstmt.setString(4, status);
        preparedstmt.setString(5, groupname);
        preparedstmt.setInt(6, groupid);
        preparedstmt.setString(7, actfrom);
        preparedstmt.setString(8, actuntil);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
    	}
		catch (Exception e)
		{
			throw new Exception("Can't create user");
		}
		
	}
	
}
