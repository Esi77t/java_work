package ex02_constructor;

public class PhoneMain {
	public static void main(String[] args) {
		// 자바는 생성자에 전달되는 인자의 개수에 따라 알아서 호출
		
		Phone p1 = new Phone("갤럭시S", 25, "흰색");
		p1.phoneInfo();
		Phone p2 = new Phone("아이폰", 16);
		p2.phoneInfo();
	}
}
