package ex02_Thread;

// 쓰레드를 생성하는 방법
// 1. Thread클래스를 상속 받는다
public class ThreadTest extends Thread {
	@Override
	public void run() {
		// 작업할 내용
		for(int i = 0; i < 10; i++) {
			System.out.println("쓰레드 진행중 " + i);
		}
	}
}
