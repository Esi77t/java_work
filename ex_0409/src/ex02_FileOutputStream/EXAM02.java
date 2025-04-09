package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

//학생의 이름과 점수를 입력받아 scores.txt저장
//이어쓰기를 한다.
//마지막에는 파일 내용을 읽어 콘솔에 출력하는 기능 구현하기
//입력:
//이름: 홍길동
//점수: 90
//이름: 김영희
//점수: 85
//이름: exit
//
//출력:
//현재 저장된 점수 목록:
//홍길동 : 90
//김영희 : 85
public class EXAM02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null;
		
		try {
			while(true) {
				fos = new FileOutputStream("D:\\full_stack_osh\\3. JAVA\\scores.txt", true);
				
				// 이름 입력
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();
				// 대문자 무시하고 값을 검증
				if(name.equalsIgnoreCase("exit")) {
					break ;
				}
				
				// 점수 입력
				System.out.print("점수를 입력하세요 : ");
				String score = sc.next();
				
				// 이름 : 점수
				String nameScore = name + " : " + score + "\n";
				fos.write(nameScore.getBytes());
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		// 작성한 내용 콘솔에 출력
		File file = new File("D:\\full_stack_osh\\3. JAVA\\scores.txt");
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)file.length()];
		
		if(file.exists()) {
			try {
				fis = new FileInputStream(file);
				fis.read(b_read);
				String res = new String(b_read, "UTF-8");
				
				System.out.println("=== 출 력 ===");
				System.out.println(res);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(fis != null) {
						fis.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
}
