package Admin_Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ViewUsersPanel extends JPanel {

	public ViewUsersPanel(Boolean rights) {
		setLayout(null);
		
		String list = "";
		
		if (rights=true)
		{
			
			try
			{
		    // Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	        Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from usersprofiles");
	    	list += "User's List \n";
	    	// Process the result set
	    	while (myRs.next())
	    	{
	    		list += myRs.getInt("idusersprofiles") + " " + myRs.getString("usersname") + " " +myRs.getString("userssurname")+ " " + myRs.getString("usersstatus") + " " + myRs.getString("usersgroup") + " " + myRs.getInt("groupid") + " " + myRs.getString("actfrom") + " " + myRs.getString("actuntil") +"\n";
	    	}
	    	myRs = myStmt.executeQuery("select * from adminlogins");
	    	list += "Admin's List \n";
	    	while(myRs.next())
	    	{
	    		list += myRs.getString("adminsname") + " " + myRs.getInt("adminsid") + "\n";
	    	}
	 	    myStmt.close();
	 	    myConn.close();
	    	}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Unknown Error");
			}	
			
			
		}
		else
		{
			try
			{
		    // Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	        Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from usersprofiles");
	    	list += "User's List \n";
	    	// Process the result set
	    	while (myRs.next())
	    	{
	    		list += myRs.getInt("idusersprofiles") + " " + myRs.getString("usersname") + " " +myRs.getString("userssurname")+ " " + myRs.getString("userssttus") + " " + myRs.getString("usersgroup") + " " + myRs.getInt("groupid") + " " + myRs.getString("actfrom") + " " + myRs.getString("actuntil") +"\n";
	    	}
	 	    myStmt.close();
	 	    myConn.close();
	    	}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Unknown Error");
			}	
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 278);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea(list);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

	}
}
