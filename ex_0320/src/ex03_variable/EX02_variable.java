package ex03_variable;

public class EX02_variable {
	public static void main(String[] args) {
		// 변수의 유효범위(scope)
		// 모든 변수는 만들어진 중괄호 안에서만 사용할 수 있음
		String favoriteFood;
		
		if(10 > 5) {
			favoriteFood = "제육";
		}
		System.out.println(favoriteFood);
	}
}
