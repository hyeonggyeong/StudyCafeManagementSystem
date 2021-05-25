import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

import Member.MemberInput;
import Member.MenMember;
import Member.WomenMember;

public class MemberManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6384567515766354655L;
	
	ArrayList<MemberInput> members= new ArrayList<MemberInput>();
	transient Scanner input;	
	MemberManager(Scanner input) {
		this.input = input;
	}
	
	public void addmembers() {
		int kind = 0;
		MemberInput memberInput;
		while (kind != 1 && kind !=2) {
			try {
				System.out.println("****************ADD******************");
				System.out.println("Select Gender: ");
				System.out.println("1. Men");
				System.out.println("2. Women");
				kind = input.nextInt();
				if (kind == 1) {
					memberInput = new MenMember();
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else if (kind ==2) {
					memberInput = new WomenMember();
					memberInput.getUserInput(input);
					members.add(memberInput);
					break;
				}
				else {
					System.out.println("Select num for Member's Genger between 1 and 2");
				}	
			}
			catch(InputMismatchException e) {
				System.out.println("please put an integer between 1 and 2!");
				if (input.hasNext()) {
					input.next();
				}
			}
		}		
	}
	
	public void deletemembers() {
		System.out.println("***************DELETE******************");
		System.out.print("Enter the MemberID you want to delete :");
		int memberID =input.nextInt();
		int index = -1;
		
		for (int i = 0; i<members.size(); i++) {
			if(members.get(i).getId() == memberID) {
				index = i;
				break;		
			}
		}
		if (index >= 0) {
			members.remove(index);
			System.out.println("Member " + memberID  +" is deleted");
		}
		
		
		else {
			System.out.println("Member has not been registered");
			return;
		}
		
		
		
	}
	public void editmembers() {
		System.out.println("****************EDIT*******************");
		System.out.print("Enter the MembertID you want to edit :");
		int memberID =input.nextInt();
		for (int i = 0; i<members.size(); i++) {
			MemberInput memberInput = members.get(i);
			if(memberInput.getId() == memberID) {
				int editnum = -1;				
				while (editnum != 5) {
					System.out.println("Enter the number you want to edit");
					System.out.println("1. ID");
					System.out.println("2. Name");
					System.out.println("3. Time Ticket");
					System.out.println("4. Locker Number");
					System.out.println("5. Exit");
					editnum = input.nextInt();
					if (editnum == 1) {
						System.out.print("Member ID(PhoneNumber without '-') :");
						int id =input.nextInt();
						memberInput.setId(id);
					}
					else if (editnum == 2) {
						System.out.print("Member Name :");
						String name = input.next();
						memberInput.setName(name);
					}
					else if (editnum == 3) {
						System.out.print("Desired Timeticket[Hour] :");
						int time = input.nextInt();
						memberInput.setTime(time);
					}
					else if (editnum == 4) {
						System.out.print("Locker Number :");
						int locker = input.nextInt();
						memberInput.setLocker(locker);
					}
					else {
						continue;	
					}
				}
				break;
			}						
		}		
	}
	public void viewmembers() {
		System.out.println("# of registered members : " + members.size());
		for (int i = 0; i<members.size(); i++) {
			members.get(i).printInfo();
		}
	}
}
