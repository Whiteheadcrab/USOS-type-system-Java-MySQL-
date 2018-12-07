import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ViewMyPlan extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewMyPlan(int id) throws Exception {
		setLayout(null);
		int valueforgroupid = 0;
		String variableforname = "";
		String valueforlessonname = "";
		String valuefortimetable = "";
		int valueforroomnumber = 0;
		String valueforteachername = "";
		
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
	    	ResultSet myRs = myStmt.executeQuery("select * from studentstable where id = "+id);
	    	while (myRs.next())
	    	{
	        variableforname = myRs.getString("name");
	    	valueforgroupid = myRs.getInt("groupid");
			} 
			}
			catch (Exception e)
			{
					throw new Exception("Error with database");
			}
		
		
		
		try {
			// Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	    	Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from plantable where groupid = "+valueforgroupid);
	    	while (myRs.next())
	    	{
	    	valueforlessonname = myRs.getString("lessonname");
	    	valuefortimetable = myRs.getString("timetable");
	    	valueforroomnumber = myRs.getInt("roomnumber");
	    	valueforteachername = myRs.getString("teachername");
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
		
		JLabel lblStudentName = new JLabel("Name:");
		lblStudentName.setBounds(10, 11, 46, 14);
		add(lblStudentName);
		
		JLabel lblNameFromVariable = new JLabel(variableforname);
		lblNameFromVariable.setBounds(66, 11, 158, 14);
		add(lblNameFromVariable);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 27, 46, 14);
		add(lblId);
		
		JLabel lblIDFromVariable = new JLabel(String.valueOf(id));
		lblIDFromVariable.setBounds(66, 27, 158, 14);
		add(lblIDFromVariable);
		
		JLabel lblGroupNameLabel = new JLabel("Group:");
		lblGroupNameLabel.setBounds(10, 43, 46, 14);
		add(lblGroupNameLabel);
		
		plantext = variableMonday + variableTuesday + variableWednesday + variableThursday + variableFriday + variableSaturday + variableSunday; 
		JLabel lblGroupFromVariableLabel = new JLabel(String.valueOf(valueforgroupid));
		lblGroupFromVariableLabel.setBounds(66, 43, 158, 14);
		add(lblGroupFromVariableLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 68, 423, 200);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea(plantext);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

	}
}
