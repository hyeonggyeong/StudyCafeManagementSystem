package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.MemberAdderCancelListener;
import Listener.MemberAdderListener;
import manager.MemberManager;


public class MemberAdder extends JPanel {
	WindowFrame frame;
	
	MemberManager membermanager;
	
	public MemberAdder(WindowFrame frame, MemberManager membermanager) {
		this.frame = frame;
		this.membermanager = membermanager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelTime = new JLabel("Time : ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		JLabel labelLocker = new JLabel("Locker : ", JLabel.TRAILING);
		JTextField fieldLocker = new JTextField(10);
		labelLocker.setLabelFor(fieldLocker);
			
		JButton saveButton = new JButton("SAVE");
		saveButton.addActionListener(new MemberAdderListener(fieldID,fieldName,fieldTime,fieldLocker,membermanager));
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new MemberAdderCancelListener(frame));
		
		panel.add(labelLocker);
		panel.add(fieldLocker);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
	}
	
}
