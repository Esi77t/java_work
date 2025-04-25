package EXAM05;

public class Exam05 {
	public static void main(String[] args) {
		int[] f_arr = {3,2,5,7,9,4,2,1,6,8};
		int max = 0;
		
		for(int i = 0; i < f_arr.length; i++) {
			if(f_arr[i] > max) {
				max = f_arr[i];
			}
		}
		
		System.out.println(max);
	}
}
