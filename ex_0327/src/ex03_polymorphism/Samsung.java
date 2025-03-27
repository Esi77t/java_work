package ex03_polymorphism;

public class Samsung extends Computer{
	@Override
	public void powerON() {
		// TODO Auto-generated method stub
		super.powerON();
		System.out.println("아이 러브 삼성");
	}
	
	@Override
	public void poewrOff() {
		// TODO Auto-generated method stub
		super.poewrOff();
		System.out.println("아이 러브 애플");
	}
}
