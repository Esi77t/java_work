package ex01_continue;

public class EX01_continue {
	public static void main(String[] args) {
		// 기타 제어문
		// 반복문은 각각 정해진 횟수 또는 조건에 의해 반복을 진행
		// 하지만 숫자가 표시된 100개의 공에서 특정 숫자가 적힌 공을
		// 찾는데, 만약 10번만에 찾았다면 더 이상 반복을 할 필요가 없다.
		// 기타제어문은 반복문의 횟수를 제어할 수 있음
		
		// 1. continue
		// 반복문 안에서 continue를 만나게 되면 이후의 실행코드는 수행되지 않고, 반복문의 처음으로 돌아가 반복문을 진행
		// for문은 증감식으로 이동하며, while문과 do-while문의 경우 조건식으로 이동
		
		// for문의 경우
		int sum = 0;
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.printf("홀수의 합 : %d\n", sum);
		
		// while문의 경우
		int s = 0;
		sum = 0;
		while(s < 10) {
			s++;
			if(s % 2 == 0) {
				continue;
			}
			sum += s;
		}
		System.out.printf("홀수의 합 : %d\n", sum);
	}
}
