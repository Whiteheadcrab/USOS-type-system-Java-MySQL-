package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletingOldAdminPanel extends JPanel {
	private JTextField textFieldforId;

	/**
	 * Create the panel.
	 */
	public DeletingOldAdminPanel() {
		setLayout(null);
		
		JLabel labelforReport = new JLabel("Input please data of admin which you want to delete");
		labelforReport.setBounds(10, 11, 253, 14);
		add(labelforReport);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setBounds(10, 47, 46, 14);
		add(lblNewLabel);
		
		textFieldforId = new JTextField();
		textFieldforId.setBounds(79, 44, 184, 20);
		add(textFieldforId);
		textFieldforId.setColumns(10);
		
		JButton buttonDelete = new JButton("Delete");
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id_delete = Integer.parseInt(textFieldforId.getText());
				DeletingOldAdminController controllerdelete =  new DeletingOldAdminController();
				try {
					controllerdelete.Delete(id_delete);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonDelete.setBounds(89, 75, 89, 23);
		add(buttonDelete);

	}

}
