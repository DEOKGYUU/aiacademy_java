package test;

public class Shop {
	private String name;
	private int phone, tv, computer, sum;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public void setTv(int tv) {
		this.tv = tv;
	}
	
	public void setComputer(int computer) {
		this.computer = computer;
	}
	
	public void sum() {
		this.sum = this.phone + this.tv + this.computer;
	}
	
	public void print() {
		System.out.println(name +"님이 결제하실 총 금액은 " + sum + "만원입니다.");
	}
}
