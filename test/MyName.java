package test;
import java.util.Scanner;

public class MyName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��� �Ǽ���?");
		String name = scanner.next();
		System.out.println("�� �̸��� " + name + "�Դϴ�.");
		System.out.print("���̴� ��� �Ǽ���?");
		int age = scanner.nextInt();
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		System.out.print("Ű�� ��� �Ǽ���?");
		float height = scanner.nextFloat();
		System.out.println("�� Ű�� " + height + "�Դϴ�.");
		System.out.println((int)(Math.random()*3) +1);
	}
}
