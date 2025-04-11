package ex06_annotation;

// 어노테이션
// 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형태로 포함시킨 것
// 주석처럼 프로그래밍 언어에 영향을 미치지 않으면서도 다른 프로그램에게 유용한 정보를 제공할 수 있다는 장점이 있음

// 표준 어노테이션
// 자바에서 제공하는 어노테이션

// 메타 어노테이션
// 사용자 정의 어노테이션을 만들기 위한 어노테이션
// @Target : 어노테이션이 적용될 수 있는 위치(필드, 메서드, 클래스 등)
// @Retention : 어노테이션의 유지 범위를 지정(런타임, 컴파일 등)
// @Documented : JavaDoc문서에 어노테이션 정보 포함 여부
// @Inherited : 자식 클래스에게 상속될 수 있는 어노테이션 여부

// 어노테이션 선언 시 규칙 정리
// 1. 선언 키워드는 @interface
// public @interface MyAnnotation {
// 	  String value();
//	  int version();
// }
// 2. 메서드 형태로 요소 선언
// - 어노테이션의 속성(요소)은 매개 변수 없는 메서드처럼 선언함
// 3. 속성의 반환 타입은 제한적
// 기본타입, String, Class, <?>, 열거형, 다른 어노테이션, 배열
// 4. 속성에 기본값을 정의 할 수 있다.
// public @interface MyAnnotation {
//	  String value() default "홍길동";
//	  int version();
// }
// 5. 속성이름이 value일 경우 특별 규칙
// @MyAnnotation(value = "xxx")
// @MyAnnotation("xxx") -> 속성 이름이 value
// 6. 어노테이션 자체에는 예외를 던질 수 없다
// - 어노테이션 속성은 단순 선언만 가능하고 예외, 로직, 조건문 등은 포함할 수 없다
// String value() throws Exception; -> 불가능
// 7. 속성은 매개변수를 가질 수 없다
// String name(String input); -> 불가능
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


