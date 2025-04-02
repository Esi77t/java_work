package ex02_lamda;

public class EX01_Function {
	public static void main(String[] args) {
		// Iadd를 구현한 구현체는 다 대입이 가능
		// 람다는 매개변수에 식을 전달해 구현 가능
		Iadd add = (x, y) -> x + y;
		int res = result(add);
		System.out.println("res : " + res);
	}
	
	public static int result(Iadd lamda) {
		return lamda.add(1, 2);
	}
}
