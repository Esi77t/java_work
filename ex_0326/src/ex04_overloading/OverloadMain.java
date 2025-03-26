package ex04_overloading;

public class OverloadMain {
	public static void main(String[] args) {
		Overload o1 = new Overload();
		
		// 같은 이름이지만 인자에 따라 다른 기능을 하는 메서드를 만들 수 있다
		o1.result();
		o1.result(100);
		o1.result('A');
		o1.result("문자열", 100);
		o1.result(100, "문자열");
	}
}
