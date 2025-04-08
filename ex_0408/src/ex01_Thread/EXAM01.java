package ex01_Thread;

import java.util.Scanner;

// 스캐너를 이용하여 키보드에서 숫자를 입력받고
// 쓰레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을 때
// "종료" 메시지와 함께 프로그램이 종료되도록 만들어보자
// Thread는 ThreadCount에 작성
public class EXAM01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아무 숫자를 입력하세요 : ");
		ThreadCount tc = new ThreadCount(sc.nextInt());
		
		tc.start();
		
		sc.close();
		
	}
}

class ThreadCount extends Thread {
	private int count = 0;
	
	// 1. 생성자를 통해 전달
	public ThreadCount(int count) {
		this.count = count;
	}
	
	// 2. setter를 통해 전달
//	public void setCount(int count) {
//		this.count = count;
//	}
	
	// 값을 반환받고 싶다면 getter를 만든다
//	public int getCount() {
//		return count;
//	}
	
	
	
	@Override
	public void run() {
		try {
			for(int i = count; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch(Exception e) {
		
		}
		System.out.println("종료");
	}
}