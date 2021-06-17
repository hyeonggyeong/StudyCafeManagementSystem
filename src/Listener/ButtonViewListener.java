package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import GUI.MemberViewer;
import GUI.WindowFrame;
import manager.MemberManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MemberViewer memberViewer = frame.getMemberviewer();
		MemberManager membermanager = getObject("membermanager.ser");	
		memberViewer.setMembermanager(membermanager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(memberViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static MemberManager getObject(String filename) {
		MemberManager membermanager = null;
		
	
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			membermanager = (MemberManager) in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return membermanager;	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return membermanager;
	}

}
