package test;
import java.util.Scanner;

public class ShopApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Shop[] shops = new Shop[3];
		
		for(int i=0; i<3; i++) {
			shops[i] = new Shop();
			System.out.print("�̸�: ");
			shops[i].setName(scanner.next());
			System.out.print("������: ");
			shops[i].setPhone(scanner.nextInt());
			System.out.print("TV ����: ");
			shops[i].setTv(scanner.nextInt());
			System.out.print("��ǻ�Ͱ���: ");
			shops[i].setComputer(scanner.nextInt());
			shops[i].sum();
		}
		
		for(int i=0; i<3; i++) {
			shops[i].print();
		}
	}
}
