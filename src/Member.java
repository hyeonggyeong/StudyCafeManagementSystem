
public class Member {
	
	int id;
	String name;
	int time;
	int locker;
	
	public Member() {
		
	}
	
	public Member(int id, String name, int time, int locker) {
		this.id = id;
		this.name = name;
		this.time = time;
		this.locker = locker;
	}
	
	public void printInfo() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Timeticket : " + time);
		System.out.println("Locker Number: " + locker);
	}
}
