package ex02_Thread;

// 쓰레드를 생성하는 방법 2번째
// Runnable 인터페이스를 구현
public class RunnableTest implements Runnable {
	@Override
	public void run() {
		// 작업할 내용
		for(int i = 0; i < 10; i++) {
			System.out.println("Runnable 진행중 " + i);
		}
	}
}
