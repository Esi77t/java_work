package exam02;

public class HouseMain {
	public static void main(String[] args) {
		House h = new House();
		
		// 각 구성원 객체가 부모타입으로 들어옴
		h.member1 = new Father();
		h.member2 = new Mother();
		h.member3 = new Child();
		
		// 부모타입으로 변했기 때문에 Father 클래스에 정의된 필드는 사용못함
		System.out.println(((Father)h.member1).beard);
		System.out.println(h.member1.desk);
	}
}
