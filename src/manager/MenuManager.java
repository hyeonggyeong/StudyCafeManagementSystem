package manager;
import java.util.Scanner;

import GUI.WindowFrame;
import log.EventLogger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MemberManager membermanager = getObject("membermanager.ser");
		if (membermanager == null) {
			membermanager = new MemberManager(input);
		}
		
		WindowFrame frame = new WindowFrame(membermanager);
		selectMenu(input,membermanager);
		putObject(membermanager, "membermanager.ser");
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
					logger.log("add a member");
					break;
				case 2:
					membermanager.deletemembers();
					logger.log("delete a member");
					break;
				case 3:
					membermanager.editmembers();
					logger.log("edit a member");
					break;
				case 4:
					membermanager.viewmembers();
					logger.log("view a member");
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
	public static MemberManager getObject(String filename) {
		MemberManager membermanager = null;
		
	
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			membermanager = (MemberManager) in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return membermanager;	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return membermanager;
	}
	
	public static void putObject(MemberManager membermanager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(membermanager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();		
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
	