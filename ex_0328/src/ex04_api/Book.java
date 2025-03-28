package ex04_api;

public class Book {
	private String book_name;
	private String book_author;
	
	public Book(String book_name, String book_author) {
		this.book_name = book_name;
		this.book_author = book_author;
	}
	
	@Override
	public String toString() {
		return "책 제목 : " + this.book_name + ", 저자 : " + this.book_author;
	}
}

