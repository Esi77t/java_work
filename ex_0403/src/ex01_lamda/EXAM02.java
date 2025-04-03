package ex01_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

class Greeting {
	private String name;
	
	public Greeting(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Hello, " + name;
	}
}

class Student {
	private int score;
	
	public Student(int score) {
		this.score = score;
	}
	
	public boolean isPassed(int cutLine) {
		return score >= cutLine;
	}
}


public class EXAM02 {
	public static void main(String[] args) {
		// Greeting 메서드를 참조하여 sayHello() 호출하기
		Function<Greeting, String> greeting = Greeting::sayHello;
		
		Greeting gt = new Greeting("Java");
		System.out.println(greeting.apply(gt));
		
		
		// 학생이 특정 점수 인상인지 확인하는 메서드를 메서드 참조로 구하기
		BiPredicate<Student, Integer> passChecker = Student::isPassed;
		
		Student std = new Student(80);
		System.out.println(passChecker.test(std, 75));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// removeIf()
		// 조건에 맞으면 삭제
		list.removeIf(x -> x % 2 == 0);
		
		System.out.println(list);
	}
}
