import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			System.out.println("================================");
			System.out.println("Studycafe Management Menu");
			System.out.println("================================");
			System.out.println("1. Add Members");
			System.out.println("2. Delete Members");
			System.out.println("3. Edit Members");
			System.out.println("4. View Members");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Selete one number between 1-6 :");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				addmembers();
				break;
			case 2:
				deletemembers();
				break;
			case 3:
				editmembers();
				break;
			case 4:
				viewmembers();
				break;
			case 5:
				continue;			
			}
		}
	}
	public static void addmembers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID(PhoneNumber) :");
		int MemberID =input.nextInt();
		System.out.print("Member Name :");
		String Membername = input.next();
		System.out.print("Desired Timeticket[Hour] :");
		int Timeticket = input.nextInt();
		System.out.print("Locker Number :");
		int Locker = input.nextInt();
		
	}
	public static void deletemembers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the MemberID you want to delete :");
		int Del_MemberID =input.nextInt();
		
		
	}
	public static void editmembers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the MembertID you want to edit :");
		int Edit_MemberID =input.nextInt();
	}
	public static void viewmembers() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the MemberID you want to view :");
		int View_MemberID =input.nextInt();
	}
}
