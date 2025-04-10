package ex05_enum;

public class OperationMain {
	public static void main(String[] args) {
		
		for(Operation op : Operation.values()) {
			System.out.println(op + " : " + op.apply(10, 7));
		}
	}
}
