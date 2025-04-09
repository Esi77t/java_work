package ex04_FileWriter;

import java.io.FileWriter;

public class EX04_FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {
			// 파일을 정해주고 파일이 없으면 생성도 해준다
			fw = new FileWriter("D:\\full_stack_osh\\3. JAVA\\fileWriter예제.txt");
			
			// 파일에 내용 작성
			fw.write("첫 번째 줄을 작성합니다.\n");
			fw.write("두 번째 줄을 작성합니다.\n");
			
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
