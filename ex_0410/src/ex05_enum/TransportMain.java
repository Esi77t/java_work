package ex05_enum;

public class TransportMain {
	public static void main(String[] args) {
		// 각 운송수단별 100을 갔을 때 금액 출력
		// name : xxx, 100km - fare : xxx
		// name : xxx, 100km - fare : xxx
		// name : xxx, 100km - fare : xxx
		// name : xxx, 100km - fare : xxx
		
		Transportation[] tp = Transportation.values();
		for(Transportation trans : tp) {
			System.out.printf("name : %s, 100km - fare : %d\n", trans.name(), trans.totalFare(100));
		}
	}
}
