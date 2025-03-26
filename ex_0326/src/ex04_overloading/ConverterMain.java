package ex04_overloading;

public class ConverterMain {
	public static void main(String[] args) {
		Converter cover = new Converter();
		System.out.println(cover.convert(500) + "m");
		System.out.println(cover.convert(5, "m") + "cm");
		System.out.println(cover.convert(5, "inch") + "cm");
	}
}
