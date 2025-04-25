package EXAM06;

public class Student {
	private String name;
	private int age;
	private int stdNumber;
	
	public String Std(String name) {
		return this.name = name;
	}
	
	public int StdAge(int age) {
		return this.age = age;
	}
	
	public int StdNum(int stdNumber) {
		return this.stdNumber = stdNumber;
	}
	
	public void StudentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + stdNumber);
	}
}
