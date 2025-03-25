package ex04_array;

import java.util.Arrays;
import java.util.Random;

public class EXAM02 {
	public static void main(String[] args) {
		// 랜덤메서드
        int[] lottoNum = new int[6];
        for(int i = 0; i < 6; i++) {
            lottoNum[i] = ((int)(Math.random() * 45) + 1);	// 난수 생성하여 배열에 넣기
            for(int j = 0; j < i; j++) {	// 중복 검사
                if(lottoNum[i] == lottoNum[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lottoNum);
		System.out.print(Arrays.toString(lottoNum));
        
        // 랜덤클래스 호출
		int[] lottoNums = new int[6];
        Random rad = new Random();
        for(int i = 0; i < lottoNums.length; i++) {
            lottoNums[i] = rad.nextInt(45)+1;	// 난수 생성하여 배열에 넣기
            for(int j = 0; j < i; j++) {	// 중복 검사
                if(lottoNums[i] == lottoNums[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lottoNums);
        System.out.print(Arrays.toString(lottoNums));
    }
}
