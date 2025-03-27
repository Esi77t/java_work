package ex01_inheritance;

public class Chiwawa extends Dog{
	String angry = "치와와는 참지 않아";

	@Override
	public void info() {
		// TODO Auto-generated method stub
		super.info();
		System.out.println("치와와의 특징 : " + angry);
	}
	
	
}
