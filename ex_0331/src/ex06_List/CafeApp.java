package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
	public static void main(String[] args) {
		ArrayList<MenuItem> menuList = new ArrayList<>();
		ArrayList<MenuItem> orderList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		menuList.add(new MenuItem("아메리카노", 3000));
		menuList.add(new MenuItem("라떼", 3500));
		menuList.add(new MenuItem("카푸치노", 4000));
		
		boolean running = true;
		while(running) {
			System.out.println("=== 카페 주문 시스템 ===");
			System.out.println("1. 메뉴 보기");
			System.out.println("2. 메뉴 추가");
			System.out.println("3. 결제 하기");
			System.out.println("4. 종료 하기");
			System.out.println("5. 취소 하기");
			System.out.print("번호 선택 : ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					// menuList에 들어있는 내용을 꺼내서 보여주기
					System.out.println("[메뉴판]");
					int count = 1;
					for(MenuItem mi: menuList) {
						System.out.printf("%d. %s - %d원\n", count, mi.getCoffee(), mi.getPrice());
						count++;
					}
					break;
				case 2:
					// 메뉴추가기능
					// 메뉴번호를 입력받아서 해당 번호에 해당하는 객체를 orderList에 추가
					
					// 메뉴번호 입력
					System.out.print("메뉴를 고르세요 : ");
					int menuNum = sc.nextInt();
					// 입력받은 숫자가 1보다 크거나 같거나, 메뉴리스트 사이즈보다는 작거나 같을 때
					if(menuNum >= 1 && menuNum <= menuList.size()) {
						MenuItem selected = menuList.get(menuNum - 1);
						orderList.add(selected);
						System.out.println("'" + selected.getCoffee() + "'가 추가되었습니다.");
					// 번호를 잘못 입력하면 "잘못된 메뉴 번호입니다."
					} else {
						System.out.println("잘못된 번호 입니다.");
					}
					break;
				case 3:
					// 결제하기
					// orderList가 비어있으면 결제할 주문이 없습니다 출력
					if(orderList.isEmpty()) {
						System.out.println("결제할 주문이 없습니다.");
					} else {
						System.out.println("[결제 내역]");
						int total = 0;
						for(MenuItem order : orderList) {
							System.out.println("- " + order.getCoffee());
							total += order.getPrice();
						}
						System.out.println("총 금액 : " + total + "원");
						System.out.println("결제가 완료되었습니다. 감사합니다.");
						// 결제 후 장바구니 초기화
						orderList.clear();
					}
					break;
				case 4:
					System.out.println("프로그램을 종료합니다.");
					running = false;
					break;
				case 5:
					// 취소하기
					// orderList가 비어 있으면
					// 주문내역이 없습니다 출력
					if(orderList.isEmpty()) {
						System.out.println("결제할 주문이 없습니다.");
					// 비어 있지 않으면
					// [현재 주문 내역]
					// 1. 아메리카노 - 3000원
					// 2. 라떼 - 3500원			
					} else {
						System.out.println("[현재 주문 내역]");
						count = 1;
						for(MenuItem mi : orderList) {
							System.out.printf("%d. %s - %d원\n", count, mi.getCoffee(), mi.getPrice());
							count++;
						}
					}
					// 취소할 주문 번호를 입력하세요
					System.out.print("취소할 주문 번호를 선택해주세요 : ");
					int cancelSelect = sc.nextInt();
					// 올바른 숫자를 고르면
					if(cancelSelect >= 1 && cancelSelect <= orderList.size()) {
						System.out.printf("%d. %s를 취소했습니다.\n", cancelSelect, orderList.get(cancelSelect - 1).getCoffee());
						orderList.remove(cancelSelect - 1);
					// 취소할 숫자를 잘못고른다면
					} else {
						System.out.println("잘못된 숫자입니다.");
					}
					break;
			}
		}
	}
}
