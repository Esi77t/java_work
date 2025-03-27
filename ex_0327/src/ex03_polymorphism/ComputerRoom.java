package ex03_polymorphism;

public class ComputerRoom {
	
//	Samsung com1;
//	Samsung com2;
	
//	LG com1;
//	LG com2;
	
	Computer com1;
	Computer com2;
	
	public void allPowerOn() {
		com1.powerON();
		com2.powerON();
	}
	
	public void allPowerOff() {
		com1.poewrOff();
		com2.poewrOff();
	}
	
}
