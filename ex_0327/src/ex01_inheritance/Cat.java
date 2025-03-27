package ex01_inheritance;

// 상속관계가 성립이 되려면 extends를 써야 함
public class Cat extends Animal{
	String cute = "귀엽다";

	// 메서드의 재정의
	@Override
	public void info() {
		System.out.println("---고양이---");
		// TODO Auto-generated method stub
		super.info();
		System.out.println("고양이의 특징 : " + cute);
	}
}
