package test;

import java.util.Scanner;

public class StringSwitchDemo {
	public static int getMonthNumber(String month) {
		int monthNumber = 0;
		
		if(month == null) { return monthNumber; }
		
		switch(month) {
		case "January": monthNumber = 1; break;
		case "Feburary": monthNumber = 2; break;
		case "March": monthNumber = 3; break;
		case "April": monthNumber = 4; break;
		case "May": monthNumber = 5; break;
		case "June": monthNumber = 6; break;
		case "July": monthNumber = 7; break;
		case "August": monthNumber = 8; break;
		case "September": monthNumber = 9; break;
		case "October": monthNumber = 10; break;
		case "November": monthNumber = 11; break;
		case "December": monthNumber = 12; break;
		}
		
		return monthNumber;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("달을 입력하세요");
		String month = sc.next();
		
		int returnedMonthNumber = StringSwitchDemo.getMonthNumber(month);
		
		if(returnedMonthNumber == 0) {
			System.out.println("Invaild month");
		}else {
			System.out.println(returnedMonthNumber);
		}
	}
}
