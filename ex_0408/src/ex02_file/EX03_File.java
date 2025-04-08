package ex02_file;

import java.io.File;

public class EX03_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_osh\\3. JAVA\\aaa\\bbb";
		File f = new File(path);
		
		// exists()
		// 목적지까지의 경로가 존재하면 true
		if(!f.exists()) {
			System.out.println("폴더 생성");
			// mkdirs()
			// 복수의 폴더를 생성해준다
			// 하나일 때도 써주는 것이 좋다
			f.mkdirs();
		}
		
		// File 클래스의 역할
		// 폴더를 만들어 주거나 목적지까지의 검증(파일이나 폴더가 존재하는지에 대한 검증)
		// 폴더일 때 목록의 반환
		// 목적지의 크기도 반환
		
		// 내용을 읽거나 쓰는 기능은 없다
	}
}
