package ex03_polymorphism;

public class LG extends Computer{
	@Override
	public void powerON() {
		// TODO Auto-generated method stub
		super.powerON();
		System.out.println("사랑해요 LG");
	}
	
	@Override
	public void poewrOff() {
		// TODO Auto-generated method stub
		super.poewrOff();
		System.out.println("사랑해요 애플");
	}
}
