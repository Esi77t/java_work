package ex03_FileReader;

import java.io.FileReader;

public class EX01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\full_stack_osh\\3. JAVA\\test.txt");
			
			int code = 0;
			// 파일을 읽다가 더이상 읽을게 없으면 -1이 나온다
			while(((code) = fr.read()) != -1) {
				System.out.print((char)code);
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
