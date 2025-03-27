package ex03_polymorphism;

public class ComMain {
	public static void main(String[] args) {
		ComputerRoom cr = new ComputerRoom();
		
		// Computer com1 = new Samsung();
		cr.com1 = new Samsung();
		
		// Computer com2 = new LG();
		// cr.com2 = new LG();
		
		cr.com2 = new Apple();
		
		cr.allPowerOn();
		cr.allPowerOff();
	}
}
