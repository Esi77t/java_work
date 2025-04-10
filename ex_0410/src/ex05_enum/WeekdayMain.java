package ex05_enum;

public class WeekdayMain {
	public static void main(String[] args) {
		
		Weekday today = Weekday.FRIDAY;
		
		if(today == Weekday.SUNDAY) {
			System.out.println("쉬는날 입니다.");
		} else {
			System.out.println("출근하는 날입니다.");
		}
	}
}
