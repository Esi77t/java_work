package EXAM09;

public class SumofDigits {
	public int sumOfDigits(int num) {
		
		int sum = 0;
		while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
		
		return sum;
	}
}
