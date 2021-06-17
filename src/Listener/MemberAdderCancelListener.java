package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import GUI.MemberAdder;
import GUI.MemberViewer;
import GUI.WindowFrame;

public class MemberAdderCancelListener implements ActionListener {

	WindowFrame frame;
	
	public MemberAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselecion());
		frame.revalidate();
		frame.repaint();
	}

}
