import java.util.ArrayList;
import java.util.Scanner;

import Member.Member;
import Member.MenMember;
import Member.WomenMember;

public class MemberManager {
	ArrayList<Member> members= new ArrayList<Member>();
	Scanner input;	
	MemberManager(Scanner input) {
		this.input = input;
	}
	
	public void addmembers() {
		int kind = 0;
		Member member;
		while (kind != 1 && kind !=2) {
			System.out.println("****************ADD******************");
			System.out.println("Select Gender: ");
			System.out.println("1. Men");
			System.out.println("2. Women");
			kind = input.nextInt();
			if (kind == 1) {
				member = new MenMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else if (kind ==2) {
				member = new WomenMember();
				member.getUserInput(input);
				members.add(member);
				break;
			}
			else {
				System.out.println("Select num for Member's Genger between 1 and 2");
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
			Member member = members.get(i);
			if(member.getId() == memberID) {
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
						member.setId(id);
					}
					else if (editnum == 2) {
						System.out.print("Member Name :");
						String name = input.next();
						member.setName(name);
					}
					else if (editnum == 3) {
						System.out.print("Desired Timeticket[Hour] :");
						int time = input.nextInt();
						member.setTime(time);
					}
					else if (editnum == 4) {
						System.out.print("Locker Number :");
						int locker = input.nextInt();
						member.setLocker(locker);
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
