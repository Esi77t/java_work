package exam02;

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		int[] a = {10, 7};
		System.out.println(calc.add(10, 7));
		System.out.println(calc.substract(10, 7));
		System.out.println(calc.average(a));
	}
}

