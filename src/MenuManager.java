import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (num != 6) {
			System.out.println("================================");
			System.out.println("Studycafe Management Menu");
			System.out.println("================================");
			System.out.println("1. Add Students");
			System.out.println("2. Delete Students");
			System.out.println("3. Edit Students");
			System.out.println("4. View Students");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Selete one number between 1-6 :");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("Student PhoneNumber :");
				int StudentID =input.nextInt();
				System.out.print("Student Name :");
				String StudentName = input.next();
				System.out.print("Desired Timeticket[Hour] :");
				int Timeticket = input.nextInt();
				break;			
			case 2:
				System.out.print("Enter the studentID you want to delete :");
				int StudentID2 =input.nextInt();
				System.out.print("Are you sure you want to delete?(Y/N) :");
				String TF  = input.next();
				break;
			case 3:
				System.out.print("Enter the studentID you want to edit :");
				int StudentID3 =input.nextInt();
				break;
			case 4:
				System.out.print("Enter the studentID you want to view :");
				int StudentID4 =input.nextInt();
				break;
			}
		}
	}

}
