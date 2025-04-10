package ex06_annotation;

@FunctionalInterface
interface testInter {
	void method1();
}

class testImp1 implements testInter {
	@Override
	public void method1() {
		System.out.println("테스트입니다.");
	}
}

// '사용하지 않는 변수' 경고를 억제
@SuppressWarnings("unused")
// unused : 사용하지 않는 변수에 대한 경고 억제
// unchecked : 제네릭 타입 미지정에 발생하는 경고 억제
public class EX01_Annotation {
	public static void main(String[] args) {
		int x = 10;
		
		addUser("철수");

	}
	
	@Deprecated
	public static void addUser(String name) {
		System.out.println("사용자 추가 : " + name + "(이 방식으로 접근이 불가능 합니다)");
	}
}


