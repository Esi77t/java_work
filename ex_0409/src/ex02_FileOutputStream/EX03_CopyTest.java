package ex02_FileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class EX03_CopyTest {
	public static void main(String[] args) {
		// byte 배열복사
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\full_stack_osh\\3. JAVA\\image.jpg");
			fos = new FileOutputStream("D:\\full_stack_osh\\3. JAVA\\image_copy.jpg");
			byte[] buffer = new byte[512];
			// 현재 시간을 m/s 단위로 나타냄
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			// read()를 통해 읽는다
			while((read = fis.read(buffer)) != -1) {
				// 읽어온 내용을 write()로 쓴다
				fos.write(buffer, 0, read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			// 종료시간 - 시작시간 = 총 소요시간
			double time = (double)(end - start) / 1000;
			System.out.println("걸린 시간 : " + time);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(fos != null) {
					fos.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		// 직접 복사하는 것보다 바이트 배열을 이용하여 이미지를 복사했을 때 속도가 매우 빠르다
	}
}