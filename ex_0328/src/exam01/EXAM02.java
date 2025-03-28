package exam01;

import java.util.Scanner;

public class EXAM02 {
	public static void main(String[] args) {
		// 키보드에서 특수문자를 제외한 알파벳을 무작위로 받는다
		// 입력받은 문자열에서 소문자 a가 몇개있는지 판별
		// 예시
		// 입력 : asdfasdf
		// 결과 : 2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String str1 = sc.nextLine();
		int cnt = 0;
		for(int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == 'a') {
				cnt++;
			}
		}
		System.out.println("결과 : " + cnt);
		
		// 생일과 성별구하기
		// 예시
		// 주민등록번호 모두 입력하세요 (- 포함)
		// 911223-1033451
		// 당신은 1991년 12월 23일에 태어난 남자입니다.
		// 3, 4는 2000년부터니까 26세 이하
		System.out.println("주민등록번호 모두 입력하세요 (-포함)");
		String str2 = sc.next();
		String result = "";
		String year = "";
		year = str2.substring(0, 2);
		
		if(str2.trim().length() < 14 || str2.trim().charAt(6) != '-') {
			System.out.println("주민번호를 올바르게 입력하세요.");
		} else {
			if(str2.charAt(7) == 1 || str2.charAt(7) == 2) {
				result = "당신은 19";
			} else {
				result = "당신은 20";
			}
			result += year + "년 " + str2.substring(2, 4) + "월 " + str2.substring(4, 6) + "일에 태어난 ";
			if(str2.charAt(7) % 2 != 0) {
				result += "남자입니다.";
			} else {
				result += "여자입니다.";
			}
			
			System.out.println(result);
		}
		
		// 회문 판별하기
		// 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열
		// 키보드에서 문자열을 입력받아 회문이면 xxx는 회문입니다.
		// 아니면 xxx는 회문이 아닙니다.
		// ex) 토마토는 회문입니다
		// 지하철은 회문이 아닙니다.
		String str4 = "";
		
		System.out.print("아무 단어를 입력하세요 : ");
		String str3 = sc.next();

		for(int i = str3.length(); 0 < i; i--) {
			str4 += str3.charAt(i - 1);
		}
		if(str3.equals(str4)) {
			System.out.println(str3 + "은(는) 회문입니다.");
		} else {
			System.out.println(str3 + "은(는) 회문이 아닙니다.");
		}
	}
}
