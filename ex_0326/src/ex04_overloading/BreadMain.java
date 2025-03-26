package ex04_overloading;

public class BreadMain {
	public static void main(String[] args) {
		Bread bread = new Bread();
		
		bread.makeBread("피자빵");
		bread.makeBread("소보로빵", 5);
		bread.makeBread(5);
	}
}
