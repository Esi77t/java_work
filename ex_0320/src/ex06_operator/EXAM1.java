package ex06_operator;

import java.util.Scanner;

public class EXAM1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("국어 점수 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 점수 : ");
//		int math = sc.nextInt();
//		
//		int sum;
//		double avg;
//		sum = kor + eng + math;
//		avg = (double)sum / 3;
//		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 40) ? "합격" : "불합격";
//		System.out.println("총점 : " + sum);
//		System.out.printf("평균 : avg%.2f\n", avg);
//		System.out.println(result);
		
		//----------------------------------------------------------------------------------------------------------------------
		
		// 상자 하나에는 농구공이 5개 들어갈 수 있다
		// X개의 농구공을 담기 위한 박스의 개수를 구하라
		// 농구공의 개수는 키보드를 통해 입력 받습니다
//		Scanner sc = new Scanner(System.in);
//		System.out.println("농구공의 갯수 : ");
//		int basketball = sc.nextInt();
//		int box = basketball / 5;
//		if(basketball % 5 == 0) {
//			System.out.println("필요한 박스 : " + box);
//		} else {
//			System.out.println("필요한 박스 : " + (box + 1));
//		}
		
		//----------------------------------------------------------------------------------------------------------------------
		
		// 과수원이 있다.
		// 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은
		// 각각 5, 7, 5개이다
		// 과수원에서 하루에 생산되는 총 개수를 출력하고,
		// 시간당 전체 과일의 평균 생산 갯수를 출력
		// 평균값을 담는 변수는 float으로 할것
		int pear = 5;
		int apple = 7;
		int orange = 5;
		int sum = pear + apple + orange;
		float avg = (float)sum / 24;
		System.out.println("하루 총 생산 : " + sum);
		System.out.printf("시간당 평균 : %.2f\n", avg);
	}
}
