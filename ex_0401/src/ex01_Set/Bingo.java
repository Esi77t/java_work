package ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Bingo {
	public static void main(String[] args) {
		// HashSet을 이용한 5 * 5의 랜덤 빙고판 만들기
		// 숫자는 1 ~ 50까지
		HashSet<Integer> hs1 = new HashSet<>();
		
		// HashSet에 25개의 난수를 채울 때 까지 돌려라
		int[][] arrInt = new int[5][5]; 
		while(hs1.size() != 25) {
			hs1.add((int)(Math.random() * 50) + 1);
		}
		
		// Set은 index가 없기 때문에 하나씩 꺼낼 수가 없다
		// 그렇기 때문에 iterator를 통해서 꺼낸다
		
		// shuffle()
		// set으로 랜덤값을 넣었기 때문에 중복값은 어차피 안 들어가 있음
		List<Integer> list = new ArrayList<>(hs1);
		Collections.shuffle(list);
		Iterator<Integer> iter = list.iterator();
		
		for(int i = 0; i < arrInt.length; i++) {
			for(int j = 0; j < arrInt[i].length; j++) {
				arrInt[i][j] = iter.next();
				System.out.print(arrInt[i][j] + " ");
			}
			System.out.println();
		}
	}
}
