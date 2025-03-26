package ex04_exam;

import java.util.Random;

public class Graph {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] nums = new int[100];	// 난수를 담을 배열
        
        // 100개의 공간의 난수를 할당
        System.out.print("결과 : ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = ran.nextInt(10);
            System.out.print(nums[i]);
        }
        System.out.println();
        
        // 클래스 호출
        PrintGraph prgr = new PrintGraph();
        prgr.printGraph(nums);
    }
}
