package EXAM04;

import java.util.HashSet;
import java.util.Set;

public class Exam04 {
	
	// 주어진 배열에서 중복된 값을 제거하는 메서드 작성
	public int[] removeDuplicates(int[] arr) {
		// HashSet에 배열의 모든 내용을 넣으면 됨
		Set<Integer> s = new HashSet<>();
		for(int i : arr) {
			s.add(i);
		}
		
		int[] res = new int[s.size()];
		int idx = 0;
		for(int num : s) {
			res[idx++] = num;
		}
		
		return res;
	}
}
