package EXAM06;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void StudentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + id);
	}
}
