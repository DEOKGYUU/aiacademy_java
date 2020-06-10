package test;
import java.util.Scanner;

public class MyName {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름이 어떻게 되세요?");
		String name = scanner.next();
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.print("나이는 어떻게 되세요?");
		int age = scanner.nextInt();
		System.out.println("제 나이는 " + age + "입니다.");
		System.out.print("키는 어떻게 되세요?");
		float height = scanner.nextFloat();
		System.out.println("제 키는 " + height + "입니다.");
	}
}
