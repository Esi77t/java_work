package exam02;

public class Family {
	String desk =  "책상";
	String bed = "침대";
	
	public void sleep() {
			System.out.println("드르렁");
	}
}

class Father extends Family {
	String beard = "수염";
	@Override
	public void sleep() {
			System.out.println("아빠가 코를 골며 잡니다");
	}
}

class Mother extends Family {}


class Child extends Family {}


class Pet extends Family {}