package ex02_file;

import java.io.File;

public class EX01_File {
	public static void main(String[] args) {
		String path = "D:\\full_stack_osh\\3. JAVA\\test.txt";
		
		File f = new File(path); // 경로를 직접 넣어도 상관 없음
		// File 클래스의 객체가 생성되면서 path 경로까지의 스트림을 생성
		
		// isFile() : 최종 목적지까지 갔을 때 파일인지 아닌지 판별
		if(f.isFile()) {
			// length()
			// 파일이나 폴더 등 최종 목적지에 해당하는 용량을 가져올 수 있다
			System.out.println(f.length() + "byte");
		}
	}
}
