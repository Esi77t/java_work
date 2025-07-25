package ex01_print;

public class Ex01_print {
	public static void main(String[] args) {
		// 자바에서 문자열은 반드시 ""안에 넣어야 한다
		// print() : 출력을 하고 줄을 바꾸지 않는다
		// System.out.print("Welcome");
		// System.out.print(" Java World");
		
		// println() : 출력을 하고 줄을 바꾼다
		// System.out.println("Welcome");
		// System.out.println("Java World");
		
		// printf()
		// 문자열 속에서 다른 타입의 데이터를 같이 출력할 수 있게 해주는 형식
		// 서식문자
		// %d	정수(10진수)
		// %o	정수(8진수)
		// %x	정수(16진수)
		// %f	실수
		// %s	문자열
		// %c	문자형
		// %b	논리형
		
		System.out.printf("저는 대학교 %d학년에 재학중입니다.\n", 4);
		// 서식문자를 한번에 여러개 넣을 수 있다.
		System.out.printf("제 이름은 %s이고 나이는 %d살 입니다. 키는 %.1fcm입니다.\n", "홍길동", 30, 182.5);
		
		// 출력 값의 정렬
		System.out.printf("%5d\n", 1);	// XXXX1
		System.out.printf("%5d\n", 12);	// XXX12
		System.out.printf("%5d\n", 123);	// XX123
		System.out.printf("%5d\n", 1234);	// X1234
		System.out.printf("%5d\n", 12345);	// 12345
		
		// 실수의 정렬(반올림됨)
		System.out.printf("%.1f\n", 1.2345678);
		System.out.printf("%.2f\n", 1.2345678);
		System.out.printf("%.3f\n", 1.2345678);
		System.out.printf("%.4f\n", 1.2345678);
		System.out.printf("%.5f\n", 1.2345678);
		
		// 2 + 2 = 4
		int num1 = 2;
		int num2 = 2;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
}
