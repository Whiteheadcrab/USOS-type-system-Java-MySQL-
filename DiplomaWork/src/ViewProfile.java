import javax.swing.JPanel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;

public class ViewProfile extends JPanel {

	public ViewProfile(int id) throws Exception {
		setLayout(null);
		
		//Here we created the vriables which we will use to represent our variables from database
		String variableforname = null;
		String variableforsurname = null;
		int variableforid = 0;
		String variableforstatus = null;
		String variableforgroup = null;
		String variableforactfrom = null;
		String variableforactuntil = null;
		String readvariable = "";
		String variableformarks = "";
		
		try {
			// Get connection to the database
	        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	    	Statement myStmt = myConn.createStatement();
	    	// Execute SQL query
	    	ResultSet myRs = myStmt.executeQuery("select * from usersprofiles where idusersprofiles = "+id);
	    	while (myRs.next())
	    	{
	    	variableforname = myRs.getString("usersname");
	    	variableforsurname = myRs.getString("userssurname");
	    	variableforid = id;
	    	variableforstatus = myRs.getString("usersstatus");
	    	variableforgroup = myRs.getString("usersgroup");
	    	variableforactfrom = myRs.getString("actfrom");
	    	variableforactuntil = myRs.getString("actuntil");
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
	    	ResultSet myRs = myStmt.executeQuery("select * from usersmarks where usersid = "+id);
	    	while (myRs.next())
	    	{
            readvariable=String.format("%s\n", (myRs.getString("lessonname")+"  "+myRs.getString("mark")+"  "+myRs.getString("teachername")));
            variableformarks = variableformarks + readvariable;
			} 
			}
			catch (Exception e)
			{
				throw new Exception("Error with database");
			}
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 11, 46, 14);
		add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(10, 36, 63, 14);
		add(lblSurname);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 61, 46, 14);
		add(lblId);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setBounds(10, 86, 46, 14);
		add(lblStatus);
		
		JLabel lblGroup = new JLabel("Group:");
		lblGroup.setBounds(10, 111, 46, 14);
		add(lblGroup);
		
		JLabel lblNotificationMarksLabel = new JLabel("Marks:");
		lblNotificationMarksLabel.setBounds(245, 137, 46, 14);
		add(lblNotificationMarksLabel);
		
		JLabel lblBeginofStudyLabel = new JLabel("Study/work from:");
		lblBeginofStudyLabel.setBounds(300, 11, 120, 14);
		add(lblBeginofStudyLabel);
		
		JLabel lblCurrentStudyLabel = new JLabel("Current status until:");
		lblCurrentStudyLabel.setBounds(300, 36, 120, 14);
		add(lblCurrentStudyLabel);
		
		JLabel lblVaribleNameLabel = new JLabel(variableforname);
		lblVaribleNameLabel.setBounds(76, 11, 135, 14);
		add(lblVaribleNameLabel);
		
		JLabel lblVariableSurnameLabel = new JLabel(variableforsurname);
		lblVariableSurnameLabel.setBounds(76, 36, 135, 14);
		add(lblVariableSurnameLabel);
		
		JLabel lblVariableIDLabel = new JLabel(String.valueOf(variableforid));
		lblVariableIDLabel.setBounds(76, 61, 135, 14);
		add(lblVariableIDLabel);
		
		JLabel lblVariableStatusLabel = new JLabel(variableforstatus);
		lblVariableStatusLabel.setBounds(76, 86, 135, 14);
		add(lblVariableStatusLabel);
		
		JLabel lblVariableGroupLabel = new JLabel(variableforgroup);
		lblVariableGroupLabel.setBounds(76, 111, 135, 14);
		add(lblVariableGroupLabel);
		
		JLabel lblVariableFromLabel = new JLabel(variableforactfrom);
		lblVariableFromLabel.setBounds(430, 11, 87, 14);
		add(lblVariableFromLabel);
		
		JLabel lblVariableUntilLabel = new JLabel(variableforactuntil);
		lblVariableUntilLabel.setBounds(430, 36, 87, 14);
		add(lblVariableUntilLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 159, 507, 89);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea(variableformarks);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);

	}
}
