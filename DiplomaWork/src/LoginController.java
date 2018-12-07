import javax.swing.*;


import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.sql.*;

public class LoginController {


	

	
	public void Logining(int id , String name) throws Exception	
	{		
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from logininformation");
    	// Process the result set
    	while (myRs.next())
    	{
    		if (id == myRs.getInt("Id"))
    		{
    			if (name.equals(myRs.getString("name")))
    			{
    		System.out.println(myRs.getString("Id") + " " + myRs.getString("name"));
    		System.out.println("Logining succesfully completed");
    		UserPageFrame userpage = new UserPageFrame(name,id);
    		userpage.setVisible(true);
    			}
    		}
    	}
    			
		}
		catch (Exception e)
		{
			throw new Exception("Not Received");
		}
	}
	
}
