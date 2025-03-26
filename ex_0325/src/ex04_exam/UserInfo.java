package ex04_exam;

public class UserInfo {
	private int money;	// 계좌 돈
	
	public void deposit(int money) {	// 입금
		System.out.printf("%d원 입금 성공\n", money);
		this.money += money;	// 매개변수를 우선순위로 두기 때문에 this. 사용
	}
	
	public void withdraw(int money) {	// 출금
		if(this.money < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			System.out.printf("%d원 출금 성공\n", money);
			this.money -= money;
		}
	}
	
	public int showMoney() {	// 잔액 반환
		return money;
	}
}

