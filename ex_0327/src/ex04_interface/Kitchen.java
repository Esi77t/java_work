package ex04_interface;

public class Kitchen implements Menu1, Menu2{
	
	// 여러 개의 인터페이스를 구현할 수 있다
	// 인터페이스를 구현한 클래스는 반드시 추상 메서드를
	// 오버라이드 해야 한다
	
	// 오버라이드 : 메서드의 재 정의
	// 컴파일러에게 메서드가 재정의 됐다는 것을 알려준다
	// @ : 어노테이션
	@Override
	public String jajang() {
		return "면 + 춘장 + 완두콩";
	}
	@Override
	public String JJamBBong() {
		return "면 + 해물 + 육수";
	}
}
