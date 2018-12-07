package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsersToolbar extends JPanel {

	public UsersToolbar(String adminname,int id) {
		setLayout(null);
		
		JPanel panelforadmins = new JPanel();
		panelforadmins.setBounds(13, 11, 147, 137);
		add(panelforadmins);
		panelforadmins.setLayout(null);
		
		JButton buttonForAddingNewUser = new JButton("Add User");
		buttonForAddingNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddingUserFrame addinguser;
				addinguser = new AddingUserFrame();
				addinguser.setVisible(true);
			}
		});
		buttonForAddingNewUser.setBounds(13, 36, 119, 23);
		panelforadmins.add(buttonForAddingNewUser);
		
		JButton buttonContinueTerm = new JButton("Change status");
		buttonContinueTerm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeStatusOfUsersFrame changestatus;
				try {
					changestatus = new ChangeStatusOfUsersFrame();
					changestatus.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			}
		});
		buttonContinueTerm.setBounds(13, 70, 119, 23);
		panelforadmins.add(buttonContinueTerm);
		
		JButton buttonForDeletingOldUsers = new JButton("Delete User");
		buttonForDeletingOldUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeletingOldUsersFrame deletinguser;
				deletinguser = new DeletingOldUsersFrame();
				deletinguser.setVisible(true);
			}
		});
		buttonForDeletingOldUsers.setBounds(13, 104, 119, 23);
		panelforadmins.add(buttonForDeletingOldUsers);
		
		JLabel labelForAdminPanel = new JLabel("Admin Panel");
		labelForAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		labelForAdminPanel.setBounds(13, 11, 119, 14);
		panelforadmins.add(labelForAdminPanel);
		
		JPanel panelforhighadmins = new JPanel();
		panelforhighadmins.setBounds(170, 11, 147, 137);
		add(panelforhighadmins);
		panelforhighadmins.setLayout(null);
		
		JLabel labelForHighAdminPanel = new JLabel("High Admin Panel");
		labelForHighAdminPanel.setHorizontalAlignment(SwingConstants.CENTER);
		labelForHighAdminPanel.setBounds(10, 11, 114, 14);
		panelforhighadmins.add(labelForHighAdminPanel);
		
		JButton buttonForAddingNewAdmins = new JButton("Add Admin");
		buttonForAddingNewAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		     CheckingOfAdminsAdd checkingadminforadd = new CheckingOfAdminsAdd();
		     try {
				checkingadminforadd.checking(adminname, id);
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		});
		buttonForAddingNewAdmins.setBounds(10, 36, 114, 23);
		panelforhighadmins.add(buttonForAddingNewAdmins);
		
		JButton buttonForChangingRights = new JButton("Change Rights");
		buttonForChangingRights.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckingOfAdminsChange checkingadminforchange = new CheckingOfAdminsChange();
				try {
					checkingadminforchange.checking(adminname, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonForChangingRights.setBounds(10, 70, 114, 23);
		panelforhighadmins.add(buttonForChangingRights);
		
		JButton buttonForDeletingOldAdmins = new JButton("Delete Admins");
		buttonForDeletingOldAdmins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckingOfAdminsDelete checkingadminfordelete = new CheckingOfAdminsDelete();
				try {
					checkingadminfordelete.checking(adminname, id);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		buttonForDeletingOldAdmins.setBounds(10, 104, 114, 23);
		panelforhighadmins.add(buttonForDeletingOldAdmins);
		
		JButton buttonforInstructions = new JButton("Instructions");
		buttonforInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckingOfAdminsInstructions checkingforinstructions = new CheckingOfAdminsInstructions();
				try {
					checkingforinstructions.checking(adminname, id);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		buttonforInstructions.setBounds(54, 155, 89, 23);
		add(buttonforInstructions);
		
		JButton buttonforViewAllUsers = new JButton("View Users");
		buttonforViewAllUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CheckingOfAdminsView checkingforview = new CheckingOfAdminsView();
				try {
					checkingforview.checking(adminname, id);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		buttonforViewAllUsers.setBounds(180, 155, 89, 23);
		add(buttonforViewAllUsers);

	}
}
