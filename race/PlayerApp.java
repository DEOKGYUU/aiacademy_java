package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for(int i=0; i<3; i++) {
			players[i] = new Player();
			System.out.print("�̸�?");
			players[i].setName(scanner.next());
			System.out.print("���?");
			players[i].setRecord(scanner.nextInt());
		}
		
		for(int i=0; i<3; i++) {
			players[i].print();
		}
	}
}
