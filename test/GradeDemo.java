package test;

import java.util.Scanner;

public class GradeDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 학생 점수");
			scores[i] = scanner.nextInt();
		}
		
		int a = scores[0];
		int b = scores[1];
		int c = scores[2];
		
		String result = "";
		if(a > b && b > c) {
			result = "a win";
		} else if(b > a && b > c) {
			result = "b win";
		} else {
			result = "c win";
		}
		System.out.println(result);
	}
}
