package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingUserPanel extends JPanel {
	private JTextField textFieldforName;
	private JTextField textFieldforID;
	private JTextField textFieldforGroupID;
	private JTextField textFieldforSemester;
	private JTextField textFieldforFrom;
	private JTextField textFieldforUntil;
	private JTextField textFieldforSurname;

	/**
	 * Create the panel.
	 */
	public AddingUserPanel() {
		setLayout(null);
		
		AddingUserController controller = new AddingUserController();
		
		JLabel lblLabelforName = new JLabel("Name :");
		lblLabelforName.setBounds(20, 11, 73, 14);
		add(lblLabelforName);
		
		JLabel lblLabelforSurname = new JLabel("Surname :");
		lblLabelforSurname.setBounds(20, 42, 73, 14);
		add(lblLabelforSurname);
			
		JLabel lblLabelforID = new JLabel("ID :");
		lblLabelforID.setBounds(20, 73, 73, 14);
		add(lblLabelforID);
				
		JLabel lblLabelforGroupID = new JLabel("Group ID :");
		lblLabelforGroupID.setBounds(20, 104, 73, 14);
		add(lblLabelforGroupID);
		
		JLabel lblLabelforSemester = new JLabel("Semester :");
		lblLabelforSemester.setBounds(251, 73, 73, 14);
		add(lblLabelforSemester);
		
		JLabel lblLabelActFrom = new JLabel("From :");
		lblLabelActFrom.setBounds(251, 11, 73, 14);
		add(lblLabelActFrom);
		
		JLabel lblLabelforUntil = new JLabel("Until :");
		lblLabelforUntil.setBounds(251, 42, 46, 14);
		add(lblLabelforUntil);
		
		textFieldforName = new JTextField();
		textFieldforName.setBounds(111, 8, 130, 20);
		add(textFieldforName);
		textFieldforName.setColumns(10);
			
		textFieldforSurname = new JTextField();
		textFieldforSurname.setBounds(111, 39, 130, 20);
		add(textFieldforSurname);
		textFieldforSurname.setColumns(10);
		
		textFieldforID = new JTextField();
		textFieldforID.setBounds(111, 70, 130, 20);
		add(textFieldforID);
		textFieldforID.setColumns(10);
			
		textFieldforGroupID = new JTextField();
		textFieldforGroupID.setBounds(111, 101, 130, 20);
		add(textFieldforGroupID);
		textFieldforGroupID.setColumns(10);
		
		textFieldforSemester = new JTextField();
		textFieldforSemester.setBounds(335, 70, 130, 20);
		add(textFieldforSemester);
		textFieldforSemester.setColumns(10);
		
		textFieldforFrom = new JTextField();
		textFieldforFrom.setBounds(335, 8, 130, 20);
		add(textFieldforFrom);
		textFieldforFrom.setColumns(10);
		
		textFieldforUntil = new JTextField();
		textFieldforUntil.setBounds(335, 39, 130, 20);
		add(textFieldforUntil);
		textFieldforUntil.setColumns(10);
		
		JButton buttonAddUser = new JButton("Add User");
		buttonAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textFieldforName.getText();
				String surname = textFieldforSurname.getText();
				int id = Integer.parseInt(textFieldforID.getText());
				int groupid = Integer.parseInt(textFieldforGroupID.getText());
				int semester = Integer.parseInt(textFieldforSemester.getText());
				String actfrom = textFieldforFrom.getText();
				String actuntil = textFieldforUntil.getText();
                if (id==groupid)
                {
                	String status = "Teacher";
                	try {
    					controller.AddingUser(name, surname , id, groupid, semester, status , actfrom , actuntil);
    				} catch (Exception e1) {
    					e1.printStackTrace();
    				}
                }
                else
                {
                	String status = "Student";
                	try {
    					controller.AddingUser(name, surname , id, groupid, semester, status , actfrom , actuntil);
    				} catch (Exception e1) {
    					e1.printStackTrace();
    				}
                }
			}
		});
		buttonAddUser.setBounds(197, 168, 89, 23);
		add(buttonAddUser);

	}
}
