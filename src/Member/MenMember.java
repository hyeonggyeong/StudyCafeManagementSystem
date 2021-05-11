package Member;

import java.util.Scanner;

public class MenMember extends Member implements MemberInput {
	
	public void printInfo() {	
		System.out.print("ID : " + id);
		System.out.print(" / Name : " + name);
		System.out.print(" / Timeticket : " + time);
		System.out.println(" / Locker Number: " + locker);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member ID(PhoneNumber without '-') :");
		int id =input.nextInt();
		this.setId(id);
		
		System.out.print("Member Name :");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Desired Timeticket[Hour] :");
		int time = input.nextInt();
		this.setTime(time);
		
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you want to use locker? (Y/N)");
			answer = input.next().charAt(0);
			
			if (answer == 'y'|| answer =='Y') {
				System.out.print("Locker Number(Men : 1~100) :");
				int locker = input.nextInt();
				this.setLocker(locker);	
				break;
			}
			else if (answer == 'n'|| answer =='N') {
				this.setLocker(0);
				break;
			}
			else {
				
			}	
		}		
	}
}
