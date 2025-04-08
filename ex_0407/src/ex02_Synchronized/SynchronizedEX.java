package ex02_Synchronized;

public class SynchronizedEX implements Runnable {
	private long money = 10000;
	
	@Override
	public void run() {
		// SynchronizedEX.class : SynchronizedEX 클래스 자체를 의미
		// SynchronizedEX 클래스에 락을 걸겠다
		// 하나의 쓰레드가 이미 점유중이라면 다른 쓰레드가 사용할 수 없다.
		
		// synchronized 블록
		// 필요한 부분만 선택적으로 동기화 할 수 있어 조금 더 성능을 최적화 할 수 있다
		synchronized (SynchronizedEX.class) {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(getMoney() <= 0) {
					break;
				}
				outMoney(1000);
			}
		}
	}
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	// 출금
	public void outMoney(long money) {
		String threadName = Thread.currentThread().getName();
		// 잔고가 0보다 크면
		if(getMoney() > 0) {
			this.money -= money;
			System.out.println(threadName + " - 잔액 : " + getMoney() + "원");
		} else {
			System.out.println("잔액이 없습니다.");
		}
	}
}
