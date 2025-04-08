package ex02_file;

import java.io.File;

public class EX04_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_osh\\3. JAVA\\test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			System.out.println("파일 이름 : " + f.getName());
			System.out.println("절대 경로 : " + f.getAbsolutePath());
		}
	}
}
