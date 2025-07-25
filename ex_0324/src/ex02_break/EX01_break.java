package ex02_break;

public class EX01_break {
	public static void main(String[] args) {
		// break문은 switch를 할 때 나왔던 구문으로
		// case를 종료할 때 사용
		// 반복문이 진행되는 도중, 특정 조건을 만족해
		// 더이상 반복문을 실행할 필요없이 종료하려고 할 때 사용
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		int s = 0;
		while(s < 10) {
			if(s == 5) {
				break;
			}
			System.out.print(s + " ");
			s++;
		}
		System.out.println();
	}
	
	// break, continue와 같은 기타제어문은 반복문 안에서만 사용 가능
	// 기타제어문 밑에는 코드가 올 수 없음
}
