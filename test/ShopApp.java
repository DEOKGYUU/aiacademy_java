package test;
import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] shops = new Shop[3];
		
		for(int i=0; i<3; i++) {
			shops[i] = new Shop();
			System.out.print("이름: ");
			shops[i].setName(scanner.next());
			System.out.print("폰가격: ");
			shops[i].setPhone(scanner.nextInt());
			System.out.print("TV 가격: ");
			shops[i].setTv(scanner.nextInt());
			System.out.print("컴퓨터가격: ");
			shops[i].setComputer(scanner.nextInt());
			shops[i].sum();
		}
		
		for(int i=0; i<3; i++) {
			shops[i].print();
		}
	}
}
