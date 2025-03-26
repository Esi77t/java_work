package ex04_overloading;

public class RectangleCalculator {
	// 다양한 방식으로 사각형 넓이 구하기
	// 메서드 명 : area
	// 1. 정사각형 한 변의 길이를 받아 넓이 반환
	// 2. 가로 세로 길이를 받아 직사각형 넓이 반환
	// 3. 실수형 가로, 세로를 받아 실수 결과 반환
	public int area(int a) {
		return a * a;
	}
	
	public int area(int a, int b) {
		return a * b;
	}
	
	public double area(double a, double b) {
		return a * b;
	}
}
