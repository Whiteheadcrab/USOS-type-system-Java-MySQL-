package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLoginPanel extends JPanel {
	private JTextField textFieldForLogin;
	private JTextField textFieldForPassword;

	public AdminLoginPanel() {
		setLayout(null);
		
		//Small text for saying "Hi" to all workers who use our application
		String Textforgreating = "Welcome to the admin client of our application. Hope you will enjoy our application . \n   @Developers team ";
		
		//Here we create connection between controller and panel for loggining
		LoginControllerForAdmins controller = new LoginControllerForAdmins();
		
		JLabel lblLabelForInputLogin = new JLabel("Login :");
		lblLabelForInputLogin.setBounds(10, 11, 71, 14);
		add(lblLabelForInputLogin);
		
		JLabel lblLabelForInputPassword = new JLabel("Password :");
		lblLabelForInputPassword.setBounds(10, 65, 79, 14);
		add(lblLabelForInputPassword);
		
		
		JButton btnButtonForLogin = new JButton("Login");
		btnButtonForLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Creating variables for next steps in loggining
				String variableforname = textFieldForLogin.getText();
				int variableforpassword = Integer.parseInt(textFieldForPassword.getText());
				//And start the loggining
				try {
					controller.LogginingAsAdmin(variableforpassword,variableforname);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnButtonForLogin.setBounds(104, 139, 89, 23);
		add(btnButtonForLogin);
		
		textFieldForPassword = new JTextField();
		textFieldForPassword.setBounds(10, 90, 150, 20);
		add(textFieldForPassword);
		textFieldForPassword.setColumns(10);
		
		textFieldForLogin = new JTextField();
		textFieldForLogin.setBounds(10, 34, 150, 20);
		add(textFieldForLogin);
		textFieldForLogin.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(190, 11, 127, 117);
		add(scrollPane);
		
		JTextArea textAreaForDescribingThisClient = new JTextArea(Textforgreating);
		textAreaForDescribingThisClient.setEditable(false);
		textAreaForDescribingThisClient.setLineWrap(true);
		textAreaForDescribingThisClient.setWrapStyleWord(true);
		scrollPane.setViewportView(textAreaForDescribingThisClient);
		
		

	}
}
