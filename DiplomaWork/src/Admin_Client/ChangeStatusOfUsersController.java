package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class ChangeStatusOfUsersController {
	
	public void changingStatus(int id , String date) throws Exception
	{
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
        PreparedStatement preparedstmt = null;
        String query = "UPDATE usersprofiles SET actuntil='"+date+"' WHERE idusersprofiles="+id;
        preparedstmt = myConn.prepareStatement(query);
        //preparedstmt.setString(1, date);
        //preparedstmt.setInt(2, id);
    	// Execute SQL query  
        preparedstmt.execute();
 	    preparedstmt.close();
 	    myConn.close();
 	    JOptionPane.showMessageDialog(null, "Updating executed");
    	}
		catch (Exception ex)
		{
			JOptionPane.showMessageDialog(null,"Updating dindn't execute . Please check you data");
		}
	}

}
