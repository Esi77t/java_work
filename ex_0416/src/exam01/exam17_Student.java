package exam01;

import java.util.List;

public class exam17_Student {
	String name;
	List<Integer> scores;
	
	public exam17_Student(String name, List<Integer> scores) {
		this.name = name;
		this.scores = scores;
	}
	
	public double avg() {
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		return (double) sum / scores.size();
	}
}
