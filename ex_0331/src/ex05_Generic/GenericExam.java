package ex05_Generic;

class Gen{
	public<T> void printArr(T[] arr) {
		for(T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}

public class GenericExam {
	// Gen클래스를 만들어 제네릭타입 T를 가지는
	// printArr메서드를 생성
	// printArr메서드 내부에서 배열을 순차적으로 출력하는 코드 작성
	// main에서 Integer, Double, Character배열을 각각 만든 뒤
	// Gen클래스의 printArr메서드를 각각 호출하여 배열의 내용을 출력하자
	// 결과 :
	// 1 2 3 4 5
	// 1.1 2.2 3.3 4.4 5.5
	// A B C D E
	public static void main(String[] args) {
		Integer[] iArr = {1, 2, 3, 4, 5};
		Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};
		
		Gen gen = new Gen();
		
		// 컴파일러가 전달된 인자의 타입을보고 타입을 추론
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
		
		// 타입의 명시
		gen.<Integer>printArr(iArr);
		gen.<Double>printArr(dArr);
		gen.<Character>printArr(cArr);
	}
}
