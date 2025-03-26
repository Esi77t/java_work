package ex05_inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Customer c1 = new Customer(250001, "홍길동", 30);
		// 자식객체가 부모의 필드를 가져다가 사용
		
		c1.enter();
	}
}
