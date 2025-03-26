package ex04_exam;

import java.util.Scanner;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserInfo user = new UserInfo();
		
		while(true) {
			System.out.println("1. 입      금 :");
			System.out.println("2. 출      금 :");
			System.out.println("3. 잔 액 조 회 :");
			System.out.println("4. 종      료 :");
			System.out.print("선 택 하 세 요 :");
			int select = sc.nextInt();
			int money = 0;
			
			switch(select) {
				case 1:
					System.out.println("-- 입 금 --");
					System.out.print("입금할 금액 입력 : ");
					money = sc.nextInt();
					user.deposit(money);
					break;
				case 2:
					System.out.println("-- 출 금 --");
					System.out.print("출금할 금액 입력 : ");
					money = sc.nextInt();
					user.withdraw(money);
					break;
				case 3:
					System.out.println("-- 잔 액 --");
					System.out.printf("남은 잔액 : %d원\n", user.showMoney());
					break;
				case 4:
					System.out.println("종료합니다");
					return;		// 함수 자체를 빠져나감
			} System.out.println("-----------------------");
		}
	}
}
