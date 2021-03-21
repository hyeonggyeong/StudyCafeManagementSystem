import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			System.out.println("================================");
			System.out.println("Studycafe Management Menu");
			System.out.println("================================");
			System.out.println("1. Add Membesr");
			System.out.println("2. Delete Members");
			System.out.println("3. Edit Members");
			System.out.println("4. View Members");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Selete one number between 1-6 :");
			num = input.nextInt();
			
			switch(num) {
			case 1:
					System.out.print("MemberID :");
					int MemberID =input.nextInt();
					System.out.print("Name :");
					String Membername = input.next();
					System.out.print("Desired Timeticket[Hour] :");
					int Timeticket = input.nextInt();
					break;
			case 2:
				System.out.print("Enter the MemberID you want to delete :");
				int Del_MemberID =input.nextInt();
				System.out.print("Are you sure you want to delete?(Y/N) :");
				String Del_check  = input.next();
				break;
			case 3:
				System.out.print("Enter the MembertID you want to edit :");
				int Edit_MemberID =input.nextInt();
				break;
			case 4:
				System.out.print("Enter the MemberID you want to view :");
				int View_MemberID =input.nextInt();
				break;
			}
		}
	}

}
