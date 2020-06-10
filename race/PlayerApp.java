package race;

import java.util.Scanner;

public class PlayerApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player[] players = new Player[3];
		
		for(int i=0; i<3; i++) {
			players[i] = new Player();
			System.out.print("이름?");
			players[i].setName(scanner.next());
			System.out.print("기록?");
			players[i].setRecord(scanner.nextInt());
		}
		
		for(int i=0; i<3; i++) {
			players[i].print();
		}
		
		Player[] ranking = new Player[3];
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
			} else {
				ranking[0] = players[2];
			}
		} else if(players[1].getRecord() < players[0].getRecord()) {
			if(players[1].getRecord() < players[2].getRecord()) {
				ranking[0] = players[1];
			} else {
				ranking[0] = players[2];
			}
		}
		
		System.out.print("1등: ");
		ranking[0].print();
	}
}
