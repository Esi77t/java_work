package ex01_if;

import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		// 삼항 연산자로 만들었던 X개의 농구공을 담기 위한 박스의 개수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("공 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int box = ball / 5;
		if(ball % 5 == 0) {
			System.out.println("필요한 박스 : " + box);
		} else {
			System.out.println("필요한 박스 : " + (box + 1));
		}
		sc.close();
	}	
}
