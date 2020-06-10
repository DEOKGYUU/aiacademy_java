package test;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			System.out.print("이름?");
			student.setName(scanner.next());
			System.out.print("국어?");
			student.setKor(scanner.nextInt());
			System.out.print("영어?");
			student.setEng(scanner.nextInt());
			System.out.print("수학?");
			student.setMath(scanner.nextInt());
			student.sum();
			student.avg();
			students[i] = student;
		}
		for(int i=0; i<students.length; i++) {
			students[i].printStates();
		}
	}
}
