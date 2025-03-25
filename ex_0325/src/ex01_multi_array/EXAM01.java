package ex01_multi_array;

import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3, 4, 5},
				{6, 7, 8, 9, 10},
				{11, 12, 13, 14, 15},
				{16, 17, 18, 19, 20}
		};
		// 배열 arr의 총합과 평균을 구하시오
		// 총합 :
		// 평균 :
		int sum = 0;
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				cnt++;
			}
		}
		double avg = (double)sum / cnt;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("---------------------------------------------");
		
		// 학생들의 정보를 입력하고, 출력하는 프로그램 작성
		// 학생들의 수학과 영어성적을 등록하는 프로그램
		// 1. 프로그램을 실행하면 몇 명의 정보를 저장할 것인지 입력받는다
		// 2. 입력받은 수 만큼 학생들의 이름, 수학, 영어(3개 String으로 받을 것) 성적을 입력받는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원 수 : ");
		int std = sc.nextInt();
		String[][] stdInfo = new String[std][3];
		for(int i = 0; i < stdInfo.length; i++) {
			System.out.print("이름 : ");
			stdInfo[i][0] = sc.next();
			System.out.print("수학 : ");
			stdInfo[i][1] = sc.next();
			System.out.print("영어 : ");
			stdInfo[i][2] = sc.next();
			System.out.println("-------------------------------");
		}
		System.out.println(std + "명 등록 완료");
		System.out.println("-------------------------------");
		for(int i = 0; i < stdInfo.length; i++) {
			for(int j = 0; j < stdInfo[i].length; j++) {
				System.out.print(stdInfo[i][j] + " ");
			} 
			System.out.println();
		}
		System.out.println("-------------------------------");
		
		// 
	}
}

