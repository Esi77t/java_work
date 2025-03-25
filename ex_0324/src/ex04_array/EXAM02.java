package ex04_array;

import java.util.Arrays;
import java.util.Random;

public class EXAM02 {
	public static void main(String[] args) {
		// 랜덤메서드
//        int[] lottoNum = new int[6];
//        for(int i = 0; i < 6; i++) {
//            lottoNum[i] = ((int)(Math.random() * 45) + 1);
//            for(int j = 0; j < i; j++) {
//                if(lottoNum[i] == lottoNum[j]) {
//                    i--;
//                }
//            }
//        }
//        Arrays.sort(lottoNum);
//        for(int i :lottoNum) {
//            System.out.println(i + " ");
//        }
        
        // 랜덤클래스 호출
		int[] lottoNum = new int[6];
        Random rad = new Random();
        for(int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = rad.nextInt(45)+1;
            for(int j = 0; j < i; j++) {
                if(lottoNum[i] == lottoNum[j]) {
                    i--;
                }
            }
        }
        Arrays.sort(lottoNum);
        System.out.print(Arrays.toString(lottoNum));
    }
}
