package ex04_interface;

// 인터페이스는 상수와 추상메서드만 들어갈 수 있다
public interface Menu1 {
	// 상수
	// 값을 한 번 넣으면 변경이 불가능한 변수
	final String name = "홍길동"; 
	
	// 인터페이스에서는 어차피 추상메서드만 들어갈 수 있기 때문에
	// abstract를 생략해도 된다.
	public String jajang();
	
	// default접근제한자를 가진 메서드는 정의가 가능
	default void f() {
		System.out.println();
	}
}
