import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;

public class TeacherPlan extends JPanel {

	/**
	 * Create the panel.
	 */
	public TeacherPlan(String teachernamefrominput) throws Exception {
		setLayout(null);
		
		//Variables for searching our plan
		String valueforlessonname = "";
		String valuefortimetable = "";
		int valueforroomnumber = 0;
		
		//Here we create variable for represention each day of week in our plan
		String variableMonday = "Monday: \n";
		String variableTuesday = "Tuesday: \n";
		String variableWednesday = "Wednesday: \n";
		String variableThursday = "Thursday: \n";
		String variableFriday = "Friday: \n";
		String variableSaturday = "Saturday: \n";
		String variableSunday = "Sunday: \n";
		
		//Text for text area
		String plantext = "";
		
		try {
			// Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	    	Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from plantable ");
	    	while (myRs.next())
	    	{
	    		if (teachernamefrominput.equals(myRs.getString("teachername")))
    			{
	    	valueforlessonname = myRs.getString("lessonname");
	    	valuefortimetable = myRs.getString("timetable");
	    	valueforroomnumber = myRs.getInt("roomnumber");
	    	switch(myRs.getString("day"))
	    	{
	    	case "Monday": variableMonday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
	    	               break;
	    	case "Tuesday": variableTuesday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                            break;
	    	case "Wednesday": variableWednesday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                              break;
	    	case "Thursday": variableThursday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                             break;
	    	case "Friday": variableFriday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                           break;
	    	case "Saturday": variableSaturday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                             break;
	    	case "Sunday": variableSunday +=valueforlessonname +" " +valuefortimetable+" "+valueforroomnumber+" "+teachernamefrominput+"\n" ;
                           break;
	    	}
			} 
			}
		}
			catch (Exception e)
			{
					throw new Exception("Error with database");
			}
		
		plantext = variableMonday + variableTuesday + variableWednesday + variableThursday + variableFriday + variableSaturday + variableSunday;
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 249);
		add(scrollPane);
		
		JTextArea textAreaForPlan = new JTextArea(plantext);
		textAreaForPlan.setLineWrap(true);
		textAreaForPlan.setWrapStyleWord(true);
		textAreaForPlan.setEditable(false);
		scrollPane.setViewportView(textAreaForPlan);

	}
}
