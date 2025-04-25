package EXAM04;

public class Exam04Main {
	public static void main(String[] args) {
		int[] i_arr = {1,1,1,2,2,2,2,3,3,3,4,4,4,4,4,5,5,5,5,5};
		
		int[] rs = Exam04.removeDuplicates(i_arr);
		
		for(int i = 0; i < rs.length; i++) {
			System.out.print(rs[i]);
		}
	}
}
