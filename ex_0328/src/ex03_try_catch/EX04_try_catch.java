package ex03_try_catch;

import java.util.Scanner;

public class EX04_try_catch {
	public static void main(String[] args) {
		// finally
		// 예외 발생 유무와 상관없이 실행되는 구문이며 생략 가능
		// 예외를 처리할 때, 예외와 상관없이 반드시 처리해야 하는 구문들을 작성할 때 사용
		// 보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("숫자 입력 : ");
			
			int number = sc.nextInt();
			System.out.println("입력한 숫자 : " + number);
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요.");
		} finally {
			// 연결을 종료하는 코드
			// 스캐너 연결 종료
			// DB와의 연결 종료
			sc.close();
			System.out.println("프로그램 종료");
		}
	}
}
