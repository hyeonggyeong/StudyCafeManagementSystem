package Member;

import java.util.Scanner;

public interface MemberInput {
	
	public void getUserInput(Scanner input);
	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setTime(int time);
	public void setLocker(int locker);
	public void printInfo();
}
