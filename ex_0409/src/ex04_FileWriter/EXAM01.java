package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class EXAM01 {
	public static void main(String[] args) {
		// 메모장 프로그램 만들기
		// 사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		// 입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면 출력
		// 사용자로부터 여러 줄의 텍스트를 입력 받는다
		// 사용자가 exit 입력하면 종료
		// 메모 입력 (exit 입력 시 종료):
		// > 오늘 날씨가 좋다.
		// > 내일은 시험이다.
		// > exit
		//
		// 저장 완료. 저장된 메모 내용:
		// 오늘 날씨가 좋다.
		// 내일은 시험이다.
		
		Scanner sc = new Scanner(System.in);
		FileReader fr = null;
		FileWriter fw = null;
		try {
			while(true) {
				fw = new FileWriter("D:\\full_stack_osh\\3. JAVA\\memo.txt");
				
				System.out.print("메모 입력 (exit 입력 시 종료) : ");
				String memo = sc.nextLine();
				if(memo.equalsIgnoreCase("exit")) {
					break;
				}
				
				fw.write(memo + "\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			fr = new FileReader("D:\\full_stack_osh\\3. JAVA\\memo.txt");
			
			int code = 0;
			
			while(((code) = fr.read()) != -1) {
				System.out.println((char)code);
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
