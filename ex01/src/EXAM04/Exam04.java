package EXAM04;

public class Exam04 {
	public static int[] removeDuplicates(int[] arr) {
		int[] temp = new int[arr.length];
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i++;
				if()
				} else {
					temp[i] = arr[i];
				}
			}
		}
		
		return temp;
	}
}
