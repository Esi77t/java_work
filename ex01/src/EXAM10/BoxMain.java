package EXAM10;

public class BoxMain {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.setValue(10);
		Box<String> b2 = new Box<>();
		b2.setValue("Hello, Generics");
		Box<Double> b3 = new Box<>();
		b3.setValue(3.14);
		
		System.out.println(b1.getValue());
		System.out.println(b2.getValue());
		System.out.println(b3.getValue());
	}
	
}
