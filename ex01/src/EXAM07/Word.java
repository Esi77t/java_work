package EXAM07;

import java.util.HashMap;
import java.util.Map;

public class Word {
	public static Map<String, Integer> wordFrequency(String str) {
		
		Map<String, Integer> map = new HashMap<>();
		
		String[] words = str.split(" ");
		
		for(String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		
		
		
		return map;
	}
}
