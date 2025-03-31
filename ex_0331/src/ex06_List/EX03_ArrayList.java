package ex06_List;

import java.util.ArrayList;

public class EX03_ArrayList {
	public static void main(String[] args) {
		// 사람에 대한 정보를 저장한다
		// 이름, 키, 몸무게, 주소, 혈액형, 나이
		ArrayList<Person> list = new ArrayList<>();
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 30;
		p1.height = 182.4;
		
		Person p2 = new Person();
		p2.name = "홍길순";
		p2.age = 24;
		p2.height = 167.3;
		
		list.add(p1);
		list.add(p2);
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);
		System.out.println(list.get(0).height);
	}
}
