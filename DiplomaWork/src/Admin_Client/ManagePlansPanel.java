package Admin_Client;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ManagePlansPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ManagePlansPanel() {
		setLayout(null);
		
		JButton buttonAddLesson = new JButton("Add Lesson");
		buttonAddLesson.setBounds(10, 11, 89, 23);
		add(buttonAddLesson);
		
		JButton buttonViewPlan = new JButton("View Plans");
		buttonViewPlan.setBounds(104, 34, 89, 23);
		add(buttonViewPlan);
		
		JButton buttonRemovePlans = new JButton("Remove Lesson");
		buttonRemovePlans.setBounds(198, 11, 107, 23);
		add(buttonRemovePlans);
		
		JButton buttonInstructions = new JButton("Instructions");
		buttonInstructions.setBounds(10, 107, 89, 23);
		add(buttonInstructions);
		
		JLabel labelforInstructions = new JLabel("Click here if you don't understand something");
		labelforInstructions.setBounds(10, 138, 218, 14);
		add(labelforInstructions);

	}

}
