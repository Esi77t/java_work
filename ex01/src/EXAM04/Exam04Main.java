package EXAM04;

import java.util.Arrays;

public class Exam04Main {
	public static void main(String[] args) {
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		
		Exam04 e= new Exam04();
		
		int[] rs = e.removeDuplicates(i_arr);
		
		System.out.println(Arrays.toString(rs));
	}
}

