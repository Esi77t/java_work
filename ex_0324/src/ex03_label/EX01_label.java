package ex03_label;

public class EX01_label {
	public static void main(String[] args) {
		// label
		// 기타제어문을 포함하고 있는 반복문에 대해서만 영향이 있음
		// 라벨링을 하면 내가 원하는 반복문에 대해서 조작을 할 수 있음
		
		// 라벨은 항상 쌍으로 존재한다
		// j가 2가 될 경우 바깥 쪽 라벨로 넘어가기 때문에 1밖에 나올 수 없다 
		out:for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					continue out;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		out:for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 10; j++) {
				if(j % 2 == 0) {
					break out;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
