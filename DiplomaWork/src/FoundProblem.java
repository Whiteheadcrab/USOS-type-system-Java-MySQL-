import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class FoundProblem extends JPanel {

	/**
	 * Create the panel.
	 */
	public FoundProblem() {
		setLayout(null);
		
		//Here we create the string variable for representing message for users
		String Message="If you found any problem which make the process of using our application unpleasent or impossible please contact with us and we will deal with this problem.";
		
		JLabel lblProblemLabel = new JLabel("You found problem ?");
		lblProblemLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblProblemLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblProblemLabel.setBounds(57, 11, 430, 14);
		add(lblProblemLabel);
		
		JLabel lblOurMailExamplegmailcom = new JLabel("Our mail: example.@gmail.com");
		lblOurMailExamplegmailcom.setBounds(10, 101, 256, 14);
		add(lblOurMailExamplegmailcom);
		
		JLabel lblPhone = new JLabel("Phone: +48888888888");
		lblPhone.setBounds(10, 126, 165, 14);
		add(lblPhone);
		
		JLabel lblRoom = new JLabel("Room 399");
		lblRoom.setBounds(10, 151, 121, 14);
		add(lblRoom);
		
		JLabel lblMnFd = new JLabel("Work Days : Mn - Fd  10-16");
		lblMnFd.setBounds(10, 176, 217, 14);
		add(lblMnFd);
		
		JTextArea textAreaMessage = new JTextArea(Message);
		textAreaMessage.setLineWrap(true);
		textAreaMessage.setRows(4);
		textAreaMessage.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textAreaMessage.setForeground(new Color(0, 0, 0));
		textAreaMessage.setEnabled(false);
		textAreaMessage.setTabSize(4);
		textAreaMessage.setBackground(SystemColor.control);
		textAreaMessage.setEditable(false);
		textAreaMessage.setBounds(10, 28, 510, 69);
		add(textAreaMessage);

	}
}
