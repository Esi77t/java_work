package ex05_enum;

import java.util.Arrays;

public class EnumMain {
	public static void main(String[] args) {
		// 열거형은 직접 객체를 생성할 수 없다
		// enum의 생성자는 암묵적으로 private으로 만들어져있다
		// JVM이 각 상수를 단 한번만 생성하고 공유한다
		
		Item i1 = Item.START;
		System.out.println(i1);
		// 모든 열거형이 상속하는 Enum클래스에 toString()메서드에서
		// 이름을 반환하기 때문에 이름이 출력된다.
		
		Item[] items = Item.values();
		System.out.println(Arrays.toString(items));
		
		// 열거형 상수에 들어있는 순서 보기
		for(Item item : items) {
			System.out.println("name = " + item.name() + ", ordinal = " + item.ordinal());
		}
		
		Item i2 = Item.valueOf("START");
		System.out.println(i2);
		
		System.out.println(i1 == i2);
		
		Item i3 = Item.EXIT;
		
		// 열거형끼리는 '=='를 제외한 나머지 비교 연산자는 사용할 수 없다
		// compareTo()는 사용이 가능하다
		System.out.println(i1.compareTo(i3));
		// a.compareTo(b)
		// a가 b보다 앞서면 -> 음수
		// a와 b가 같으면 -> 0
		// a보다 b가 작으면 -> 양수
		
		// 열거형과 switch문
		// 열거형 상수를 switch의 case에 쓸 수 있다
		
		switch(i1) {
			case START:	// Item.START 앞의 타입은 생략해도 된다
				System.out.println("시작");
				break;
			case STOP:
				System.out.println("정지");
				break;
			case EXIT:
				System.out.println("종료");
				break;
		}
		
		for(Item item : items) {
			System.out.println(item.getItemStr());
		}
		
		// enum을 쓰는 이유
		// 1. 코드의 가독성 증가
		// ex) int status = 1; // 무슨 상태를 의미하는지 헷갈릴 수 있음
		// Status status = Status.SUCCESS; // 성공을 의미하는 걸 알 수 있음
		// 2. 타입 안정성 보장
		// 정해진 값 이외에 다른 값을 넣을 수 없다
		// 열거형을 안쓸 때
		// ex) int color = 9999999;	// 문법적으로 틀린건 아니라서 에러는 아니지만 우리가 설정한 색의 범주가 아님;
		// Color color = Color.RED; // Color 타입만 들어올 수 있다
	}
}
