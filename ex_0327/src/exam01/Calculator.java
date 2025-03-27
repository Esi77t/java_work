package exam01;

public class Calculator {
	
	public int getResult(int n1, int n2) {
		return -1;
	}
}

class CalPlus extends Calculator {
	
	@Override
	public int getResult(int n1, int n2) {
		return n1 + n2;
	}
	
}

class CalMinus extends Calculator {

	@Override
	public int getResult(int n1, int n2) {
		return n1 - n2;
	}
	
}

