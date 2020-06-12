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
		RpsService rpsService = new RpsServiceImpl();
		Rps rps = null;
		
		while(true) {
			rps = new Rps();
			System.out.println("메뉴:  0.종료  1.게임  2.전적");
			switch (sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1:
				System.out.println("가위, 바위, 보를 고르세요");
				System.out.println("1.가위 2.바위 3.보");
				rps.setPlayer(sc.nextInt());
				rps.setComputer((int)(Math.random() * 3) + 1);
				rpsService.game(rps);
				System.out.println(rps);
				break;
			case 2:
				rpsService.score();
				break;
			}
		}
	}
}
