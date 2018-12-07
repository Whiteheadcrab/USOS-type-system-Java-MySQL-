import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class UserPagePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public UserPagePanel(String name , int id) throws Exception{
		setLayout(null);
		
		int valueforid = 0;
		String valueforname = null;
		String valueforgroupname = null;
		int valueforgroupid = 0;
		String valuefornotifications = "";
		int teachergroup=9999;
		
		JLabel lblUserLabel = new JLabel("User :");
		lblUserLabel.setBounds(10, 11, 46, 14);
		add(lblUserLabel);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 36, 56, 14);
		add(lblId);
		
		JLabel lblGroupLabel = new JLabel("Group:");
		lblGroupLabel.setBounds(10, 61, 46, 14);
		add(lblGroupLabel);
		
		JLabel lblSemester = new JLabel("Semester:");
		lblSemester.setBounds(10, 86, 62, 14);
		add(lblSemester);
		
		JPanel PanelforButtons = new JPanel();
		PanelforButtons.setBounds(10, 162, 186, 127);
		add(PanelforButtons);
		
		JButton btnViewMyPlanButton = new JButton("View my plan");
		btnViewMyPlanButton.setBounds(15, 11, 149, 23);
		btnViewMyPlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewMyPlanFrame myplan;
				try {
					myplan = new ViewMyPlanFrame(id);
					myplan.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		PanelforButtons.setLayout(null);
		PanelforButtons.add(btnViewMyPlanButton);
		
		JButton btnViewTeachersPlan = new JButton("View teacher's plan");
		btnViewTeachersPlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTeacherPlanFrame teacherplan;
				try {
					teacherplan = new ViewTeacherPlanFrame();
					teacherplan.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnViewTeachersPlan.setBounds(15, 45, 149, 23);
		PanelforButtons.add(btnViewTeachersPlan);
		
		JButton btnReportButton = new JButton("I found problem");
		btnReportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FoundProblemFrame problem;
				problem = new FoundProblemFrame();
				problem.setVisible(true);
			}
		});
		btnReportButton.setBounds(15, 79, 149, 23);
		PanelforButtons.add(btnReportButton);
		
		
		
		JButton btnProfileButton = new JButton("My Profile");
		btnProfileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewProfileFrame profilepage;
				try {
					profilepage = new ViewProfileFrame(id);
					profilepage.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		
			}
		});
		btnProfileButton.setBounds(10, 111, 120, 23);
		add(btnProfileButton);
		try {
		// Get connection to the database
        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
        // Create a statement 
    	Statement myStmt = myConn.createStatement();
    	// Execute SQL query
    	ResultSet myRs = myStmt.executeQuery("select * from studentstable where id = "+id);
    	while (myRs.next())
    	{
    	valueforid = myRs.getInt("id");
    	valueforname = myRs.getString("name");
    	valueforgroupname = myRs.getString("groupname");
    	valueforgroupid = myRs.getInt("groupid");
		} 
		}
		catch (Exception e)
		{
			throw new Exception("Error with database");
		}
		JLabel lblUserdaraLabel = new JLabel(valueforname);
		lblUserdaraLabel.setBounds(98, 11, 98, 14);
		add(lblUserdaraLabel);
		
		JLabel lblStudentIddataLabel = new JLabel(String.valueOf(valueforid));
		lblStudentIddataLabel.setBounds(98, 36, 98, 14);
		add(lblStudentIddataLabel);
		
		JLabel lblGroupdataLabel = new JLabel(valueforgroupname);
		lblGroupdataLabel.setBounds(98, 61, 98, 14);
		add(lblGroupdataLabel);
		
		JLabel lblSemesterdatalabel = new JLabel(String.valueOf(valueforgroupid));
		lblSemesterdatalabel.setBounds(98, 86, 98, 14);
		add(lblSemesterdatalabel);
        
		//Notification panel
		JPanel Notificationlabel = new JPanel();
		Notificationlabel.setBounds(252, 48, 244, 241);
		add(Notificationlabel);
		Notificationlabel.setLayout(null);
		
		
		// Again create connection to database here
		
		try {
			// Get connection to the database
	        Connection myConn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?autoReconnect=true&useSSL=false","root","password11111111");
	        // Create a statement 
	    	Statement myStmt1 = myConn1.createStatement();
	    	// Execute SQL query
			ResultSet myRs1 = myStmt1.executeQuery("select notificationmessage from notification where studentid = "+id);
	    	while (myRs1.next())
	    	{
	    		valuefornotifications += myRs1.getString("notificationmessage");
	    		valuefornotifications += ("\n");
			} 
		}
		catch (Exception e)
		{
			throw new Exception("Error with database number 2");
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 22, 224, 208);
		Notificationlabel.add(scrollPane);
		
		JTextArea textAreaForNotifications = new JTextArea(valuefornotifications);
		textAreaForNotifications.setWrapStyleWord(true);
		textAreaForNotifications.setLineWrap(true);
		textAreaForNotifications.setColumns(6);
		textAreaForNotifications.setRows(10);
		textAreaForNotifications.setEditable(false);
		scrollPane.setViewportView(textAreaForNotifications);
		
		JLabel lblNotificationsLabel = new JLabel("Notifications");
		lblNotificationsLabel.setBounds(75, -3, 85, 14);
		Notificationlabel.add(lblNotificationsLabel);
		lblNotificationsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotificationsLabel.setVerticalAlignment(SwingConstants.TOP);
		
	}
}
