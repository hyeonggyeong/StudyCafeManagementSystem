package GUI;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Member.MemberInput;
import manager.MemberManager;

public class MemberViewer extends JPanel {

	WindowFrame frame;
	
	MemberManager membermanager;
	
	public MemberManager getMembermanager() {
		return membermanager;
	}

	public void setMembermanager(MemberManager membermanager) {
		this.membermanager = membermanager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Time");
		model.addColumn("Locker No.");
		
		for(int i=0; i< membermanager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = membermanager.get(i);
			row.add(mi.getId());
			row.add(mi.getName());
			row.add(mi.getTime());
			row.add(mi.getLocker());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public MemberViewer(WindowFrame frame, MemberManager membermanager) {
		this.frame = frame;
		this.membermanager = membermanager;
		
		System.out.println("***" + membermanager.size() + "***");
		
		
		
	}

}
