package exam01;

public class CalculatorMain {
	public static void main(String[] args) {
		CalPlus calplus = new CalPlus();
		CalMinus calminus = new CalMinus();
		
		System.out.println(calplus.getResult(10, 7));
		System.out.println(calminus.getResult(10, 7));
	}
}
