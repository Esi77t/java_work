package exam01;

import java.util.Arrays;
import java.util.List;

public class exam12 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "dog", "banana", "cat", "grape");
		list.stream()
			.filter(s -> s.length() >= 4)
			.forEach(System.out::println);
	}
}
