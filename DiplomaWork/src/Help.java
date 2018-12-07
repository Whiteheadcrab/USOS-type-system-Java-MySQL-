import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class Help extends JPanel {

	/**
	 * Create the panel.
	 */
	public Help() {
		
		//Here we create string variables which we will use to represent our text
				//Topics
				String whyourapplication = "Why you need to choose our application ?\n";
				String outapplicationorientedfor = "Application for study\n";
				String howtoregister = "How to register for our application ? \n";
				String howtofindus = "How to find us \n";
				
				//Main text
				String ourapplication ="In this application we tried to minimaze your time for receiving only necessary information : your current id , you current status , group id , plans , marks if you are student and receiving important notifications from university like canceling lessons,problems with payments or just notifications about future events.\n";
				String appforuniversity ="Mainly our application orriented for schools , universities and even for courses. Using our application could be as main part of all notifications in educational establishment , as good possibility of viewing plans of study for student or just as system for workes of establishment.\n";
				String whomayregisteryou ="If you a student/teacher of eductional establishment our support team automatically generate your account and give you all necessary information for logging . If you didn't receive login information please contact with techical support manager in your establishment. IMPORTANT INFORMTATION : Please DO NOT give you login information for other people.\n";
				String ifyouwanttofindus ="You can write to us using our mail or come to the room of support team in your establishment.\n";
				
				//Our text for text Area
				String fulltext = whyourapplication + ourapplication + outapplicationorientedfor + appforuniversity + howtoregister + whomayregisteryou + howtofindus + ifyouwanttofindus;
		
				setLayout(null);
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 11, 499, 270);
				add(scrollPane);
				
				JTextArea textAreaForText = new JTextArea(fulltext);
				textAreaForText.setWrapStyleWord(true);
				textAreaForText.setLineWrap(true);
				textAreaForText.setEditable(false);
				scrollPane.setViewportView(textAreaForText);
		
		

	}
}
