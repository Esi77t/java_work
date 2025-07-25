package ex04_while;

import java.util.Scanner;

public class EX02_do_while {
	public static void main(String[] args) {
		// while문과 같이 조건을 만족할 때까지 반복
		// 다만, while문과 다른 점은 먼저 루프를 한 번 실행한 후
		// 조건식을 검사
		// 즉, 조건식의 결과와 상관없이 무조건 한 번은 실행
		
		// do{
		// 	 반복하고자 하는 명령;
		// } while(조건식)
		
		int i = 11;
		do {
			System.out.println(i);
		} while(i <= 10);
		
		// 1 ~ 10까지의 총합 구하기
		int sum = 0;
		int n1 = 10;
		do {
			sum += n1;
			n1--;
		} while(n1 > 0);
		System.out.println(sum);
		
		// 비밀번호 확인 프로그램 만들기
		// 사용자로부터 비밀번호를 입력받아 올바른 비밀번호가
		// 입력될때까지 계속 입력을 요구하는 프로그램 만들기
		// 비밀번호는 9486
		Scanner sc = new Scanner(System.in);
		int password;
		boolean passwordC = false;
		do {
			System.out.print("비밀번호를 입력하세요 : ");
			password = sc.nextInt();
			if(password == 9486) {
				passwordC = true;
				break;
			} else {
				System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
				continue;
			}
		} while(!passwordC);
		System.out.println("접속 성공!");
		
		// 학생의 국어, 영어, 수학 점수를 입력받는다
		// 단, 각 과목은 40점 이상이어야 하며
		// 40점 미만이면 전체 과목 점수를 다시 입력받아야 한다.
		int kor, eng, math;
		boolean scoreCorrect = false;
		do {
			System.out.print("국어 점수를 입력하세요 : ");
			kor = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			eng = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			math = sc.nextInt();
			if(kor >= 40 && eng >= 40 && math >= 40) {
				scoreCorrect = true;
				break;
			} else {
				System.out.println("불합격입니다. 다시 입력하세요.");
				continue;
			}
		} while(!scoreCorrect);
		System.out.println("합격입니다!");
		
		sc.close();
	}
}
