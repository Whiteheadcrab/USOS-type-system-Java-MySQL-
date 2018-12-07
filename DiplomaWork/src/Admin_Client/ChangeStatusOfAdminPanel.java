package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeStatusOfAdminPanel extends JPanel {
	private JTextField textFieldforIDAdd;
	private JTextField textFieldforIDRemove;

	public ChangeStatusOfAdminPanel() {
		setLayout(null);
		
		JLabel labelforReports = new JLabel("Choose your option and input please all necessry information");
		labelforReports.setHorizontalAlignment(SwingConstants.CENTER);
		labelforReports.setBounds(69, 11, 292, 14);
		add(labelforReports);
		
		JPanel panelforFirstOption = new JPanel();
		panelforFirstOption.setBounds(10, 36, 399, 83);
		add(panelforFirstOption);
		panelforFirstOption.setLayout(null);
		
		JLabel labelforFirstOption = new JLabel("Add highadmin rights to admin");
		labelforFirstOption.setHorizontalAlignment(SwingConstants.CENTER);
		labelforFirstOption.setBounds(105, 0, 202, 14);
		panelforFirstOption.add(labelforFirstOption);
		
		JLabel labelforIDAdd = new JLabel("Please input ID :");
		labelforIDAdd.setBounds(10, 24, 95, 14);
		panelforFirstOption.add(labelforIDAdd);
		
		textFieldforIDAdd = new JTextField();
		textFieldforIDAdd.setBounds(125, 21, 161, 20);
		panelforFirstOption.add(textFieldforIDAdd);
		textFieldforIDAdd.setColumns(10);
		
		JButton buttonAdd = new JButton("Add");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id_add = Integer.parseInt(textFieldforIDAdd.getText());
				AddingHighAdminsRightsController addrights = new AddingHighAdminsRightsController();
				try {
					addrights.Add(id_add);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonAdd.setBounds(279, 52, 89, 23);
		panelforFirstOption.add(buttonAdd);
		
		JPanel panelforSecondOption = new JPanel();
		panelforSecondOption.setBounds(10, 130, 399, 83);
		add(panelforSecondOption);
		panelforSecondOption.setLayout(null);
		
		JLabel labelforSecondOption = new JLabel("Remove highadmin rights from admin");
		labelforSecondOption.setHorizontalAlignment(SwingConstants.CENTER);
		labelforSecondOption.setBounds(105, 0, 202, 14);
		panelforSecondOption.add(labelforSecondOption);
		
		JLabel labelforIDRemove = new JLabel("Please input ID :");
		labelforIDRemove.setBounds(10, 24, 95, 14);
		panelforSecondOption.add(labelforIDRemove);
		
		textFieldforIDRemove = new JTextField();
		textFieldforIDRemove.setBounds(125, 21, 161, 20);
		panelforSecondOption.add(textFieldforIDRemove);
		textFieldforIDRemove.setColumns(10);
		
		JButton buttonRemove = new JButton("Remove");
		buttonRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id_remove = Integer.parseInt(textFieldforIDRemove.getText());
				RemovingHighAdminsRightsController removerights = new RemovingHighAdminsRightsController();
				try {
					removerights.Remove(id_remove);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonRemove.setBounds(279, 52, 89, 23);
		panelforSecondOption.add(buttonRemove);

	}
}
