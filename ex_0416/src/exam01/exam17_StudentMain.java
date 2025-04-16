package exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class exam17_StudentMain {
	public static void main(String[] args) {
		List<exam17_Student> std = new ArrayList<>();
		
		List<Integer> scores1 = Arrays.asList(85, 72, 90);
		List<Integer> scores2 = Arrays.asList(20, 40, 90);
		List<Integer> scores3 = Arrays.asList(80, 78, 90);
		std.add(new exam17_Student("Alice", scores1));
		std.add(new exam17_Student("Bob", scores2));
		std.add(new exam17_Student("Charlie", scores3));
		
		for(exam17_Student stdS : std) {
			double avg = stdS.avg();
			if(avg >= 80) {
				System.out.printf("학생 : %s, 평균 점수 : %.2f\n", stdS.name, avg);
			}
		}
	}
}
