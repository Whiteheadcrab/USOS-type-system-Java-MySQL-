package Admin_Client;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ViewInstructionsPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ViewInstructionsPanel(int rights) {
		setLayout(null);
		
		String text = "";
		
		if (rights == 1)
		{
			//Here we need to write instructions for admins with the normal admin's rights
		}
		else
		{
			if (rights == 2)
			{
				//Here we need to write instructions for admins with the highadmin's rights
			}
			else
			{
				if(rights == 3)
				{
					//Here we need to write instructions for admins with upper highadmin's rights
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Sorry , problem with you rights");
				}
			}
		}
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 430, 278);
		add(scrollPane);
		
		JTextArea textArea = new JTextArea(text);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

	}

}
