package exam01;

import java.util.HashMap;
import java.util.Map;

public class exam16_StudentScore {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Alice", 85);
		scores.put("Bob", 72);
		scores.put("Charlie", 90);
		
		for(Map.Entry<String, Integer> name : scores.entrySet()) {
			if(name.getValue() >= 80) {
				System.out.println("80점 이상인 학생 이름 : " + name.getKey());
			}
		}
	}
}
