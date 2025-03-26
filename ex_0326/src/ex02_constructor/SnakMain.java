package ex02_constructor;

public class SnakMain {
	public static void main(String[] args) {
		// 생성자 : 특수한 기능을 가진 메서드
		// 메서드는 선언을 한 뒤 -> 호출
		// 우리는 생성자를 따로 선언한적 X
		Snak chip = new Snak(5000);
		chip.info();
		Snak fries = new Snak(3000);
		fries.info();
	}
}
