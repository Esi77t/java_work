package ex02_switch;

public class EX02_switch {
	public static void main(String[] args) {
		// switch문에 break가 없는 경우
		int num = 1;
		switch(num) {
			case 1:
				System.out.println("num은 1입니다.");
			case 7:
				System.out.println("num은 7입니다.");
			default:
				System.out.println("num은 1도 7도 아닙니다.");
		}
		
		int x = 14;
		if(x > 10 && x < 20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		char ch = 'b';
		if(('A' <= ch && 'Z' >= ch) || ('a' <= ch && 'z' >= ch)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
