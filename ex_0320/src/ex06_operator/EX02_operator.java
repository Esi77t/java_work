package ex06_operator;

public class EX02_operator {
	public static void main(String[] args) {
		// 이항연산자
		// 피연산자가 2개인 연산자
		
		// 산술연산자
		int x = 100;
		int y = 200;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

		// 오버플로우 발생
		int result = 1000000 * 1000000;
		System.out.println(result);
		
		// 산술 변환
		// 기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 연산이 가능
		// 컴퓨터는 서로 다른 타입을 계잔하지 못하므로 값의 손실이 적은 쪽으로 타입을 맞추게 함
		// long + int -> long + long -> long
		// float + int -> float + float -> float
		// double + float -> double + double -> double
		// 대입 연산자
		// 우변의 값을 좌변에 대입을 해주는 연산자
		// 복합 대입 연산자
		// 산술 연산자와 대입연산자가 합쳐진 형태
		// A = A +, -, *, /, % B
		
		x = 10;
		y = 1;
		
		y += x; // y = x + y
		System.out.println(y);
		y -= x; // y = x - y
		System.out.println(y);
		y *= x; // y = x * y
		System.out.println(y);
		
		// ++x -> x += 1
		
		// 비교연산자
		// 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		// 결과가 항상 true 또는 false 로 반환
		int a = 10;
		int b = 20;
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b); // 같다
		System.out.println(a != b); // 같지 않다
		
		// 논리연산자
		int myAge = 30;
		int limit = 35;
		// &&(and) : 앞 뒤 피연산자가 둘 다 참이어야 참을 반환
		boolean res1 = (limit - myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과 : " + res1);
		// ||(or) : 둘 중 하나만 참이어도 참을 반환
		boolean res2 = (limit - myAge) >= 5 || myAge > 30;
		System.out.println("&&연산결과 : " + res2);
		
		// 비트연산자
		// 논리 연산자와 유사하지만 bit단위의 연산만 가능
		// & 논리곱(and) 두 항이 모두 참이면 참 아니면 거짓
		// | 논리합(or) 두 항 중 하나라도 참이면 참 아니면 거짓
		// ^ 배타적논리합(xor) 두 항이 다르면 참 같으면 거짓
		// ~ 부정(not) 참을 거짓으로, 거짓을 참으로 연산
		int a1 = 10;// 1010
		int b1 = 7;// 0111
		int c1 = a1 & b1;
		System.out.println("c1 : " + c1);
		
		int a2 = 12; // 1100
		int b2 = 8;  // 1000
		int c2 = a2 | b2;
		System.out.println("c2 : " + c2);
		
		int a3 = 9;  // 1001
		int b3 = 11; // 1011
		int c3 = a3 ^ b3;
		System.out.println("c3 : " + c3);
		
		// ~(not)
		int x1 = 7;	// 0111
		System.out.println("~x1 : " + ~x1);
		// ~x -> -(x + 1)
		
		// 시프트연산자
		// 비트의 이동
		// <<, >>
		x = 10;	// 1010
		int res3 = x << 1;	// 10100
		System.out.println(res3);	// 20
		res3 = x >> 1; // 101
		System.out.println(res3);	// 5
		
		// 삼항연산자
		// 조건식 ? 참일 때 실행할 명령 : 거짓일 때 실행할 명령;
		int i1 = 10;
		int i2 = 15;
		int res4 = ++i1 >= i2 ? 1 : 0;
		System.out.println(res4);
	}
}
