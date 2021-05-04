package Member;

import java.util.Scanner;

public class Member {
	protected MemberKind kind;
	protected int id;
	protected String name;
	protected int time;
	protected int locker;
	
	public Member() {	
	}
	
	public Member(MemberKind kind, int id, String name, int time, int locker) {
		this.kind = kind;
		this.id = id;
		this.name = name;
		this.time = time;
		this.locker = locker;
	}
	public MemberKind getKind() {
		return kind;
	}

	public void setKind(MemberKind kind) {
		this.kind = kind;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getLocker() {
		return locker;
	}

	public void setLocker(int locker) {
		this.locker = locker;
	}
	
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
		System.out.print("Locker Number :");
		int locker = input.nextInt();
		this.setLocker(locker);
	}
}
