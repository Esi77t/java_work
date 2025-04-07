package ex01_ThreadMethod;

public class JoinMain {
	public static void main(String[] args) {
		JoinExample je = new JoinExample();
		je.start();
		try {
			je.join();	// main 쓰레드는 worker 쓰레드가 끝날 때까지 기다린다
		} catch (Exception e) {
			
		}
		System.out.println("main 쓰레드 종료");
	}
}
