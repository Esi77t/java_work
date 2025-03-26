package ex05_inheritance;

// 자식 클래스
public class Customer extends Person {
	int memberID;
	
	public Customer(int memberID, String name, int age) {
		super(name, age); // 부모 생성자의 호출
		this.memberID = memberID;
	}
	
	void enter() {
		System.out.printf("회원번호 %d(%s, %d세)님이 입장하셨습니다.\n", memberID, name, age);
	}
}
