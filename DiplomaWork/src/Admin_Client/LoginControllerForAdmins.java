package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginControllerForAdmins {

	
	public void LogginingAsAdmin(int password , String name) throws Exception	
	{		
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
    		if (password == myRs.getInt("adminspassword"))
    		{
    			if (name.equals(myRs.getString("adminsname")))
    			{
    		System.out.println(myRs.getString("adminspassword") + " " + myRs.getString("adminsname"));
    		System.out.println("Logining succesfully completed");
    		int id = myRs.getInt("adminsid");
    		AdminClientFrame adminpage = new AdminClientFrame(name,password,id);
    		adminpage.setVisible(true);
    			}
    		}
    	}
    			
		}
		catch (Exception e)
		{
			throw new Exception("Can't login");
		}
	}
}
