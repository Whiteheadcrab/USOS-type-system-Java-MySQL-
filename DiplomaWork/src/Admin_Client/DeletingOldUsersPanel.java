package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletingOldUsersPanel extends JPanel {
	private JTextField textFieldforID;
	private JTextField textFieldforName;

	/**
	 * Create the panel.
	 */
	public DeletingOldUsersPanel() {
		setLayout(null);
		
		JLabel labelForHisId = new JLabel("ID :");
		labelForHisId.setBounds(10, 32, 139, 14);
		add(labelForHisId);
		
		JLabel labelforHisName = new JLabel("Full Name :");
		labelforHisName.setBounds(10, 57, 139, 14);
		add(labelforHisName);
		
		JLabel labelforReport = new JLabel("Plese input all necessary variables");
		labelforReport.setBounds(83, 7, 163, 14);
		add(labelforReport);
		
		textFieldforID = new JTextField();
		textFieldforID.setBounds(159, 29, 152, 20);
		add(textFieldforID);
		textFieldforID.setColumns(10);	
		
		textFieldforName = new JTextField();
		textFieldforName.setBounds(159, 54, 152, 20);
		add(textFieldforName);
		textFieldforName.setColumns(10);	
		
		JButton buttonforDeletingUsers = new JButton("Delete");
		buttonforDeletingUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textFieldforName.getText();
				int id = Integer.parseInt(textFieldforID.getText());
				DeletingOldUsersController controller = new DeletingOldUsersController();
				try {
					controller.deleting(id,name);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		buttonforDeletingUsers.setBounds(120, 94, 89, 23);
		add(buttonforDeletingUsers);
	}
}
