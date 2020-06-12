package rps;

import java.util.Scanner;

public class WhileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("메뉴 0. 종료 1. 게임");
			switch(sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("게임중..."); break;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("게임 끝");
		}
	}
}