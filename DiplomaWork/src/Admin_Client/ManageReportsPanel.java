package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ManageReportsPanel extends JPanel {
	public ManageReportsPanel() {
		setLayout(null);
		
		JButton buttonViewAllReports = new JButton("View Reports");
		buttonViewAllReports.setBounds(10, 29, 109, 23);
		add(buttonViewAllReports);
		
		JButton buttonDeleteReportbyID = new JButton("Delete Report");
		buttonDeleteReportbyID.setBounds(10, 63, 109, 23);
		add(buttonDeleteReportbyID);
		
		JLabel labelforManageReportsPanel = new JLabel("Manage Reports ");
		labelforManageReportsPanel.setBounds(200, 11, 82, 14);
		add(labelforManageReportsPanel);
		
		JButton buttonInstructions = new JButton("Instructions");
		buttonInstructions.setBounds(193, 93, 89, 23);
		add(buttonInstructions);

	}

}
