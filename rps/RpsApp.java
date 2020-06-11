package rps;
import java.util.Scanner;
/*
가위, 바위, 보를 고르세요.
1.가위 2.바위 3.보
결과값
"플레이어: 가위"
"컴퓨터: 보"
"플레이어 승리 || 패배 || 무승부
*/

public class RpsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴 0. 종료  1.게임");
			switch (sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: game(sc); break;
			}
		}
	}

	private static void game(Scanner sc) {
		System.out.println("가위, 바위, 보를 고르세요.");
		System.out.println("1. 가위  2. 바위  3. 보");
		int player = sc.nextInt();
		int computer = (int) (Math.random() * 3) + 1;
		
		String result = "";
		if(player == 1) {
			if(computer == 1) {
				result = "무승부";
			} else if(computer == 2) {
				result = "패배";
			} else { result = "승리"; }
		} else if(player == 2) {
			if(computer == 1) {
				result = "승리";
			} else if(computer == 2) {
				result = "무승부";
			} else { result = "패배"; }
		} else if(player == 3) {
			if(computer == 1) {
				result = "패배";
			} else if(computer == 2) {
				result = "승리";
			} else { result = "무승부"; }
		}
		
		String rpsP = rps(player);
		String rpsC = rps(computer);
		
		System.out.println("결과 값");
		System.out.println("플레이어: " + rpsP);
		System.out.println("컴퓨터: " + rpsC);
		System.out.println("플레이어 : " + result);
	}

	private static String rps(int player) {
		switch(player) {
		case 1 : return "가위";
		case 2 : return "바위";
		case 3 : return "보";
		}
		return null;
	}
}
