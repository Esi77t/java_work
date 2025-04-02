package ex02_lamda;

public class EX02_Function {
	public static void main(String[] args) {
		FunctionEXAM fe = new FunctionEXAM();
		
		Iminus im = fe.makeFunction();	// (x, y) -> x - y;
		int res = im.sub(20, 10);
		System.out.println("res : " + res);
	}
}
