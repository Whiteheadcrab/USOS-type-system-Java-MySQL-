import java.sql.*;

public class CheckingTheConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        		System.out.println(myRs.getString("Id") + " " + myRs.getString("name"));
        	}
        }
        catch (Exception exc)
        {
        	exc.printStackTrace();
        }
		
	}

}
