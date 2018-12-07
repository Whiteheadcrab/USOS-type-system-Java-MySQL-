package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class ChangeStatusOfUsersPanel extends JPanel {
	private JTextField textFieldforHisID;
	private JTextField textFieldforNewDeadline;

	/**
	 * Create the panel.
	 */
	public ChangeStatusOfUsersPanel() throws Exception{
		setLayout(null);
		
		JLabel labelforMessage = new JLabel("Please input id of user who you want to change:");
		labelforMessage.setBounds(10, 11, 252, 14);
		add(labelforMessage);
		
		JLabel labelForNewCurrentDate = new JLabel("Please input new deadline of his status :");
		labelForNewCurrentDate.setBounds(10, 36, 252, 14);
		add(labelForNewCurrentDate);
		
		JLabel labelforReports = new JLabel("");
		labelforReports.setBounds(187, 61, 46, 14);
		add(labelforReports);
		
		textFieldforHisID = new JTextField();
		textFieldforHisID.setBounds(272, 8, 168, 20);
		add(textFieldforHisID);
		textFieldforHisID.setColumns(10);
		
		textFieldforNewDeadline = new JTextField();
		textFieldforNewDeadline.setBounds(272, 33, 168, 20);
		add(textFieldforNewDeadline);
		textFieldforNewDeadline.setColumns(10);
		
		JButton buttonforChanges = new JButton("Change");
		buttonforChanges.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e1) {
				int id = Integer.parseInt(textFieldforHisID.getText());
				String date = textFieldforNewDeadline.getText();
				ChangeStatusOfUsersController controller = new ChangeStatusOfUsersController();
				controller = new ChangeStatusOfUsersController();
				try {
                    controller.changingStatus(id, date);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
			}
		});
		buttonforChanges.setBounds(173, 86, 89, 23);
		add(buttonforChanges);
		
		

	}

}
