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
		
		Player[] ranking = new Player[3];
		if(players[0].getRecord() < players[1].getRecord()) {
			if(players[0].getRecord() < players[2].getRecord()) {
				ranking[0] = players[0];
				if(players[1].getRecord() < players[2].getRecord()) {
					ranking[1] = players[1];
					ranking[2] = players[2];
				} else {
					ranking[1] = players[2];
					ranking[2] = players[1];
				}
			}
		} else if(players[1].getRecord() < players[0].getRecord()) {
			if(players[1].getRecord() < players[2].getRecord()) {
				ranking[0] = players[1];
				if(players[0].getRecord() < players[2].getRecord()) {
					ranking[1] = players[0];
					ranking[2] = players[2];
				} else {
					ranking[1] = players[2];
					ranking[2] = players[0];
				}
			}
		} else if(players[2].getRecord() < players[0].getRecord()) {
			if(players[2].getRecord() < players[1].getRecord()) {
				ranking[0] = players[2];
				if(players[0].getRecord() < players[1].getRecord()) {
					ranking[1] = players[0];
					ranking[2] = players[1];
				} else {
					ranking[1] = players[1];
					ranking[2] = players[0];
				}
			}
		}
		
		System.out.println("--���--");
		for(int i=0; i<3; i++) {
			ranking[i].print();
		}
		
	}
}
