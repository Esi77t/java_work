package ex03_for;

import java.util.Scanner;

public class EX01_for {
	public static void main(String[] args) {
		// 반복문
		// 특정 명령을 원하는 만큼 반복하여 실행하는 제어문
		// for, while
		
		// for
		// 주로 반복횟수가 정해져 있을 때 사용하는 문법
		
		// for(초기식; 조건식; 증감식) {
		//		반복하고자 하는 명령
		// }
		
		// 초기식 : 반복을 하기 위한 시작값으로 변수를 하나 초기화한다
		// 조건식 : 반복을 위한 종료값으로 비교연산자를 많이 사용
		// 증감식 : 초기식에 있는 변수의 값을 증감시켜주는 역할을 함
		for(int i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		
//		int i = 0;	// 초기값을 밖에 쓸 수 있음
//		for(; i <= 3;) {
//			System.out.println(i);
//			i++;	// 증감식도 밖에 쓸 수 있음
//		}
		// 초기식에 들어가는 변수 i를 무조건 사용할 필요는 없다
		// 사용하는게 좋을 거 같을 때 쓰면 됨
		
		// 1부터 10까지 출력하는 for문 작성
		// 단, 가로로 출력할 것
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 10부터 1까지 출력하는 for문 작성
		for(int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 1부터 10까지 3의 배수만 출력하는 for문 작성
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 1부터 10까지 총합 구하기
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 키보드에서 정수를 하나 입력 받아
		// 해당 단의 구구단 출력하기
		// 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6 ...
		Scanner sc = new Scanner(System.in);
//		System.out.println("단 입력 : ");
//		int dan = sc.nextInt();
//		for(int i = 1; i < 10; i++) {
//			System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//		}
		
		// 키보드에서 정수 n을 입력받고
		// 1부터 정수 n까지의 총합을 계산하여 결과를 출력하기
//		System.out.println("숫자 입력 : ");
//		int n = sc.nextInt();
//		sum = 0;
//		for(int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.printf("1부터 %d까지의 총합 : %d\n", n, sum);
		
		// 10개의 정수를 입력받아
		// 그중 짝수의 개수가 몇개인지 구하시오
//		int cnt = 0;
//		for(int i = 0; i < 10; i++) {
//			System.out.println("무작위 숫자 10개를 입력하세요. : ");
//			int ev = sc.nextInt();
//			if(ev % 2 == 0) {
//				cnt += 1;
//			}
//		}
//		System.out.printf("무작위 숫자 10개 중 짝수는 %d개 입니다.", cnt);
		
		// 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+10)
		// 의 결과를 계산
		int total = 0;
		int total_sum = 0;
		for(int i = 1; i <= 10; i++) {
			total += i;
			total_sum += total;
		}
		System.out.println(total_sum);
		
		// 양의 정수 x를 키보드에 입력 받아
		// x가 홀수면 x이하의 홀수인 정수의 합을 구하고
		// x가 짝수면 x이하의 짝수인 정수의 제곱의 합을 구하시오
		// x가 7이라면 1 + 3 + 5 + 7 = 16
		// x가 10이면 2x2 + 4x4 + 6x6 + 8x8 + 10x10 = 220
		System.out.println("숫자를 입력하세요 : ");
		int x = sc.nextInt();
		int hap = 0;
		if(x % 2 == 0) {
			for(int i = 0; i <= x; i += 2) {
				hap += i * i;
			}
			System.out.printf("짝수의 제곱 합은 %d입니다.\n", hap);
		} else {
			for(int i = 1; i <= x; i += 2) {
				hap += i;
			}
			System.out.printf("홀수의 합은 %d입니다.\n", hap);
		} 
		
		hap = 0;
		for(int i = x; i >= 0; i -= 2) {
			sum += (x % 2 == 0) ? i*i : i;
		}
		System.out.printf("총합 : %d\n", hap);
	}
}
