package ex02_break;

import java.util.Random;
import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		// 1 ~ 50 사이의 난수를 생성하고
		// 난수를 맞추는 프로그램 만들기
		// 적은 값이 난수보다 작으면 "맞춰야 할 숫자가 더 큽니다."
		// 적은 값이 난수보다 크면 "맞춰야 할 숫자보다 더 작습니다."
		// 정답을 x번에 맞췄습니다.
		
		// 경우의 수
		// 1. 난수를 맞추는 경우 -> if
		// 2. 난수보다 큰 경우 -> if
		// 3. 난수보다 작은 경우 -> if
		
		Random rnd = new Random();
		int result = rnd.nextInt(50)+1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 입력하세요. : ");
			int ans = sc.nextInt();
			cnt++;
			if(ans == result) {
				break;
			} else if(ans > result) {
				System.out.println("맞춰야 할 숫자보다 더 작습니다.");
			} else if(ans < result){
				System.out.println("맞춰야 할 숫자가 더 큽니다.");
			}
		}
		System.out.printf("정답입니다.\n");
		System.out.printf("정답을 %d번에 맞췄습니다.\n", cnt);
		
		// for(;;) -> for문의 무한루프
	}
}
