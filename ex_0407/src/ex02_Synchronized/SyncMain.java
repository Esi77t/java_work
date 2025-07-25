package ex02_Synchronized;

public class SyncMain {
	public static void main(String[] args) {
		// Runnable 인터페이스로 구현한 쓰레드는 start() 메서드가 없기 때문에
		// Thread 객체를 만들어서 생성자에 전달을 하고 start() 메서드로 실행
		SynchronizedEX atm = new SynchronizedEX();
		Thread mom = new Thread(atm, "Mother");
		
		Thread son = new Thread(atm, "Son");
		
		son.start();
		mom.start();
	}
}
