import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		int num = 0;

		
		while (num != 5) {
			System.out.println("================================");
			System.out.println("Studycafe Management Menu");
			System.out.println("================================");
			System.out.println("1. Add Members");
			System.out.println("2. Delete Members");
			System.out.println("3. Edit Members");
			System.out.println("4. View Members");
			System.out.println("5. Exit");
			System.out.println("Selete one number between 1-6 :");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				membermanager.addmembers();
				break;
			case 2:
				membermanager.deletemembers();
				break;
			case 3:
				membermanager.editmembers();
				break;
			case 4:
				membermanager.viewmembers();
				break;			
			}
		}
	}
	
}
