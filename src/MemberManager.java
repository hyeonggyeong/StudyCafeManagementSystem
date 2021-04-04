import java.util.Scanner;

public class MemberManager {
	Member member;
	Scanner input;	
	MemberManager(Scanner input) {
		this.input = input;
	}
	
	public void addmembers() {
		System.out.println("****************ADD******************");
		member = new Member();
		System.out.print("Member ID(PhoneNumber without '-') :");
		member.id =input.nextInt();
		System.out.print("Member Name :");
		member.name = input.next();
		System.out.print("Desired Timeticket[Hour] :");
		member.time = input.nextInt();
		System.out.print("Locker Number :");
		member.locker = input.nextInt();
		
	}
	public void deletemembers() {
		System.out.println("***************DELETE******************");
		System.out.print("Enter the MemberID you want to delete :");
		int memberID =input.nextInt();
		
		if(member == null) {
			System.out.println("Member has not been registered");
			return;
		}
		if(member.id == memberID) {
			member = null;
			System.out.println("Member is deleted");
			
		}
		
		
	}
	public void editmembers() {
		System.out.println("****************EDIT*******************");
		System.out.print("Enter the MembertID you want to edit :");
		int memberID =input.nextInt();
		if(member == null) {
			System.out.println("Member has not been registered");
			return;
		}
		if (member.id == memberID) {
			System.out.println("Enter the number you want to edit");
			System.out.println("1. ID");
			System.out.println("2. Name");
			System.out.println("3. Time Ticket");
			System.out.println("4. Locker Number");
			 int editnum = input.nextInt();
			if (editnum == 1) {
				System.out.print("Member ID(PhoneNumber without '-') :");
				member.id =input.nextInt();
			}
			else if (editnum == 2) {
				System.out.print("Member Name :");
				member.name = input.next();
			}
			else if (editnum == 3) {
				System.out.print("Desired Timeticket[Hour] :");
				member.time = input.nextInt();
			}
			else if (editnum == 4) {
				System.out.print("Locker Number :");
				member.locker = input.nextInt();
			}
		}
	}
	public void viewmembers() {
		System.out.println("****************VIEW*******************");
		System.out.print("Enter the MemberID you want to view :");
		int memberID =input.nextInt();
		
		if(member == null) {
			System.out.println("Member has not been registered");
			return;
		}
		
		if (member.id == memberID) {
			member.printInfo();
		}
	}
}
