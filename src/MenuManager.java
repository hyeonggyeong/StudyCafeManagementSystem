import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MemberManager membermanager = new MemberManager(input);
		
		selectMenu(input,membermanager);
	}
	
	public static void selectMenu(Scanner input, MemberManager membermanager ) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				
			}
		}
	}
	public static void showMenu() {
		System.out.println("================================");
		System.out.println("Studycafe Management Menu");
		System.out.println("================================");
		System.out.println("1. Add Members");
		System.out.println("2. Delete Members");
		System.out.println("3. Edit Members");
		System.out.println("4. View Members");
		System.out.println("5. Exit");
		System.out.println("Selete one number between 1-6 :");
	}
	
}
