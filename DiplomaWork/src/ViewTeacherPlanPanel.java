import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class ViewTeacherPlanPanel extends JPanel {
	private JTextField textFieldForTeacherName;

	/**
	 * Create the panel.
	 */
	public ViewTeacherPlanPanel() throws Exception{
	
		
	
		SearchTeacherController newcontroller = new SearchTeacherController();
			
		JButton btnViewPlanButton = new JButton("View plan");
		btnViewPlanButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String valueforteachername=textFieldForTeacherName.getText();
				try {
					TeacherPlanFrame teacher;
					teacher = new TeacherPlanFrame(valueforteachername);
					teacher.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		setLayout(null);
			
		btnViewPlanButton.setBounds(111, 45, 108, 23);
		add(btnViewPlanButton);
		
		JLabel lblTeachersName = new JLabel("Teacher's name");
		lblTeachersName.setBounds(10, 17, 95, 14);
		add(lblTeachersName);
		
		textFieldForTeacherName = new JTextField();
		textFieldForTeacherName.setBounds(128, 14, 209, 20);
		add(textFieldForTeacherName);
		textFieldForTeacherName.setColumns(10);

	}
}
