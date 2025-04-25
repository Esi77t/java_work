package EXAM07;

import java.util.Map;

public class WordMain {
	public static void main(String[] args) {
		String text = "apple banana apple apple orange banana apple orange orange";
		
		Map<String, Integer> res = Word.wordFrequency(text);
		
		for(Map.Entry<String, Integer> entry : res.entrySet()) {
			System.out.println(entry.getKey() +  " : " + entry.getValue());
		}
	}
}
