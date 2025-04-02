package ex02_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class EX03_Function {
	public static void main(String[] args) {
		// 컬렉션 프레임워크의 인터페이스에 일부는 함수형 인터페이스를 사용
		ArrayList<String> list = new ArrayList<>();
		list.add("이름 1");
		list.add("이름 2");
		list.add("이름 3");
		list.add("이름 4");
		list.add("이름 5");
		list.add("이름 6");
		
		// void accept(T t)
		// list에 들어있는 요소를 하나씩 꺼내서 출력을 해라
		list.forEach(System.out::println);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		
		hs.forEach(System.out::println);
	}
}
