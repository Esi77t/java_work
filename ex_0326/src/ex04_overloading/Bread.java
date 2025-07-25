package ex04_overloading;

public class Bread {
	// 각기 다른 기능을하는 makeBread()메서드를 세 개 만드는데,
	// 메인클래스에서 각각의 메서드를 호출 했을 때의 결과를 보고 로직을 구현
	// 빵을 만들었습니다. <--------------------------- method 1을 호출해서 나온 결과
	// -----------------
	// 빵을 만들었습니다. <--------------------------- method 2를 호출해서 나온 결과
	// 빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	// -----------------
	// 크림빵을 만들었습니다. <--------------------------- method 3을 호출해서 나온 결과
	// 크림빵을 만들었습니다.
	// 요청하신 n개의 빵을 만들었습니다.
	public void makeBread(String bread) {
		System.out.println(bread + "을 만들었습니다.");
		System.out.println("--------------------");
	}
	public void makeBread(String bread, int count) {
		for(int i = 1; i <= count; i++) {
			System.out.println(bread + "을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵을 만들었습니다.");
		System.out.println("--------------------");
	}
	public void makeBread(int count) {
		for(int i = 1; i <= count; i++) {
			System.out.println("크림빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵을 만들었습니다.");
		System.out.println("--------------------");
	}
}
