package exam01;

// 4번
class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + "세");
	}
}


public class exam04_Student {
	public static void main(String[] args) {
		Student std = new Student("홍길동", 20);
		std.printInfo();
	}
}