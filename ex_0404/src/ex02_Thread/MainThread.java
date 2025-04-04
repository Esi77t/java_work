package ex02_Thread;

public class MainThread {
	public static void main(String[] args) {
		ThreadName tn = new ThreadName();
		tn.start();
		
		// 메인도 하나의 쓰레드
		// 1 ~ 10까지가 있고 우선순위가 가장 높은건 10
		System.out.println("현재 실행되고 있는 쓰레드의 이름 : " + Thread.currentThread().getName());
		System.out.println("현재 실행되고 있는 쓰레드의 상태 : " + Thread.currentThread().getState());
		System.out.println("현재 실행되고 있는 쓰레드의 우선순위 : " + Thread.currentThread().getPriority());
	}
}
