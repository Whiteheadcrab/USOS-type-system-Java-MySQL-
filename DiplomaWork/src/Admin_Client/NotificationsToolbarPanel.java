package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NotificationsToolbarPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public NotificationsToolbarPanel() {
		setLayout(null);
		
		JPanel panelforUsersNotifications = new JPanel();
		panelforUsersNotifications.setBounds(10, 11, 175, 170);
		add(panelforUsersNotifications);
		panelforUsersNotifications.setLayout(null);
		
		JLabel labelforUserReport = new JLabel("User's Notifications");
		labelforUserReport.setHorizontalAlignment(SwingConstants.CENTER);
		labelforUserReport.setBounds(10, 11, 155, 14);
		panelforUsersNotifications.add(labelforUserReport);
		
		JButton buttonAddUsersNotification = new JButton("Add");
		buttonAddUsersNotification.setBounds(43, 36, 89, 23);
		panelforUsersNotifications.add(buttonAddUsersNotification);
		
		JButton buttonViewUsersNotifications = new JButton("View");
		buttonViewUsersNotifications.setBounds(43, 70, 89, 23);
		panelforUsersNotifications.add(buttonViewUsersNotifications);
		
		JButton buttonChangeUsersNotifications = new JButton("Change");
		buttonChangeUsersNotifications.setBounds(43, 104, 89, 23);
		panelforUsersNotifications.add(buttonChangeUsersNotifications);
		
		JButton buttonDeleteUsersNotification = new JButton("Delete");
		buttonDeleteUsersNotification.setBounds(43, 138, 89, 23);
		panelforUsersNotifications.add(buttonDeleteUsersNotification);
		
		JPanel panelforAdminsNotifications = new JPanel();
		panelforAdminsNotifications.setBounds(195, 11, 175, 170);
		add(panelforAdminsNotifications);
		panelforAdminsNotifications.setLayout(null);
		
		JLabel labelforAdminsReports = new JLabel("Admin's Notifications");
		labelforAdminsReports.setHorizontalAlignment(SwingConstants.CENTER);
		labelforAdminsReports.setBounds(10, 11, 155, 14);
		panelforAdminsNotifications.add(labelforAdminsReports);
		
		JButton buttonAddAdminsNotifications = new JButton("Add");
		buttonAddAdminsNotifications.setBounds(43, 36, 89, 23);
		panelforAdminsNotifications.add(buttonAddAdminsNotifications);
		
		JButton buttonViewAdminsNotifications = new JButton("View");
		buttonViewAdminsNotifications.setBounds(43, 70, 89, 23);
		panelforAdminsNotifications.add(buttonViewAdminsNotifications);
		
		JButton buttonChangeAdminsNotifications = new JButton("Change");
		buttonChangeAdminsNotifications.setBounds(43, 104, 89, 23);
		panelforAdminsNotifications.add(buttonChangeAdminsNotifications);
		
		JButton buttonDeleteAdminsNotifications = new JButton("Delete");
		buttonDeleteAdminsNotifications.setBounds(43, 138, 89, 23);
		panelforAdminsNotifications.add(buttonDeleteAdminsNotifications);
		
		JButton buttonInstructions = new JButton("Instructions");
		buttonInstructions.setBounds(148, 192, 89, 23);
		add(buttonInstructions);

	}
}
