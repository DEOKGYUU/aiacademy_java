package test;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			Student student = new Student();
			System.out.print("�̸�?");
			student.setName(scanner.next());
			System.out.print("����?");
			student.setKor(scanner.nextInt());
			System.out.print("����?");
			student.setEng(scanner.nextInt());
			System.out.print("����?");
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
