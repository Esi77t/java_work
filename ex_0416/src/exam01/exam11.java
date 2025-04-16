package exam01;

// 11번
public interface exam11 {
	public static void main(String[] args) {
		exam11Interface toUp = s -> s.toUpperCase();
		
		String res = toUp.anyong("hello");
		System.out.println(res);
	}
}
