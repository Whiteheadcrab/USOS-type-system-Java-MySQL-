import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchTeacherController {
	
	

	public static String Search(String valueforteachername) throws Exception{
       String variableMonday = "Monday: \n";
       String variableTuesday = "Tuesday: \n";
       String variableWednesday = "Wednesday: \n";
       String variableThursday = "Thursday: \n";
       String variableFriday = "Friday: \n";
       String variableSaturday="Saturday: \n";
       String variableSunday="Sunday: \n";
       String dayplan="";
       
       
		try {
			// Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	    	Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from plantable where teachername = "+valueforteachername);
	    	System.out.println("It is okay here");
	    	while (myRs.next())
	    	{
	    	String valueforlessonname = myRs.getString("lessonname");
	    	String valuefortimetable = myRs.getString("timetable");
	    	int valueforroomnumber = myRs.getInt("roomnumber");
			switch(myRs.getString("day"))
	    	{
	    	case "Monday": variableMonday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
	    	               break;
	    	case "Tuesday": variableTuesday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                            break;
	    	case "Wednesday": variableWednesday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                              break;
	    	case "Thursday": variableThursday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                             break;
	    	case "Friday": variableFriday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                           break;
	    	case "Saturday": variableSaturday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                             break;
	    	case "Sunday": variableSunday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+valueforteachername+"\n" ;
                           break;
	    	}
			} 
			}
			catch (Exception e)
			{
					throw new Exception("Error with database");
			}
		dayplan=variableMonday + variableTuesday + variableWednesday + variableThursday;
		return dayplan;
        }
	}

