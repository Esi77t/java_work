package ex02_exception;

public class EX04_ArithmeticException {
	public static void main(String[] args) {
		// 정수를 0으로 나누려고 할 때 발생
		
		int result = 10 / 0; // 코드 문법상 에러는 없음
		
		System.out.println(result);	// 하지만 계산할 수 없기 때문에 예외 발생
	}
}
