package ex04_overloading;

public class RectangleCalculatorMain {
	public static void main(String[] args) {
		RectangleCalculator reca = new RectangleCalculator();
		
		System.out.println("정사각형 넓이 : " + reca.area(10));
		System.out.println("직사각형 넓이 : " + reca.area(10, 20));
		System.out.println("직사각형 넓이 : " + reca.area(5.5, 10.11));
	}
}
