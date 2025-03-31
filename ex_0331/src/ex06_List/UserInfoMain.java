package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

// Main클래스에서 유저의 정보를 ArrayList에 추가하여 출력

public class UserInfoMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> userInfo = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			UserInfo ui = new UserInfo();
			System.out.print("아이디 생성 : ");
			ui.setUserID(sc.next());
			
			System.out.print("패스워드 입력 : ");
			ui.setPassword(sc.nextInt());
			
			
			// 중복체크(과제)
			userInfo.add(ui);
			
			
			for(int i = 0; i < userInfo.size(); i++) {
				System.out.println(userInfo.get(i).getUserID());
				System.out.println(userInfo.get(i).getPassword());
				System.out.println("-------------------------------");
			}
		}
	}
}
