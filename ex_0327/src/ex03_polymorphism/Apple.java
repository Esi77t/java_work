package ex03_polymorphism;

public class Apple extends Computer{
	@Override
	public void powerON() {
		// TODO Auto-generated method stub
		super.powerON();
		System.out.println("Hello, macOS");
	}
	
	@Override
	public void poewrOff() {
		// TODO Auto-generated method stub
		super.poewrOff();
		System.out.println("Hello, Samsung");
	}
}
