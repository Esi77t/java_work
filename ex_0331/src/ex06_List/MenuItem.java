package ex06_List;

public class MenuItem {
	private String coffee;
	private int price;

	public MenuItem(String coffee, int price) {
		this.coffee = coffee;
		this.price = price;
	}
	
	public void setCoffee(String coffee) {
		this.coffee = coffee;
	}
	
	public String getCoffee() {
		return coffee;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
