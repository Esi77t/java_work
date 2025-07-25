package ex01_inheritance;

public class AnimalMain {
	public static void main(String[] args) {
		// 부모의 메서드도 사용할 수 있지만
		// 자식 클래스에 메서드가 오버라이딩 되면
		// 자식 객체가 메서드를 호출됐을 때 오버라이딩 된 메서드를 호출
		Cat cat = new Cat();
		cat.info();
		
		Dog dog = new Dog();
		dog.info();
		
		Chiwawa ch = new Chiwawa();
		ch.info();
	}
}
