package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		// 아래의 결과를 도출
		
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc2
		// abc abc2
		// 아이디 생성 : abc3
		// abc abc2 abc3
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		//	while(true) {
		//		System.out.print("아이디 생성 : ");
		//		list.add(sc.next());
		//		for(String id : list) {
		//			System.out.print(id + " ");
		//		}
		//		System.out.println();
		//			
		//		if(list.size() == 5) {
		//			break;
		//		}
		//	}
		
		// 아이디 생성 : abc
		// abc
		// 아이디 생성 : abc
		// 중복된 아이디
		// 아이디 생성 : abc2
		// abc, abc2
		// 아이디 생성 : c
		// abc, abc2, c
		
		outer:while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			list.add(id);
			for(String x : list) {
				System.out.print(x + " ");
			}
			System.out.println();
			if(list.size() == 5) {
				break;
			}
		}
	}
}