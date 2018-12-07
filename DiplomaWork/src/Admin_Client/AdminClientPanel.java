package Admin_Client;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminClientPanel extends JPanel {

	public AdminClientPanel(String name , int password, int id) throws Exception{
		setLayout(null);
		
		//Here we create variabe which will store admins notifications
		String adminnotification = "";
		
		//Creare varible which will store admin id
		int adminid = 0;
		
		//Here we will try to again check that admin is logining 
		//while checking present of his admin's id into the table
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from adminlogins where adminspassword = "+password);
    	// Process the result set
    	while (myRs.next())
    	{
           adminid = myRs.getInt("adminsid");
    	}
		}
    	catch (Exception e)
		{
			throw new Exception("Can't find admin id");
		}
		//
		
		//Searching notifications for our admin
		try
		{
	    // Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from adminsnotifications where idreceivedadmin = "+adminid+" or idreceivedadmin = 0 ");
    	// Process the result set
    	while (myRs.next())
    	{
           adminnotification += myRs.getString("message")+"\n"+"\n";
    	}
		}
    	catch (Exception e)
		{
			throw new Exception("There is no any notification");
		}
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 262);
		add(panel);
		
		JLabel labelName = new JLabel("Name :");
		labelName.setBounds(10, 11, 46, 14);
		panel.add(labelName);
		
		JLabel labelId = new JLabel("ID :");
		labelId.setBounds(10, 36, 46, 14);
		panel.add(labelId);
		
		JPanel panelforbuttons = new JPanel();
		panelforbuttons.setLayout(null);
		panelforbuttons.setBounds(273, 15, 151, 222);
		panel.add(panelforbuttons);
		
		JButton buttonUsersTool = new JButton("Users Toolbar");
		buttonUsersTool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsersToolbarFrame userstoolbar;
				userstoolbar = new UsersToolbarFrame(name,id);
				userstoolbar.setVisible(true);
			}
		});
		buttonUsersTool.setBounds(10, 32, 131, 23);
		panelforbuttons.add(buttonUsersTool);
		
		JButton buttonNotificationsTool = new JButton("Notifications Toolbar");
		buttonNotificationsTool.setBounds(10, 65, 131, 23);
		panelforbuttons.add(buttonNotificationsTool);
		
		JButton buttonmanageplans = new JButton("Manage Plans");
		buttonmanageplans.setBounds(10, 99, 131, 23);
		panelforbuttons.add(buttonmanageplans);
		
		JLabel labelforToolbar = new JLabel("Tool Bar");
		labelforToolbar.setBounds(10, 7, 131, 14);
		panelforbuttons.add(labelforToolbar);
		
		JButton buttonManageReports = new JButton("Manage Reports");
		buttonManageReports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonManageReports.setBounds(10, 133, 131, 23);
		panelforbuttons.add(buttonManageReports);
		
		JButton buttonInstructions = new JButton("Instructions");
		buttonInstructions.setBounds(10, 167, 131, 23);
		panelforbuttons.add(buttonInstructions);
		
		JLabel labelForNameVar = new JLabel(name);
		labelForNameVar.setBounds(82, 11, 104, 14);
		panel.add(labelForNameVar);
		
		JLabel labelForIdVar = new JLabel(String.valueOf(adminid));
		labelForIdVar.setBounds(82, 36, 104, 14);
		panel.add(labelForIdVar);
		
		JLabel labelForSystemNotifications = new JLabel("System notifications");
		labelForSystemNotifications.setBounds(10, 82, 151, 14);
		panel.add(labelForSystemNotifications);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 253, 130);
		panel.add(scrollPane);
		
		JTextArea textAreaForNotifications = new JTextArea(adminnotification);
		textAreaForNotifications.setLineWrap(true);
		textAreaForNotifications.setWrapStyleWord(true);
		scrollPane.setViewportView(textAreaForNotifications);

	}
}

