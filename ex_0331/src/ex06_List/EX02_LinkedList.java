package ex06_List;

import java.util.LinkedList;

public class EX02_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		// 요소의 추가
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		// 링크드리스트에는 index가 없지만, 자바에서는 List 인터페이스를 구현하고 있기 때문에
		// index로 접근할 수 있도록 기능을 제공
		
		// ex) 3번째를 찾아간다.
		// LinkedList의 경우 앞에서보터 노드를 따라가면서 해당 위치까지 이동해서 처리를 함
		
		// 맨 앞/뒤에 추가하기
		list.addFirst("HTML");
		list.addLast("JavaScript");
		
		System.out.println(list);
		
		// 조회
		System.out.println(list.get(0));
		
		// 					ArrayList 			vs 		LinkedList
		// 내부구조			배열기반		 	   			노드구조기반
		// 메모리 구조			연속된 공간	 				노드마다 객체 + 포인터로 연결
		// 중간삽입 / 삭제		느림			 				빠름
		// 인덱스에 접근		빠름 			 				느림
		// 전체 순회			빠름			 				빠름
		// 성능 요약			검색에 강함 	 				삽입 / 삭제에 강함
		// 					인덱스에 접근이 많을 때 			삽입 / 삭제가 자주 일어날 때
	}
}
