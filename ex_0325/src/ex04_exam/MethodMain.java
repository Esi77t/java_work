package ex04_exam;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int[] arr = {1, 2, 3, 4, 5};
		
		mt.maxFinder(arr);
		int r = 3;
		mt.circleArea(r);
		System.out.printf("원의 둘레 : %.2f\n", mt.circleRound(r));
		
		int a = 10;
		int b = 7;
		mt.calculator(a, b, '-');
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자 입력 : ");
			int answer = sc.nextInt();
			if(mt.check(answer).equals("정답!")) {
				System.out.println(mt.count + "회 만에정답입니다.");
				break;
			} else {
				System.out.println(mt.check(answer));
				mt.count++;
			} 
		}
	}	
}
