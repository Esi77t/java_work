package ex01_Thread;

import java.util.Scanner;

public class QuizThread extends Thread {
	//	QuizThread클래스를 만들어 스레드를 상속 받는다.
	//	startGame()메서드를 만들고 그 안에서 1 ~ 100사이의 난수 두 개를 더하는 문제를 출제
	//	키보드에서 답을 입력하여 5문제가 정답처리 될 때까지 로직을 반복한다.
	//	정답을 맞히고 난 후에 모든 문제를 맞히는데 몇 초가 걸렸는지를 화면에 출력하며 프로그램 종료.
	int num1, num2;
	int timer = 0;
	int count;
	boolean isCheck = true;
	
	public void startGame() {
		while(isCheck) {
			try {
				num1 = (int)(Math.random() * 100) + 1;
				num2 = (int)(Math.random() * 100) + 1;
				System.out.println(num1 + " + " + num2 + " = ?");
				Scanner sc = new Scanner(System.in);
				System.out.print("정답을 적어주세요 : ");
				int youAnswer = sc.nextInt();
				
				// 정답 검증
				if(youAnswer == num1 + num2) {
					System.out.println("정답입니다!");
				} else {
					System.out.println("오답입니다!");
					continue;
				}
				count++;
				// count 완료 시
				if(count == 5) {
					System.out.println("5문제를 맞추는데 걸린 시간은 " + timer + "초 입니다.");
					isCheck = false;
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력해주세요");
			}
			
		}
	}
	@Override
	public void run() {
		while(isCheck) {
			try {
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				
			}
		}
		
	}
}
