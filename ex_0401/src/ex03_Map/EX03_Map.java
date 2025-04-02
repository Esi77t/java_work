package ex03_Map;

import java.util.HashMap;
import java.util.Scanner;

public class EX03_Map {
	public static void main(String[] args) {
		// 문장을 입력받고 단어별로 몇 번 등장했는지 출력
		// 예시
		// hello world hello java world java java
		// hello : 2
		// world : 2
		// java : 3
		Scanner sc = new Scanner(System.in);
		System.out.print("문장을 입력하세요 : ");
		String sentence = sc.nextLine();
		String[] sentenceCut = sentence.split(" ");
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		for(String word : sentenceCut) {
//			if(wordCount.containsKey(word)) {
//				// 이미 키가 존재한다면 값 1 증가
//				int count = wordCount.get(word);
//				wordCount.put(word, count+1);
//			} else {
//				// 단어가 처음 나왔을 때
//				wordCount.put(word, 1);
//			}
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}
		
		System.out.println("-----단어별 등장 횟수-----");
		for(String key: wordCount.keySet()) {
			System.out.println(key + " : " + wordCount.get(key));
		}
		
		// Map인터페이스에서 제공하는 메서드
		// V getOrDefault(K key, defaultValue)
		// 키가 존재하면 Value를 반환
		// 키가 존재하지 않으면 defaultValue를 반환.
		
		// V replace(K key, V value)
		// put은 키가 없으면 추가가 됨
		// replace는 키가 없으면 추가가 안됨
		
		// V putIfAbsent(K key, V value)
		// 키가 없을 경우에만 추가
		// 키가 있을 경우
		// put() -> 덮어쓰기
		// putIfAbsent() -> 아무 동작도 하지 않음
	}
}
