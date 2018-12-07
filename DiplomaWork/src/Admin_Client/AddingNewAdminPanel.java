package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingNewAdminPanel extends JPanel {
	private JTextField textFieldforName;
	private JTextField textFieldforPassword;

	/**
	 * Create the panel.
	 */
	public AddingNewAdminPanel() {
		setLayout(null);
		
		JLabel labelforMessage = new JLabel("Please input all necessary information");
		labelforMessage.setBounds(32, 11, 191, 14);
		add(labelforMessage);
		
		JLabel labelforName = new JLabel("Full Name :");
		labelforName.setBounds(10, 43, 81, 14);
		add(labelforName);
		
		JLabel labelforPassword = new JLabel("Password :");
		labelforPassword.setBounds(10, 68, 81, 14);
		add(labelforPassword);
		
		textFieldforName = new JTextField();
		textFieldforName.setBounds(101, 40, 148, 20);
		add(textFieldforName);
		textFieldforName.setColumns(10);
		
		textFieldforPassword = new JTextField();
		textFieldforPassword.setBounds(101, 65, 148, 20);
		add(textFieldforPassword);
		textFieldforPassword.setColumns(10);
		
		JButton buttonAdd = new JButton("Add");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldforName.getText();
				int password = Integer.parseInt(textFieldforPassword.getText());
				AddingNewAdminController addadmin = new AddingNewAdminController();
				try {
					addadmin.Add(name, password);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonAdd.setBounds(73, 96, 89, 23);
		add(buttonAdd);

	}
}
