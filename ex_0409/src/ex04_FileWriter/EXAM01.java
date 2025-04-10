package ex04_FileWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EXAM01 {
	public static void main(String[] args) {
		// 메모장 프로그램 만들기
		// 사용자가 키보드로 입력한 내용을 "memo.txt"에 저장하고
		// 입력이 종료되면 해당 파일의 내용을 다시 읽어서 화면 출력
		// 사용자로부터 여러 줄의 텍스트를 입력 받는다
		// 사용자가 exit 입력하면 종료
		// 메모 입력 (exit 입력 시 종료):
		// > 오늘 날씨가 좋다.
		// > 내일은 시험이다.
		// > exit
		// 
		// 저장 완료. 저장된 메모 내용:
		// 오늘 날씨가 좋다.
		// 내일은 시험이다.
		// 단어 빈도 수
		// 오늘 : 1
		// 날씨가 : 1
		// 좋다 : 1
		
		Scanner sc = new Scanner(System.in);
		FileWriter fw = null;
		FileReader fr = null;
		List<String> memos = new ArrayList<>();
		try {
			fw = new FileWriter("D:\\full_stack_osh\\3. JAVA\\memo.txt", true);
			System.out.print("메모 입력 (exit 입력 시 종료) : ");
			while(true) {
				System.out.print("> ");
				String memo = sc.nextLine();
				if(memo.equalsIgnoreCase("exit")) {
					break;
				}
				//메모장에 쓰기 전에 ArrayList에 추가
				memos.add(memo);
				fw.write(memo + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		Map<String, Integer> wordCount = new HashMap<>();
		
		for(String memo : memos) {
			String[] words = memo.toLowerCase().split(" ");
			for(String word : words) {
				if(word.isEmpty()) continue;
				wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
			}
		}
		// result.txt에 저장
		try {
			fw = new FileWriter("D:\\full_stack_osh\\3. JAVA\\result.txt");
			for(Map.Entry<String, Integer> entry : wordCount.entrySet()) {
				fw.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}
			System.out.println("단어 빈도수 저장 완료");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			System.out.println("저장 완료. 저장된 메모 내용");
			fr = new FileReader("D:\\full_stack_osh\\3. JAVA\\memo.txt");
			int code = 0;
			while(((code) = fr.read()) != -1) {
				System.out.print((char)code);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
