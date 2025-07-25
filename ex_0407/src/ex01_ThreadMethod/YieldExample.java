package ex01_ThreadMethod;

public class YieldExample extends Thread {
	// 현재 실행 중인 쓰레드가 CPU를 다른 쓰레드에게 양보하도록 한다
	// 하지만 양보가 반드시 일어나는 것은 아니다
	@Override
	public void run() {
		this.setName("쓰레드 1");
		String name = Thread.currentThread().getName();
		for(int i = 1; i <= 5; i++) {
			System.out.println(name + " : " + i);
			Thread.yield();		// 양보 요청
		}
	}
}
