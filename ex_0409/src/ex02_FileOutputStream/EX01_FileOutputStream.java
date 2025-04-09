package ex02_FileOutputStream;

import java.io.FileOutputStream;

public class EX01_FileOutputStream {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			// 경로에 파일이 없으면 파일을 만들어준다
			// write를 한 내용까지 작성을 해준다
			// 세이브파일을 만든다거나 저장하는 문서를 만드는 경우 FileOutputStream을 사용
			// 확장자도 마음대로 지정 가능
			// true를 주게 되면 이어쓰기가 가능
			fos = new FileOutputStream("D:\\full_stack_osh\\3. JAVA\\fileOut.txt", true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			// 바이트 배열 -> 문자열 new String(byte[] b);
			// 문자열 -> 바이트배열
			
			String msg = "fileOutput 예제 입니다\n";
			String msg2 = "여러 줄도 가능";
			// 삼중 따옴표 문법은 Java 15부터 사용할 수 있다.
			// 텍스트 블록이라고 부르며 여러줄에 걸친 문자열을 작성할 때 사용
			// 줄 끝에 \를 붙이면 줄바꿈 없이 이어서 쓸 수 있다
			// HTML, JSON등을 쓸 때 유용
			String msg3 = """
						여러줄
						문자열
						리터럴
							""";
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
