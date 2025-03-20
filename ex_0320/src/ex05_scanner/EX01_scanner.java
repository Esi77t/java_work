package ex05_scanner;
import java.util.Scanner;

public class EX01_scanner {
	public static void main(String[] args) {
		// 데이터의 입력
		// 프로그램을 실행할 때 키보드를 통해 입력한 데이터를
		// 변수에 대입하겠다
		
		// java.util 패키지에 있는 Scanner클래스를 사용
		// 다른 패키지에 있는 기능을 사용하기 위해서는 import를 해야 함
		// import 경로
		// let obj = new Object();
		// obj.key = value;		// 프로퍼티가 없으면 추가
		// Scanner sc = new Scanner(System.in);	// 스캐너 객체 선언
		// System.out.print("정수 입력 : ");
		// int a = sc.nextInt();	// 정수 입력받기
		// int b = sc.nextInt();
		// System.out.println(a + b);
		
		// 나이 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next(); // 띄어쓰기를 해버리면 종료
		sc.nextLine(); // 엔터 값을 대신 가져감
		System.out.println("주소 입력 : ");
		String address = sc.nextLine(); // 엔터를 하면 종료
		System.out.printf("제 이름은 %s 입니다.\n", name);
		System.out.printf("제 나이는 %d세 입니다.\n", age);
		System.out.printf("제 주소는 %s 입니다.\n", address);
	}
}
