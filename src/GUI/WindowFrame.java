package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.MemberManager;

public class WindowFrame extends JFrame {
	
	MemberManager membermanager;
	
	MenuSelection menuselecion;
	MemberAdder memberadder;
	MemberViewer memberviewer;
	
	
	public WindowFrame(MemberManager membermanager) {
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.membermanager = membermanager;
		this.menuselecion = new MenuSelection(this);
		this.memberadder = new MemberAdder(this,this.membermanager);
		this.memberviewer = new MemberViewer(this, this.membermanager);
			
		this.add(menuselecion);
		
		this.setVisible(true);
		
		
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();

	}
	public MenuSelection getMenuselecion() {
		return menuselecion;
	}
	public void setMenuselecion(MenuSelection menuselecion) {
		this.menuselecion = menuselecion;
	}
	public MemberAdder getMemberadder() {
		return memberadder;
	}
	public void setMemberadder(MemberAdder memberadder) {
		this.memberadder = memberadder;
	}
	public MemberViewer getMemberviewer() {
		return memberviewer;
	}
	public void setMemberviewer(MemberViewer memberviewer) {
		this.memberviewer = memberviewer;
	}
}



