package exam02;

public class Calc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a + b;
	}
	
	@Override
	public int substract(int a, int b) {
		return a - b;
	}
	
	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = sum / (double)a.length;
		return avg;
	}
}
