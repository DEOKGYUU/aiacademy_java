package item;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ItemService itemservice = new ItemServiceImpl();
		Item item = null;
		while(true) {
			item = new Item();
			System.out.println("메뉴: 0.종료 1.담기 2.담은목록");
			switch(sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: 
				System.out.print("상품명? ");
				item.setName(sc.next());
				System.out.print("가격?");
				item.setPrice(sc.nextInt());
				itemservice.addCart(item);
				break;
			case 2: itemservice.list(); break;
			default: System.out.println("다시 선택하세요."); break;
			}
		}
	}
}
