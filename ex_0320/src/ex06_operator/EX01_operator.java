package ex06_operator;

public class EX01_operator {
	public static void main(String[] args) {
		// 1. 단항 연산자
		// 항이 한 개인 연산자
		
		// 부호 연산자
		int x = 100;
		int resultPlus = +x;
		int resultMinus = -x;
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		// 2. 증감 연산자
		// 1씩 증가시키거나 1씩 감소 시키는 연산자
		
		// 선핸증감
		// 1이 먼저 증감되고 코드에 즉시 반영
		int a = 10;
		System.out.println("a : " + ++a);
		// 후행증감
		// 코드가 먼저 실행되고 1이 증감
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println("b : " + b);
		
		char alphabetA = 'A';	// 아스키코드 값이 65
		System.out.println(alphabetA++); 	// 65(+1)
		System.out.println(alphabetA);	// 66
		
		// 오버플로우와 언더플로우
		// 오버플로우가 발생하면 그 값의 최소값으로 바뀌고
		// 언더플로우가 발생하면 그 값의 최대값으로 변경됨
		byte value = 127;
		value++;
		System.out.println(value);
		
		byte value2 = -128;
		value2--;
		System.out.println(value2);
		
		// 논리 부정 연산사
		// !
		// 논리형 값을 가지는 피연산자 앞에 !를 붙여서 값을 반대로 바꿈
		// 연산자를 사용한 곳에서만 적용이 될 뿐 진짜 변수의 값이 바뀌어 저장되는 것은 아님
		boolean isHuman = false;
		System.out.println(!isHuman);
		System.out.println(isHuman);
	}
}
