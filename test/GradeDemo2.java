package test;

import java.util.Scanner;

public class GradeDemo2 {
	public static void main(String[] args) {
		/*[요구사항] 영어 점수에 따라 A ~ F 까지 등급을 부여하는 프로그램을 작성해 주시오.
		100 ~ 90 A
		89 ~ 80 B
		79 ~ 70 C
		69 ~ 60 D
		59 ~ 50 E
		49 ~ 0 F
		화면 출력은 다음과 같습니다.
		********************************
		이름       영어   점수  등급
		-----------------------------------
		| 홍길동 | 영어 | 89점 | B |*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름: ");
		String name = scanner.next();
		//System.out.print("영어: ");
		final String eng = "영어";
		System.out.print("점수: ");
		int score = scanner.nextInt();
		String grade = "";
		if(score <= 100 && score >= 90) {
			grade = "A";
		}else if(score <= 89 && score >=80) {
			grade = "B";
		}else if(score <=79 && score >= 70) {
			grade = "C";
		}else if(score <=69 && score >= 60) {
			grade = "D";
		}else if(score <= 59 && score >= 50) {
			grade = "E";
		}else {
			grade = "F";
		}
		
		System.out.println("**********************");
		System.out.println("   이름      영어    점수   등급");
		System.out.println("----------------------");
		System.out.println(" | " + name + " | " + eng + " | " + score + " | " + grade);
		System.out.println("**********************");
		
	}
}
