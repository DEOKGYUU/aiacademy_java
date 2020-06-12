package item;

public class Item {
	private String name;
	private int price;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "[상품명: " + name + ", 가격: " + price +"]"; 
	}
}
