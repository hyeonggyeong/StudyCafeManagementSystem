package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import Member.Member;
import Member.MemberInput;
import Member.MemberKind;
import Member.MenMember;
import manager.MemberManager;

public class MemberAdderListener implements ActionListener {

	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldTime;
	JTextField fieldLocker;

	MemberManager membermanager;
	
	public MemberAdderListener(JTextField fieldID, JTextField fieldName, JTextField fieldTime, JTextField fieldLocker, MemberManager membermanager) {
			
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldTime = fieldTime;
		this.fieldLocker = fieldLocker;
		this.membermanager = membermanager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		MemberInput member = new MenMember();
		member.setId(Integer.parseInt(fieldID.getText()));
		member.setName(fieldName.getText());
		member.setTime(Integer.parseInt(fieldTime.getText()));
		member.setLocker(Integer.parseInt(fieldLocker.getText()));
		membermanager.addMember(member);
		putObject(membermanager, "membermanager.ser");
		member.printInfo();
		
		

		
	}
	
	public static void putObject(MemberManager membermanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(membermanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}

}

