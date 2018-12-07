package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class AdminsInstructionsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public AdminsInstructionsPanel() {
		setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 278);
		add(scrollPane);
		
		JTextArea textAreaforInstructions = new JTextArea();
		textAreaforInstructions.setWrapStyleWord(true);
		textAreaforInstructions.setLineWrap(true);
		textAreaforInstructions.setEditable(false);
		scrollPane.setViewportView(textAreaforInstructions);

	}

}
