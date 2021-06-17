package Member;

import java.util.Scanner;

public interface MemberInput {
	
	public void getUserInput(Scanner input);
		
	public void setId(int id);
	
	public int getId();
	
	public void setName(String name);
	
	public String getName();
	
	public void setTime(int time);
	
	public int getTime();
	
	public void setLocker(int locker);
	
	public int getLocker();
	
	public void printInfo();


}
