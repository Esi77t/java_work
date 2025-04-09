package ex02_FileOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

// 학생의 이름과 점수를 저장하는 프로그램
// 이름과 점수를 FileOutputStream을 이용하여 scores.txt.파일에 저장

// 요구사항
// 1. 사용자로부터 이름과 점수를 입력받는다. (Scanner)
// 2. 입력받은 데이터를 "이름 : 점수 \n" 형식으로 문자열로 만들어 파일에 쓴다
// ex) "김철수 : 84"
// 3. 이름에 exit를 입력하면 프로그램 종료
// 4. 파일은 scores.txt로 저장되며, 기존 내용은 덮어쓴다
// 5. "이름 : 점수" 형식의 문자열의 각 문자의 char값을 +3을 해 암호화 한다
// ex) 입력 : John : 85\n
// 	   저장 : Mrkq#=#;
// 	   출력 : John : 85
public class EXAM01 {
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
				String result = "";
				for(int i = 0; i < nameScore.length(); i++) {
					result += (char)(nameScore.charAt(i) + 3);
				}
				
				// 파일에 작성
				fos.write(result.getBytes());
				
				System.out.println("파일 저장 완료");
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
		// 복호화 해서 콘솔에 출력하기
		File file = new File("D:\\full_stack_osh\\3. JAVA\\scores.txt");
		FileInputStream fis = null;
		byte[] b_read = new byte[(int)file.length()];
		try {
			fis = new FileInputStream(file);
			fis.read(b_read);
			String res = new String(b_read, "UTF-8");
			String resChar = "";
			for(int i = 0; i < res.length(); i++) {
				resChar += (char)(res.charAt(i) - 3);
			}
			
			System.out.println("=== 출 력 ===");
			System.out.println(resChar);
			
		} catch (Exception e) {
			// TODO: handle exception
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
