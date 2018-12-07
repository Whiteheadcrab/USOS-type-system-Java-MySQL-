import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;

public class Login_Page extends JPanel {
	private JTextField textFieldForName;
	private JTextField textFieldForPassword;

	/**
	 * Create the panel.
	 */
	public Login_Page()  {
		
		LoginController  controller = new LoginController();
		 		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnLoginButton.setBounds(45, 147, 106, 29);
		add(btnLoginButton);
		textFieldForName = new JTextField();
		textFieldForName.setBounds(35, 66, 166, 20);
		add(textFieldForName);
		textFieldForName.setColumns(20);
				
		textFieldForPassword = new JTextField();
		textFieldForPassword.setBounds(35, 107, 166, 20);
		add(textFieldForPassword);
		textFieldForPassword.setColumns(20);
		
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textFieldForPassword.getText());
				String name = textFieldForName.getText();				
					try {
						controller.Logining(id,name);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			    
			}
		});
		setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Welcome to our application. Please , login in.");
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 17));
		lblNewLabel.setBounds(10, 11, 348, 29);
		add(lblNewLabel);
		
		JLabel lblYourUsername = new JLabel("Your Username");
		lblYourUsername.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYourUsername.setBounds(211, 63, 127, 23);
		add(lblYourUsername);
		
		JLabel lblYourPassword = new JLabel("Your Password");
		lblYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblYourPassword.setBounds(211, 105, 129, 23);
		add(lblYourPassword);
		
		JButton btnHelpButton = new JButton("Need help ?");
		btnHelpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HelpingFrame change1 = new HelpingFrame();
				change1.setVisible(true);
			}
		});
		btnHelpButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnHelpButton.setBounds(225, 148, 133, 29);
		add(btnHelpButton);

	}
	

}
