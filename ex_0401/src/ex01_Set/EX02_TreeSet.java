package ex01_Set;

import java.util.TreeSet;

public class EX02_TreeSet {
	public static void main(String[] args) {
		// 자바 컬렉션에서 제공하는 정렬된 Set
		// 중복을 허용하지는 않지만
		// Tree기반이기 때문에 자동정렬이 된다
		// Red-Black Tree는 부모 노드보다 작은 값을 가지는 노드는 왼쪽으로, 큰 값을 가지면 오른쪽 자식을 배치하며
		// 데이터 추가나 삭제 시 트리가 한쪽으로 치우쳐지지 않도록 균형을 맞춤
		TreeSet<Integer> set1 = new TreeSet<>();
		
		set1.add(7);// 루트 노드
		set1.add(4);
		set1.add(9);
		set1.add(1);
		set1.add(5);
		System.out.println(set1);
		System.out.println(set1.first());	// 최소값
		System.out.println(set1.last());	// 최대값
		System.out.println(set1.higher(3)); // 입력값보다 큰 수 중 최소 값
		System.out.println(set1.lower(3));  // 입력값보다 작은 수 중 최소 값 
	}
}
