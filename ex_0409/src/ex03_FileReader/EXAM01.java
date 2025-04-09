package ex03_FileReader;

import java.io.FileReader;

public class EXAM01 {
	public static void main(String[] args) {
		// text.txt 파일을 만들고 한글, 영어(대문자, 소문자) 섞어서 작성
		// text.txt 파일의 내용을 읽어와서
		// 영어 대문자의 개수, 소문자의 개수를 판별하여 출력
		// 대문자 : x개
		// 소문자 : x개
		FileReader fr = null;
		int upper = 0;
		int lower = 0;
		try {
			fr = new FileReader("D:\\full_stack_osh\\3. JAVA\\text.txt");
			int code = 0;
			while(((code) = fr.read()) != -1) {
				if(code >= 'A' && code <= 'Z') {
					upper++;
				} else if(code >= 'a' && code <= 'z') {
					lower++;
				}
			}
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
