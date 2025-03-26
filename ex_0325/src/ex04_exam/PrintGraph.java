package ex04_exam;

public class PrintGraph {
    public void printGraph(int[] nums) {
        int[] cnt = new int[10];	// 생성된 난수의 개수를 담을 배열
        for(int num : nums) {
            cnt[num]++;
        }
        // 그래프 찍는 함수
        for(int i = 0; i < cnt.length; i++) {
            System.out.printf("%d의 개수 : ", i);
            for(int j = 0; j < cnt[i]; j++) {
                System.out.print("#");
            }
            System.out.printf("%d\n", cnt[i]);
        }
    }
}
