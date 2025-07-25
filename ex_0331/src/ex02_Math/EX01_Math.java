package ex02_Math;

public class EX01_Math {
	public static void main(String[] args) {
		// 수학에서 자주 사용하는 상수들과 함수들을
		// 미리 구현해놓은 클래스로 자바에서 수학 계산이 필요할 때 사용
		// 객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가 제공하는
		// 모든 메서드는 정적 메서드로 이루어짐
		
		// ceil()
		// 올림
		System.out.println("3.51 올림 : " + Math.ceil(3.51));
		
		// floor()
		// 버림
		System.out.println("13.61 올림 : " + Math.floor(13.61));
		
		// round()
		// 반올림
		System.out.println("12.8 반올림 : " + Math.round(12.8));
		
		// abs()
		// 절대값
		System.out.println("-4.5 절대값 : " + Math.abs(-4.5));
		
		// max()
		// 최대값
		System.out.println("30, 60 최대값 : " + Math.max(30, 60));
		
		// 배열의 최대값 찾기
		int[] numbers = {3, 7, 2, 9, 4, 10, 6};
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			max = Math.max(max, numbers[i]);
		}
		System.out.println("numbers의 최대 값 : " + max);
		
		// min()
		// 최소값
		System.out.println("30, 60 최소값 : " + Math.min(30, 60));
		
		// 소수점 첫째자리에서만 반영이 됨
		
		// 소수점 둘째자리에서 반영
		double pi = 3.141592;
		double result = Math.round(pi * 100.0)/100.0;
		System.out.println(result);
		
		// pow()
		// 거듭제곱
		System.out.println("2의 0제곱 : " + Math.pow(2, 0));
		System.out.println("2의 1제곱 : " + Math.pow(2, 1));
		System.out.println("2의 2제곱 : " + Math.pow(2, 2));
		System.out.println("2의 3제곱 : " + Math.pow(2, 3));
		
		// sqrt()
		// 제곱근(루트)
		System.out.println("16의 제곱근 : " + Math.sqrt(16));
		
		// random()
		// 난수 생성
		// 0.0이상 1.0미만의 double 난수
		System.out.println("난수 생성 : " + (int)(Math.random() * 100));
		
	}
}
