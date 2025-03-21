package ex01_if;

public class EX03_if_elseif_else {
	public static void main(String[] args) {
		// 비교해야할 조건이 여러개 있는경우 사용하는 문법
		// if문 안에 두 개 이상의 조건식과 논리 연산자를 사용할 수 도 있지만
		// 더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법으로
		// if - else if문을 구현한다
		
		// if(조건식 1) {
		//	조건식1이 참일 때 실행할 명령
		// } else if(조건식 2) {
		// 	조건식1이 거짓이고, 2가 참일때
		// } else if(조건식 3) {
		// 	조건식 1, 2가 거짓이고, 3이 참일 때;
		// } else {
		// 	위의 조건이 모두 거짓일 때 실행할 명령
		// }
		
		// else-if 문의 개수에는 제한이 없다
		// 하지만 너무 많은 else - if문을 사용한다면
		// 프로그램의 실행속도가 현저히 느려질수 있기 때문에
		// 다른 방법도 고려해좌야 한다
		// else문은 필요 없다면 생략 가능
		
		int favorite = 7;
		if(favorite > 5) {
			System.out.println("좋아하는 숫자가 5 입니다.");
		} else  if(favorite  == 7)
			System.out.println("좋아하는 숫자가 7 입니다.");
		
		// 효율적인 흐름으로 제어하기 위해 if문과 else if문의 조건문의 위치를 잘 고려해야 함
	}
}
